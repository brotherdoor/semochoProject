package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.User;
import semo.service.SemoHomeService;
import semo.service.UserService;
import semo.service.logic.SemoHomeServiceLogic;
import semo.service.logic.UserServiceLogic;

/**
 * Servlet implementation class RegisterContoller
 */
@WebServlet("/registerUser.do")
public class RegisterUserContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.sendRedirect("register.jsp");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int semo = Integer.parseInt(request.getParameter("semo"));
		
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setBirth(request.getParameter("birth"));
		user.setTel(request.getParameter("tel"));
		user.setInterest(request.getParameter("interest"));
		user.setEmail(request.getParameter("email"));
		user.setGender(request.getParameter("gender"));
		user.setGrade(request.getParameter("grade"));
		user.setSemo(semo);
		
		UserService service = new UserServiceLogic();
		SemoHomeService semoService = new SemoHomeServiceLogic();
		System.out.println(user.getId());
		semoService.createSemoHome(user.getId());
		service.registerUser(user);
		response.sendRedirect("login.do");
	}

}
