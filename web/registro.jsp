<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro</title>
  </head>

  <body>
    <h1>Registro de usuario</h1>
    <form action="registrar" method="post">
      <input type="text" name="nombre" placeholder="Ingresa tu nombre">
      <input type="text" name="apellido" placeholder="Ingresa tu apellido">
      <input type="text" name="dni" placeholder="Ingresa tu dni">
      <input type="password" name="pass" placeholder="Ingresa tu contraseña">
      <input type="text" name="email" placeholder="Ingresa tu email">
      <input type="text" name="telefono" placeholder="Ingresa tu telefono">
      <input type="submit" value="Registrarme">
    </form>
    <a href="lista_usuarios.jsp">Ver listado de usuarios</a>
  </body>
</html>