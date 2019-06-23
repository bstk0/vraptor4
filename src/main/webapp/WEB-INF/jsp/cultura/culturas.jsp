<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project - Vraptor4</title>
</head>
<body>
	[21/06/19] Codenvy - Cultura<br>
	Cultura.Codigo: ${cultura.codigo} <br>
	Cultura.Descrição: ${cultura.descricao} <br>
	Index   : ${linkTo[CulturaController].view}
	<br><br><a href="${linkTo[IndexController].index}">Voltar</a>
</body>
</html>