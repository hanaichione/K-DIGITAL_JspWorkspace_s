<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		if(userid.equals("abcd")){
			out.print("회원인증됨");
		} else {
			request.setAttribute("test", "홍길동");
			// response.sendRedirect("reponseRedirect.jsp");	// 화면전환, userid, passwd 안 넘어감
			RequestDispatcher dis = request.getRequestDispatcher("reponseRedirect.jsp");	// 다 넘어감
			dis.forward(request, response);
		}
	%>
	사용자 id : <%= userid %>
	패스워드     : <%= passwd %>
	
</body>
</html>