<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to allow an employee to
 * 				create a daily time sheet.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: timesheet.php
-->

<!DOCTYPE html>
<html lang="en"> 
<head>
<title>Time Sheet</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="timesheet.js"></script>
  
  <!-- datepicker found jQuery UI http://jqueryui.com/datepicker/ -->
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  
  <!-- clockpicker found http://weareoutman.github.io/clockpicker/ -->
  <link rel="stylesheet" href="clockpicker.css">
  <link rel="stylesheet" href="standalone.css">
  <script src="clockpicker.js"></script>
  <style type = "text/css">
  @import URL(project.css);
  </style>
</head>

<?php include ('resources/nav.php');?>

<div class="col-lg-10">
<body onload="loadPage()">
	<table class="table-condensed" style="align: left;" id="table1">
		<tbody>
			<form role="form" id="myForm">
				<tr><td><div class="form-group"><label for="date">Date:</label><input type="text" class="form-control" id="date"></input></div></td></tr>
				<tr><td><div class="form-group"><label for="startTime">Start Time:</label><input type="text" class="time form-control" id="startTime"></input></div></td></tr>
				<tr><td><div class="form-group"><label for="startingMileage">Starting Mileage:</label><input type="text" class="form-control" id="startingMileage"></input></div></td></tr>
				<tr><td><div class="form-group"><label for="endingMileage">Ending Mileage:</label><input type="text" class="form-control" id="endingMileage"></div></td></tr>
			</form>
		</tbody>
	</table>
						
	<table class="table-condensed" id="table2">
		<thead>
			<tr><th>Arrival Time</th>
			<th>Job Name</th>
			<th>Description</th>
			<th>Break Time</th>
			<th>Depart Time</th>
			<th>Job Time</th></tr>
		</thead>
	</table>
	<br><a onclick="validate();" class="btn" id="submitbtn">Submit</a>
      <a onclick="window.location.href='timesheet.php';" class="btn" id="resetbtn">Reset</a>
</div>
</div><!-- body container -->
</body>
</html>
