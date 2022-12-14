<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <!-- core 태그 라이브러리를 사용하기 위해서 반드시 선언해야 되는 부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력 창</title>
</head>
<body>
	<table border="1" align="center" >
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
		</tr>
<c:choose>
<c:when test="${empty param.id}">
	<tr align="center">
		<td colspan=4>아이디를 입력하세요!!</td>
	</tr>
</c:when>
<c:otherwise>
	<tr align="center">
		<td><c:out value="${param.id}"/></td>
		<td><c:out value="${param.pwd}"/></td>
		<td><c:out value="${param.name}"/></td>
		<td><c:out value="${param.email}"/></td>
	</tr>
</c:otherwise>
</c:choose>
		</table>
</body>
</html>