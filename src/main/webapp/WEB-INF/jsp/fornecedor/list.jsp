<!-- Import correção acentuação -->
<%@ page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="UTF-8" errorPage=""%>
<!-- Import da taglib -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Cultura - list</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">
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
	<h1>Fornecedor - from elephantsql (postgres)</h1>
	<a href="${linkTo[IndexController].index}">Voltar</a>
	<div class="bs-example">
		<table id="fornecedorlist" class="table table-hover">
			<thead class="thead-light">
				<tr>
					<th>Código</th>
					<th>Descrição</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${fornecedorList}" var="fornecedor"
					varStatus="theCount">
					<tr>
						<td><a
							href="${linkTo[FornecedorController].edit}?id=${fornecedor.id_fornec}">${fornecedor.id_fornec}</a></td>
						<td>${fornecedor.nome}</td>
						<td><a href="#" data-id="${fornecedor.id_fornec}"
							data-toggle="modal" data-target="#confirm-delete"
							class="confirm-delete"> <span class="fas fa-trash"></span>
						</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<!-- Modal - inicio -->
		<div class="modal fade" id="confirm-delete" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">

					<!-- <div id="confirm-delete" class="modal hide"> -->
					<div class="modal-header">
						<h3>Delete</h3>
						<a href="#" data-dismiss="modal" aria-hidden="true" class="close">×</a>
					</div>
					<div class="modal-body">
						<p>You are about to delete.</p>
						<p>Do you want to proceed?</p>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
						<!-- 						<a class="btn btn-danger btn-ok">Delete</a> -->
						<a href="#" id="btnConfirmDelete" class="btn btn-danger">Delete</a>
					</div>
				</div>

			</div>
		</div>
		<!-- Modal - fim -->

		<a href="${linkTo[IndexController].index}">Voltar</a>
		<script>
			$(document).ready(function() {
				$('#fornecedorlist').DataTable({
					"order" : [ [ 0, "asc" ] ]
				});
			});

			$('.confirm-delete').on('click', function(e) {
				e.preventDefault();

				var id = $(this).data('id');
				//alert(id);
				$('#confirm-delete').data('id', id).modal('show');
			});

			$('#btnConfirmDelete').click(function() {
				// handle deletion here
				var delId = $('#confirm-delete').data('id');
				var urlAction = "${linkTo[FornecedorController].delete}";
				urlAction += "?id=" + delId
				//alert("confirm:" + id);
				//$('[data-id='+id+']').remove();
				window.location.href = urlAction;
				$('#confirm-delete').modal('hide');
			});
		</script>
		<script
			src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	</div>
</body>
</html>
