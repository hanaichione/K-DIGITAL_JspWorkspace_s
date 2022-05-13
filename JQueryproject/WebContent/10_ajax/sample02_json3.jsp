<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	
	// cros domain 허용 코드
	response.setHeader("Access-Control-Allow-Origin", "*");
	String name = "홍길동";
int age = 20;
%>
[
{"username":"<%=name%>", "age":"<%=age%>"}, 
{"username":"유관순", "age":"40"}, 
{"username":"강감찬", "age":"55"} 
]
