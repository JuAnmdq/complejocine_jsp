<%@page import="controller.ControladoraCines"%>
<%@page import="model.Cine"%>
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
      }
    </style>
  </head>
  <body>

    <div id="wrapper">
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header">
          
          <a class="navbar-brand" href="index.html">Administración</a>
        </div>
       <div class="collapse navbar-collapse navbar-ex1-collapse">
          
          <%@include file="navbar.jsp" %>

          <%@include file="logout.jsp" %>

        </div>
      </nav>

      <div>
        <form action="../alta_sala" method="post" role="form">           
          <div class="row text-center">
            <h2>Alta sala</h2>
          </div>
          <div>
            <label for="nombre" class="col-md-2">Nombre:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingrese el nombre">
            </div>
          </div>
          <div>
            <label for="filas" class="col-md-2">Filas:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="filas" name="filas" placeholder="Ingrese las filas">
            </div>
          </div>
          <div>
            <label for="columnas" class="col-md-2">Columnas:</label>
            <div class="col-md-9">
              <input type="number" class="form-control" id="columnas" name="columnas" placeholder="Ingrese las columnas">
            </div>
          </div>
          <div>
            <label for="cine" class="col-md-2">Cine:</label>
            <div class="col-md-9">

              <% List<Cine> cines = ControladoraCines.getInstance().getLista();%>

              <select name="cine" id="genero" class="form-control">

                <% for (Cine cine : cines) {%>
                <option value="<%= cine.getId()%>"><%= cine.getNombre()%></option>
                <% }%>

              </select>
            </div>
          </div>
          <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-10">
              <button type="submit" class="btn btn-primary">Ingresar</button>
            </div>
          </div>
        </form>
      </div>
    </div>

  </body>
</html>
