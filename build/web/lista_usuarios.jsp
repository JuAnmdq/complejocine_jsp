<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControladoraUsuarios"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Usuario> usuarios = ControladoraUsuarios.getInstance().getUsuarios(); %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de usuarios</title>
  </head>

  <body>
    <h1>Listado de usuarios</h1>
    <ul>
      <% for (Usuario user : usuarios) {%>
        <li><%= user.getNombre()%></li>
      <% }%>
    </ul>
  </body>
</html>
