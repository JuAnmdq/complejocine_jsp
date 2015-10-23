<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <title>Cinema UTN</title>
  </head>

  <body>
    <h1>Login</h1>

    <form class="form-inline" role="form" action="login" method="post">
      <div class="form-group">
        <label for="dni">DNI:</label>
        <input type="text" class="form-control" id="dni" name="dni" required>
      </div>
      <div class="form-group">
        <label for="pass">Contraseña:</label>
        <input type="password" class="form-control" id="pass" name="pass" required>
      </div>
      <div class="checkbox">
        <label><input type="checkbox">Recordarme</label>
      </div>
      <input type="submit" class="btn btn-default" value="Ingresar">
    </form>

    <br>
    <a href="registro.jsp">Registrarme ahora</a>
    <a href="alta_pelicula.jsp">Ingresar pelicula</a>
    <a href="alta_cine.jsp">Ingresar nuevos cines</a>
    <a href="alta_sala.jsp">Ingresar nueva sala</a>
    <a href="alta_funcion.jsp">Ingresa nueva función</a><br>
    <a href="usuarios.jsp">Ver listado de usuarios</a>
    <a href="peliculas.jsp">Ver estrenos</a>
    <a href="funciones.jsp">Ver funciones</a>
    <a href="salas.jsp">Ver salas</a>
    <a href="reservas.jsp">Ver reservas</a>
  </body>
</html>