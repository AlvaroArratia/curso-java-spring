<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="" method="post">
			<label>Nombre</label> <input name="name" type="text">
			<label>Raza</label> <input name="breed" type="text"> 
			<label>Peso</label> <input name="weight" type="number"> 
			<input type="hidden" name="animalType" value="dog">
			<input type="submit" value="Ingresar perro">
		</form>
	</div>
	<div>
		<form action="" method="post">
			<label>Nombre</label> <input name="name" type="text"> <br> 
			<label>Raza</label> <input name="breed" type="text"> <br>
			<label>Peso</label> <input name="weight" type="number"> <br>
			<input type="hidden" name="animalType" value="cat"> <br>
			<input type="submit" value="Ingresar gato">
		</form>
	</div>
</body>
</html>