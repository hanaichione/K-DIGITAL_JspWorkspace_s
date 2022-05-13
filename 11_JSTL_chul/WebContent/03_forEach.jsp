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
<h1>jstl core 태그의 사용 - forEach</h1>

<h3>forEach1: c: forEach</h3>
<c:forEach var="x" begin="1" end="5">
hello: ${x }	<!-- x를 증가시켜주고 있음 -->
</c:forEach>
<hr>

<h3>forEach2: c: forEach step</h3>
<c:forEach var="x" begin="0" end="5" step="2">
>>>>${x }&nbsp;&nbsp;
</c:forEach>
<hr>

<h3>forEach3: c: forEach List<Person></h3>
<c:forEach var="p" items="${xxx}">
${p.username}, ${p.age}<br>
</c:forEach>
<hr>

<h3>forEach4: c: forEach List<Person> status</h3>
<c:forEach var="person" items="${xxx}" varStatus="status">	<!-- ** 제일 중요 ** -->
index: ${status.index}<br>	<!-- 방번호 -->
count: ${status.count}<br>	<!-- 순회갯수 -->
current: ${status.current}<br>	<!-- Person [username=이순신, age=10] -->
first: ${status.first}<br>
last: ${status.last}<br>
${person.username } : ${person.age }<br>
current : ${status.current.username }<br>
</c:forEach>

<h3>forEach5: c: forTokens</h3>
<c:forTokens var="x" items="${yyy }" delims="/">
${x }<br>
</c:forTokens>

</body>
</html>