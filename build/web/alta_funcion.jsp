<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControladoraPeliculas"%>
<%@page import="controller.ControladoraSalas"%>
<%@page import="model.Pelicula"%>
<%@page import="model.Sala"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Sala> salas = ControladoraSalas.getInstance().getLista(); %>
<% List<Pelicula> peliculas = ControladoraPeliculas.getInstance().getLista(); %> 

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/bootstrap-datetimepicker.css"/>    
    <script src="js/jquery-2.1.4.min.js"></script>
    <script src="js/moment.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootstrap-datetimepicker.js"></script>
    <title>Alta funciones</title>
  </head>

  <body>
    <h1>Ingresar una nueva función</h1>
    <form action="alta_funcion" method="post">
      <div class="container">
        <div class="row">
          <div class='col-sm-6'>
            <div class="form-group">
              <div class="input-group date" id="datetimepicker">
                <input type='text' name="fecha_hora" class="form-control" />
                <span class="input-group-addon">
                  <span class="glyphicon glyphicon-calendar"></span>
                </span>
              </div>
            </div>
          </div>
        </div>
      </div>
      <script type="text/javascript">
          $(function () {
            $('#datetimepicker').datetimepicker({
              format: 'DD/MM/YYYY HH:mm'
            });
          });
      </script>

      <select name="sala">
        <% for (Sala sala : salas) {%>
        <option value="<%= sala.getId()%>"><%= sala.getNombre()%></option>
        <% }%>
      </select>
      <select name="pelicula">
        <% for (Pelicula pelicula : peliculas) {%>
        <option value="<%= pelicula.getId()%>"><%= pelicula.getTitulo()%></option>
        <% } %>
      </select>
      <input type="submit" value="Ingresar">
    </form>
  </body>
</html>