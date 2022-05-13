<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function login(event) {
		var id = document.getElementById("userid");
		var pw = document.getElementById("passwd");
		if (id.value.length==0) {
			alert("비번, 패스를 입력하세요");
			event.preventDefault();
		}
		if (pw.value.length==0) {
			alert("비번, 패스를 입력하세요");
			event.preventDefault();
		}
	}
</script>

</head>
<body>
	<form action="LoginServlet" method="get" onsubmit="login(event)">
		아이디 : <input type="text" name="userid" id="userid"><br>
		비밀번호 : <input type="text" name="passwd" id="passwd"><br>
		<button>로그인</button>
	</form>
</body>
</html>