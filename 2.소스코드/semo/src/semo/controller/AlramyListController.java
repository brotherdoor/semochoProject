package semo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.Post;
import semo.service.PostService;
import semo.service.SemoHomeService;
import semo.service.logic.PostServiceLogic;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/alramyList.do")
public class AlramyListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PostService service = new PostServiceLogic();
		
		HttpSession session = req.getSession();
		
		String userId = req.getParameter("id");
		
		List<Post> list = service.searchAlaming(userId);
		
		req.setAttribute("list", list);
	
		req.getRequestDispatcher("alramyList.jsp").forward(req, resp);
		
	}

}
