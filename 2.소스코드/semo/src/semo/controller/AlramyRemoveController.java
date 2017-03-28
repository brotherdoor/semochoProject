package semo.controller;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.Post;
import semo.domain.User;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;


@WebServlet("/alramyRemove.do")
public class AlramyRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PostService service = new PostServiceLogic();
		
		HttpSession session = req.getSession();
		
		User user = (User)session.getAttribute("loginUser");
		String postId = req.getParameter("postId");
		
		service.removeAlaming(user.getId(), postId);
		
		resp.sendRedirect(req.getContextPath() + "/alramyList.do?id=" + user.getId());
		
	}

}
