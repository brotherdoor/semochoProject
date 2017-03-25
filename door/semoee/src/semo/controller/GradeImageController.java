package semo.controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semo.domain.Image;
import semo.domain.User;
import semo.service.UserService;
import semo.service.logic.UserServiceLogic;

@WebServlet("/grade.do")
public class GradeImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		UserService service = new UserServiceLogic();
		
		
		String userId = request.getParameter("writerId");
		
		User user = service.searchUserById(userId);
		
		int semo = user.getSemo();
		
		Image img = new Image();
		img.setImageType("image/jpg");
		if(semo < 100){
			img.setImageName("first.jpg");
		}else if(semo < 200){
			img.setImageName("second.jpg");
		}else{
			img.setImageName("third.jpg");
		}

		String fileName = null;
		InputStream in = null;
		
		if (img != null) {
			response.setContentType(img.getImageType());
			String imagePath = getServletContext().getInitParameter("imagePath");
			fileName = imagePath + "/" + img.getImageName();

			in = new BufferedInputStream(new FileInputStream(fileName));
		}
		
		OutputStream out = response.getOutputStream();
		
		byte [] buf = new byte[8096];
		int readByte = 0;
		while((readByte = in.read(buf))>-1){
			out.write(buf, 0, readByte);
			
		}
		in.close();
		out.close();
	}

}


