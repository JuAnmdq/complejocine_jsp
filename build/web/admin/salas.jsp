<%@page import="java.util.List"%>
<%@page import="controller.ControladoraSalas"%>
<%@page import="model.Sala"%>
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
          <h2>Salas</h2>
        </div>

        <% List<Sala> salas = ControladoraSalas.getInstance().getLista(); %>

        <div>

          <table class="table table-hover">
            <thead>
              <tr>
                <th>Nombre</th>
                <th>Filas</th>
                <th>Columnas</th>
                <th>Cine</th>
                <th></th>
                <th></th>
              </tr>
            </thead>

            <tbody>
              <% for (Sala sala : salas) {%>
              <tr>
                <td><%= sala.getNombre()%></td>
                <td><%= sala.getFilas()%></td>
                <td><%= sala.getColumnas()%></td>
                <td><%= sala.getCine().getNombre()%></td>
                <td>  
                  <form action="modifica_sala.jsp" method="post">
                    <input type="hidden" name="sala" value="<%= sala.getId()%>">
                    <input type="submit" value="Modificar" class="btn btn-primary">
                  </form>
                </td>
                <td>  
                  <form action="../baja_sala" method="post">
                    <input type="hidden" name="sala" value="<%= sala.getId()%>">
                    <input type="submit" value="Eliminar" class="btn btn-primary">
                  </form>
                </td>
              </tr>
              <% }%>
            </tbody>
          </table> 
        </div>

      </div>
    </div>

  </body>
</html>
