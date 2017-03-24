package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Comment;
import semo.service.PostSevice;
import semo.service.logic.PostServiceLogic;

@WebServlet("/commentRegister.do")
public class CommentRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PostSevice service = new PostServiceLogic();
		
		String postId = request.getParameter("postId");
		Comment comment = new Comment();
		comment.setContent(request.getParameter("comment"));
		
//		로그인기능 되면
//		HttpSession session = request.getSession();
//		String writerId = session.getAttribute("userId");
		String writerId = "door";
		
		comment.setWriterId(writerId);
		
		service.registerComment(postId, comment);
		response.sendRedirect(request.getContextPath() + "/postDetail.do?postId=" + postId);
	}

}
