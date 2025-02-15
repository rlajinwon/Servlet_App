<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/commons/header.jsp"></c:import>
</head>
<body>


<div>

	<fieldset>
		<legend>이름</legend>
<h3>${sessionScope.user.name}</h3>
	</fieldset>

<fieldset>
		<legend>폰번호</legend>
<h3>${user1.phone}</h3>
	</fieldset>
	
	<fieldset>
		<legend>이메일</legend>
	<h3>${user1.email}</h3>
	</fieldset>

</div>

<div>
	<a href ="./update.do">정보 수정</a>
</div>




</body>
</html>