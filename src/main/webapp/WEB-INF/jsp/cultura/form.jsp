<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Cultura - form</title>
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
<form action="<c:url value='/cultura/add'/>">
    <div class="form-group">  
    Codigo:
    <input type="text" name="cultura.codigo"/>
    </div>
    <!--
    <div class="input-group input-group-sm mb-3" max-width="500px">
  <div class="input-group-prepend">
    <span class="input-group-text" id="inputGroup-sizing-sm">Codigo</span>
  </div>
  <input type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" name="cultura.codigo">
</div>
    -->
<div class="form-group">
    Descrição:
    <input type="text" name="cultura.descricao"/>
    </div>
    <!-- 
    Preço:
    <input type="text" name="cultura.novacoluna"/><br/>
    -->
    <button type="submit" class="btn btn-success save-btn">Save</button>
    <a href="${linkTo[IndexController].index}" class="btn btn-light" role="button">Voltar</a>
</form>
</body>
</html>