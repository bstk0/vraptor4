<!-- Import correção acentuação -->
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" errorPage="" %>
<!-- Import da taglib -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Cultura - list</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
</style>
</head>
<body>
	<h1>Cultura - from restdb.io</h1>
<a href="${linkTo[IndexController].index}">Voltar</a>
<div class="bs-example">
    <table class="table table-hover">
        <thead>
            <tr>
                <th>Código</th>
                <th>Descrição</th>
            </tr>
        </thead>
        <tbody>
		<c:forEach items="${culturaList}" var="cultura" varStatus="theCount">
			<tr>
				<td>${cultura.CulturaCodigo}</td>
				<td>${cultura.CulturaDescricao}</td>
			</tr>
		</c:forEach>
        </tbody>
    </table>
    <a href="${linkTo[IndexController].index}">Voltar</a>
</div>
</body>
</html>                            