<%@page import="com.winter.app.locations.LocationDAO"%>
<%@page import="com.winter.app.locations.LocationDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
String id = request.getParameter("location_id");
String street = request.getParameter("street_address");
String postal = request.getParameter("postal_code");
String city = request.getParameter("city");
String state = request.getParameter("stateProvince");
String country = request.getParameter("country_id");

LocationDTO locationDTO = new LocationDTO();
locationDTO.setLocationId(Integer.parseInt(id));
locationDTO.setStreetAddress(street);
locationDTO.setPostalCode(postal);
locationDTO.setCity(city);
locationDTO.setStateProvince(state);
locationDTO.setCountryId(country);

LocationDAO locationDAO = new LocationDAO();
int result = locationDAO.update(locationDTO);


	String r = "부서 수정 실패";

	if(result > 0){
		r ="부서 수정 성공";
	}
	
%>
	
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3><%= r %></h3>
	<a href ="/">Home</a>
	<a href ="./list.jsp">지역정보 리스트</a>


</body>
</html>