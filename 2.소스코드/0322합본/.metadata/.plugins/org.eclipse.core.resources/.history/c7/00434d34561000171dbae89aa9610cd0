package semo.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import semo.domain.User;
import semo.service.UserService;
import semo.service.Logic.UserServiceLogic;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		UserService service = new UserServiceLogic();
		User user = new User();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		user.setId(id);
		user.setPassword(password);
		
		User result = service.login(user);
		HttpSession session = request.getSession();
		
		session.setAttribute("id", result);
		response.sendRedirect("list.do");
	}

}
