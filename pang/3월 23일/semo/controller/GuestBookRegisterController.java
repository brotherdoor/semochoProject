package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.GuestBook;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/register.do")
public class GuestBookRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		GuestBook gb = new GuestBook();
		
		gb.setId(null);
		gb.setContent(req.getParameter("contents"));
		gb.setWriterId("chee");//쎄션에 유져 아이디
		
		System.out.println(gb.getContent());
		System.out.println(req.getParameter("semoHomeId"));
		String semoHomeId = req.getParameter("semoHomeId");
		service.registerGuestBook(semoHomeId , gb);
		
		resp.sendRedirect("list.do");
	}

}
