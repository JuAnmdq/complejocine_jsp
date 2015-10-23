<%@page import="controller.ControladoraPeliculas"%>
<%@page import="model.Pelicula"%>
<%@page import="java.util.List"%>
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
          <h2>Peliculas</h2>
        </div>

        <% List<Pelicula> peliculas = ControladoraPeliculas.getInstance().getLista(); %>

        <div>

          <table class="table table-hover">
            <thead>
              <tr>
                <th>Titulo</th>
                <th>Director</th>
                <th>Duración(minutos)</th>
                <th>Imagen</th>
                <th></th>
                <th></th>
              </tr>
            </thead>

            <tbody>
              <% for (Pelicula pelicula : peliculas) {%>
              <tr>
                <td><%= pelicula.getTitulo()%></td>
                <td><%= pelicula.getDirector()%></td>
                <td><%= pelicula.getDuracion()%></td>
                <td><img src="<%= pelicula.getImagen()%>" alt="" height="40" width="40"></td>
                <td>  
                  <form action="modifica_pelicula.jsp" method="post">
                    <input type="hidden" name="pelicula" value="<%= pelicula.getId()%>">
                    <input type="submit" value="Modificar" class="btn btn-primary">
                  </form>
                </td>
                <td>  
                  <form action="../baja_pelicula" method="post">
                    <input type="hidden" name="pelicula" value="<%= pelicula.getId()%>">
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
