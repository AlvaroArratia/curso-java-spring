<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
		<title>Tablero de Damas</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<%
		int width = request.getParameter("width") != null ? Integer.parseInt(request.getParameter("width")) : 0;
		int height = request.getParameter("height") != null ? Integer.parseInt(request.getParameter("height")) : 0;
		String color = "";
		%>
		<h1>Tablero de damas: <%= width %> ancho X <%= height %> alto</h1>
		<div id="tablero">
			<% for(int i = 0; i < height; i++) { %>
				<div class="row">
				<% for(int j = 0; j < width; j++) {
					if(i % 2 == 0 && j % 2 == 0) {
						color = "magenta";
					} else if(i % 2 == 0 && j % 2 != 0) {
						color = "azul";
					} else if(i % 2 != 0 && j % 2 == 0) {
						color = "azul";
					} else if(i % 2 != 0 && j % 2 != 0) {
						color = "magenta";
					}
				%> 
					<div class=<%= color %>></div>
				<% } %>
				</div>	
			<% } %>		
		</div>
	</body>
</html>