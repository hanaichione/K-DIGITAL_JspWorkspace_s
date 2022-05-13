<%@page import="com.dto.Person"%>
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
	String xxx = (String)request.getAttribute("xxx");
	Person p = (Person)request.getAttribute("person");
%>
일반 : <%=xxx %><br>
일반 : <%=p.getUsername() %><br>
일반 : <%=p.getAge() %><br>

<hr>
${person }<br>
el : ${xxx}<br>

el : person.name = ${requestScope.person.username }<br>
el : person.name = ${person.username }<br>
el : person.age = ${person.age }<br>

<input type = "text" value="${person.username}">
</body>
</html>