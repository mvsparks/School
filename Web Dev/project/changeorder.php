<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to allow
 * 				installers to create to create a change order
 * 				when a customer decides they need something
 * 				or would like to take something out that was
 *  			agreed for us to install in the contract.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: changeorder.php
-->

<!DOCTYPE html>
<html lang="en"> 
<head>
<title>Change Order</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="changeorder.js"></script>
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

<body onload="changeorder();">

<?php include ('resources/nav.php');?>

<div class="col-lg-10">
  <table class="table-condensed" style="align: left;">
      <tbody>
        <form role="form">
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
                <label for="customerAddress">Customer Address:</label>
                  <input class="form-control" id="customerAddress"></input>
              </div><!-- form group -->
            </td>
          </tr>
          <tr>
            <td>
              <div class="form-group">
                <label for="date">Date:</label>
                  <input type="text" class="form-control" id="date"></input>
              </div><!-- form group -->
            </td>
          </tr>
    </table>
<div class="panel panel-default" style="width: 400px;">
  <div class="panel-heading">Type of System</div>
    <div class="panel-body">
	  <label class="radio-inline" style="color: black;"><input type="radio" name="typeOfSystem" value="Security">Security</label>
      <label class="radio-inline" style="color: black;"><input type="radio" name="typeOfSystem" value="Audio/Video">Audio/Video</label>
      <label class="radio-inline" style="color: black;"><input type="radio" name="typeOfSystem" value="Network">Network</label>
      <label class="radio-inline" style="color: black;"><input type="radio" name="typeOfSystem" value="Camera">Camera</label>
	</div><!-- panel body -->
</div><!-- panel -->
  
<table class="table-condensed" style="align: left;" id="table1">
    <thead>
     <tr>
      <th>Count</th>
      <th>Item</th>
      <th>Price Each</th>
     </tr>
    </thead>
</table>	
  <div class="form-group">
    <label for="additionalTerms">Additional Terms:</label>
      <textarea class="form-control" rows="5" id="additionalTerms" style="width: 500px;"></textarea>
  </div><!-- form group -->
  <div class="form-group">
	<table>
	<tr><td><label for="total">Total</label>
		<input type="text" class="form-control" id="total"></input></td></tr>
	</table>
  </div>
<br><a class="btn" onclick="validate();" id="submitbtn">Submit</a> 
 	<a onclick="window.location.href='changeorder.php';" class="btn" id="resetbtn">Reset</a>

</div><!-- col-lg-10 -->
</body>
</html>