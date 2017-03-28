package semo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import semo.domain.Good;
import semo.service.GoodService;
import semo.service.logic.GoodServiceLogic;

@WebServlet("/goodList.do")
public class GoodListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		GoodService service = new GoodServiceLogic();
		List<Good> list = service.searchAllGood();
		request.setAttribute("goods", list);
		request.getRequestDispatcher("goodList.jsp").forward(request, response);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
