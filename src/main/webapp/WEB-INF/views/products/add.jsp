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
		<legend>상품 이름</legend>
	<input type = "text" name ="productname" value ="상품이름">
	</fieldset>
	
	<fieldset>
		<legend>이자율</legend>
	<input type = "text" name ="productrate" value = "이자율">
			</fieldset>
	
	<button type="submit">등록</button>
	


</form>

</body>
</html>