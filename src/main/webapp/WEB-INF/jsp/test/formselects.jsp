<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
-->
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
//$('.area').change(function () {
$(function(){	
	$('#area').change(function () {	
		//console.log("AREA.CHANGE");
	    $.ajax({
	        type: "GET",
	        contentType: "application/json; charset=utf-8",
	        url: "/test/buscaAmostrasDaArea?idArea="+this.value, //-- esse caminho teria outra forma de colocar ?
	        dataType: "json",
	        success: function (data) {
	            var appenddata = '<option>Selecione a amostra</option>';           
	            $.each(data, function (key, value) {
	                appenddata += "<option value=\"" + value.codigo + "\">" + value.descricao + " </option>";
	            });
	            document.getElementById("amostra").disabled = false;
	            $('#amostra').html(appenddata);
	
	        }
	    });
	})
});
</script>
</head>
<body>
<a href="${linkTo[IndexController].index}">Voltar </a>|
<a href="/test/tests.html"> Voltar Testes</a>
<BR><br>
Fonte: https://cursos.alura.com.br/forum/topico-select-dinamico-com-vraptor-e-jpa-32213
<BR><br>						
<div class="span3">
    <label for="area">Área:</label>
    <select name="area" id="area">
        <option value="">selecione area</option>
		<option value="1">Area 1</option>
		<option value="2">Area 2</option>
     </select> 
    <label for="amostra">Amostra:</label>
    <select name="amostra" id="amostra" disabled="true">       </select>                        
</div>
</body>
</html>