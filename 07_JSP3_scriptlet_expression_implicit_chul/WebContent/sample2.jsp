<%-- <%@page import="java.util.Arrays"%> --%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%-- <%@page import="java.util.ArrayList"%> --%>
<%-- <%@page import="java.util.List"%> --%>
<%@page import="java.util.*" %>
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
		List<String> list=
		Arrays.asList("홍길동", "이순신", "유관순");
		for(String s:list){
	%>
	이름 : <%= s %> <br>
	<% } %>
	<hr>
	
	<% int a = 10;
	if(a >= 10){
	%>
		크다<hr>
	<% } else { %>
		작다
	<% } 
	
	int sum = 0;
	for(int i = 0; i <= 10; i++){
		sum += i;
		out.print(sum + "<br>");
	}
	out.print("<br>"+sum);	// 브라우저에 출력
	%>
	<%-- <%= sum %> --%>
	
	<hr>
</body>
</html>