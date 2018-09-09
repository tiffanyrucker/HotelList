<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
   <h1> Hotel List</h1>
   
   <table border="1">
	<c:forEach var="city" items="${city1}">
		<tr>
		<!-- left out title on purpose -->
			<td>${city.id}</td>
			<td>${city.name}</td>
			<td>${city.city}</td>
			<td>${city.pricePerNight}</td>
			<!-- this is url encoding and allows us to pass some data into 
			the link for our controller method -->
			
		</tr>
	</c:forEach>

</table>
   
   
   <a href="/">Start a new Search</a>
</body>
</html>