<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Ingresar nuevo cine</h1>
    <form action="alta_cine" method="post">
      <input type="text" name="nombre" placeholder="Ingresa el nombre del cine">
      <input type="text" name="direccion" placeholder="Ingresa la dirección">
      <input type="submit" value="Ingresar">
    </form>
  </body>
</html>
