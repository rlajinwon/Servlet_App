<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>정보 수정</h2>

<form action="update.do" method="post">

	<fieldset>
		<legend>이름</legend>
		<input type="text" name="name" value="${user.name}">
	</fieldset>
	
	<fieldset>
		<legend>폰번호</legend>
		<input type="text" name="phone" value="${user1.phone}">
	</fieldset>

	<fieldset>
		<legend>이메일</legend>
		<input type="text" name="email" value="${user1.email}">
	</fieldset>

	<fieldset>
		<legend>비밀번호</legend>
		<input type="text" name="password" value="${user.password}">
	</fieldset>

			<fieldset>
		<button type="submit">정보수정</button>
			</fieldset>		

</form>








</body>
</html>