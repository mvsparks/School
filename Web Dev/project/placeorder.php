<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to allow
 * 				the inventory manager to create a place order
 * 				to order materials from distributors.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: placeorder.php
-->

<!DOCTYPE html>
<html lang="en"> 
<head>
<title>Place Order</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="placeorder.js"></script>
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
<body onload="placeorder();">

<?php include ('resources/nav.php');?>

<div class="col-lg-10">

<table class="table-condensed" style="align: left; color: red;">
      <tbody>
        <form role="form">
         <tr>
            <td>
              <div class="form-group">
                <label for="vendor">Vendor</label>
                  <input type="text" class="form-control" id="vendor"></input> 
              </div><!-- form group -->
            </td>
            <td>
              <div class="form-group">
                <label for="openAcct">Open Acct</label>
                  <input type="text" class="form-control" id="openAcct"></input> 
              </div><!-- form group -->
            </td>
		  </tr>
		  <tr>
            <td>
              <div class="form-group">
                <label for="placeOrderNumber">PO#</label>
                  <input type="text" class="form-control" id="customerName"></input> 
              </div><!-- form group -->
            </td>
            <td>
              <div class="form-group">
                <label for="date">Date:</label>
                  <input type="text" class="form-control" id="date"></input>
              </div><!-- form group -->
            </td>
          </tr>
    </table>
	<table class="table table-condensed table-striped table-bordered" id="table1">
        <thead>
          <tr>
            <th>Job Name</th>
            <th>Part Description</th>
            <th>Qty</th>
            <th>Unit Price</th>
            <th>Total Price</th>
            <th>Billed On Inv #</th>
            <th>Back Order</th>
          </tr>
        </thead>
	</table>
	<table>
	 <form>
	 <tbody>
	      <tr>
            <td>
              <div class="form-group">
                <label for="totalPrice">Total Price</label>
                  <input class="form-control" id="totalPrice"></input>
              </div><!-- form group -->
            </td>
          </tr>
      </tbody>
	</form>
  </table><!-- table -->
	</table>

<br><a class="btn" onclick="validate();" id="submitbtn">Submit</a> 
    <a class="btn" onclick="window.location.href='placeorder.php';" id="resetbtn">Reset</a>
</div><!-- col-lg-10 -->

</body>
</html>