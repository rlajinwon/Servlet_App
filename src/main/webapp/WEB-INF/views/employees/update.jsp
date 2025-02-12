<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<h1>Update Form</h1>
	
	<form action="./update.do" method ="post">
		
		<input type="text" name="last_name" value="${requestScope.user.last_name}">
		<input type="text" name="first_name" value="${sessionScope.user.first_name}">
		<button type="submit">수정</button>
			
	</form>


</body>
</html>