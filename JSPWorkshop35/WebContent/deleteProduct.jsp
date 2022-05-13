<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String prodid = request.getParameter("prodId");
System.out.println(prodid);

MyProductService service = new MyProductService();
int n = service.delete(prodid);
// out.print(n);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String mesg = prodid + "상품삭제 성공";
		if(n!=1){
			mesg = prodid + "상품삭제 실패";
		}
		out.print(mesg);
	%>
	<br>
	<a href="listProduct.jsp">목록보기</a>
</body>
</html>