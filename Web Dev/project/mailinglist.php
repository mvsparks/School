<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to allow the 
 *				operations manager to create a mailing list
 *				of new customer emails to be added to our
 *				complied customer emailing service list.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: mailinglist.php
-->

<!DOCTYPE html>
<html lang="en"> 
<head>
<title>Mailing List</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="mailinglist.js"></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <script>
  $(function() {
    $( "#date" ).datepicker({dateFormat: 'mm-dd-yy'});
  });
  </script>
  <style type = "text/css">
  @import URL(project.css);
  </style>
</head>
<body onload="mailingList();">

<?php include ('resources/nav.php');?>

<div class="col-lg-10">
  <table style="padding: 10px">
   <tbody>
     <tr>
	   <td>
	     <div class="form-group">
          <label for="date">Date:</label>
            <input type="text" class="form-control" id="date"></input>
         </div><!-- form group -->
		</td>
	  </tr>
	</tbody>
   </table>
	<table style="padding: 10px" id="table1">
    <thead>
     <tr>
      <th class="col-lg-2">Customer Name</th>
      <th class="col-lg-3">Customer Email</th>
	 </tr>
	</thead>
   </table>
	<br><a class="btn" onclick="validate();" id="submitbtn">Submit</a> 
	    <a class="btn" onclick="window.location.href='mailinglist.php';" id="resetbtn">Reset</a>
</div><!-- col-lg-10 -->
</body>
</html>