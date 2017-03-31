package semo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.User;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;
import semo.store.logic.PostStoreLogic;


@WebServlet("/accuseRegister.do")
public class PostAccuseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PostService service;
	
	public PostAccuseController() {
		service = new PostServiceLogic();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("postId", request.getParameter("postId"));
		
		request.getRequestDispatcher("postAccuse.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PostService service = new PostServiceLogic();
		String postId = request.getParameter("postId");
		String content = request.getParameter("content");
		HttpSession session = request.getSession();
		String writerId = ((User)session.getAttribute("loginUser")).getId();
		boolean result = service.registerAccuse(postId, writerId, content);
		if(result){
			response.sendRedirect(request.getContextPath() + "/postList.do");
		}else{
			PrintWriter out = response.getWriter();
			out.println("<script language='javascript'>");
			out.println("alert('이미신고했습니다.');");
			out.print("location.href = 'postList.do';");
			out.println("</script>");
			out.close();
		}
	}

}
