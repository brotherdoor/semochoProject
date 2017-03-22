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

import semo.domain.Good;
import semo.domain.Image;
import semo.service.GoodService;
import semo.service.logic.GoodServiceLogic;

@WebServlet("/good/image.do")
public class GoodImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String goodId = request.getParameter("goodId");
		GoodService service = new GoodServiceLogic();
		
		Good good = service.selectGoodByGoodId(goodId);
		Image image = good.getImage();
		
		String fileName = null;
		InputStream in = null;
		
		if(image != null){
			response.setContentType(image.getImageType());
			String imagePath = getServletContext().getInitParameter("imagePath");
			fileName = imagePath + "/" + image.getImgaeName();
			
			in = new BufferedInputStream(new FileInputStream(fileName));
		}
		
		OutputStream out = response.getOutputStream();
		byte[] buf = new byte[8096];
		int readByte = 0;
		while((readByte = in.read(buf)) > -1){
			out.write(buf,0,readByte);
		}
		in.close();
		out.close();
	}

}
