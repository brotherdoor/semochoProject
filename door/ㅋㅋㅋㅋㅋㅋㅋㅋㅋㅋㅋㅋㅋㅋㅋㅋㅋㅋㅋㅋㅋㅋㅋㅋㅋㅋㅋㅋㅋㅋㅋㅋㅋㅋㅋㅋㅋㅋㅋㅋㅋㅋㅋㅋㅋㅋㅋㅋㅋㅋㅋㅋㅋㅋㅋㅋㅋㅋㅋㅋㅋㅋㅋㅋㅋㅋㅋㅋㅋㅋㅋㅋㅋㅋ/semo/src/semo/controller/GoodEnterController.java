package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Good;
import semo.domain.User;
import semo.service.GoodService;
import semo.service.UserService;
import semo.service.logic.GoodServiceLogic;
import semo.service.logic.UserServiceLogic;

@WebServlet("/enter.do")
public class GoodEnterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 경품 응모 컨트롤러, 경품 응모시 사용자의 세모 차감 및 응모리스트에 사용자 추가.
		String userId = "last";
		int useSemo = Integer.parseInt(request.getParameter("useSemo"));
		String goodId = request.getParameter("goodId");
		
		UserService Uservice = new UserServiceLogic();
		GoodService gService = new GoodServiceLogic();
		User user = Uservice.searchUserById(userId);
		
		if(user.getSemo() > useSemo){ // userId로 찾아온 유저의 세모가 경품응모에 필요한 세모보다 많다면
			user.setSemo(user.getSemo() - useSemo); // 유저의 세모를 경품응모에 필요한 세모만큼 차감시킨다.
			Uservice.modifyUser(user);
			gService.registerEnterUsers(userId, goodId); // 응모자 리스트에 유저 id와 경품 id 저장
		}
		
		request.getRequestDispatcher("list.do").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
