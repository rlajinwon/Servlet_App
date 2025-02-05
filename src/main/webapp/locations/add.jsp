<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>지역정보 추가 페이지</h2>
	
	<form action="./addProcess.jsp" method="post">
	
	<input type="text" name="street_address">
	<input type="text" name="postal_code">
	<input type="text" name="city">
	<input type="text" name="state_province">
	<input type="text" name="country_id">
	
	
	<input type="submit" value="등록">
	</form>

</body>
</html>