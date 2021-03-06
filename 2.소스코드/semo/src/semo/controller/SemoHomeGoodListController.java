package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.SemoHome;
import semo.domain.User;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/semoGoodList.do")
public class SemoHomeGoodListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		
		//����̶� ����Ȩ�̶� ���� ������ ��~
		
		HttpSession session = req.getSession();
		String userId = (String)session.getAttribute("userId");
		User loginUser = (User)session.getAttribute("loginUser");
		
		if(loginUser.getId().equals(userId)){
			userId = loginUser.getId();
		}
		
		SemoHome semoHome = service.searchSemoHome(userId);
		
		req.setAttribute("goods", semoHome.getGoods());
		req.setAttribute("semoHomeId", semoHome.getId());
		req.setAttribute("size", semoHome.getGoods().size());
		
		req.getRequestDispatcher("shGoodList.jsp").forward(req, resp);
		
	}

}
