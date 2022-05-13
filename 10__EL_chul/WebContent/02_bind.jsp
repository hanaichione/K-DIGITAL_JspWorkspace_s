<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>2. bind</h1>
	<%
		String xxx = (String)request.getAttribute("xxx");
	%>
	일반 : <%=xxx %><br>
	
	<HR>
	EL 이용한 데이터 얻기 : ${xxx}<br>
	EL : ${empty xxx}<br>
	EL : ${not empty xxx}<br>
	
</body>
</html>