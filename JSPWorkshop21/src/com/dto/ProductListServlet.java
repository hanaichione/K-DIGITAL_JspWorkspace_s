package com.dto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Enumeration<String> key = session.getAttributeNames();	// session으로 받아서 키값만 빼옴
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>상품입력결과</title></head><body>");
		out.println("<b>상품입력 결과</b><hr/>");
		String my = "<table border='1'>";
		   my += "<tr>";
		   my += "<td>상품 아이디</td>";
		   my += "<td>상품명</td>";
		   my += "<td>갯수</td>";
		   my += "</tr>";
		while (key.hasMoreElements()) {
			String id = (String) key.nextElement();
			Product p = (Product)session.getAttribute(id);
			
			my += "<tr>";
			my += "<td>" + p.getId() +"</td>";
			my += "<td>" + p.getName() +"</td>";
			my += "<td>" + p.getAmount() +"</td>";
			my += "</tr>";
		}
		
		my += "</table>";
		out.print(my);
		out.println("<a href='productForm.html'>등록 화면 보기</a><br>");
		out.println("<a href='ProductAllDeleteServlet'>전체 상품 삭제</a><br>");
		out.println("<a href='productDelete.html'>특정 상품 삭제</a><br>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
