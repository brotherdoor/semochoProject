package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Post;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/postModify.do")
public class PostModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PostService service;
	
	public PostModifyController() {
		service = new PostServiceLogic();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setAttribute("post", service.searchPostByPostId(request.getParameter("postId")));
		request.getRequestDispatcher("postModify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Post post = service.searchPostByPostId(request.getParameter("postId"));
		post.setCategory(request.getParameter("category"));
		post.setTitle(request.getParameter("title"));
		service.modifyPost(post);
		response.sendRedirect(request.getContextPath() + "/postDetail.do?postId=" + post.getId());
	}

}
