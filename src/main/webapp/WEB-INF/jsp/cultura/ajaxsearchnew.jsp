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
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
    	$('#mydiv').show();
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
		    	$('#mydiv').hide();
		    }
			})
        }
     })
});
 
</script>

</head>
<body>
<div class="container" style="margin-top: 30px;">
<!-- <form action=""> -->
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
<div id="mydiv" style="display:none">
    <img src="/img/ajax-loader.gif" class="ajax-loader" />
</div>
<!--</form> -->
</div>
</body>
</html>