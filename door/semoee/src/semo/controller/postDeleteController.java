package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/postDelete.do")
public class postDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String postId = request.getParameter("postId");
		PostService service = new PostServiceLogic();
		
		service.removePost(postId);
		response.sendRedirect(request.getContextPath() + "/postList.do");
	}

}
