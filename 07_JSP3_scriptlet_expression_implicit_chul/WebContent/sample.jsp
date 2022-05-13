<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- html 주석 -->
    <%-- jsp 주석 --%>
    
    <%!
    	//declaration tag : 멤버변수/멤버메소드 작성시 사용
    	int num = 10;
    	public String a(int tt){
    		System.out.println("a=========" + tt);
    		return "test";
    	}
    %>
    <%
    	//scriptlet 에서 사용하는 코드는
    	//servlet의 doGet, doPost 안으로 적용됨
    	System.out.println(num);
    	a(10);
    	Date d = new Date();
    	System.out.println(d);
    	ArrayList x = new ArrayList();
    	x.add(10);
    	System.out.println(x);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = "홍길동";
		System.out.println("body 사이의 %태그에 출력 : " + str);	// console 출력
	%>
	브라우저에 출력 : <%= str %> <br>
	num : <%= num %><br>
	<%= a(100) %>
</body>
</html>
    