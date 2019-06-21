<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cultura</title>
</head>
<body>
	<h1>Cultura</h1>
	<h2>from restdb.io - <a href="${linkTo[IndexController].index}">Voltar</a></h2>
	<table>
		<tr>
			<td>Código</td>
			<td>Descrição</td>
		</tr>

		<c:forEach items="${culturaList}" var="cultura" varStatus="theCount">
			<tr>
				<td>${cultura.CulturaCodigo}</td>
				<td>${cultura.CulturaDescricao}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>