<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
<h1>Hotel Search by City <h1>



<br>
<form action="formdata">
	<select name="city">
		<option value="Detroit">Detroit</option>
		<option value="Birmingham">Birmingham</option>
		<option value="Troy">Troy</option>
		<option value="Dearborn">Dearborn</option>
		<option value="Ann Arbor">Ann Arbor</option>
	</select>
	<input type="submit" value="Submit">
</form>



</body>
</html>