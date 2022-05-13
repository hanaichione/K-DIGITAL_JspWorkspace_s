package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.dto.PageDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String curPage = request.getParameter("curPage");//현재페이지 
		if(curPage == null) curPage = "1";//시작시 현재페이지 1 
		
		// 최초 요청시 검색 옵션 null
		String searchName = request.getParameter("searchName");	// 최초 null
		String searchValue = request.getParameter("searchValue");	// 최초 null
		System.out.println(searchName+"\t"+searchValue);
		EmpService service = new EmpService();
		PageDTO pDTO = service.select(searchName, searchValue, Integer.parseInt(curPage));
		
		System.out.println(pDTO);
		
		request.setAttribute("pDTO", pDTO);	// 최초 : curpage = 1, perpage = 2, list(0, 1), totalcount = 13(원래 12인데 1개 추가)
		request.setAttribute("searchName", searchName);
		request.setAttribute("searchValue", searchValue);
		//forward
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
		
	}

}
