<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="create" method="POST"> <!-- http://localhost:8080/servlet-app/demo -->
	<span>EmpId</span><input type="text" name="id"><br /> 
		<span>Name</span><input type="text" name="name"><br /> 
		<span>City</span><input type="text" name="city"><br /> 
		<span>Salary</span><input type="text" name="salary"><br />
		<input type="submit" value="Send"><br />
	</form>
</body>
</html>