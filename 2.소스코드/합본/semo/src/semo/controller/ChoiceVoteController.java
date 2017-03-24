package semo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.service.PostSevice;
import semo.service.logic.PostServiceLogic;

@WebServlet("/choiceVote.do")
public class ChoiceVoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PostSevice service = new PostServiceLogic();
		
		String postId = request.getParameter("postId");
		String choiceId = request.getParameter("choiceId");
		String userId = "1234";
		
		boolean result = service.registerVote(postId, choiceId, userId);
		if(!result){
			PrintWriter out = response.getWriter();
			out.println("<script language='javascript'>");
			out.println("alert('이미투표했습니다.');");
			out.print("history.back(-1);");
			out.println("</script>");
			out.close();
		}
		response.sendRedirect(request.getContextPath() + "/postDetail.do?postId=" + postId);
	}

}
