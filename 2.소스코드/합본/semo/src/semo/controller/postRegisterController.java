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
import semo.service.PostSevice;
import semo.service.logic.PostServiceLogic;

@WebServlet("/postRegister.do")
public class postRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		PostSevice service = new PostServiceLogic();
		
		String path = getServletContext().getInitParameter("imagePath");
		String encType = "UTF-8";
	    int maxFilesize = 5 * 1024 * 1024;
		MultipartRequest multi = new MultipartRequest(request, path, maxFilesize,
                encType, new DefaultFileRenamePolicy());
				
		Post post = new Post();
		post.setTitle(multi.getParameter("title").toString());
		System.out.println(multi.getParameter("title"));
		post.setCategory(multi.getParameter("category").toString());
		String date = multi.getParameter("endDate").toString();
		String [] end = date.split("-");
		int year = Integer.parseInt(end[0]);
		int month = Integer.parseInt(end[1]);
		int day = Integer.parseInt(end[2]);
		Date endDate = new Date(year, month, day);
		post.setEndDate(endDate);
		System.out.println(date);
		for(String s : end){
			System.out.println(s);
			System.out.println("팔스인트" + Integer.parseInt(s));
		}
		
//		로그인 중인 userID 가저오기
//		HttpSession session = request.getSession();
		post.setWriterId("door");
		
		Choice choiceLeft = new Choice();
		choiceLeft.setContent(multi.getParameter("leftContent"));
		Image image = new Image();
		String left = multi.getFilesystemName("leftImage");
		System.out.println(left);
		String [] aryL = left.split("\\.");
		image.setImageName(left);
		image.setImageType("image/" + aryL[1]);
		choiceLeft.setImage(image);
		
		Choice choiceRight = new Choice();
		choiceRight.setContent(multi.getParameter("RightContent"));
		String right = multi.getFilesystemName("rightImage");
		String [] aryR = right.split("\\.");
		image.setImageName(right);
		image.setImageType("image/" + aryR[1]);
		choiceRight.setImage(image);
		
		post.setChoiceLeft(choiceLeft);
		post.setChoiceRight(choiceRight);
		
		service.registerPost(post);
		
		response.sendRedirect(request.getContextPath() + "/postList.do");
		
	}

}
