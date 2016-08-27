<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to create a payroll
 *				form for an employee.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: payrollowner.php
-->

<!DOCTYPE html>
<html lang="en"> 
<head>
<title>Payroll</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="payroll.js"></script>
  
  <!-- datepicker found jQuery UI http://jqueryui.com/datepicker/ -->
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  
  <!-- clockpicker found http://weareoutman.github.io/clockpicker/ -->
  <link rel="stylesheet" href="clockpicker.css">
  <link rel="stylesheet" href="standalone.css">
  <script src="clockpicker.js"></script>
  <script>
	$(function() {
		$( "input[type='date']" ).datepicker({dateFormat: 'mm-dd-yy'});
	});
  </script>
  <style type = "text/css">
  @import URL(project.css);
  </style>
</head>
<body onload="payroll();">

<?php include ('resources/nav.php');?>

<div class="col-lg-10">
	<form class="form-inline" role="form">
	<p>Hourly Employee Monthly Tall Sheet for: <input type="text" class="form-control" id="employee"></input>
	       Mileage: <input type="text" class="form-control" id="mileage"></input><br><br><br>
	Carry over week <input type="date" class="form-control" id="carryOver1"></input> thru <input type="date" class="form-control" id="carryOver2"></input>
	(ending on the 14th of prior month) <input type="text" class="form-control" id="carryOverHrs1"></input> hrs.<br>
	Carry over week <input type="date" class="form-control" id="carryOver3"></input> thru <input type="date" class="form-control" id="carryOver4"></input>
	(ending on the 15th of prior month) <input type="text" class="form-control" id="carryOverHrs2"></input> hrs.</p>
	</form>
	<table class="table-condensed" style="align: left; color: red;" id="table1">
    <thead>
     <tr>
      <th>Week</th>
      <th>Thru</th>
      <th>Regular Hrs</th>
      <th>Overtime Hrs</th>
     </tr>
    </thead>
    </table>
	<br><br>
	<form class="form-inline" role="form">
	<label for="regularHrs">Regular Hrs</label>
	  <input type="text" class="form-control" id="regularHrs"></input>
	<br><br>
	<label for="overtimeHrs">Overtime Hrs</label>
	  <input type="text" class="form-control" id="overtimeHrs"></input>
	<br>  
	</form>
	<table class="table-condensed" style="align: left; color: red;" id="table2">
    <thead>
     <tr>
      <th>Job</th>
      <th>Commission</th>
     </tr>
    </thead>
    </table>
	<br><br>
	<form class="form-inline" role="form">
	<label for="payRate">Pay Rate</label>
	  <input type="text" class="form-control" id="payRate"></input>
	<br><br>
	<label for="commissionTotal">Commission Total</label>
	  <input type="text" class="form-control" id="commissionTotal"></input>
	  <br><br>
	<label for="total">Total</label>
	  <input type="text" class="form-control" id="total"></input>
	<br>  
	</form>
<br><a class="btn" onclick="validate();" id="submitbtn">Submit</a> 
    <a class="btn" onclick="window.location.href='payroll.php';" id="resetbtn">Reset</a>
</div><!-- col-lg-10 -->

</body>
</html>