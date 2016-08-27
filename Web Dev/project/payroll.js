/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the tables
 * 				in the payroll form. Also, this file updates
 *				the running total as the data is entered. When
 *				the form is complete and submitted this form validates
 *				and extracts data and send it to the output.php
 *				script to create the document.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: payroll.js
*/
function payroll(){
	$("#table1").append('<tbody>');
	for(var i = 0; i < 5; i++){
		$("#table1").append('<tr>'
							+ '<td><input type="date" class="form-control" id="week'+i+'"></input></td>'
							+ '<td><input type="date" class="form-control" id="thru'+i+'"></input></td>'
							+ '<td><input type="text" class="form-control" id="regHours'+i+'"></input></td>'
							+ '<td><input type="text" class="form-control" id="overtimeHours'+i+'"></input></td>'
							+ '</tr>');
	}	
	$("#table1").append('</tbody>');
		
	$("#table2").append('<tbody>');
	for(var i = 0; i < 8; i++){
		$("#table2").append('<tr>'
							+ '<td><input type="text" class="form-control" id="job'+i+'"></input></td>'
							+ '<td><input type="text" class="form-control" id="commission'+i+'"></input></td>'
							+ '</tr>' );
	}
	$("#table2").append('</tbody>');
	$(function() {
		$( "input[type='date']" ).datepicker({dateFormat: 'mm-dd-yy'});
	});
}
$(document).on('focus', 'input',  function(e){
	var carryOverHrs1 = $("#carryOverHrs1").val();
	var carryOverHrs2 = $("#carryOverHrs2").val();
	var payRate = $("#payRate").val();
	var commissionTotal = 0;
	var total = 0;
	var regHours = 0;
	var overtimeHours = 0;
	var jobcommission = new Array();
	var payWeek = new Array();
	
	function week(){
		this.regHours = $("#regHours"+i).val();
		this.overtimeHours = $("#overtimeHours"+i).val();
	}
	
	function jobCommission(){
		this.commission = $("#commission"+i).val();
	}
	
	for(var i = 0; i < 5; i++){
		payWeek[i] = new week();
		if(payWeek[i].regHours != ""){
			regHours += parseFloat(payWeek[i].regHours);
		}
		if(payWeek[i].overtimeHours != ""){
			overtimeHours += parseFloat(payWeek[i].overtimeHours);
		}
		
	}
	$("#overtimeHrs").val(overtimeHours);
	if(carryOverHrs1 != ""){
		regHours += parseFloat(carryOverHrs1);
	}
	if(carryOverHrs2 != ""){
		regHours += parseFloat(carryOverHrs2);
	}
	$("#regularHrs").val(regHours);
	if(payRate != ""){
			total = (regHours * parseFloat(payRate)) + (overtimeHours * (parseFloat(payRate) * 1.5));
	}
	for(var i = 0; i < 8; i++){
		jobcommission[i] = new jobCommission();
		if(jobcommission[i].commission != ""){
			commissionTotal += parseFloat(jobcommission[i].commission);
			total += parseFloat(jobcommission[i].commission);
		}
	}
	$('#commissionTotal').val(commissionTotal.toFixed(2));
	$('#total').val(total.toFixed(2));
	
});
function validate(){
	var carryOverHrs1 = $("#carryOverHrs1").val();
	var carryOverHrs2 = $("#carryOverHrs2").val();
	var mileage = $("#mileage").val();
	var employee = $("#employee").val();
	var payRate = $("#payRate").val();
	var jobcommission = new Array();
	var carryOver = new Array();
	var commissionTotal = 0;
	var total = 0;
	var regHours = 0;
	var overtimeHours = 0;
	var jobcommission = new Array();
	var payWeek = new Array();
	
	function jobCommission(){
		this.commission = $("#commission"+i).val();
	}
	
	function week(){
		this.week = $("#week"+i).val();
		this.thru = $("#thru"+i).val();
		this.regHours = $("#regHours"+i).val();
		this.overtimeHours = $("#overtimeHours"+i).val();
	}
	
	function jobCommission(){
		this.job = $("#job"+i).val();
		this.commission = $("#commission"+i).val();
	}
	
	for(var i = 0; i < 5; i++){
		payWeek[i] = new week();
		if(payWeek[i].regHours != ""){
			regHours += parseFloat(payWeek[i].regHours);
		}
		if(payWeek[i].overtimeHours != ""){
			overtimeHours += parseFloat(payWeek[i].overtimeHours);
		}
	}
	
	for(var i = 1; i < 5; i++){
		carryOver[i] = $("#carryOver"+i).val();
	}
	
	for(var i = 0; i < 8; i++){
		jobcommission[i] = new jobCommission();
		if(jobcommission[i].commission != ""){
			commissionTotal += parseFloat(jobcommission[i].commission);
			total += parseFloat(jobcommission[i].commission);
		}

	}
	if(carryOverHrs1 != ""){
		regHours += parseFloat(carryOverHrs1);
	}
	if(carryOverHrs2 != ""){
		regHours += parseFloat(carryOverHrs2);
	}
	if(payRate != ""){
			total += (regHours * parseFloat(payRate)) + (overtimeHours * (parseFloat(payRate) * 1.5));
	}
	console.log(parseFloat(total) + " " + parseFloat(regHours) + " " + parseFloat(overtimeHours));
	var input = new Array(payRate, commissionTotal, total, regHours, overtimeHours, employee, carryOverHrs1, carryOverHrs2, mileage);
	$.ajax({  
			type: 'post',  
			url: 'output.php', 
			data: { action: 'payroll', inputArray: input, pay: payWeek, jobCommission: jobcommission, carryOver1: carryOver },
			success: function(response) {
				alert(response);
			}
	});
}