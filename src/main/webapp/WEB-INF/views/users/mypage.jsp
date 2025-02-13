<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<div>

<h3>이름: ${sessionScope.user.name}</h3>
<h3>폰 번호:${user1.phone}</h3>
<h3>이메일: ${user1.email}</h3>

</div>

<div>
	<a href ="./update.do">정보 수정</a>
</div>




</body>
</html>