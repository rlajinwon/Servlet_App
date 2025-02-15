<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/commons/table.jsp"></c:import>
<c:import url="/WEB-INF/views/commons/detail.jsp"></c:import>
</head>

<body>


<table>


<c:choose>

	<c:when test="${not empty dto}">
	<fieldset>
		<legend>상품 번호</legend>
	<h3>${dto.productnum}</h3>
		</fieldset>
		
			<fieldset>
		<legend>상품 이름</legend>
	<h3>${dto.productname}</h3>
		</fieldset>
		
		<fieldset>
		<legend>이자율</legend>
	<h3>${dto.productrate}</h3>
		</fieldset>
	
		<fieldset>
		<legend>가입 날짜</legend>
	<h3>${dto.productdate}</h3>
		</fieldset>
	
	<%-- <%-- <a href="./update.do?productnum=${dto.productnum}">상품 수정</a> --%> --%>
	
<%-- 	<a href="./add.do?productnum=${dto.productnum}">상품 가입</a> --%>
	
	
	</c:when>


	<c:otherwise>
		<h3>상품 정보가 없습니다.</h3>
	</c:otherwise>



	</c:choose>

</table>

</body>
</html>