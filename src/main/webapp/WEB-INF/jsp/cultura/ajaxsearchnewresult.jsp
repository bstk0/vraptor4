<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h3>Resultados da busca pelo Id <b>"${pesquisa}"</b></h3>
<table class="table">
  <thead>
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Codigo</th>
			<th scope="col">Descricao</th>
		</tr>
	</thead>
	<tbody>	
	<c:forEach items="${culturaList}" var="cultura">
		<tr>
		    <th scope="row">${cultura._id}</th>
			<td>${cultura.codigo}</td>
			<td>${cultura.descricao}</td>
		</tr>		
	</c:forEach>
	</tbody>
</table>
</body>
</html>