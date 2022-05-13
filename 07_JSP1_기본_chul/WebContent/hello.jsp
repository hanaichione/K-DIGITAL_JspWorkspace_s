<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- jsp 태그 -->
<%@ page import="java.util.Date" %>	<!-- import -->
<%@ page import="java.util.Random"%>
<%-- <%@ page import="com.dto.Person"%> --%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // doget, dopost 부분과 동일
		String name = "홍길동"; 
		System.out.println(name);
		Date d = new Date();
		Random r = new Random();
		// Person p = new Person(); // 자바와 동일한 주석
	%>
	<h1>Jsp 기본 실습</h1>
	hello!<br>
	안녕하세요 <%= name %>	<!-- jsp 태그가 먼저 실행되고 실행 결과가 html에 추가되어 사용자는  html만 보게 됨 -->
</body>
</html>
