package semo.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import semo.domain.Good;
import semo.domain.Image;
import semo.service.AdminService;
import semo.service.logic.AdminServiceLogic;

@WebServlet("/goodRegister.do")
public class GoodRegisterControlloer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminService service = new AdminServiceLogic();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("goodId", request.getParameter("goodId"));
		request.getRequestDispatcher("goodForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String savePath = getServletContext().getInitParameter("imagePath");
		int sizeLimit = 1024 * 1024 * 15;
		MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "UTF-8",new DefaultFileRenamePolicy());
		
		
		
		String title = multi.getParameter("title");
		String content = multi.getParameter("content");
		String product = multi.getParameter("product");
		int useSemo = Integer.parseInt(multi.getParameter("useSemo"));
		
		String startDate = multi.getParameter("startDate");
		String endDate = multi.getParameter("endDate");
		String [] start = startDate.split("-");
		String [] end = endDate.split("-");
	
		int startYear = Integer.parseInt(start[0]) -1900;
		int startMonth = Integer.parseInt(start[1]);
		int startDay = Integer.parseInt(start[2]);
		
		int endYear = Integer.parseInt(end[0]) - 1900;
		int endMonth = Integer.parseInt(end[1]);
		int endDay = Integer.parseInt(end[2]);
		
		Date sDate = new Date(startYear, startMonth, startDay);
		Date eDate = new Date(endYear,endMonth,endDay);
		
		String fileName = multi.getFilesystemName("attachFile");
		String saveFname[] = fileName.split("\\.");
		
		Image image = new Image();
		image.setImageType("image/" + saveFname[1]);
		image.setImageName(fileName);
		
		
		Good good = new Good();
		good.setTitle(title);
		good.setContent(content);
		good.setProduct(product);
		good.setStartDate(sDate);
		good.setEndDate(eDate);
		good.setImage(image);
		good.setUseSemo(useSemo);
		service.regiserGood(good);
		
		response.sendRedirect("goodList.do");
		
	}

}
