<%@page import="controller.ControladoraFunciones"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControladoraSalas"%>
<%@page import="model.Sala"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Sala> salas = ControladoraSalas.getInstance().getLista(); %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <title>Salas</title>
  </head>

  <body>
    <h1>Funciones por salas</h1>

    <form class="form-inline" role="form">
      <div class="form-group">
        <label for="sala">Selecciona la sala:</label>
        <select class="form-control" id="sala" style="width: 12em;">
          <% for (Sala sala : salas) {%>
          <option value="<%= sala.getId()%>"><%= sala.getNombre()%></option>
          <% }%>        
        </select>
      </div>
      <input type="submit" class="btn btn-default" value="Buscar">
    </form>

  </body>
</html>
