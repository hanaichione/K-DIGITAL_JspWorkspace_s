package com.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/MemberUpdateServlet")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberUpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();	// session 받아와서
		MemberDTO dto = (MemberDTO) session.getAttribute("login");	// "login"으로 다시 session 설정 중
		String nextPage = null;
		int n = 0;
		if (dto != null) {
			request.setCharacterEncoding("utf-8");
			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			String username = request.getParameter("username");
			String post = request.getParameter("post");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
			String phone1 = request.getParameter("phone1");
			String phone2 = request.getParameter("phone2");
			String phone3 = request.getParameter("phone3");
			String email1 = request.getParameter("email1");
			String email2 = request.getParameter("email2");

			MemberDTO dto2 = new MemberDTO(userid, passwd, username, post, addr1, addr2, phone1, phone2, phone3, email1,
					email2);
			
			System.out.println(dto2);

			MemberService service = new MemberService();
			n = service.memberUpdate(dto2);
			System.out.println("update : " + n);
			if (n==1) {
				//
				// dto2.setUsername(dto.getUsername());	// main.jsp를 안 고쳤을 때, 원래 dto에서 받아오기
				// dto2 = service.mypage(userid);  		// userid로 해당 회원정보 다시 받아오기
				session.setAttribute("login", dto2);
				session.setAttribute("memberAdd", "회원정보가 수정되었습니다.");
			}
//			nextPage = "main";	
			nextPage = "MyPageServlet";	
		}else {
			nextPage = "LoginUIServlet";
			request.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		}
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
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
