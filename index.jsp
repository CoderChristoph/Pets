<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
</head>
<body>
	<h1>Make a Dog!</h1>
	<form action="/Pets/Dogs" method="Get">
		<label for="name">Name</label>
		<input type="text" name="name">
		
		<label for="breed">Breed</label>
		<input type="text" name="breed">
		
		<label for="weight">Weight (lb)</label>
		<input type="number" name="weight">
		
		<input type="submit" name="submit" value="submit">
	</form>
	
	<h1>Make a Cat!</h1>
	<form action="/Pets/Cats" method="Get">
		<label for="name">Name</label>
		<input type="text" name="name">
		
		<label for="breed">Breed</label>
		<input type="text" name="breed">
		
		<label for="weight">Weight (lb)</label>
		<input type="number" name="weight">
		
		<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>