<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Datos del Cliente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<link rel="icon" href="<c:url value="img/favicon.png"></c:url>">

</head>


<body>
<div class="container text-center" >

<h1>Datos del cliente</h1>
<form action="Controller" method="post" class="form-control needs-validation" novalidate>

<label for="nombre" class="label-group">Nombre cliente</label>
<input type="text" name="nombre" class="form-control" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+" max="20" required>
 
<label for="apellido" class="label-group">Apellido cliente</label>
<input type="text" name="apellido" class="form-control" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+" max="20" required>

<label for="telefono" class="label-group">Teléfono cliente</label>
<input type="tel" name="telefono" class="form-control" pattern="[6789]{1}[0-9]{8}" required> 

<br>
<input type="submit" name="enviar" value="Aceptar" class="btn btn-light"> 


</form>
</div>

<c:if test="${not empty msg}">
<div class="my-4 bg-light" >
<c:out value="${msg}"/>
</div>
</c:if>

<c:if test="${not empty clientes}">
<table class="table table-striped">

<tr>
<th>id</th>
<th>nombre</th>
<th>apellidos</th>
<th>telefono</th>
<th>acciones</th>
</tr>

<c:forEach items="${clientes}" var="cli">
<tr>
<td> <c:out value="${cli.idCliente}"/> </td>
<td><c:out value="${cli.nombreC}"/></td>
<td><c:out value="${cli.apellidoC}"/></td>
<td><c:out value="${cli.telefonoC}"/></td>
<td> 
<a href="#">&#9999;</a> 
<a href="#">&#128465;</a> 
</td>
</tr>

</c:forEach>

</table>
</c:if>

<script src="<c:url value="js/script.js"></c:url>">
</script>


</body>
</html>