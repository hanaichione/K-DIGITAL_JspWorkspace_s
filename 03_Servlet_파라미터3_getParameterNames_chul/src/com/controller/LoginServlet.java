package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 한글처리
		request.setCharacterEncoding("utf-8"); // 1. 요청된 데이터의 한글 처리
		// 요청작업 처리(파싱:데이터뽑아오기)
		Enumeration<String> keys = request.getParameterNames();	// key값만 꺼내옴

		response.setContentType("text/html;charset=UTF-8"); // 1. 응답헤더 설정
		PrintWriter out = response.getWriter(); // 2. 응답할 html 코드 작업
		
		out.print("<html><body>"); // 3. 응답할 html 코드 작업
		
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = request.getParameter(key);
			out.print(key + ": " + value + "<br>");
		}
		
		out.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
