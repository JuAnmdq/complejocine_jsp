<%@page import="java.util.List"%>
<%@page import="controller.ControladoraReservas"%>
<%@page import="model.Reserva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administración</title>

    <link rel="stylesheet" type="text/css" href="assets/bootstrap/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/local.css" />

    <script type="text/javascript" src="assets/js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.min.js"></script>

    <style>
      div {
          padding-bottom:20px;
          padding-left: 20px;
      }
    </style>
  </head>
  <body>

    <div id="wrapper">
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header">
          
        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          
          <%@include file="navbar.jsp" %>

          <%@include file="logout.jsp" %>

        </div>
      </nav>

      <div>
        <div class="row text-center">
          <h2>Reservas</h2>
        </div>

        <% List<Reserva> reservas = ControladoraReservas.getInstance().getLista(); %>

        <div>
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
              <% }%>
            </tbody>
          </table>   
        </div>

      </div>
    </div>

  </body>
</html>
