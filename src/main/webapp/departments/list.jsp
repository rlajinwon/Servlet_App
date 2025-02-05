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
</head>
<style type="text/css">

	table{
	width: 40%;
	margin: 0 auto;
	border: 1px solid black;
	border-collapse: collapse;
	}
	
	table td, table th {
	border: 1px solid black;
	text-align: center;
	
	}





</style>
<body>

	<h1>Department List</h1>
	<h3>표현식 자바의 변수나 값을 HTML로 출력할 때 사용 </h3>
	<table>
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
	
	
	
	
	
	
	
	
	

</body>
</html>