package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductRegistrationServlet
 */
@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {
	private HashMap<String, Product> products = new HashMap<String, Product>();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>상품입력결과</title></head><body>");
		out.print("<b>상품입력결과</b>");
		
		try {
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			int amount = Integer.parseInt(request.getParameter("amount"));
			Product temp = products.get(id);	// id의 value값을 뽑아 temp에 저장
			System.out.println(products); // products에 뭐 들어있는지
			System.out.println(temp); 	// temp에 뭐 들어있는지 한번 보자;
			if (temp == null) {
				temp = new Product(name, id, amount);
				products.put(id, temp);
			} else {
				temp.setAmount(temp.getAmount()+amount);
			}
			out.println("<table border='1'>");
			out.println("<tr><th>상품명</th><th>상품아이디</th><th>수량</th></tr>");
			
			for (Product p : products.values()) {
				out.println("<tr>");
				out.println("<td>" + p.getName() + "</td><td>" + p.getId() + "</td><td>" + p.getAmount() + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (Exception e) {
			// TODO: handle exception
			out.println("입력항목확인요망<br>");
		}
		out.print("<a href='productForm.html'>상품입력하기</a>");
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
