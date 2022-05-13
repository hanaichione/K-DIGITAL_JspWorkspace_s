package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 인스턴스 변수, static 변수 -> 공유 가능(threaed-unsafe)
	int num;
	ArrayList<String> list = new ArrayList<String>();
    
    public TestServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		num++;
		list.add("홍길동");
		
		int size = 10;	// 계속 10 유지
		System.out.println("doGet member num = " + num);
		System.out.println("doGet member list = " + list);
		System.out.println("doGet size = " + size);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
