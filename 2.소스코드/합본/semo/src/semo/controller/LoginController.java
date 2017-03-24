package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.User;
import semo.service.UserService;
import semo.service.logic.UserServiceLogic;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		UserService service = new UserServiceLogic();
		User check = service.searchFriendById(request.getParameter("id"));
		
		if(request.getParameter("id").equals(check.getId())){
			if(request.getParameter("password").equals(check.getPassword())){
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", check);
				response.sendRedirect("main.jsp");
			}
		}else{
			response.sendRedirect("login.jsp");
		}
		
		
	}

}
