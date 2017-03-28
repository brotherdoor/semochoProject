package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.User;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/alamingRegister.do")
public class AlramyRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		

		PostService service = new PostServiceLogic();
		
		HttpSession session = req.getSession();
		
		User user = (User)session.getAttribute("loginUser");
		String postId = req.getParameter("postId");
		
		String userId = user.getId();
		System.out.println("asd" + userId);
		System.out.println("서블릿에서 서비스 들어간다~");
		service.registerAlaming(userId, postId);
		System.out.println("서블릿에서 서비스 나온다~~");
		resp.sendRedirect(req.getContextPath() + "/postDetail.do?postId=" + postId);
	}

}
