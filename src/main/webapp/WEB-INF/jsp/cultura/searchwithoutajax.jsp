<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cultura - searchWithoutAjax</title>
</head>
<body>
<form action="<c:url value="/cultura/retornoPesquisa" />" >
<!-- 
<form action="<c:url value="/cultura/retornoPesquisa/" />" method="POST">
 -->
	<label for="id">Código</label>
	<input name="id" id="ìd" value="${id}"/>
	<button type="submit">Pesquisar</button> 
</form>
<%@ include file="retornoPesquisa.jsp" %>
</body>
</html>