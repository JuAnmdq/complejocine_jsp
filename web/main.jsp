<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Usuario user = (Usuario) session.getAttribute("user");%>    

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Principal</title>
  </head>
  <body>
    <h1>Principal</h1>
    <h2><%=user.getNombre()%> se registro bien.</h2>
  </body>
</html>
