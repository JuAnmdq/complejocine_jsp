<%@page import="controller.ControladoraPeliculas"%>
<%@page import="java.util.List"%>
<%@page import="model.Pelicula"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Estrenos</h1>
    <% List<Pelicula> peliculas = ControladoraPeliculas.getInstance().getLista(); %>

    <div>
      <ul>
        <% for (Pelicula pelicula : peliculas) {%>
        <li><%= pelicula.getTitulo()%></li>
        <li><%= pelicula.getDirector()%></li>
        <li><%= pelicula.getDuracion()%></li>
        <li><%= pelicula.getGenero()%></li>
        <li><img src="<%= pelicula.getImagen()%>"/></li>
        <% 
        }%>
      </ul>
    </div>
  </body>
</html>
