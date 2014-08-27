<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cadastro de Produtos</title>
	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="base.css">
</head>	
 	<body>
        <form action="<c:url value='/produto/adiciona'/>" method="post">
            Nome: <input class="form-control" type="text" name="produto.nome"/>
            Valor: <input class="form-control" type="text" name="produto.valor"/>
            Quantidade: <input class="form-control" type="text" name="produto.quantidade"/>
           <button class="btn btn-primary" type="submit" value="Adicionar" ></button>
        </form>
    </body>
</html>