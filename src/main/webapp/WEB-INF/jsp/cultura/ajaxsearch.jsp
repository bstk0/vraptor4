<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script>

$(function(){
    $('#culturaItem').change(function(){
    	//alert($(this).val());
        if($(this).val()) {
			$.ajax({
			    url: "/cultura/item/" + $(this).val(),
			    method: 'GET',
			    dataType: 'application/json',
			    complete: function(data){
			    	console.log("complete:"+data);
			        //alert(data.status);// S1000
			        //alert(data.description);// Success
			        // for results you have to iterate because it is an array
			        
			        var json = JSON.parse(data.response);
			        
			        //alert(json["codigo"]);
			        //alert(json.codigo);
			        
			        var event_data = '';
			        //$("#list_table_json").append(event_data);
			        
			        event_data += '<tr>';
	                event_data += '<td>'+json.codigo+'</td>';
	                event_data += '<td>'+json.descricao+'</td>';
	                event_data += '</tr>';
	
	            	$("#list_table_json").find("tbody").append(event_data);
			        
			        //var len =  data.response.length; //data.results.length;
			        //for(var i=0;i<len;i++ ){
			        //    alert(data.response[i]);
			        //}
		    },
		    success: function(data){
		        //alert(data)
		        console.log("success:"+data);
		        $("#list_table_json").find("tbody").empty();
		    }
			})
        }
     })
});
 
</script>

</head>
<body>
<form action="">
<select id="culturaItem">
  <option value="">--NONE--</option>
  <option value="5cde08a9ef4a98100000f664">FUMO</option>
  <option value="5d150709458a683700002586">novo 35.1</option>
  <option value="5cde08a9ef4a98100000f660">SOJA</option>
</select>
<br><br>
<table class="table table-responsive table-hover table-bordered" id="list_table_json">
    <thead>
        <tr>
            <th>Codigo</th>
            <th>Descricao</th>                  
        </tr>                   
    </thead>
    <tbody></tbody>
</table>
</form>
</body>
</html>