package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestController.doGet");
		
		request.setAttribute("request", "홍길동");
		
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");
		
		ServletContext ctx= getServletContext();
		ctx.setAttribute("application", "유관순");
		
		// 1. redirect 방법
		// response.sendRedirect("hello.jsp");
		// sendRedirect : 화면 전환이 이루어지고 request가 새롭게 요청됨, request 저장 값은 전달 안 됨
		// response.sendRedirect("TestController2");	// 자주 사용 ***
		response.sendRedirect("hello.jsp");	// request의 전달은 이루어지지 않음
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
