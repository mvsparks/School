<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is allow and installer
 *				to create a service form that details information
 *				about action taken in service of a customer's system.
 *				This form also calculates the total cost of the service.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: serviceform.php
-->

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Service Man Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="serviceform.js"></script>
  
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
  
  <script>
  	$(function() {
		$( "#date" ).datepicker({dateFormat: 'mm-dd-yy'});
	});
  </script>
</head>
<body onload="serviceForm();">

<?php include ('resources/nav.php');?>

<div class="col-lg-10">
  <table class="table-condensed" style="align: left;">
      <tbody>
        <form role="form">
          <tr>
            <td>
              <div class="form-group">
                <label for="date">Date:</label>
                  <input type="text" class="form-control" id="date"></input>
              </div><!-- form group -->
            </td>
          </tr>
          <tr>
            <td>
              <div class="form-group">
                <label for="customerName">Customer Name:</label>
                  <input type="text" class="form-control" id="customerName"></input> 
              </div><!-- form group -->
            </td>
          </tr>
          <tr>
            <td>
              <div class="form-group">
                <label for="arrivalDepartTime">Arrival Time:</label>
                  <input class="time form-control" id="arrivalTime"></input>
              </div><!-- form group -->
            </td>
          </tr>
		  <tr>
            <td>
              <div class="form-group">
                <label for="arrivalDepartTime">Depart Time:</label>
                  <input class="time form-control" id="departTime"></input>
              </div><!-- form group -->
            </td>
          </tr>
          <tr>
            <td>
              <div class="form-group">
                <label for="chargingVoltage">Charging Voltage:</label>
                  <input class="form-control" id="chargingVoltage"></input>
              </div><!-- form group -->
            </td>
            <td>
              <div class="form-group">
                <label for="batteryVoltage">Battery Voltage:</label>
                  <input class="form-control" id="batteryVoltage"></input>
              </div><!-- form group -->
            </td>
            <td>
              <div class="form-group">
                <label for="wirelessSignal">Wireless Signal:</label>
                  <input class="form-control" id="wirelessSignal"></input>
              </div><!-- form group -->
            </td>
          </tr>
      </tbody>
	</form>
  </table><!-- table -->
  <div class="form-group">
    <label for="actionTaken">Action Taken:</label>
        <textarea class="form-control" rows="5" id="actionTaken" style="width: 500px;"></textarea>
  </div><!-- form group -->
<div class="col-lg-5">  
<div class="panel panel-default" style="width: 400px;">
  <div class="panel-heading">Materials</div>
  <div class="panel-body">
	<table style="padding: 5px" id="table1">
      <thead>
       <tr>
        <th class="col-lg-1">Quantity</th>
        <th class="col-lg-3">Item</th>
        <th class="col-lg-1">Price Each</th>
       </tr>
      </thead>
    </table>
  <div class="checkbox">
    <label><input type="checkbox" value="tax">Tax</label>
  </div><!-- checkbox -->
  </div><!-- panel body -->
  <br><br>
</div><!-- panel -->
</div><!-- col-lg-5 -->
 <div class="col-lg-5">
  <div class="panel panel-default" style="width: 400px;">
  <div class="panel-heading">Labor</div>
  <div class="panel-body">
  <table class="table-condensed">
   <form class="form-inline" role="form" id="form2">
    <tbody>
	  <tr>
	    <td><label for="serviceCalls">Service Call(s)</label>
		      <input class="form-control" name="serviceCalls" id="serviceCalls"></input>
		    <label for="servicePrice">Each</label>
			  <input class="form-control" name="servicePrice" id="servicePrice"></input>
		</td>
	  </tr>
	  <tr>
	    <td><label for="addHoursOfLabor">Hours of Addtional Labor</label>
		      <input class="form-control" name="addHoursOfLabor" id="addHoursOfLabor"></input>
			<label for="addLaborCost">Cost Per Hour</label>		    
			    <input class="form-control" name="addLaborCost" id="addLaborCost"></input>
		</td>
	  </tr>
	  <tr>
		<td><label for="totalCharge">Total Charge:</label>
		      <input class="form-control" name="totalCharge" id="totalCharge"></input>
		</td>
	  </tr>
	</tbody>
   </form>
  </table>
  </div><!-- panel body -->
  </div><!-- panel -->
  <div class="panel panel-default" style="width: 400px;">
  <div class="panel-heading">Payment</div>
  <div class="panel-body">
  <form class="inline-form" id="form3">
    <label for="customerPaid">Customer Paid</label><br>
      <label class="radio-inline" style="color: black;"><input type="radio" value="Yes" name="customerPaid">Yes</label>
      <label class="radio-inline" style="color: black;"><input type="radio" value="No" name="customerPaid">No</label>
    <br><br><label for="customerPaidWith">Customer Paid With</label><br>
      <label class="radio-inline" style="color: black;"><input type="radio" value="CC" name="customerPaidWith">Credit Card</label>
      <label class="radio-inline" style="color: black;"><input type="radio" value="Cash" name="customerPaidWith">Cash</label>
      <label class="radio-inline" style="color: black;"><input type="radio" value="Check" name="customerPaidWith">Check</label>
  </form>
  </div><!-- panel body -->
  </div><!-- panel -->
 </div><!-- col-lg-5 -->
  <div class="col-lg-4">
   <br><a onclick="serviceFormValidate();" class="btn" id="submitbtn">Submit</a> 
      <a onclick="window.location.href='serviceform.php'" class="btn" id="resetbtn">Reset</a>
  </div>
</div><!-- col-lg-10 -->
</body>
</html>