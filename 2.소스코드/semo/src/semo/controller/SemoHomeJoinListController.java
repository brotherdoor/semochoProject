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


@WebServlet("/semoJoinList.do")
public class SemoHomeJoinListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		
		//쎄션이랑 세모홈이랑 같은 곳인지 비교~
		
		HttpSession session = req.getSession();
		String userId = (String)session.getAttribute("userId");
		User loginUser = (User)session.getAttribute("loginUser");
		
		if(loginUser.getId().equals(userId)){
			userId = loginUser.getId();
		}
		
		SemoHome semoHome = service.searchSemoHome(userId);
		
		req.setAttribute("joins", semoHome.getJoins());
		req.setAttribute("semoHomeId", semoHome.getId());
		req.setAttribute("size", semoHome.getJoins().size());
		
		req.getRequestDispatcher("shJoinList.jsp").forward(req, resp);
		
	}

}
