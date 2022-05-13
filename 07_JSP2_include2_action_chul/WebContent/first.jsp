<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h1 {
	color: red;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("xxx", "홍길동");
	%>
	first.jsp
	<br> 아래 화면은 top.jsp를 jsp:include 시킨 내용입니다.
	<hr>
	<jsp:include page="include/top.jsp" flush="true" />
	<!-- end tag 빼먹지 말고! -->
	<!-- flush 속성 : 캐쉬 없이 변화가 생기면 바로 반영하도록 설정 -->
	<hr>
	다시 first.jsp 내용입니다.
</body>
</html>