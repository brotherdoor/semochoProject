package semo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Comment;
import semo.domain.Post;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/commentDelete.do")
public class CommentRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PostService service = new PostServiceLogic();
		String commentId = request.getParameter("commentId");
		service.removeComment(commentId);
		response.sendRedirect("postList.do");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
