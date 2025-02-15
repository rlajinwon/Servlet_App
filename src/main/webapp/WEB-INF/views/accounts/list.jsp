<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/commons/header.jsp"></c:import>
</head>
<body>


		<nav class="nav">
			<ul class="contents_top">
				<li><a href="/products/list.do">홈으로</a></li>
				<li><a href="/products/list.do">My Page</a></li>
				<li><a href="/products/add.do">상품 조회</a></li>
			</ul>
		</nav>

	
	<table>
				<thead>
					<tr>
						<th>계좌 번호</th>
						<th>잔액</th>
						<th>가입일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="dto">
						<tr>
							<td>${dto.accountNum }</td>
							<td>${dto.accountBalance }</td>
							<td>${dto.accountDate }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	







</body>
</html>