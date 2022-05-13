package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloTestServlet
 */
@WebServlet("/test")
public class HelloTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HelloTestServlet() {
        super();
        System.out.println("기본생성자 호출됨=============");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost호출");
		doGet(request, response);
	}

}
