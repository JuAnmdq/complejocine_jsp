<%@page import="java.util.List"%>
<%@page import="controller.ControladoraSalas"%>
<%@page import="controller.ControladoraPeliculas"%>
<%@page import="model.Sala"%>
<%@page import="model.Pelicula"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Sala> salas = ControladoraSalas.getInstance().getLista(); %>
<% List<Pelicula> peliculas = ControladoraPeliculas.getInstance().getLista(); %> 

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Alta funciones</title>
  </head>

  <body>
    <h1>Ingresar una nueva función</h1>
    <form action="alta_funcion">
      <select name="sala">
        <% for (Sala sala : salas) {%>
        <option value="<%= sala.getPkSala()%>"><%= sala.getNombre() %></option>
        <% }%>
      </select>
      <select name="pelicula">
        <% for (Pelicula pelicula : peliculas) {%>
        <option value="<%= pelicula.getPkPelicula()%>"><%= pelicula.getTitulo() %></option>
        <% }%>
      </select>
      <input type="text" name="fecha" placeholder="Ingresa la fecha de la función">
      <input type="text" name="hora" placeholder="Ingresa la hora de la función">
      <input type="submit" value="Ingresar">
    </form>
  </body>
</html>