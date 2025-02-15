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



<form action="add.do" method="post">
	<fieldset>
		<legend>회원이름</legend>
	<input type = "text" name ="username" value ="회원이름">
	</fieldset>
	
	<fieldset>
		<legend>상품번호</legend>
	<input type = "text" name ="productnum" value = "상품번호">
			</fieldset>
			
			<fieldset>
		<legend>잔고</legend>
	<input type = "hidden" name ="accountbalance" value = "잔고">
			</fieldset>
	
	<button type="submit">등록</button>


</form>
</body>
</html>