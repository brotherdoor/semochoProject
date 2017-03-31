package semo.controller;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/goodEnter.do")
public class GoodEnterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 경품 응모 컨트롤러, 경품 응모시 사용자의 세모 차감 및 응모리스트에 사용자 추가.
		String userId = request.getParameter("userId");
		int semo = Integer.parseInt(request.getParameter("useSemo"));
		String goodId = request.getParameter("goodId");
		
		UserService Uservice = new UserServiceLogic();
		GoodService gService = new GoodServiceLogic();
		User user = Uservice.searchUserById(userId);
		
		PrintWriter out = response.getWriter();
		
		if(user.getSemo() >= semo){ // userId로 찾아온 유저의 세모가 경품응모에 필요한 세모보다 많다면
			user.setSemo(user.getSemo() - semo); // 유저의 세모를 경품응모에 필요한 세모만큼 차감시킨다.
			Uservice.modifyUser(user);
			gService.registerEnterUsers(userId, goodId); // 응모자 리스트에 유저 id와 경품 id 저장
			out.println("<script>");
			out.println("alert('응모되었습니다.');");
			out.println("location.href = 'goodList.do';"); 
			out.println("</script>");
			out.close();
		}else{
			out.println("<script>");
			out.println("alert('세모가 부족합니다.');");
			out.println("location.href = 'goodList.do';"); 
			out.println("</script>");
			out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
