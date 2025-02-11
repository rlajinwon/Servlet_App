<%@page import="com.winter.app.locations.LocationDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.locations.LocationDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
	Object ar = request.getAttribute("list");
	List<LocationDTO> list = (List<LocationDTO>) ar;	
    
    
	
	
    %>
    
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../template/common.jsp"%>
<link rel="stylesheet" href="../resources/css/list.css">
<link rel="stylesheet" href="../resources/css/table1.css">
</head>
<body>
	<%@ include file="../template/header.jsp"%>
	<section class="wrap_left contents">
		<%@ include file="../template/nav.jsp"%>
		<div class="right contents_right">
			<div class="contents_right_list">
				<table class="table_sprite">
					<thead>
						<tr>
							<th>지역번호</th>
							<th>지역명</th>
						</tr>
					</thead>
					<tbody>
	
						<%
						for (int i = 0; i < list.size(); i++) {
						%>
						<tr>
							<td><%=list.get(i).getLocationId()%></td>
							<td><a
								href="./detail.do?location_id=<%=list.get(i).getLocationId()%>"><%=list.get(i).getCity()%></a>
							</td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
			</div>
			<div>
				<a href="add.do">지역정보 추가</a>
			</div>


		</div>

	</section>

	<%@ include file="../template/footer.jsp"%>



</body>
</html>