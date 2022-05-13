package com.dto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class productDeleteServlet
 */
@WebServlet("/productDeleteServlet")
public class productDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		
		Product p = (Product)session.getAttribute(id);
		System.out.println(id + "\t" + p.getId());
		if (p != null && id.trim().contentEquals(p.getId())) {
			session.removeAttribute(id);
			/*
			 * out.println("<h2>"+id+"상품 삭제 성공</h2>");
			 * out.println("<a href='productForm.html'>등록 화면 보기</a><br>");
			 * out.println("<a href='ProductListServlet'>상품 목록 보기</a><br>");
			 */
			response.sendRedirect("ProductListServlet");	// 상품 목록 보기로 화면 전환
		} else {
			out.println("<h2>"+id+" 상품은 등록되지 않은 상품입니다.</h2>");
			out.println("<a href='productForm.html'>등록 화면 보기</a><br>");
			out.println("<a href='ProductListServlet'>상품 목록 보기</a><br>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
