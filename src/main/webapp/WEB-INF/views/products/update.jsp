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


<form action="./update.do" method="post">

<input type="hidden" name="productNum" value="${updateDTO.productnum }">
	
	<fieldset>
		<legend>상품이름</legend>
	<input type="text" name="productname" value="${dto.productname}">
		</fieldset>
		
		
	<fieldset>
		<legend>이자율</legend>
	<input type="text" name="productrate" value="${dto.productrate}">
	</fieldset>
	
	
	<button type ="submit">수정</button>
</form>


</body>
</html>