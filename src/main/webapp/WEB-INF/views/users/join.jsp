<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/commons/add.jsp"></c:import>
<c:import url="/WEB-INF/views/commons/header.jsp"></c:import>

</head>
<body>

	<form action="join.do" method="post">
	<fieldset>
		<legend>회원 아이디</legend>
		<input type="text" name="username">
	
	</fieldset>

	<fieldset>
		<legend>비밀번호</legend>
		<input type="password" name="password">
	
	</fieldset>

	<fieldset>
		<legend>이름</legend>
		<input type="text" name="name">
	
	</fieldset>

	<fieldset>
		<legend>전화번호</legend>
		<input type="text" name="phone">
	
	</fieldset>

	<fieldset>
		<legend>이메일</legend>
		<input type="text" name="email">
	
	</fieldset>
	
	
	<fieldset>
		<button type="submit">회원등록</button>
	</fieldset>		


</form>


</body>
</html>