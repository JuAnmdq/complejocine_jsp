<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/registro.css"/>
    <title>Registro</title>
  </head>

  <body>
    <h1>Registro de usuario</h1>

    <form action="registrar" method="post" role="form">
      <div class="form-group">
        <label for="nombre">Ingresa tu nombre</label>
        <input type="text" class="form-control" id="nombre" name="nombre" required autofocus>
      </div>
      <div class="form-group">
        <label for="apellido">Ingresa tu nombre</label>
        <input type="text" class="form-control" id="apellido" name="apellido" required>
      </div>
      <div class="form-group">
        <label for="dni">Ingresa tu documento</label>
        <input type="text" class="form-control" id="dni" name="dni" required>
      </div>
      <div class="form-group">
        <label for="pass">Ingresa tu contraseña</label>
        <input type="password" class="form-control" id="pass" name="pass" required>
      </div>
      <div class="form-group">
        <label for="repass">Reingresa tu contraseña</label>
        <input type="password" class="form-control" id="repass" name="repass" required>
      </div>
      <div class="form-group">
        <label for="email">Ingresa tu email:</label>
        <input type="email" class="form-control" id="email" name="email" required>
      </div>
      <div class="form-group">
        <label for="telefono">Ingresa un telefono(Opcional)</label>
        <input type="text" class="form-control" id="telefono" name="telefono">
      </div>
      <input type="hidden" name="rol" value="2">
      <input type="submit" class="btn btn-default" value="Registrarme">
    </form>
    
  </body>
</html>