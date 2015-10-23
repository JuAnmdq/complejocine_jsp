<%@page import="model.Funcion"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControladoraFunciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Funcion> funciones = ControladoraFunciones.getInstance().getLista();%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <title>Lista de funciones</title>
    <script src="js/jquery-2.1.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </head>

  <body>
    <h1>Listado de funciones</h1>

    <table class="table table-hover">
      <thead>
        <tr>
          <th>Fecha</th>
          <th>Hora</th>
          <th>Pelicula</th>
          <th>Sala</th>
          <th>Cine</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <% for (Funcion funcion : funciones) {%>
        <tr>
          <td><%= funcion.getFecha()%></td>
          <td><%= funcion.getHora()%></td>
          <td><%= funcion.getPelicula().getTitulo()%></td>
          <td><%= funcion.getSala().getNombre()%></td>
          <td><%= funcion.getSala().getCine().getNombre()%></td>
          <td>  
            <form action="reservar" method="post">
              <input type="hidden" name="funcion" value="<%= funcion.getId()%>">
              <input type="submit" value="Reservar" class="btn btn-primary">
            </form>
          </td>
        </tr>
        <% }%>
      </tbody>
    </table>
  </body>
</html>
