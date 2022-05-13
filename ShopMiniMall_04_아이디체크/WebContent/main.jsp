<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	String mesg = (String)session.getAttribute("memberAdd");
if (mesg != null) {
%>
<script type="text/javascript">
	alert("<%=mesg%>");
</script>
<%
	session.removeAttribute("memberAdd");	// 새로고침했을 때 alert 안 뜨도록
	}
%>
<title>Shopping</title>
</head>
<body>
	<h1>Main화면입니다.</h1>
	<jsp:include page="common/top.jsp" flush="true"></jsp:include><br>
	<jsp:include page="common/menu.jsp" flush="true"></jsp:include>
</body>
</html>