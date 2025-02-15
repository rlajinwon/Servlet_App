<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="/WEB-INF/views/commons/table.jsp"></c:import>
<c:import url="/WEB-INF/views/commons/header.jsp"></c:import>
</head>
<body>

	<table>
	
	<thead>
		<tr>
			<th>상품이름</th>
			<th>이자율</th>
		
		</tr>

	</thead>
	
	<tbody>
	
	<c:forEach items="${list}" var="d" varStatus="st">
	
	<tr>
	
		<td><a
			  href="./detail.do?productnum=${d.productnum}">${d.productname}</a>
				
		</td>
	
	<td>
		${d.productrate}
	</td>
	
	
	
	
		</tr>
		
	
			</c:forEach>
	
		</tbody>
	
	</table>
	
	<div>
		<a href="add.do">상품 등록</a>
	</div>




</body>
</html>