package semo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.SemoHome;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/semoGoodList.do")
public class SemoHomeGoodListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		
		//쎄션이랑 세모홈이랑 같은 곳인지 비교~
		
		HttpSession session = req.getSession();
		String userId = "chee";
		String guestId = null;
		if((String)session.getAttribute("semoHomeHost") != null){
			guestId = (String)session.getAttribute("semoHomeHost");
		}
		
		if(!userId.equals(guestId) && guestId!=null){
			userId = guestId;
		}
		
		SemoHome semoHome = service.searchSemoHome(userId);
		
		System.out.println("경품응모 : ");
		
		req.setAttribute("goods", semoHome.getGoods());
		req.setAttribute("semoHomeId", semoHome.getId());
		req.setAttribute("size", semoHome.getGoods().size());
		
		System.out.println("경품응모 : ");
		
		req.getRequestDispatcher("shGoodList.jsp").forward(req, resp);
		
	}

}
