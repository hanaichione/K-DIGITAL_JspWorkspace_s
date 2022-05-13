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
		String name = (String) session.getAttribute("username");
		String pass = (String) session.getAttribute("passwd");
	%>
	<h2>세션정보2</h2>
	아이디 : <%= name %>
	비번 : <%= pass %>
</body>
</html>