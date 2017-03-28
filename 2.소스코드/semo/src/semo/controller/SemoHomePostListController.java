package semo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.Post;
import semo.domain.SemoHome;
import semo.domain.User;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;


@WebServlet("/semoPostList.do")
public class SemoHomePostListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		SemoHomeService service = new SemoHomeServiceLogic();
		
		//½ê¼ÇÀÌ¶û ¼¼¸ðÈ¨ÀÌ¶û °°Àº °÷ÀÎÁö ºñ±³~
		
		HttpSession session = req.getSession();
		String userId = (String)session.getAttribute("userId");
		User loginUser = (User)session.getAttribute("loginUser");
		
		if(loginUser.getId().equals(userId)){
			userId = loginUser.getId();
		}
		
		SemoHome semoHome = service.searchSemoHome(userId);
		
		List<Integer> size = new ArrayList<>();
		
		
		 // ½ÎÀÌÁî ÀÌ¿¤Å×±×
		req.setAttribute("posts", semoHome.getPosts());
		req.setAttribute("semoHomeId", semoHome.getId());
		req.setAttribute("comments", size);
		
		req.getRequestDispatcher("shPostList.jsp").forward(req, resp);
		
	}

}
