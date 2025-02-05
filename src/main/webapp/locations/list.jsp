<%@page import="com.winter.app.locations.LocationDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.locations.LocationDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    LocationDAO locationDAO = new LocationDAO();
    List<LocationDTO> ar = locationDAO.getlist();
    
    
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">

table{
	width: 40%;
	margin: 0 auto;
	border: 1px solid black;	
	border-collapse: collapse;
}
table td, table th{
	border: 1px solid black;
	text-align: center;
	


}



</style>

<body>

<h1>Location List</h1>

<table>

<thead>
	<tr>	
		<td>지역번호</td> <td>지역명</td>
	</tr>
</thead>
	<tbody>
	
	<%for(int i = 0; i<ar.size();i++){%>
		<tr>
		<td>
			<h3><%=ar.get(i).getLocationId() %></h3>
		</td>
			<td>
			<a href="./detail.jsp?location_id=<%=ar.get(i).getLocationId()%>"><%=ar.get(i).getCity() %></a>
			</td>
		</tr>
	<% } %>
	
	</tbody>





</table>

	<div>
		<a href ="./add.jsp">부서등록</a>
	</div>
	
	
	



</body>
</html>