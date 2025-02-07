<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	//스크립틀릿
	DepartmentDAO departmentDAO = new DepartmentDAO();
	List<DepartmentDTO> ar = departmentDAO.getList();
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<%@ include file = "/template/common.jsp" %>	
    <link rel="stylesheet" href="/resources/css/table1.css">
    
</head>



<body>

	<h1>Department List</h1>

	<table>
		<%@ include file ="/template/header.jsp" %>
		<thead>
		<tr>
			<th>부서번호</th><th>부서명</th>
		</tr>
		</thead>
		<tbody>
	<%for(int i = 0; i<ar.size();i++){ %>
	<tr>
	<td>
		<h3><%=ar.get(i).getDepartment_id() %></h3>
	</td>
	<td>
		<a href="./detail.jsp?department_id=<%=ar.get(i).getDepartment_id()%>"><%= ar.get(i).getDepartment_name() %> </a>
	</td>
	</tr>
	<% } %>

	</tbody>
	


	
	</table>
	
	
	<div>
		<a href ="./add.jsp">부서등록</a>
	</div>
	
	<%@ include file ="/template/footer.jsp" %>
	


</body>
</html>