package semo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.User;
import semo.service.PostService;
import semo.service.UserService;
import semo.service.logic.PostServiceLogic;
import semo.service.logic.UserServiceLogic;

@WebServlet("/choiceVote.do")
public class ChoiceVoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PostService service = new PostServiceLogic();
		UserService userService = new UserServiceLogic();
		
		String postId = request.getParameter("postId");
		String choiceId = request.getParameter("choiceId");
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("loginUser");
		String userId = user.getId();
		
		boolean result = service.registerVote(postId, choiceId, userId);
		if(!result){
			PrintWriter out = response.getWriter();
			out.println("<script language='javascript'>");
			out.println("alert('이미투표했습니다.');");
			out.print("history.back(-1);");
			out.println("</script>");
			out.close();
		}else{
			int semo = user.getSemo();
			user.setSemo(semo++);
			userService.modifyUser(user);
		}
		response.sendRedirect(request.getContextPath() + "/postDetail.do?postId=" + postId);
	}

}
