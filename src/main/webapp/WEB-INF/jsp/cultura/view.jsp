<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" errorPage="" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>VRaptor Blank Project - Vraptor4</title>
</head>
<body>
<form>
	[21/06/19] Codenvy - Cultura<br>
	Cultura Codigo: ${cultura.codigo} <br>
	Cultura Descrição: ${cultura.descricao} <br>
	Index   : ${linkTo[CulturaController].view}<br>
	Mensagem: <fmt:message key="teste.properties"/>
	<br><br><a href="${linkTo[IndexController].index}">Voltar</a>
</form>
</body>
</html>