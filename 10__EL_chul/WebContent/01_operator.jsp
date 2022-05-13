<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>연산기능</h1>
${"홍길동"}<br>
<%="홍길동"%><br>
<HR>

${10+4}<br>
${10-4}<br>
${10*4}<br>
${10/4}<br>
<hr>

${10>=4}<br>
${10<=4}<br>
${10==4}<br>
${10!=4}<br>
<hr>

<% int x = 10; %>
표준 jsp 태그 x : <%= x %><br>
<%-- <%= ${10+4} %>	el과 jsp 태그 혼용 불가(에러) --%>
el태그 x : ${x}<br>	<!-- x는 변수지 request로 바인딩된 객체가 아니기 때문에 접근 불가 -->
<!-- bind 객체(request, session, application 등)에만 접근이 가능, 일반 변수 사용 불가* -->

</body>
</html>