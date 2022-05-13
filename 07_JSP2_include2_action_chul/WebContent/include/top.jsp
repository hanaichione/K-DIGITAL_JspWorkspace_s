<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- html/body 태그 생략 -->
<%! int num = 10; %>
<%
// main.jsp에서 사용한 request를 재사용
String mesg = (String)request.getAttribute("xxx");
%>
<h1>
top.jsp
안녕하세요? mesg=== <%= mesg %>
num=== <%= num %>
</h1>