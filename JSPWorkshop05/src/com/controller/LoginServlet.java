package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/myLogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// post 한글처리
		request.setCharacterEncoding("utf-8"); // 1. 요청된 데이터의 한글 처리
		// 요청작업 처리(파싱:데이터뽑아오기)
		String userid = request.getParameter("userid"); // html부터 실행해야 함
		String passwd = request.getParameter("passwd");
		System.out.println("LoginServlet.doGet() : " + userid + "\t" + passwd);
		
		response.setContentType("text/html;charset=UTF-8"); // 1. 응답헤더 설정
		PrintWriter out = response.getWriter(); // 2. 응답할 html 코드 작업
		out.print("<html><body>"); // 3. 응답할 html 코드 작업
		out.print("이름은 " + userid);
		out.print("이고 비밀번호는 " + passwd);
		out.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
