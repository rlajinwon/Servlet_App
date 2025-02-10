<%@page import="com.winter.app.locations.LocationDTO"%>
<%@page import="com.winter.app.locations.LocationDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	
   	<%
   	
   	LocationDTO locationDTO = (LocationDTO)request.getAttribute("dto");
   	%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Location Detail Page</h1>
	
	
	<%if(locationDTO != null){%>
	
	<h3><%=locationDTO.getLocationId()%></h3>
	<h3><%=locationDTO.getCity() %></h3>
	<h3><%=locationDTO.getStreetAddress()%></h3>
	
	<a href ="./update.do?location_id=<%=locationDTO.getLocationId()%>">부서수정</a>
	<a href ="./delete.do?location_id=<%=locationDTO.getLocationId()%>">지역정보 삭제</a>
	
 	<%}else{ %>
 	<h3>없는 부서</h3>
 	<%} %>
</body>
</html>