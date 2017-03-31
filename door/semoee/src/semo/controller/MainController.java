package semo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Post;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/main.do")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PostService service = new PostServiceLogic();
		List<Post> list = service.searchAllPost();
		List<Post> posts = new ArrayList<>();
		List<String> postId = new ArrayList<>();
		
		Map<Integer, String> yet = new HashMap<>();
		
		for(Post p : list){
			yet.put(p.getComments().size(), p.getId());
		}
		
		Map<Integer, String> sort = new TreeMap<>(Collections.reverseOrder());
		sort.putAll(yet);
		
		for(int key : sort.keySet()){
			postId.add(sort.get(key));
		}
		
		
		int count = 0;
		for(String p: postId){
			if(count == 6) break;
			Post post = service.searchPostByPostId(p);
			posts.add(post);
			count++;
		}
		
		request.setAttribute("posts", posts);
		request.getRequestDispatcher("/main.jsp").forward(request, response);
	}
	

}
