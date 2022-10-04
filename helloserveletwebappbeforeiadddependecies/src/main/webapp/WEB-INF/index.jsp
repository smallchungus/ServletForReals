
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<div align="center">
	<h1>Login Page</h1>
	<form action ="<%= request.getContextPath() %>/register" method="POST">
	<table style="with: 80%">
	<tr>
	<td>Username</td>
		<td><input type="text" name="username"></td>
	</tr>
	<tr>
	
	<td>Password</td>
		<td><input type="password" name="password" /></td>
	</tr>
	</table>
		<input type="submit" value="submit" />
	</form>
	
	<form action ="<%= request.getContextPath() %>/search" method="POST">
	<h1>Search</h1>
	<table style="with: 80%">
	<tr>
		<td><input type="text" name="search"></td>
	</tr>
	</table>
	
		<input type="submit" value="searchThis" /> 
	</form>
</div>
	
</body>
</html>