<%@page import="com.winter.app.locations.LocationDTO"%>
<%@page import="com.winter.app.locations.LocationDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	
   	<%
   	LocationDTO locationDTO = new LocationDTO();
   String location_id = request.getParameter("location_id");
   locationDTO.setLocationId(Integer.parseInt(location_id));
 	
   	LocationDAO locationDAO = new LocationDAO();
   	locationDTO = locationDAO.getdetail(locationDTO);
   	
   	
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
	
	<a href ="./update.jsp?location_id=<%=locationDTO.getLocationId()%>">부서수정</a>
	<a href ="./deleteProcess.jsp?location_id=<%=locationDTO.getLocationId()%>">지역정보 삭제</a>
	
 	<%}else{ %>
 	<h3>없는 부서</h3>
 	<%} %>
</body>
</html>