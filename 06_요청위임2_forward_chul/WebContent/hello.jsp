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
// mvc 패턴의 view 부분, 데이터를 받아 화면만 구현해 줌
String mesg = (String)request.getAttribute("request");
String mesg2 = (String)session.getAttribute("session");
String mesg3 = (String)application.getAttribute("application");
%>
1>> <%= mesg %>
2>> <%= mesg2 %>
3>> <%= mesg3 %>
<hr>
request : <%= request.getAttribute("request")%><br>
session : <%= session.getAttribute("session")%><br>
application : <%= application.getAttribute("application")%><br>
</body>
</html>