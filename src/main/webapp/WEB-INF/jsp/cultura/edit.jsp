<!-- Import correção acentuação -->
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>
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
	<h2>from restdb.io - <a href="${linkTo[IndexController].index}">Voltar</a></h2>
	<table>
		<tr>
			<td>Código : ${cultura.codigo}</td>
			<td>Descrição: ${cultura.descricao}</td>
		</tr>

	</table>
</body>
</html>