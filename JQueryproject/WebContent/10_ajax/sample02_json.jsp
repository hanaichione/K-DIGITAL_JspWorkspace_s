<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = "홍길동";
	int age = 20;
	// 클라이언트에 전달 text(=> json 변환 필요, parseJson), json
%>
{
"username" : "<%=name %>",
"age" : "<%=age %>"
}