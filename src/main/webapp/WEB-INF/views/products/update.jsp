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


<form action="./update.do" method="post">

	<input type="hidden" name="productnum" value="${dto.productnum}">
	<input type="text" name="productname" value="${dto.productname}">
	<input type="text" name="productrate" value="${dto.productrate}">

	<button type ="submit">수정</button>
</form>


</body>
</html>