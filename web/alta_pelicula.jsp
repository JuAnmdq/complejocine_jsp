<%@page import="java.util.List"%>
<%@page import="model.Pelicula"%>
<%@page import="controller.ControladoraPeliculas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>

  <body>
    <h1>Ingresar pelicula</h1>
    <form action="alta_pelicula" method="post">
      <input type="text" name="titulo" placeholder="Ingresa el título">
      <input type="text" name="director" placeholder="Ingresa el director">
      <input type="text" name="duracion" placeholder="Ingresa la duración">
      <input type="text" name="genero" placeholder="Ingresa el genero">
      <input type="text" name="imagen" placeholder="Ingresa la url de una imagén">
      <input type="submit" value="Ingresar">
    </form>
  </body>
</html>
