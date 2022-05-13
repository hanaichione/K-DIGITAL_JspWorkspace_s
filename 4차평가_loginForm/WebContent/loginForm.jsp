<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function login() {
		var id = document.getElementById("userid");
		var pw = document.getElementById("passwd");
		if(id.value.length==0){
			alert("아이디 값을 입력하시오.");
			id.focus();
			event.preventDefault();
		}
		if(pw.value.length==0){
			alert("비밀번호 값을 입력하시오.");
			pw.focus();
			event.preventDefault();
		}
	}
</script>
</head>
<body>
<form action="success.html" onsubmit="login()">
아  이 디 : <input type="text" name="userid" id="userid"><br>
비밀번호 : <input type="text" name="passwd" id="passwd"><br>
<button>로그인</button>
</form>
</body>
</html>