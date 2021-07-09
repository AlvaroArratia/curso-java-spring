<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.codingdojo.web.models.Dog"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Perro</title>
</head>
<body>
	<h1>You create a <c:out value="${dog.getBreed()}"/></h1>
	<h1><c:out value="${dog.showAffection()}"/></h1>
</body>
</html>