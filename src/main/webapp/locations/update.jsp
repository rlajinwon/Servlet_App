<%@page import="com.winter.app.locations.LocationDAO"%>
<%@page import="com.winter.app.locations.LocationDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    String id = request.getParameter("location_id");
    LocationDTO locationDTO = new LocationDTO();
    locationDTO.setLocationId(Integer.parseInt(id));
    
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

<h1>업데이트 폼</h1>

<form action="./updateProcess.jsp" method="post">

<input type="text" readonly="readonly" name="location_id" value="<%=locationDTO.getLocationId()%>">
<input type="text" name="street_address" value="<%=locationDTO.getStreetAddress() %>">
<input type="text" name="postal_code" value="<%=locationDTO.getPostalCode() %>">
<input type="text" name="city" value="<%=locationDTO.getCity() %>">
<input type="text" name="state_province" value="<%=locationDTO.getStateProvince() %>">
<input type="text" name="country_id" value="<%=locationDTO.getCountryId() %>">

<button type="submit">수정</button>






</form>






</body>
</html>