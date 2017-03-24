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

import semo.domain.Choice;
import semo.domain.Image;
import semo.domain.Post;
import semo.service.PostSevice;
import semo.service.logic.PostServiceLogic;

@WebServlet("/choiceImage.do")
public class ChoiceImgController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PostSevice service = new PostServiceLogic();
		
		Post post = service.searchPostByPostId(request.getParameter("postId").toString());
		System.out.println(request.getParameter("postId"));
		Choice choice = post.getChoiceLeft();
		if(post.getChoiceLeft().getId() == request.getParameter("choiceId")){
			choice = post.getChoiceLeft();
		}else{
			choice = post.getChoiceRight();
		}

		String fileName = null;
		InputStream in = null;
		Image img = choice.getImage();
		
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
