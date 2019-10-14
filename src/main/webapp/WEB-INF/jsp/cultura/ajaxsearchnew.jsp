<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CULTURA - AJAX SEARCH</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<!--
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
-->

<script>

$(function(){
    $('#culturaItem').change(function(){
    	//alert($(this).val());
        if($(this).val()) {
			$.ajax({
			    //url: "/cultura/item/" + $(this).val(),
			    url: "/cultura/ajaxgetitem/" + $(this).val(),
			    method: 'GET',
			    dataType: 'application/json',
			    complete: function(data){
			    	//console.log("complete:"+data);
			    	//$("#div_retorno").load("<c:url value='/cultura/ajaxsearchnewresult'/>");
			    	//$("#div_retorno").load("/cultura/ajaxsearchnewresult");
			    	//$("#div_retorno").html(data);
			    	
		    },
		    success: function(data){
		        //alert(data)
		        //console.log("success:"+data);
		        //$("#list_table_json").find("tbody").empty();
		    	$("#div_retorno").html(data);
		    }
			})
        }
     })
});
 
</script>

</head>
<body>
<form action="">
<a href="${linkTo[IndexController].index}">Voltar</a>
<BR><BR>						
<select id="culturaItem">
  <option value="">--NONE--</option>
  <option value="5cde08a9ef4a98100000f664">FUMO</option>
  <option value="5d150709458a683700002586">novo 35.1</option>
  <option value="5cde08a9ef4a98100000f660">SOJA</option>
</select>
<br><br>
<div id="div_retorno"></div>
</form>
</body>
</html>