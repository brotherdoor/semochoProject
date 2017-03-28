package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.Comment;
import semo.domain.User;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/commentRegist.do")
public class CommentRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PostService service = new PostServiceLogic();
		
		String postId = request.getParameter("postId");
		Comment comment = new Comment();
		comment.setContent(request.getParameter("comment"));
		
		HttpSession session = request.getSession();
		String writerId = ((User)session.getAttribute("loginUser")).getId();
		
		comment.setWriterId(writerId);
		
		service.registerComment(postId, comment);
		response.sendRedirect(request.getContextPath() + "/postDetail.do?postId=" + postId);
	}

}
