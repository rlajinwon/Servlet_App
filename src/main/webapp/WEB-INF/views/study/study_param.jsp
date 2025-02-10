<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action ="./study_paramProcess.jsp" method="get">
	<div>
			<!--readonly 읽기 전용 수정(X) 파라미터로 사용가능 -->
			<!-- disabled 읽기 전용 수정(X) 파라미터로 사용 불가-->
	<input type="text" value="p1 data" name="p1" readonly="readonly">
	</div>
	
	
	<div>
	<input type = "hidden" value="hideen data" name="p2">
	</div>
	
	<div>
	남<input type = "radio" value="m" name = "p3" >
	여<input type = "radio" value="w" name = "p3" checked>
	</div>
	
	<div>
		<select name="p4">
			<option value="KT">KT</option>
			<option value="LG" selected="selected">LG</option>
			<option value="SKT">SKT</option>			
		</select>	
		

	</div>
	
	<div>
	<input type="checkbox" value="야구" name="p5" checked="checked">
	<input type="checkbox" value="축구" name="p5" checked="checked">
	<input type="checkbox" value="농구" name="p5" checked="checked">
	
	</div>
	
	
	<input type="submit" value="SUBBIT">
	
	
	</form>

</body>
</html>