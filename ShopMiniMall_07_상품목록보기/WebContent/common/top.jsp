<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 회원 정보 받아오기
	MemberDTO dto = (MemberDTO)session.getAttribute("login");

// 해당 아이디 정보를 데이터 베이스에서 찾는 데 성공하여 회원 정보를 받아왔을 경우
if (dto != null) {
	String username = dto.getUsername();
%>
<%= username %> 님 환영합니다.<br>	<!-- 회원명 출력 -->
<a href="LogoutServlet">로그아웃</a>			<!-- 로그인 대신 로그아웃 연동 -->
<a href="">장바구니</a>
<a href="">mypage</a>
<%
	} else {	// 해당 아이디 정보를 데이터 베이스에서 찾지 못한 경우
%>
<a href="LoginUIServlet">로그인</a>	
<a href="MemberUIServlet">회원가입</a>
<%
	}
%>
