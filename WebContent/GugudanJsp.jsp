<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%	
	String tmpDan = request.getParameter("dan");
	int dan = Integer.parseInt(tmpDan);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
		<% for(int i=1; i<=9; i++){ %>
			<tr>
				<td><%= dan %></td>
				<td><%= i %></td>
				<td><%= dan*i %></td>
			</tr>
		<% } %>
	</table>
</body>
</html>