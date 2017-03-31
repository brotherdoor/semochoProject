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
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/choiceImage.do")
public class ChoiceImgController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PostService service = new PostServiceLogic();
		
		Post post = service.searchPostByPostId(request.getParameter("postId").toString());
		String choiceId = request.getParameter("choiceId");
		
		Choice choice = null;
		if(choiceId.equals(post.getChoiceRight().getId())){
			choice = post.getChoiceRight();
		}else{
			choice = post.getChoiceLeft();
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
