package com.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SetScopeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("request", "홍길동");
		String msg = (String)request.getAttribute("request");	// key에 해당하는 value값 꺼내기
		System.out.println("SetServlet : "+msg);
		
		response.setContentType("text/html;charset=UTF-8"); // 1. 응답헤더 설정
		PrintWriter out = response.getWriter();
		out.print("<a href='GetScopeServlet'>getServlet</a>");	
		// request, response를 매개변수로 받고 있음 > doGet 끝나면 매개변수 사라짐 > 링크 걸어도 전달 안 됨
		// doGet 실행될 때마다 새로운 매개변수로 처리
		
		// Session Scope에 저장 
		// session : 브라우저 라이프 사이클과 같음, 페이지가 바뀌어도 세션은 살아있음(리퀘스트는 아님), 브라우저를 모두 닫았다 열면 session도 죽음
		// 세션 만료돼서 다시 로그인해야 하는 경우 생각해보기!!(학교 사이트끼리 공유하나보다 로그인 세션)
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");
		
		// application scope에 저장, 모든 브라우저, 모든 servlet에서 다 읽을 수 있음, 브라우저 종료시에도 살아있음
		ServletContext ctx = getServletContext();
		ctx.setAttribute("application", "유관순");
		
		System.out.println("request : 홍길동");
		System.out.println("session : 이순신");
		System.out.println("application : 유관순");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
