package semo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Post;
import semo.domain.User;
import semo.service.PostService;
import semo.service.UserService;
import semo.service.logic.PostServiceLogic;
import semo.service.logic.UserServiceLogic;

@WebServlet("/postDetail.do")
public class PostDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PostService pService = new PostServiceLogic();

		Post post = pService.searchPostByPostId(request.getParameter("postId"));
		System.out.println("left:" + post.getChoiceLeft().getUsers().size());
		System.out.println("right:" + post.getChoiceRight().getUsers().size());
		Map<String, Integer> resultLeft = genderCal(post.getChoiceLeft().getUsers());
		Map<String, Integer> resultRight = genderCal(post.getChoiceRight().getUsers());
		
		request.setAttribute("leftM", resultLeft.get("male"));
		request.setAttribute("leftF", resultLeft.get("female"));
		request.setAttribute("rightM", resultRight.get("male"));
		request.setAttribute("rightF", resultRight.get("female"));

		
		request.setAttribute("post", post);
		request.getRequestDispatcher("postDetail.jsp").forward(request, response);

	}
	
	private Map<String , Integer> genderCal(List<String> users){
		UserService uService = new UserServiceLogic();
		
		
		int male = 0; 
		int female = 0;
		for(String s : users){
			System.out.println(s);
			if(uService.searchUserById(s).getGender().equals("M")){
				male++;
			}else{
				female++;
			}
		}
		
		Map<String, Integer> result = new HashMap<>();
		result.put("male", male);
		result.put("female", female);
		
		return result;
	}

}
