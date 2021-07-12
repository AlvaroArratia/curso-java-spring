<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/BotonClicker/"><button>Clickeame!</button></a>
	<h2>
		Has clickado el botón
		<c:out value="${count}" />
		veces
	</h2>
</body>
</html>