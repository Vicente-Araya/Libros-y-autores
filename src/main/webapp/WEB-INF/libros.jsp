<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Libros</title>
</head>
<body>
<h1>Libros Disponibles</h1>
    <ul>
        <c:forEach var="libro" items="${libros}">
            <li>
                <a href="/libros/${libro}">${libro}</a>
            </li>
        </c:forEach>
    </ul>
    <a href="/libros/formulario">Agregar nuevo libro</a>
</body>
</html>