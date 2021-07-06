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
		int width = Integer.parseInt(request.getParameter("width"));
		int height = Integer.parseInt(request.getParameter("height"));
		String color = "";
		%>
		<h1>Tablero de damas: <%= width %>w X <%= height %>h</h1>
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