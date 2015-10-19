<%@page import="controller.ControladoraCines"%>
<%@page import="model.Cine"%>
<%@page import="java.util.List"%>
<%@page import="model.Sala"%>
<%@page import="controller.ControladoraSalas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Cine> cines = ControladoraCines.getInstance().getLista(); %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  
  <body>
    <h1>Ingresar nueva sala</h1>
    <form action="alta_sala" method="post">
      <select name="cine">
        <% for (Cine cine : cines) { %>
        <option value="<%= cine.getPkCine() %>"><%= cine.getNombre() %></option>
        <% } %>
      </select>
      <input type="text" name="nombre" placeholder="Ingresa el nombre de la sala">
      <input type="text" name="filas" placeholder="Ingresa la cantidad de filas">
      <input type="text" name="columnas" placeholder="Ingresa la cantidad de columnas">
      <input type="submit" value="Ingresar">
    </form>
  </body>
</html>