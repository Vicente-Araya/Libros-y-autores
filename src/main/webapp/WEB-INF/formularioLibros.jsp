<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario nuevo Libro</title>
</head>
<body>
<h1>Agregar Nuevo Libro</h1>
    <form action="/procesa/libro" method="post">
        <label for="nombreLibro">Nombre del libro:</label>
        <input type="text" id="nombreLibro" name="nombreLibro" required><br><br>

        <label for="nombreAutor">Autor:</label>
        <input type="text" id="nombreAutor" name="nombreAutor" required><br><br>

        <input type="submit" value="Agregar Libro">
    </form>
    <br>
    <a href="/libros">Regresar a la lista</a>
</body>
</html>