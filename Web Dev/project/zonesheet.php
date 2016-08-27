<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to allow an employee to
 * 				create a zone sheet for a customer security system.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: zonesheet.php
-->

<!DOCTYPE html>
<html lang="en"> 
<head>
<title>Zone Sheet</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="zonesheet.js"></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <style type = "text/css">
  @import URL(project.css);
  </style>
  <script>
  $(function() {
    $( "#date" ).datepicker({dateFormat: 'mm-dd-yy'});
  });
  </script>
</head>

<body onload="zonesheet()">

<?php include ('resources/nav.php');?>

<div class="col-lg-10">
	<table class="table-condensed" style="align: left; color: red;" id="table2">
    <tbody>
      <form role="form">
      <tr>
        <td>
          <div class="form-group">
            <label for="customerName">Customer Name:</label>
                <input type='text' class="form-control" name="customerName" id="cusName"></input>
           </div>
          <div class="form-group">
            <label for="date">Date:</label>
              <input type="text" class="form-control" name="date" id="date"></input>
          </div>
        </td>
      </tr>
     </form>
    </tbody>
  </table>
    <table class="table table-condensed table-striped table-bordered" id="table1">
        <thead style="color: red;">
          <tr>
            <th>Zone</th>
            <th>Area</th>
            <th>Description</th>
            <th>Wire #</th>
            <th>Report Code</th>
          </tr>
        </thead>
        
	</table>
	<table class="table table-condensed table-striped table-bordered" id="table2">
        <thead style="color: red;">
          <tr>
            <th>KP #</th>
            <th>Area</th>
            <th>Location</th>
            <th>Wire #</th>
            <th>Sensor #</th>
          </tr>
        </thead>
        <tbody>
            <tr>
              <td class="col-lg-1" id="keypadNumber0">1</td>
              <td class="col-lg-1"><input type="text" class="form-control" id="kparea0"></td>
              <td class="col-lg-5"><input type="text" class="form-control" id="keypadLocation0"></td>
              <td class="col-lg-1"><input type="text" class="form-control" id="keypadWireNumber0"></td>
              <td class="col-lg-2"><input type="text" class="form-control" id="keypadSensorNumber0"></td>
            </tr>
            <tr>
              <td class="col-lg-1" id="keypadNumber1">2</td>
              <td class="col-lg-1"><input type="text" class="form-control" id="kparea1"></td>
              <td class="col-lg-5"><input type="text" class="form-control" id="keypadLocation1"></td>
              <td class="col-lg-1"><input type="text" class="form-control" id="keypadWireNumber1"></td>
              <td class="col-lg-2"><input type="text" class="form-control" id="keypadSensorNumber1"></td>
            </tr>
            <tr>
              <td class="col-lg-1" id="keypadNumber2">3</td>
              <td class="col-lg-1"><input type="text" class="form-control" id="kparea2"></td>
              <td class="col-lg-5"><input type="text" class="form-control" id="keypadLocation2"></td>
              <td class="col-lg-1"><input type="text" class="form-control" id="keypadWireNumber2"></td>
              <td class="col-lg-2"><input type="text" class="form-control" id="keypadSensorNumber2"></td>
            </tr>
            <tr>
              <td class="col-lg-1" id="keypadNumber3">4</td>
              <td class="col-lg-1"><input type="text" class="form-control" id="kparea3"></td>
              <td class="col-lg-5"><input type="text" class="form-control" id="keypadLocation3"></td>
              <td class="col-lg-1"><input type="text" class="form-control" id="keypadWireNumber3"></td>
              <td class="col-lg-2"><input type="text" class="form-control" id="keypadSensorNumber3"></td>
            </tr>
            <tr>
              <td class="col-lg-1" id="keypadNumber4">5</td>
              <td class="col-lg-1"><input type="text" class="form-control" id="kparea4"></td>
              <td class="col-lg-5"><input type="text" class="form-control" id="keypadLocation4"></td>
              <td class="col-lg-1"><input type="text" class="form-control" id="keypadWireNumber4"></td>
              <td class="col-lg-2"><input type="text" class="form-control" id="keypadSensorNumber4"></td>
            </tr>
            <tr>
              <td class="col-lg-1" id="keypadNumber5">6</td>
              <td class="col-lg-1"><input type="text" class="form-control" id="kparea5"></td>
              <td class="col-lg-5"><input type="text" class="form-control" id="keypadLocation5"></td>
              <td class="col-lg-1"><input type="text" class="form-control" id="keypadWireNumber5"></td>
              <td class="col-lg-2"><input type="text" class="form-control" id="keypadSensorNumber5"></td>
            </tr>
		</tbody>
	</table>
	<div class="col-lg-5">
    <table id="table1" style="align: left; color: red;">
        <tbody>
            <tr>
              <td class="col-lg-3">
                <div class="form-group">
                  <label for="entry1Zones">Entry 1 Zones</label>
                    <input type='text' class="form-control" name="entry1Zones" id="entry1Zones"></input>
                </div>
			  </td>
			  <td class="col-lg-2">
                <div class="form-group">
                  <label for="entry1Delay">Delay</label>
                    <input type="text" class="form-control" name="delay" id="delay"></input>
                </div>
              </td>
            </tr>
			<tr>
              <td class="col-lg-3">
                <div class="form-group">
                  <label for="entry2Zones">Entry 2 Zones</label>
                    <input type='text' class="form-control" name="entry2Zones" id="entry2Zones"></input>
                </div>
			  </td>
			  <td class="col-lg-2">
                <div class="form-group">
                  <label for="entry2Delay">Delay 2</label>
                    <input type="text" class="form-control" name="delay2" id="delay2"></input>
                </div>
              </td>
            </tr>
			<tr>
              <td class="col-lg-3">
                <div class="form-group">
                  <label for="followers">Followers</label>
                    <input type='text' class="form-control" name="followers" id="followers"></input>
                </div>
			  </td>
              <td class="col-lg-2">
                <div class="form-group">
                  <label for="exit">Exit Delay</label>
                    <input type='text' class="form-control" name="exitDelay" id="exitDelay"></input>
                </div>
			  </td>
			</tr>
			</tr>
			<tr>
              <td class="col-lg-3">
                <div class="form-group">
                  <label for="bypass1">Bypass 1</label>
                    <input type='text' class="form-control" name="bypass1" id="bypass1"></input>
                </div>
			  </td>
            </tr>
			<tr>
              <td class="col-lg-3">
                <div class="form-group">
                  <label for="bypass2">Bypass 2</label>
                    <input type='text' class="form-control" name="bypass2" id="bypass2"></input>
                </div>
			  </td>
			</tr>
		</tbody>
    </table>
	</div>
	<div class="form-group  col-lg-5">
    <label for="notes">Notes:</label>
      <textarea class="form-control" rows="5" id="notes"></textarea>
    </div><!-- form group -->
<div class="col-lg-10">
	<br><a onclick="validate()" class="btn" id="submitbtn">Submit</a> 
	<a class="btn" onclick="window.location.href='zonesheet.php';" id="resetbtn">Reset</a>
</div><!-- col-lg-10 -->
</div><!-- col-lg-10 -->


</body>
</html>