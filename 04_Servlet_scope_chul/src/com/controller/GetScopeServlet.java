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
 * Servlet implementation class GetScopeServlet
 */
@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetScopeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg = (String)request.getAttribute("request");	// key에 해당하는 value값 꺼내기
		System.out.println("GetServlet : " + msg);
		
		HttpSession session = request.getSession();
		String x2 = (String)session.getAttribute("session");
		System.out.println("GetScopeServlet request ==== " + msg);
		System.out.println("GetScopeServlet request ==== " + x2);
		
		//application 얻기
		ServletContext ctx = getServletContext();
		String x3 = (String) ctx.getAttribute("application");
		System.out.println("GetScopeServlet applicaation===" + x3);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
