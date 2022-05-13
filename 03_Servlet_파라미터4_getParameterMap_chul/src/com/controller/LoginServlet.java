package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

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
		Map<String, String[]> map = request.getParameterMap();
		// key/String[] value
		// userid/ String [] aaa
		// passwd/ String [] 1111

		response.setContentType("text/html;charset=UTF-8"); // 1. 응답헤더 설정
		PrintWriter out = response.getWriter(); // 2. 응답할 html 코드 작업
		
		out.print("<html><body>"); // 3. 응답할 html 코드 작업
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String[] values = map.get(key);	// 키에 해당하는 value값
			String mesg = "";
			
			for (String s : values) {
				mesg += s;
			}
			out.print(key + "====" + mesg + "<br>");
		}

		out.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
