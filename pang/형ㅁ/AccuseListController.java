package semo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Post;
import semo.service.logic.AdminServiceLogic;

@WebServlet("/accuseList.do")
public class AccuseListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		AdminServiceLogic service = new AdminServiceLogic();
		
		List <Post> list = new ArrayList<>();
		
		
		list = service.findAccuseAll();
		
		req.setAttribute("accuseList", list);
		System.out.println(list.size());
		
		req.getRequestDispatcher("accuse.jsp").forward(req, resp);
		
		
		
	
	}

}
