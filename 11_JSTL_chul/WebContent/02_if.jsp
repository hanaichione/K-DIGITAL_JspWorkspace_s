<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>jstl 태그 이용 if</h1>
${xxx}<br>
<c:if test="${xxx=='홍길동'}">홍길동넘어옴</c:if>

<c:choose>
	<c:when test="${xxx == '홍길동' }">홍길동임</c:when>
	<c:when test="${xxx == '이순신' }">이순신임</c:when>
	<c:when test="${xxx == '유관순' }">유관순임</c:when>
	<c:otherwise>자료가 없음</c:otherwise>
</c:choose>
</body>
</html>