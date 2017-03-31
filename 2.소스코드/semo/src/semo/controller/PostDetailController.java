package semo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
		
		UserService uService = new UserServiceLogic();
		

		Calendar oCalendar = Calendar.getInstance();

		List<Object> resultList = new ArrayList<>();
		List<Object> ageList = new ArrayList<>();
		
		List<User> total = new ArrayList<>();
		List<User> lUser = new ArrayList<>();
		List<User> rUser = new ArrayList<>();
		
		for (String s : post.getChoiceLeft().getUsers()) {
			lUser.add(uService.searchUserById(s));
			total.add(uService.searchUserById(s));
		}
		
		for (String s : post.getChoiceRight().getUsers()) {
			rUser.add(uService.searchUserById(s));
			total.add(uService.searchUserById(s));
		}

		
		List<String> result = new ArrayList<>();
		
		List<String> age = new ArrayList<>();
	
		
		int M=0,F=0;
		for(User u :total ){
			if(u.getGender().equals("M")){
				M++;
			}else if(u.getGender().equals("F")){
				F++;
			}
		}
		
		result.add(String.valueOf(M));
		result.add(String.valueOf(F));
		
	
		
		int num1=0,num2=0,num3=0,num4=0,num5=0;
		for(User u : lUser){
			int age1=0;
			age1 = oCalendar.get(Calendar.YEAR)-Integer.parseInt(u.getBirth().substring(6,10))+1;
			switch(age1/10){
			case 1:
				num1++;				
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			case 4:
				num4++;
				break;
			default :num5++;
				
			
			}
		}
		int no1=0,no2=0,no3=0,no4=0,no5=0;
		for(User u : rUser){
			int age2=0;
			age2 = oCalendar.get(Calendar.YEAR)-Integer.parseInt(u.getBirth().substring(6,10))+1;
			switch(age2/10){
			case 1:
				no1++;				
				break;
			case 2:
				no2++;
				break;
			case 3:
				no3++;
				break;
			case 4:
				no4++;
				break;
			default :no5++;
				
			
			}
		}
	
		
		
		
		
		request.setAttribute("aL", num1);
		request.setAttribute("bL", num2);
		request.setAttribute("cL", num3);
		request.setAttribute("dL", num4);
		request.setAttribute("eL", num5);
		request.setAttribute("AR", no1);
		request.setAttribute("BR", no2);
		request.setAttribute("CR", no3);
		request.setAttribute("DR", no4);
		request.setAttribute("ER", no5);
		
		
	
		
		resultList.add(result);
		ageList.add(ageList);
		request.setAttribute("Users", resultList);
		request.setAttribute("m", result.get(0));
		request.setAttribute("w", result.get(1));
		request.setAttribute("voteAges", ageList);
		
		request.setAttribute("Ltotal", lUser.size());
		request.setAttribute("Rtotal", rUser.size());
		request.setAttribute("total", total.size());
		
		request.setAttribute("post", post);
		request.getRequestDispatcher("postDetail.jsp").forward(request, response);
		
	

	}

}
