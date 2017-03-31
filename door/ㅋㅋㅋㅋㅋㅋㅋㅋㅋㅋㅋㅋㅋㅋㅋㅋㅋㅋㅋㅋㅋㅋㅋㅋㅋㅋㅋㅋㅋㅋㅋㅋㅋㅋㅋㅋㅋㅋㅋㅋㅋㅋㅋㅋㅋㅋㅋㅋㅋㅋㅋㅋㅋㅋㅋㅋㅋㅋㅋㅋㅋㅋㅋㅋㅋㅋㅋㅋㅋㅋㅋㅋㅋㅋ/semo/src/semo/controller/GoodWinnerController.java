package semo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.User;
import semo.service.AdminService;
import semo.service.logic.AdminServiceLogic;

@WebServlet("/goodWinner.do")
public class GoodWinnerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String goodId = request.getParameter("goodId");
		AdminService aService = new AdminServiceLogic();
		
		int count = aService.searchEnterUsers(goodId).size();
		int items = 1;
		if(count >= items){
			List<User> list = aService.registerWinners(items, goodId);
			request.setAttribute("winners", list);
		}else{
			items = count;
			List<User> list = aService.registerWinners(items, goodId);
			request.setAttribute("winners", list);
		}
			
		
		
		request.getRequestDispatcher("winnerList.jsp").forward(request, response);
		
	}


}
