<%@page import="com.winter.app.locations.LocationDTO"%>
<%@page import="com.winter.app.locations.LocationDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    
	LocationDTO locationDTO = new LocationDTO();
	String address = request.getParameter("street_address");
	String postal = request.getParameter("postal_code");
	String city = request.getParameter("city");
	String state = request.getParameter("state_province");
	String country = request.getParameter("country_id");
	
	locationDTO.setStreetAddress(address);
	locationDTO.setPostalCode(postal);
	locationDTO.setCity(city);
	locationDTO.setStateProvince(state);
	locationDTO.setCountryId(country);
	
	
	LocationDAO locationDAO = new LocationDAO();
	int result = locationDAO.add(locationDTO);
    
 
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>지역 정보 등록 페이지</h1>

<%if(result > 0){ %>

	<h2>지역 등록 성공</h2>


<%}else{ %>
	<h2>지역 등록 실패</h2>

<%} %>
		<a href="/">HOME</a>
		<a href="./list.jsp">지역 리스트</a>








</body>
</html>