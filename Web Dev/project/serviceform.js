/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the table
 * 				in the service form. Also, this file updates
 *				the running total as the data is entered. When
 *				the form is complete and submitted this form validates
 *				and extracts data and send it to the output.php
 *				script to create the document.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: serviceform.js
*/
function serviceForm(){
	$("#table1").append("<tbody>");
	for(var i = 0; i < 10; i++){$("#table1").append('<tr><td class="col-lg-1"><input class="form-control" id="quantity'+i+'"></input></td>'
							+ '<td class="col-lg-3"><input class="form-control" id="item'+i+'"></input></td>'
							+ '<td class="col-lg-1"><input class="form-control" id="price'+i+'"></input></td></tr>');
	}
    $("#table1").append("</tbody>");

	$(function(){
		$(".time").clockpicker({
			placement: 'bottom',
			align: 'left',
			autoclose: true,
			'default': 'now'
		});
	});
}
$(document).on('focus', 'input',  function(e){	
	var totalCharge = 0;
	var materialsArray = new Array();
	var serviceCalls = $('#serviceCalls').val();
	var servicePrice = $('#servicePrice').val();
	var addHoursOfLabor = $('#addHoursOfLabor').val();
	var addLaborCost = $('#addLaborCost').val();
	
	function materials() {
			this.quantity = $("#quantity"+i).val();
			this.item = $("#item"+i).val();
			this.price = $("#price"+i).val();
		}
		
	for(var i = 0; i < 10; i++){
			materialsArray[i] = new materials;
			if(materialsArray[i].quantity != "" && materialsArray[i].price != ""){
				totalCharge += (parseFloat(materialsArray[i].quantity) * parseFloat(materialsArray[i].price));
			}
		}
		if(serviceCalls != '' && servicePrice != ''){
			totalCharge += (parseFloat(serviceCalls) * parseFloat(servicePrice));
		}
		if(addHoursOfLabor != '' && addLaborCost != ''){
			totalCharge += (parseFloat(addHoursOfLabor) * parseFloat(addLaborCost));
		}
		
	$('#totalCharge').val(parseFloat(totalCharge));
});


function serviceFormValidate(){
		var date = $("#date").val();
		var cusName = $("#customerName").val();
		var arrivalTime = $("#arrivalTime").val();
		var departTime = $("#departTime").val();
		var chargingVoltage = $("#chargingVoltage").val();
		var batteryVoltage = $("#batteryVoltage").val();
		var wirelessSignal = $("#wirelessSignal").val();
		var tax = $("#tax").val();
		var serviceCalls  = $("#serviceCalls").val();
		var servicePrice = $("#servicePrice").val();
		var addHoursOfLabor =  $("#addHoursOfLabor").val();
		var addLaborCost =  $("#addLaborCost").val();
		var customerPaid =  $("input[name=customerPaid]:checked").val();
		var customerPaidWith = $("input[name=customerPaidWith]:checked").val();
		var totalCharge = $("#totalCharge").val();
		var materialsArray = new Array();
		var inputArray = new Array(date, cusName, arrivalTime, departTime, chargingVoltage, batteryVoltage, wirelessSignal,
							tax, serviceCalls, servicePrice, addHoursOfLabor, addLaborCost, customerPaid, customerPaidWith, totalCharge);
		
		function materials() {
			this.quantity = $("#quantity"+i).val();
			this.item = $("#item"+i).val();
			this.price = $("#price"+i).val();
		}
		
	if(cusName == ""){
		alert("Please enter the customer's name.");
	}
	else if(date == ""){
		alert("Please enter the date.");
	}
	else{
		for(var i = 0; i < 10; i++){
			materialsArray[i] = new materials;
			if(materialsArray[i].quantity != "" && materialsArray[i].price != ""){
				totalCharge += (materialsArray[i].quantity * materialsArray[i].price);
			}
		}
		if(serviceCalls != '' && servicePrice != ''){
			totalCharge += (serviceCalls * servicePrice);
		}
		if(addHoursOfLabor != '' && addLaborCost != ''){
			totalCharge += (addHoursOfLabor * addLaborCost);
		}
		$.ajax({  
				type: 'POST',  
				url: 'output.php', 
				data: { action: 'serviceform', input: inputArray, materials: materialsArray },
				success: function(response) {
					alert(response);
				}
		});
	}
}

