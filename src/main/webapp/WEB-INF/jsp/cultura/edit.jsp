<!-- Import correção acentuação -->
<%@ page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="UTF-8" import="java.sql.*" errorPage=""%>
<!-- Import da taglib -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cultura</title>
</head>
<body>
	<h1>Cultura - Edit</h1>
	<h2>
		from restdb.io - <a href="${linkTo[IndexController].index}">Voltar</a>
	</h2>
	<!--  
	<table>
		<tr>
			<td>Código : ${cultura.codigo}</td>
			<td>Descrição: ${cultura.descricao}</td>
		</tr>

	</table>
	-->
	<form id="container" name="formulario" action="<c:url value="/cultura/update"/>" method="post"
		onsubmit="return valida(this);">
		<input type="hidden" name="cultura._id" value="${cultura._id}" />
		Codigo: <input type="text" name="cultura.codigo"
			value="${cultura.codigo}" readonly="true" /> 
		Descrição: <input
			type="text" name="cultura.descricao" value="${cultura.descricao}" />

		<input type="submit" value="Salvar" name="salvar" />
		<!--  <input type="reset" value="Limpar" name="limpar" />  -->
	</form>
</body>
</html>