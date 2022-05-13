<%@page import="java.util.HashMap"%>
<%@page import="com.service.MyProductService"%>
<%@page import="com.dao.MyProductDAO"%>
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
	String prodId = request.getParameter("prodId");
String quantity = request.getParameter("quantity");

MyProductService service = new MyProductService();
HashMap<String, Object> map = new HashMap<>();
map.put("prodId", prodId);
map.put("quantity", Integer.parseInt(quantity));
int n = service.updateProduct(map);
%>
<%=n %>개 수정됨
<a href="listProduct.jsp">목록으로 이동</a>
</body>
</html>