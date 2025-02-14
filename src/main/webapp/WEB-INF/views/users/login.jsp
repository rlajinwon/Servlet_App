<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/commons/add.jsp"></c:import>
</head>
<body>


<form action="login.do" method ="post">

	<fieldset>
		<legend>회원 아이디</legend>
		<input type="text" name="username">
	</fieldset>

	<fieldset>
		<legend>비밀번호</legend>
		<input type="text" name="password">
	</fieldset>

	<fieldset>
		<button type ="submit">로그인</button>
	</fieldset>


</form>





</body>
</html>