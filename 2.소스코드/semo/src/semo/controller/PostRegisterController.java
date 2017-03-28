package semo.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import semo.domain.Choice;
import semo.domain.Image;
import semo.domain.Post;
import semo.domain.User;
import semo.service.PostService;
import semo.service.logic.PostServiceLogic;

@WebServlet("/postRegister.do")
public class PostRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		PostService service = new PostServiceLogic();
		
		String path = getServletContext().getInitParameter("imagePath");
		String encType = "UTF-8";
	    int maxFilesize = 5 * 1024 * 1024;
		MultipartRequest multi = new MultipartRequest(request, path, maxFilesize,
                encType, new DefaultFileRenamePolicy());
				
		Post post = new Post();
		post.setTitle(multi.getParameter("title").toString());
		post.setCategory(multi.getParameter("category").toString());
		String date = multi.getParameter("endDate").toString();
		String [] end = date.split("-");
		int year = Integer.parseInt(end[0])-1900;
		int month = Integer.parseInt(end[1]);
		int day = Integer.parseInt(end[2]);
		Date endDate = new Date(year, month, day);
		post.setEndDate(endDate);
		for(String s : end){
			System.out.println(s);
			System.out.println("∆»Ω∫¿Œ∆Æ" + Integer.parseInt(s));
		}
		
		HttpSession session = request.getSession();
		String writerId = ((User)session.getAttribute("loginUser")).getId();
		post.setWriterId(writerId);
		
		Choice choiceLeft = new Choice();
		choiceLeft.setContent(multi.getParameter("leftContent"));
		Image leftImg = new Image();
		String leftName = multi.getFilesystemName("leftImage");
		leftImg.setImageName(leftName);
		String [] left = leftName.split("\\.");
		leftImg.setImageType("image/" + left[1]);
		choiceLeft.setImage(leftImg);
		
		Choice choiceRight = new Choice();
		choiceRight.setContent(multi.getParameter("rightContent"));
		Image rightImg = new Image();
		String rightName = multi.getFilesystemName("rightImage");
		rightImg.setImageName(rightName);
		String [] right = rightName.split("\\.");
		leftImg.setImageType("image/" + right[1]);
		choiceRight.setImage(rightImg);
		
		post.setChoiceLeft(choiceLeft);
		post.setChoiceRight(choiceRight);
		
		service.registerPost(post);
		
		response.sendRedirect(request.getContextPath() + "/postList.do");
		
	}

}
