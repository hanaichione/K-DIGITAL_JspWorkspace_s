<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>2. bind2</h1>
<%
String xxx = (String)request.getAttribute("xxx");
%>
일반 : <%=xxx%><br>
<hr>
EL requestScope : ${requestScope.xxx }<br> <!-- 내장객체 이름에 Scope 붙여서 쓰기 -->
EL request : ${request.xxx}<br> <!-- 출력 안 됨 -->
xxx : ${xxx }<br>
yyy : ${yyy }<br>
zzz : ${zzz }<br>

EL requestScope : ${requestScope.xxx }<br>
EL sessionScope : ${sessionScope.yyy }<br>
EL applicationScope : ${applicationScope.zzz }<br>
</body>
</html>