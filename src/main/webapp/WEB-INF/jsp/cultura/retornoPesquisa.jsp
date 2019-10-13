<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Resultados da busca pelo Id <b>"${pesquisa}"</b></h3>
<table>
	<c:forEach items="${culturaList}" var="cultura">
		<tr>
			<td>${cultura.codigo}</td>
			<td>${cultura.descricao}</td>
		</tr>		
	</c:forEach>
</table>
</body>
</html>