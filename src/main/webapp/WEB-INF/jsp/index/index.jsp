<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Vraptor4 - Cultura</title>
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
<form>
	BISTERÇO [19/06/2019] It works!!<br>
	[21/06/19] Codenvy [2]<br>
	Variavel: ${variable} <br>
	Index   : ${linkTo[IndexController].index}
	<br><br>
	<a href="cultura/view" class="btn btn-light" role="button">Cultura View</a>&nbsp;||&nbsp;
	<a href="cultura/list" class="btn btn-light" role="button">Cultura List</a>&nbsp;||&nbsp;
	<a href="cultura/form" class="btn btn-light" role="button">Cultura Add</a>

</form>
</body>
</html>