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
        <form action="../alta_pelicula" method="post" role="form">           
          <div class="row text-center">
            <h2>Alta pelicula</h2>
          </div>
          <div>
            <label for="titulo" class="col-md-2">Título:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="titulo" name="titulo" placeholder="Ingrese el título">
            </div>
          </div>
          <div>
            <label for="director" class="col-md-2">Director:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="director" name="director" placeholder="Ingrese el director">
            </div>
          </div>
          <div>
            <label for="duracion" class="col-md-2">Duración:</label>
            <div class="col-md-9">
              <input type="number" class="form-control" id="duracion" name="duracion" placeholder="Ingrese la duración">
            </div>
          </div>
          <div>
            <label for="genero" class="col-md-2">Genero:</label>
            <div class="col-md-9">
              <select name="genero" id="genero" class="form-control" style="color: #000;">
                <option>Acción</option>
                <option>Animación</option>
                <option>Ciencia ficción</option>
                <option>Comedia</option>
                <option>Drama</option>
                <option>Suspenso</option>
                <option>Terror</option>
              </select>
            </div>
          </div>
          <div>
            <label for="imagen" class="col-md-2">Imagen:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="imagen" name="imagen" placeholder="Ingrese una imagen">
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
