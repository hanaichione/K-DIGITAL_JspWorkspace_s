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
	%>
	일반 : <%= userid %><br>
	일반 : <%= passwd %><br>
	<hr>
	
	EL : ${param.userid }<br> <!-- 반드시 param.으로 뽑아야 함! -->
	EL : ${param.passwd }<br>
	<hr>
	${param.aaa}	<!-- http://localhost:8086/10__EL_chul/login.jsp?aaa=1234 -->
</body>
</html>