package semo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.GuestBook;
import semo.domain.SemoHome;
import semo.domain.User;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/guestBookList.do")
public class GuestBookListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		
		//쎄션이랑 세모홈이랑 같은 곳인지 비교~
		HttpSession session = req.getSession();
		User loginUser = (User)session.getAttribute("loginUser");
		String userId = (String)session.getAttribute("userId");
		if(loginUser.getId().equals(userId)){
			userId = loginUser.getId();
		}
		
		SemoHome semoHome = service.searchSemoHome(userId);
		
		
		//사용자 검사
		
		int check = 1;
		
		if(userId.equals("admin") || loginUser.getId().equals(userId)){
			check = 1;
		}
		
		System.out.println(check);
		
		req.setAttribute("check", check);
		req.setAttribute("userId", userId);
		req.setAttribute("writerId", loginUser.getId());
		req.setAttribute("guestBooks", semoHome.getGuestBooks());
		req.setAttribute("semoHomeId", semoHome.getId());
		
		
		req.getRequestDispatcher("guestBookList.jsp").forward(req, resp);
		
	}

}
