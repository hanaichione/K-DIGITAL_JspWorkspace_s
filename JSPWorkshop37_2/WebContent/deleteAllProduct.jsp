<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
MyProductService service = new MyProductService();

String [] ids = request.getParameterValues("delCheck");
System.out.println("prodId = "+ids);
List<String> x = Arrays.asList(ids);	// arraylist랑 list 차이가 무엇?
System.out.println("deleteAllProduct.jsp = "+x);
int n = service.deleteAllProduct(x);
%>
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String pName = "";
	for(String name : x){
		pName += (name + " ");
	}
	String mesg = pName + " 상품 삭제 성공";
	if(n==0){
		mesg = pName + " 상품 삭제 실패";
	}
	out.print(mesg);
%>
<br>
<a href="listProduct.jsp">목록보기</a>
</body>
</html>