<%@page import="java.util.List"%>
<%@page import="controller.ControladoraUsuarios"%>
<%@page import="model.Usuario"%>
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
          <h2>Usuarios</h2>
        </div>

        <% List<Usuario> usuarios = ControladoraUsuarios.getInstance().getLista(); %>

        <div>
          <table class="table table-hover">
            <thead>
              <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>DNI</th>
                <th>Contraseña</th>
                <th>Email</th>
                <th>Telefono</th>
                <th>Rol</th>
                <th></th>
              </tr>
            </thead>

            <tbody>
              <% for (Usuario user : usuarios) {%>
              <tr>
                <td><%= user.getNombre()%></td>
                <td><%= user.getApellido()%></td>
                <td><%= user.getDni()%></td>
                <td><%= user.getPass()%></td>
                <td><%= user.getEmail()%></td>
                <td><%= user.getTelefono()%></td>
                <td><%= user.getRol()%></td>
                <td>  
                  <form action="modifica_usuario.jsp" method="post">
                    <input type="hidden" name="usuario" value="<%= user.getId()%>">
                    <input type="submit" value="Modificar" class="btn btn-primary">
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
