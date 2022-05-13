<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	// 내장객체 request, session, application은 import 및  new없이 사용 가능
	out.print(request.getParameter("id")+"<br>");	// request는 전달 안 됨 null
	out.print(request.getAttribute("CCC")+"<br>");	// ..
	out.print(session.getAttribute("AAA")+"<br>");	// aaa
	out.print(application.getAttribute("BBB")+ "<br>");	// bbb
	
	out.print("홍길동<br>");
%>
</body>
</html>