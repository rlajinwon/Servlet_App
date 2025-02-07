<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <link rel="stylesheet" href="/resources/css/add.css">
</head>


<body>

	
	
	<form action="./addProcess.jsp" method="post">
		<fieldset>
			<legend>부서 이름</legend>
		<input type ="text" name ="department_name" value="test">
			</fieldset>

			<fieldset>
				<legend>매니저 아이디</legend>
		<input type ="text" name ="manager_id">
		
		</fieldset>

		
		<fieldset>
			<legend>지역 아이디</legend>
		<input type ="text" name ="location_id">
	</fieldset>


		<input type ="submit" value="부서 정보 추가">
		
	</form>





</body>
</html>