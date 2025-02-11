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

	
	
	<form action="./join.do" method="post">
	
		<fieldset>
			<legend>이름</legend>
		<input type ="text" name ="first_name" value="name">
			</fieldset>

			<fieldset>
				<legend>성</legend>
		<input type ="text" name ="list_name">
		
		</fieldset>
		
		<fieldset>
			<legend>이메일</legend>
		<input type ="text" name ="email">
	</fieldset>

	<fieldset>
			<legend>폰번호</legend>
		<input type ="text" name ="phone_number">
	</fieldset>


	<fieldset>
			<legend>입사 날짜</legend>
		<input type ="text" name ="hire_date">
	</fieldset>


	<fieldset>
			<legend>직업 아이디</legend>
		<input type ="text" name ="job_id">
	</fieldset>

	<fieldset>
			<legend>급여</legend>
		<input type ="text" name ="salary">
	</fieldset>

	<fieldset>
			<legend>성과급</legend>
		<input type ="text" name ="commission_pct">
	</fieldset>
	
		<fieldset>
			<legend>매니저 아이디</legend>
		<input type ="text" name ="manager_id">
	</fieldset>

			<fieldset>
			<legend>부서 아이디</legend>
		<input type ="text" name ="department_id">
	</fieldset>

			<fieldset>
			<legend>비밀 번호</legend>
		<input type ="text" name ="password">
	</fieldset>

	


		<input type ="submit" value="사원 정보 추가">
		
	</form>





</body>
</html>