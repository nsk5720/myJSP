<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("id", "hong");
	request.setAttribute("pwd", "1234");
	session.setAttribute("name", "홍길동");
	application.setAttribute("email", "hong@test.com");
	request.setAttribute("address", "서울시 강남구");			
%>
<!-- 우선순위//request(강남구) 셋팅 > session(팔달구) 셋팅 > application(변수셋팅) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward4</title>
</head>
<body>
	<jsp:forward page="member4.jsp"/>		<!-- 트리거 -->
</body>
</html>