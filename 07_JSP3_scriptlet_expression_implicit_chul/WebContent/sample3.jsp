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
	String id = request.getParameter("id"); /* url로 넘어오는 데이터 받아서 쓸 수 있음 */
	System.out.println("request.getParameter(id) = " + id);
	request.setAttribute("CCC", "ccc");
	session.setAttribute("AAA", "aaa");	// 내장객체 이름으로 바로 사용 가능
	application.setAttribute("BBB", "bbb");
	out.print("홍길동");
%>
</body>
</html>