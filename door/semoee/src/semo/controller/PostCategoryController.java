package semo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Post;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/postCategory.do")
public class PostCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PostService service = new PostServiceLogic();
		
		List<Post> post = service.searchByCategory(request.getParameter("category"));
		request.setAttribute("posts", post);
		request.getRequestDispatcher("postList.jsp").forward(request, response);
	}

}
