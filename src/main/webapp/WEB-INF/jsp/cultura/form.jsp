<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<c:url value='/cultura/add'/>">
    Nome:
    <input type="text" name="cultura.codigo"/><br/>
    Descrição:
    <input type="text" name="cultura.descricao"/><br/>
    <!-- 
    Preço:
    <input type="text" name="cultura.novacoluna"/><br/>
    -->
    <input type="submit" value="Salvar" />
</form>
</body>
</html>