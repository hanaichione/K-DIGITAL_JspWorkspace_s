<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	redirect되어서옴=================================<br>
	<%
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	
	String test = (String)request.getAttribute("test"); 
	%>
	사용자 id : <%= userid %><br>
	패스워드     : <%= passwd %><br>
	테스트     : <%= test %>
</body>
</html>