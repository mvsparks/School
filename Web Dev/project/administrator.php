<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to allow an
 * 				administrator to add, edit, delete employee pages.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: administrator.php
-->

<!DOCTYPE html>
<html lang="en"> 
<head>
<title>Administrator</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <style type = "text/css">
  @import URL(project.css);
  </style>
  

<script>
function addEmployee(){
var employeeNum = $("#employeeNumber").val();
var empFirstName = $("#employeeFirst").val();
var empLastName = $("#employeeLast").val();
var employeeEmail = $("#employeeEmail").val();
var empPassword = $("#employeePassword").val();
var timesheet = ($("#timesheet").is(":checked")) ? 1 : 0; 
var serviceForm = ($("#serviceform").is(":checked")) ? 1 : 0;
var zonesheet = ($("#zonesheet").is(":checked")) ? 1 : 0;
var changeorder = ($("#changeorder").is(":checked")) ? 1 : 0;
var mailinglist = ($("#mailinglist").is(":checked")) ? 1 : 0;
var placeorder = ($("#placeorder").is(":checked")) ? 1 : 0;
var payroll = ($("#payroll").is(":checked")) ? 1 : 0;
var administrator = ($("#administrator").is(":checked")) ? 1 : 0;

$("#table1").remove();

if(employeeNum == ''){
	$("#employeeNumber").css("box-shadow","0 0 5px red");
} 
else if(empFirstName == ''){
	$("#employeeFirst").css("box-shadow","0 0 5px red");
}
else if(empLastName == ''){
	$("#employeeLast").css("box-shadow","0 0 5px red");
}
else if(employeeEmail == ''){
	$("#employeeEmail").css("box-shadow","0 0 5px red");
}
else if(empPassword == ''){
	$("#employeePassword").css("box-shadow","0 0 5px red");
}
else{
	$.ajax({  
		type: 'POST',  
		url: 'admin.php', 
		data: { action: 'add', empNum: employeeNum, empFirst: empFirstName, empLast: empLastName, empEmail: employeeEmail, empPass: empPassword ,
		empTimesheet: timesheet, empServiceForm: serviceForm, empZonesheet: zonesheet, empChangeOrder: changeorder, empMailingList: mailinglist,
		empPlaceOrder: placeorder, empPayroll: payroll, empAdministrator: administrator},
		success: function(response) {
			alert(response);
		}
	});
}
}
function searchEmployees(){

	$("#table1").remove();

	$.ajax({  
		type: 'POST',  
		url: 'admin.php', 
		data: { action: 'search' },
		success: function(response) {
			$("#container1").append(response);
		}
	});
}
function removeEmployee(){

	$("#table1").remove();
	
	var employeeNum = $("#employeeNumber").val();
	
	console.log("testing");
	$.ajax({  
		type: 'POST',  
		url: 'admin.php', 
		data: { action: 'remove', empNum: employeeNum },
		success: function(response) {
			alert(response);
		}
	});
}
function updateEmployee(){
	
	$("#table1").remove();
	
var employeeNum = $("#employeeNumber").val();
var empFirstName = $("#employeeFirst").val();
var empLastName = $("#employeeLast").val();
var employeeEmail = $("#employeeEmail").val();
var empPassword = $("#employeePassword").val();
var timesheet = ($("#timesheet").is(":checked")) ? 1 : 0; 
var serviceForm = ($("#serviceform").is(":checked")) ? 1 : 0;
var zonesheet = ($("#zonesheet").is(":checked")) ? 1 : 0;
var changeorder = ($("#changeorder").is(":checked")) ? 1 : 0;
var mailinglist = ($("#mailinglist").is(":checked")) ? 1 : 0;
var placeorder = ($("#placeorder").is(":checked")) ? 1 : 0;
var payroll = ($("#payroll").is(":checked")) ? 1 : 0;
var administrator = ($("#administrator").is(":checked")) ? 1 : 0;

	$.ajax({  
		type: 'POST',  
		url: 'admin.php', 
		data: { action: 'update', empNum: employeeNum, empFirst: empFirstName, empLast: empLastName, empEmail: employeeEmail, empPass: empPassword ,
		empTimesheet: timesheet, empServiceForm: serviceForm, empZonesheet: zonesheet, empChangeOrder: changeorder, empMailingList: mailinglist,
		empPlaceOrder: placeorder, empPayroll: payroll, empAdministrator: administrator},
		success: function(response) {
			alert(response);
		}
	});
}
function clearPage(){
	window.location.href='administrator.php';
}
</script>  
  
</head>
<body>

<?php include ('resources/nav.php');?>

<div class="col-lg-10" id="container1">
	<table class="table-condensed">
    <thead>
     <tr>
      <th>Employee Number</th>
      <th>Employee First Name</th>
      <th>Employee Last Name</th>
      <th>Employee Email</th>
      <th>Employee Password</th>
	 </tr>
	</thead>
	<tbody>
	  <tr>
	    <td><input type="text" class="form-control" id="employeeNumber"></input></td>
	    <td><input type="text" class="form-control" id="employeeFirst"></input></td>
	    <td><input type="text" class="form-control" id="employeeLast"></input></td>
	    <td><input type="text" class="form-control" id="employeeEmail"></input></td>
	    <td><input type="text" class="form-control" id="employeePassword"></input></td>
	  </tr>
	</tbody>
	</table>
	<br><br>
	<table class="table-condensed">
	 <thead>
	  <th>Time Sheet</th>
	  <th>Service Form</th>
	  <th>Zone Sheet</th>
	  <th>Change Order</th>
	  <th>Mailing List</th>
	  <th>Place Order</th>
	  <th>Payroll</th>
	  <th>Administrator</th>
	 </thead>
	 <tbody>
		<td><input type="checkbox" class="form-control" id="timesheet"></input></td>
		<td><input type="checkbox" class="form-control" id="serviceform"></input></td>
		<td><input type="checkbox" class="form-control" id="zonesheet"></input></td>
		<td><input type="checkbox" class="form-control" id="changeorder"></input></td>
		<td><input type="checkbox" class="form-control" id="mailinglist"></input></td>
		<td><input type="checkbox" class="form-control" id="placeorder"></input></td>
        <td><input type="checkbox" class="form-control" id="payroll"></input></td>
		<td><input type="checkbox" class="form-control" id="administrator"></input></td>
	  </tbody>
	</table>
	<br><br>
	<br><a class="btn btn-default" type="button" id="searchbtn" onclick="searchEmployees();">Search</a> 
    <a class="btn btn-default" type="button" onclick="addEmployee();" value="add" id="addbtn">Add</a> 
	<a class="btn btn-default" type="button" onclick="updateEmployee();" id="updatebtn">Update</a> 
	<a class="btn btn-default" type="button" onclick="clearPage()" value="reset" id="resetbtn">Reset</a>
    <a class="btn btn-default" type="button" onclick="removeEmployee();" value="remove" id="removebtn">Remove</a>
	<br><br>
</body>
</div><!-- col-lg-10 -->
</html>