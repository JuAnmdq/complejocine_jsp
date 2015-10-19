<%@page import="java.util.List"%>
<%@page import="controller.ControladoraSalas"%>
<%@page import="model.Sala"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Sala> salas = ControladoraSalas.getInstance().getLista(); %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>

  <body>
    <h1>Listado de salas</h1>
    <table>
      <% for(Sala sala : salas) { %>
      <tr>
        <td><%= sala.getNombre() %></td>
        <td><%= sala.getCine().getNombre() %></td>
      </tr>
      <% } %>
    </table>
  </body>
</html>
