<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.EmpService"%>
<%@page import="com.dto.EmpDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	EmpService service = new EmpService();
	ArrayList<EmpDTO> list = service.selectAllEmp();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border ='1'>
	<tr>
		<td>사원번호</td>
		<td>사원이름</td>
		<td>월급</td>
		<td>입사일</td>
		<td>부서번호</td>
	</tr>


<% for(EmpDTO dto : list) { 
	/* int empno = dto.getEmpno();
	String ename = dto.getEname();
	int sal = (int)dto.getSal();
	String hiredate = dto.getHiredate();
	int deptno = dto.getDeptno(); */
%>
<tr>
	<%-- <td><%= empno %></td>
	<td><%= ename %></td>
	<td><%= sal %></td>
	<td><%= hiredate %></td>
	<td><%= deptno %></td> --%>
	<td><%= dto.getEmpno()%></td>
	<td><%= dto.getEname() %></td>
	<td><%= dto.getSal() %></td>
	<td><%= dto.getHiredate() %></td>
	<td><%= dto.getDeptno() %></td>
</tr>
<% } %>
</table>
</body>
</html>