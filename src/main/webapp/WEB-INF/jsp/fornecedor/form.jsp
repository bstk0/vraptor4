<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Cultura - form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
.bs-example {
	margin: 20px;
}
</style>
</head>
<body>
	<div class="container" style="margin-top: 30px;">
		<h5>Adicionando Fornecedor</h5>

		<form action="<c:url value='/fornecedor/add'/>">

			<!--  
			<div class="form-group row">
				<label class="col-sm-3 col-form-label" for="fornecedor.id_fornec">Id</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" id="fornecedor.id_fornec"
						name="fornecedor.id_fornec">
				</div>
			</div>
			-->
			<input type="hidden" name="fornecedor.id_fornec" value="" />
			<div class="form-group row">
				<label class="col-sm-3 col-form-label" for="fornecedor.nome">Nome</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" id="fornecedor.nome"
						name="fornecedor.nome">
				</div>
			</div>

			<div class="row">
				<div class="col-sm-9 offset-sm-3">
					<button type="submit" class="btn btn-success save-btn">Save</button>
					<a href="${linkTo[IndexController].index}" class="btn btn-light"
						role="button">Voltar</a>
				</div>
			</div>

		</form>
	</div>
</body>
</html>