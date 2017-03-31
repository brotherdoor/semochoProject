package semo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.Good;
import semo.domain.Post;
import semo.domain.SemoHome;
import semo.domain.User;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/semoMain.do")
public class SemoHomeMainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		
		//쎄션이랑 세모홈이랑 같은 곳인지 비교~
		
		HttpSession session = req.getSession();
		
		String userId = req.getParameter("id");
		
		User loginUser = (User)session.getAttribute("loginUser");
		
		if(loginUser.getId().equals(userId)){
			userId = loginUser.getId();
		}else{
			
		}
		
		SemoHome semoHome = service.searchSemoHome(userId); //세모홈
		
		session.setAttribute("userId", userId); //세모홈 주인 쎄션
		
		List<User> list = new ArrayList<>();
		List<Good> gList = new ArrayList<>();
		List<Post> pList = new ArrayList<>();
		List<Post> jList = new ArrayList<>();
		List<User> rList = new ArrayList<>();
		list = service.searchFriendsByUserId(loginUser.getId()); //친구
		gList = semoHome.getGoods();
		pList = semoHome.getPosts();
		jList = semoHome.getJoins();
		rList = service.searchRecommendFriendsByUserId(userId);
		
		req.setAttribute("user", semoHome.getUser());
		req.setAttribute("semoHomeId", semoHome.getId());
		req.setAttribute("friends", list);
		req.setAttribute("goods", gList.size());
		req.setAttribute("posts", pList.size());
		req.setAttribute("joins", jList.size());
		req.setAttribute("recommend", rList);
		
		
		req.getRequestDispatcher("shMain.jsp").forward(req, resp);
		
	}

}
