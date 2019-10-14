<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CULTURA - AJAX SEARCH</title>
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
			    	$("#div_retorno").load("/cultura/ajaxsearchnewresult");
			    	
		    },
		    success: function(data){
		        //alert(data)
		        //console.log("success:"+data);
		        //$("#list_table_json").find("tbody").empty();
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
<!--  
<table class="table table-responsive table-hover table-bordered" id="list_table_json">
    <thead>
        <tr>
            <th>Codigo</th>
            <th>Descricao</th>                  
        </tr>                   
    </thead>
    <tbody></tbody>
</table>
-->
</form>
</body>
</html>