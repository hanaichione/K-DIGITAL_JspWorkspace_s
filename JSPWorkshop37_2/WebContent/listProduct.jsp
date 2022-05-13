<%@page import="java.util.List"%>
<%@page import="com.service.MyProductService"%>
<%@page import="com.dto.MyProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MyProductService service = new MyProductService();
	List<MyProductDTO> list = service.select();
%>

<!DOCTYPE html>
<script type="text/javascript">
	function delProduct(id) {
		location.href = "deleteProduct.jsp?prodId="+id;
	}
	
	function chk(s){
		var list = document.querySelectorAll(".delCheck");
		for (var i = 0; i < list.length; i++) {
			list[i].checked = s.checked;
		}
	}
	
	function delAll() {
		document.querySelector("#delForm").action = 'deleteAllProduct.jsp';
	}
	
	function update(id) {
		event.preventDefault();
		var url = document.querySelector("#quantity"+id);
		var quantity = url.value;
		location.href = "updateProduct.jsp?prodId="+id+"&quantity="+quantity;
	}
	
</script>



<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="delForm">
	<table border='1'>
	<tr>
    <td><input type="checkbox" name="delCheckAll" id="delCheckAll" onclick="chk(this)">전체선택</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       </td>
    <td>상품아이디</td>
    <td>상품명</td>
    <td>가격</td>
    <td>갯수</td>
    <td>삭제</td>
    <%
  		for(MyProductDTO dto : list){
  	%>
  	<tr>
  		<td><input type="checkbox" name="delCheck" class="delCheck" value="<%=dto.getProdId()%>"></td>
  		<td><%= dto.getProdId() %></td>
  		<td><%= dto.getProdName() %></td>
  		<td><%= dto.getPrice() %></td>
  		<td><%= dto.getQuantity() %></td>
  		<td><input type="text" name="quantity" value="<%= dto.getQuantity() %>" id="quantity<%=dto.getProdId()%>"></td>
  		<td><button onclick="delProduct('<%=dto.getProdId()%>')">삭제</button></td>
  		<td><button onclick="update('<%=dto.getProdId()%>')">수정</button></td>
  	</tr>
  	<% 
  	} 
  	%>
	</table><br>
	<button id="deleteAllProduct" onclick="delAll()">선택된 항목 삭제</button>
	</form>
</body>
</html>