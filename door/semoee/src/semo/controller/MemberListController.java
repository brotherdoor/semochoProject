package semo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.User;
import semo.service.logic.AdminServiceLogic;
import semo.service.logic.UserServiceLogic;

@WebServlet("/memberList.do")
public class MemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		UserServiceLogic service = new UserServiceLogic();
		
		List<User> list = new ArrayList();
		
		list = service.searchUserAll();
		
		request.setAttribute("Users", list);
		
		request.getRequestDispatcher("memberList.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		UserServiceLogic userService = new UserServiceLogic();
		AdminServiceLogic adminService = new AdminServiceLogic();
		
		
		
		List<User> list = new ArrayList();
		List<User> searchList = new ArrayList();
		list = userService.searchUserAll();
		
		if(request.getParameter("search").equals("id")){
			searchList.add(adminService.findUserById(request.getParameter("serachText")));
		}else if(request.getParameter("search").equals("name")){
			searchList = adminService.findUserByName(request.getParameter("serachText"));
		}
		request.setAttribute("searchList", searchList);
		request.setAttribute("Users", list);
		request.getRequestDispatcher("memberList.jsp").forward(request, response);
		
	}
}
