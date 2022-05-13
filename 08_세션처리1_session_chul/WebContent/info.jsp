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
		String name = (String)session.getAttribute("username");
		String pass = (String)session.getAttribute("passwd");
	%>
	<h1>세션정보</h1>
	이름 : <%= name %><br>
	비번 : <%= pass %><br>
	<a href="GetServlet">GetServlet가기</a>
</body>
</html>