<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
#mydiv {  
    position:absolute;
    top:0;
    left:0;
    width:100%;
    height:100%;
    z-index:1000;
    background-color:grey;
    opacity: .8;
 }

.ajax-loader {
    position: absolute;
    left: 50%;
    top: 50%;
    margin-left: -32px; /* -1 * image width / 2 */
    margin-top: -32px;  /* -1 * image height / 2 */
    display: block;     
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
-->
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
//$('.area').change(function () {
$('#mydiv').hide();
$(function(){	
	$('#area').change(function () {	
		//console.log("AREA.CHANGE");
		$('#mydiv').show(); 
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
	            $('#mydiv').hide(); 
	        }
	    });
	})
});
</script>
</head>
<body>
<a href="${linkTo[IndexController].index}">Voltar</a>&nbsp;|&nbsp;
<a href="/test/tests.html">Voltar Testes</a>
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
    <select name="amostra" id="amostra" disabled="true"></select>                        
</div>
<div id="mydiv" style="display:none">
    <img src="/img/ajax-loader.gif" class="ajax-loader" />
</div>
</body>
</html>