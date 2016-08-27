/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the table
 * 				in the place order form. Also, this file updates
 *				the running total as the data is entered. When
 *				the form is complete and submitted this form validates
 *				and extracts data and send it to the output.php
 *				script to create the document.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: placeorder.js
*/
function placeorder(){
	$("#table1").append("<tbody");
	for(var i = 0; i < 15; i++){
		$("#table1").append('<tr>'
              + '<td class="col-lg-1"><input type="text" class="form-control" id="jobName'+i+'"></td>'
              + '<td class="col-lg-3"><input type="text" class="form-control" id="partDescription'+i+'"></td>'
              + '<td class="col-lg-1"><input type="text" class="form-control" id="qty'+i+'"></td>'
              + '<td class="col-lg-1"><input type="text" class="form-control" id="unitPrice'+i+'"></td>'
              + '<td class="col-lg-1"><input type="text" class="form-control" id="totalPrice'+i+'"></td>'
              + '<td class="col-lg-2"><input type="text" class="form-control" id="billedOnInvNumber'+i+'"></td>'
              + '<td class="col-lg-1"><label><input type="checkbox" id="backOrder'+i+'"></label></td>'
			  + '</tr>');
	}
	$("#table1").append("</tbody>");
}
$(document).on('focus', 'input',  function(e){	
	var total = 0;
	var items = new Array();
	
	function order(){
		this.qty = $("#qty"+i).val();
		this.unitPrice = $("#unitPrice"+i).val();
		this.totalPrice = $("#totalPrice"+i).val();
	}
	
	for(var i = 0; i < 15; i++){
		items[i] = new order();
		if(items[i].qty != "" && items[i].unitPrice != ""){
				items[i].totalPrice = (parseFloat(items[i].unitPrice) * parseFloat(items[i].qty));
				total += parseFloat(items[i].totalPrice);
				$('#totalPrice'+i).val(parseFloat(items[i].totalPrice));
		}
	}	
	$('#totalPrice').val(parseFloat(total));
});
function validate(){
	var vendor = $("#vendor").val();
	var openAcct = $("#openAcct").val();
	var date = $("#date").val();
	var totalPrice = $("#totalPrice").val();
	var input = new Array();
	var array = new Array(vendor, openAcct, date, totalPrice);
	
	function order(){
		this.jobName = $("#jobName"+i).val();
		this.partDescription = $("#partDescription"+i).val();
		this.qty = $("#qty"+i).val();
		this.unitPrice = $("#unitPrice"+i).val();
		this.totalPrice = $("#totalPrice"+i).val();
		this.billedOnInvNumber = $("#billedOnInvNumber"+i).val();
		this.backOrder = ($('#backOrder'+i).is(':checked')) ? "X" : "";
	}
	if(vendor == ""){
		alert("Please enter vendor");
	}
	else if(date == ""){ 
		alert("Please enter date"); 
	}
	else{
		for(var i = 0; i < 15; i++){
			input[i] = new order;
		}
		
		$.ajax({  
				type: 'post',  
				url: 'output.php', 
				data: { action: 'placeorder', inputArray: input, newArray: array },
				success: function(response) {
					alert(response);
				}
		});
	}
}