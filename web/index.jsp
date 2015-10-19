<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cinema UTN</title>
  </head>
  
  <body>
    <h1>Login</h1>
    <form action="login" method="post">
      <input type="text" name="dni" placeholder="Ingresa tu dni">
      <input type="password" name="pass" placeholder="Ingresa tu contraseña">
      <input type="submit" value="Ingresar">
    </form>
    <a href="registro.jsp">Registrarme ahora</a>
    <a href="peliculas.jsp">Ver estrenos</a>
    <a href="salas.jsp">Ver salas</a>
    <a href="alta_pelicula.jsp">Ingresar pelicula</a>
    <a href="alta_cine.jsp">Ingresar nuevos cines</a>
    <a href="alta_sala.jsp">Ingresar nueva sala</a>
    <a href="alta_funcion.jsp">Ingresa nueva función</a>
  </body>
</html>