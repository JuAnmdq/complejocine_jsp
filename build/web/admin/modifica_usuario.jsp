<%@page import="model.Usuario"%>
<%@page import="controller.ControladoraUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% int id = Integer.parseInt(request.getParameter("usuario")); %>
<% Usuario user = ControladoraUsuarios.getInstance().buscarPorId(id);%>

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

        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse">

          <%@include file="navbar.jsp" %>

          <%@include file="logout.jsp" %>

        </div>
      </nav>

      <div>
        <form action="../modificar_usuario" method="post" role="form">           
          <div class="row text-center">
            <h2>Modificar usuario</h2>
          </div>
          <div>
            <label for="nombre" class="col-md-2">Nombre:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="nombre" name="nombre" value="<%= user.getNombre()%>" disabled autofocus>
            </div>
          </div>
          <div>
            <label for="apellido" class="col-md-2">Apellido:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="apellido" name="apellido" value="<%= user.getApellido()%>" disabled>
            </div>
          </div>
          <div>
            <label for="dni" class="col-md-2">DNI:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="dni" name="dni" value="<%= user.getDni()%>" disabled>
            </div>
          </div>
          <div>
            <label for="email" class="col-md-2">Email:</label>
            <div class="col-md-9">
              <input type="email" class="form-control" id="dni" name="email" value="<%= user.getEmail()%>">
            </div>
          </div>
          <div>
            <label for="telefono" class="col-md-2">Telefono:</label>
            <div class="col-md-9">
              <input type="text" class="form-control" id="telefono" name="telefono" value="<%= user.getTelefono()%>">
            </div>
          </div>
          <div>
            <label for="rol" class="col-md-2">Rol:</label>
            <div class="col-md-9">
              <select name="rol" id="rol" class="form-control" style="color: #000;">
                <option value="1">Administrador</option>
                <option value="2">Espectador</option>
              </select>
            </div>
          </div>

          <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-10">
              <input type="hidden" name="id" value="<%= id%>">
              <button type="submit" class="btn btn-primary">Modificar</button>
            </div>
          </div>
        </form>
      </div>
    </div>

  </body>
</html>
