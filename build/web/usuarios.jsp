<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControladoraUsuarios"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Usuario> usuarios = ControladoraUsuarios.getInstance().getLista();%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <title>Lista de usuarios</title>
  </head>

  <body>
    <h1>Listado de usuarios</h1>

    <table class="table table-hover">
      <thead>
        <tr>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Dni</th>         
          <th>Email</th>
          <th>Telefono</th>
        </tr>
      </thead>
      <tbody>
        <% for (Usuario user : usuarios) {%>
        <tr>
          <td><%= user.getNombre()%></td>
          <td><%= user.getApellido()%></td>
          <td><%= user.getDni()%></td>
          <td><%= user.getEmail()%></td>
          <td><%= user.getTelefono()%></td>
        </tr>
        <% }%>
      </tbody>
    </table>

  </body>
</html>