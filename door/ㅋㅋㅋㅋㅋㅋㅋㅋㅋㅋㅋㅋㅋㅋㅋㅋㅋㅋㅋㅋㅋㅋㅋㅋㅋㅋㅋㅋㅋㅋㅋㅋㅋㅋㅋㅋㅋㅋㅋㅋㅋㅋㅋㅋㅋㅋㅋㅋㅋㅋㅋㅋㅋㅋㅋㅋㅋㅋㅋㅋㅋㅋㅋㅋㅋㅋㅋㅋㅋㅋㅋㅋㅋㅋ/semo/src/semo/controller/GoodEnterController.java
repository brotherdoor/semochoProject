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
		// ��ǰ ���� ��Ʈ�ѷ�, ��ǰ ����� ������� ���� ���� �� ���𸮽�Ʈ�� ����� �߰�.
		String userId = "last";
		int useSemo = Integer.parseInt(request.getParameter("useSemo"));
		String goodId = request.getParameter("goodId");
		
		UserService Uservice = new UserServiceLogic();
		GoodService gService = new GoodServiceLogic();
		User user = Uservice.searchUserById(userId);
		
		if(user.getSemo() > useSemo){ // userId�� ã�ƿ� ������ ���� ��ǰ���� �ʿ��� ���𺸴� ���ٸ�
			user.setSemo(user.getSemo() - useSemo); // ������ ���� ��ǰ���� �ʿ��� ����ŭ ������Ų��.
			Uservice.modifyUser(user);
			gService.registerEnterUsers(userId, goodId); // ������ ����Ʈ�� ���� id�� ��ǰ id ����
		}
		
		request.getRequestDispatcher("list.do").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
