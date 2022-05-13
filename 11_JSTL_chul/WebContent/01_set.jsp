<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- jstl 사용 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	jsp 태그 true <c:if test="<%=true %>">aaa</c:if><br> <!-- 브라우저에 출력됨 -->
	jsp 태그 false <c:if test="<%=false %>">aaa</c:if><br> <!-- 출력 안 됨 -->
	EL 태그 true <c:if test="${10>4}">aaa2</c:if><br>	<!-- 출력 됨 -->
	
	<h1>jstl 태그 사용</h1>
	xxx : ${xxx }<br>
	<c:if test="${not empty xxx}">xxx가 있음</c:if><br><!-- % if % -->
	<hr>
	<c:set var="aaa" value="${xxx}" scope="application"></c:set>
	<!-- application.setAttribute("aaa", "홍길동") -->
	<!-- EL 태그 사용 xxx를 bind하여 application에 aaa이름으로 set함(binding) -->
	
	이름 : ${aaa}<br> <!-- 홍길동 -->
	request의 이름 : <c:out value="${xxx}"></c:out><br> <!-- ${xxx} --> 
	application의 이름 : <c:out value="${aaa}"></c:out><br> <!-- 홍길동 -->
	<% int x = 100; %>
	<c:out value="<%= x %>"></c:out> <!-- 100 --><br>
	
	${xxx=='bbb'}<br>
	${xxx!='홍길동'}<br>
	${not empty xxx}<br>
	${empty xxx}<br>
	
	
	<!-- jsp jstl html 순서로 실행 -->
</body>
</html>