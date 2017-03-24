package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.SemoHome;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/remove.do")
public class RemoveGuestBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		
		String gbId = req.getParameter("id");
		
		service.removeGuestBook(gbId);
		
		resp.sendRedirect("list.do");
		
	}

}
