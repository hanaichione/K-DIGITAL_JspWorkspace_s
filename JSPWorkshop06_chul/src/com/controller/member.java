package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member")
public class member extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public member() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String ssn = request.getParameter("ssn");
		String gender = (ssn.substring(7,8)).contentEquals("1")?"남자":"여자";
		String[] hobby = request.getParameterValues("hobby");
		String mesg="";
		for (String x : hobby) {
			System.out.println(x);
			mesg += x + " ";	// web 출력용
		}
		String marry = request.getParameter("marry");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		String my = "이름은 " + username + "<br>"; 
		my += "성별은 " + gender + "<br>"; 
		my += "취미는 " + mesg + "<br>";
		my += "결혼여부는 " + marry;
		out.print(my);
		out.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
