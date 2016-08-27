/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the table
 * 				in the change order form. Also, this file updates
 *				the running total as the data is entered. When
 *				the form is complete and submitted this form validates
 *				and extracts data and send it to the output.php
 *				script to create the document.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: changeorder.js
*/
function changeorder(){
	$("#table1").append("<tbody");
	for(var i = 0; i < 15; i++){
		$("#table1").append('<tr>'
							+ '<td><input class="form-control" id="count'+i+'"></input></td>'
							+ '<td><input class="form-control" id="item'+i+'"></input></td>'
							+ '<td><input class="form-control" id="priceEach'+i+'"></input></td>'
							+ '</tr>');
	}
	$("#table1").append("</tbody>");
}
$(document).on('focus', 'input',  function(e){	
	var total = 0;
	var items = new Array();
	
	function item(){
		this.count = $("#count"+i).val();
		this.item = $("#item"+i).val();
		this.priceEach = $("#priceEach"+i).val();
	}
	for(var i = 0; i < 15; i++){
		items[i] = new item();
		if(items[i].count != "" && items[i].priceEach != ""){
				total += (parseFloat(items[i].count) * parseFloat(items[i].priceEach));
		}
	}	
	$('#total').val(parseFloat(total));
});
function validate(){
	var customerName = $("#customerName").val();
	var customerAddress = $("#customerAddress").val();
	var date = $("#date").val();
	var typeOfSystem = $("input[name=typeOfSystem]:checked").val();
	var additionalTerms = $("#additionalTerms").val();
	var total = $('#total').val();
	var items = new Array();
	var inputArray = new Array(customerName, customerAddress, date, typeOfSystem, additionalTerms, total);
	
	function item(){
		this.count = $("#count"+i).val();
		this.item = $("#item"+i).val();
		this.priceEach = $("#priceEach"+i).val();
	}
	
	if(customerName == ""){
		alert("Please enter customer name.");
	}
	else if(customerAddress == ""){
		alert("Please enter customer address.");
	}
	else if(date == ""){
		alert("Please enter the date.");
	}
	else{
	for(var i = 0; i < 15; i++){
		items[i] = new item();
		if(items[i].count != "" && items[i].priceEach != ""){
				total += (parseFloat(items[i].count) * parseFloat(items[i].priceEach));
		}
	}
	$.ajax({  
				type: 'POST',  
				url: 'output.php', 
				data: { action: 'changeorder', input: inputArray, itemArray: items },
				success: function(response) {
					alert(response);
				}
		});
	}
}