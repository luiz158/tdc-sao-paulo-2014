<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Lista de Produtos</title>
	<link rel="stylesheet" type="text/css" href="base.css">
</head>
<body>
	<c:if test="${not empty mensagem}">
		<c:out value="${mensagem}"></c:out>
	</c:if>

	<table class="table table-stripped table-bordered table-hover">
	    <c:forEach var="produto" items="${produtos}">
	    <tr>
	        <td>${produto.nome}</td>
	        <td>${produto.valor}</td>
	        <td>${produto.quantidade}</td>
			<td>
			  <a href="<c:url value='/produto/remove?produto.id=${produto.id}'/>">Remover</a>
			</td>	        
	    </tr>        
	    </c:forEach>
	</table>
	
	<a href="<c:url value='/produto/formulario'/>">
	    Adicionar mais produtos!
	</a>	
</body>
</html>