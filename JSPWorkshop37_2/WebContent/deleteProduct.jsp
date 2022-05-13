<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String prodId = (String)request.getParameter("prodId");
MyProductService service = new MyProductService();
int n = service.deleteProduct(prodId);
%>
</head>
<body>
<%
	String mesg = prodId + "상품삭제 성공";
	if(n != 1){
		mesg = prodId + "상품삭제 실패";
	}
	out.print(mesg);
%>
<br>
<a href="listProduct.jsp">목록보기</a>
</body>
</html>