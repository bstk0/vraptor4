<%@ page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="UTF-8" import="java.sql.*" errorPage=""%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Vraptor4 - Bstk</title>
<link rel="shortcut icon" href="/img/favicon.png">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-light bg-light navbar-expand-lg fixed-top">
		<a href="#" class="navbar-brand">VRaptor 4</a>
		<button class="navbar-toggler" data-toggle="collapse"
			data-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="navbar-nav ml-auto">
				<li class="navbar-item"><a href="cultura/view" class="nav-link">Cultura
						View</a></li>
				<li class="navbar-item">
				   <a href="cultura/list" class="nav-link d-flex justify-content-between align-items-center">Cultura
						List <span class="badge badge-primary badge-pill">${listCount}</span>
				</a></li>
				<li class="navbar-item"><a href="cultura/ajaxsearch" class="nav-link">Cultura
						Ajax Search</a></li>
				<li class="navbar-item"><a href="cultura/form" class="nav-link">Cultura
						Add</a></li>
				<li class="navbar-item"><a href="fornecedor/view" class="nav-link">Fornecedor View</a></li>
				<li class="navbar-item">
				   <a href="fornecedor/list" class="nav-link d-flex justify-content-between align-items-center">Fornecedor
						List <span class="badge badge-primary badge-pill">${fornecCount}</span>
				</a></li>
				<li class="navbar-item"><a href="fornecedor/form" class="nav-link">Fornecedor
						Add</a></li>
				<li class="navbar-item"><a href="aluno/view" class="nav-link">Aluno
						View</a></li>
				<li class="navbar-item">
				   <a href="aluno/list" class="nav-link d-flex justify-content-between align-items-center">
				   		Aluno List <span class="badge badge-primary badge-pill">${alunoCount}</span>
				</a></li>
				<li class="navbar-item">
					<a href="aluno/form" class="nav-link">Aluno
						Add</a>
				</li>
				<li class="navbar-item"><a href="test/tests.html" class="nav-link">Tests</a></li>
				<li class="navbar-item"><a href="html/version.html" class="nav-link">Version</a></li>
			</ul>
		</div>
	</nav>
	<!-- 
<div class="container" style="margin-top: 30px;">
	BISTERÇO [19/06/2019] It works!!<br>
	[21/06/19] Codenvy [2]<br>
	Variavel: ${variable} <br>
	Index   : ${linkTo[IndexController].index}
	<br><br>
	<a href="cultura/view" class="btn btn-light" role="button">Cultura View</a>&nbsp;||&nbsp;
	<a href="cultura/list" class="btn btn-light" role="button">Cultura List</a>&nbsp;||&nbsp;
	<a href="cultura/form" class="btn btn-light" role="button">Cultura Add</a>
</div>	
 -->
</body>
</html>