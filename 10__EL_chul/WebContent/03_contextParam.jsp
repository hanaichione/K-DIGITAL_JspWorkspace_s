<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>03_contextParam</h1>
<%
/* init은 web.xml에서 불러올 때 사용 */
String userid2 = getServletContext().getInitParameter("userid");	// 서블릿

String userid = application.getInitParameter("userid");
String email = application.getInitParameter("email");
%>
서블릿 : <%= userid2 %><br>
jsp : <%= userid %><br>
jsp : <%= email %><br>
<hr>
EL : ${initParam.userid }<br>	<!-- 내장객체 web.xml 설정된 key 읽기 -->
EL : ${initParam.email }<br>
</body>
</html>