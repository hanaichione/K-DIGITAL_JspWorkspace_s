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
 * Servlet implementation class TestController2
 */
@WebServlet("/TestController2")
public class TestController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestController2.doGet");
		
		String v1 = (String)request.getAttribute("request");
	
		HttpSession session = request.getSession();
		String v2 = (String)session.getAttribute("session");
		
		ServletContext ctx= getServletContext();
		String v3 = (String)ctx.getAttribute("application");
		
		System.out.println("===========================");
		System.out.println("request : " + v1);	// 함수마다 새롭게 요청되기 때문에 null로 나옴
		System.out.println("session : " + v2);
		System.out.println("application : " + v3);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
