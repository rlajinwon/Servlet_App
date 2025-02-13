<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/commons/table.jsp"></c:import>
</head>

<body>


<table>


<c:choose>

	<c:when test="${not empty dto}">
	
	<h3>${dto.productnum}</h3>
	<h3>${dto.productname}</h3>
	<h3>${dto.productrate}</h3>
	<h3>${dto.productdate}</h3>
	<h3>${dto.productdetail}</h3>
	
	<a href="./update.do?productnum=${dto.productnum}">상품 수정</a>
	
	
	
	</c:when>


	<c:otherwise>
		<h3>상품 정보가 없습니다.</h3>
	</c:otherwise>



	</c:choose>

</table>

</body>
</html>