package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmpService service = new EmpService();

		List<EmpDTO> list = service.select();
		System.out.println(list);

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		String my = "<table border ='1'>";
		my+= "<tr>";
		my += "<td>사원번호</td>";
		my += "<td>사원이름</td>";
		my += "<td>월급</td>";
		my += "<td>입사일</td>";
		my += "<td>부서번호</td>";
		my += "</tr>";
		
		for (EmpDTO dto : list) {
			my += "<tr>";
			my += "<td>" + dto.getEmpno() + "</td>";
			my += "<td>" + dto.getEname() + "</td>";
			my += "<td>" + dto.getSal() + "</td>";
			my += "<td>" + dto.getHiredate() + "</td>";
			my += "<td>" + dto.getDeptno() + "</td>";
			my += "</tr>";
		}
		my += "</table>";
		out.print(my);
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
