<%@page import="java.util.HashMap"%>
<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String prodId = request.getParameter("prodId");
String quantity = request.getParameter("quantity");

MyProductService service = new MyProductService();
HashMap<String, Object> map = new HashMap<>();
map.put("prodId", prodId);
map.put("quantity", Integer.parseInt(quantity));	// integer객체
int num = service.updateProduct(map);
%>
<%=num %>개 수정됨
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="listProduct.jsp">목록으로 이동</a>
</body>
</html>