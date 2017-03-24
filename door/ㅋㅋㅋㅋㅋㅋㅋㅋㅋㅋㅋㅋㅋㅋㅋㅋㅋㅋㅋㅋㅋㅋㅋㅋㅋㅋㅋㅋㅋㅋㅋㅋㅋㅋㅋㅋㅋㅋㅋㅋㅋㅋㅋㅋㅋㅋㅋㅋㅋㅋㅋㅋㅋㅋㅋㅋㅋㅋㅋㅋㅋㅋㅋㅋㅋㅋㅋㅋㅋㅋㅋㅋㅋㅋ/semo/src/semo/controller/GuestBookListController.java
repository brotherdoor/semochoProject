package semo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.GuestBook;
import semo.domain.SemoHome;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/GuestBook/list.do")
public class GuestBookListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		SemoHomeService shService = new SemoHomeServiceLogic();
		
		SemoHome semoHome = shService.searchSemoHome("chee");
		
		req.setAttribute("guestBooks", semoHome.getGuestBooks());
		req.setAttribute("semoHomeId", semoHome.getId());
		
		req.getRequestDispatcher("guestBookList.jsp").forward(req, resp);
		
	}

}
