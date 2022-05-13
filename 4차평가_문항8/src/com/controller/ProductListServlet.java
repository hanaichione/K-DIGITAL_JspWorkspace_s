package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		HttpSession session = request.getSession();
		Enumeration<String> keys = session.getAttributeNames();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>상품입력결과</title></head><body>");
		out.println("<b>상품입력 결과</b><hr/>");
		String html = "<table border='1'>";
		html += "<tr>";
		html += "<td>상품아이디</td>";
		html += "<td>상품명</td>";
		html += "<td>개수</td>";
		html += "</tr>";
		while (keys.hasMoreElements()) {
			String id = (String) keys.nextElement();
			Product p = (Product) session.getAttribute(id);
			html += "<tr>";
			html += "<td>"+p.getName()+"</td>";
			html += "<td>"+p.getId()+"</td>";
			html += "<td>"+p.getAmount()+"</td>";
			html += "</tr>";
		}
		html += "</table>";
		
		out.print(html);
		out.print("<a href='productForm.html'>등록화면보기</a><br>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
