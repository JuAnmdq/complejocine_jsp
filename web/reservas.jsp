<%@page import="model.Usuario"%>
<%@page import="model.Reserva"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControladoraReservas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Usuario user = (Usuario) session.getAttribute("user"); %>

<% List<Reserva> reservas = ControladoraReservas.getInstance().getReservasPorUsuario(user.getId()); %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <title>Reservas</title>
  </head>

  <body>
    <h1>Reservas</h1>

    <table class="table table-hover">
      <thead>
        <tr>
          <th>Espectador</th>
          <th>Fecha</th>
          <th>Hora</th>         
          <th>Pelicula</th>
          <th>Sala</th>
          <th>Cine</th>
        </tr>
      </thead>
      <tbody>
        <% for (Reserva reserva : reservas) {%>
        <tr>
          <td><%= reserva.getUsuario().getNombre()%> <%= reserva.getUsuario().getApellido()%></td>
          <td><%= reserva.getFuncion().getFecha()%></td>
          <td><%= reserva.getFuncion().getHora()%></td>
          <td><%= reserva.getFuncion().getPelicula().getTitulo()%></td>
          <td><%= reserva.getFuncion().getSala().getNombre()%></td>
          <td><%= reserva.getFuncion().getSala().getCine().getNombre()%></td>
        </tr>
        <% };%>
      </tbody>
    </table>
  </body>
</html>
