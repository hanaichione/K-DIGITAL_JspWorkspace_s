<%@page import="com.dto.Person"%>
<%@page import="java.util.List"%>
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
	List<Person> list = (List)request.getAttribute("xxx");
	/* List<Person> list2 = ${xxx}; */
	for(Person p : list){
%>
일반 : <%=p.getAge() %><br>
일반 : <%= p.getUsername() %><br>
<%} %>
<hr>
${xxx }<br>
El:::::::::::::::::${xxx[0].username }<br>
<%for(int i=0; i <= list.size(); i++){ %>
<!-- jsp의 i를 쓸 수 없어서 아무것도 출력이 안 됨 -->
<!-- jstl 태그를 사용해야 함 -->
EL : person.name = ${xxx[i].username }<br>
EL : person.age = ${xxx[i].age }<br>
<%} %>

<% int x = 0; %>
El:::::::::::::::::${xxx[x].username }<br> <!-- 마찬가지로 안 나옴 -->
</body>
</html>