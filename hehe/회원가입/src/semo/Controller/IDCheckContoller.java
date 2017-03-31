package semo.Controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.User;
import semo.service.UserService;
import semo.service.Logic.UserServiceLogic;


@WebServlet("/checkId.do")
public class IDCheckContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml;charset=utf-8");
		OutputStream out = response.getOutputStream();
		
		UserService service = new UserServiceLogic();
		User user = service.searchUserById("id");
		request.setAttribute("user", user);
		
		
		
	}

	}
























