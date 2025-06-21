<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle Libro</title>
</head>
<body>
<c:choose>
        <c:when test="${not empty error}">
            <p style="color:red;">${error}</p>
        </c:when>
        <c:otherwise>
            <h1>${nombre}</h1>
            <p>Autor: ${autor}</p>
        </c:otherwise>
    </c:choose>
    <br>
    <a href="/libros">Regresar a la lista</a>
</body>
</html>