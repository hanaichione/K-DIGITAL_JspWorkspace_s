package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OtherServlet")
public class OtherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public OtherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("OtherServlet.doget");
		
		ServletContext ctx = getServletContext();	// 외워야 함
		// web.xml에 설정된 context-param 데이터를 가지고 있는 객체 얻기
		
		String userid = ctx.getInitParameter("userid");	// test
		String email = ctx.getInitParameter("email");	// test@naver.com
		System.out.println(userid + "\t" + email);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
