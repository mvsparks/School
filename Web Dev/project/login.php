<!--
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this page is to accept the user's email
 *              and password and validate entry.  Then load user's 
 *              settings.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: login.php
-->

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="login.js"></script>
</head>
<body>
<div class="container">
<img src="resources/logo.png" class="img-responsive" style="width: 500px; margin: auto;">
<table class="table-condensed" style="margin: auto;">
 <form role="form" style="margin: auto;" id="myForm">
  <tr>
   <td>
     <div class="form-group">
      <label class="control-label" for="email">Email:</label>
        <input type="text" class="form-control" id="email" placeholder="Enter email" style="margin: auto;">
     </div><!-- form group -->
   </td>
  </tr>
  <tr>
    <td>
      <div class="form-group">
        <label class="control-label" for="pwd">Password:</label>
          <input type="password" class="form-control" id="pwd" placeholder="Enter password" style="margin: auto;">
      </div><!-- form group -->
	</td>
  </tr>
  <tr>
    <td>
      <div class="form-group">
        <button class="btn btn-default" type="button" onclick="checkLogin()" >Submit</button>
        <button class="btn btn-default" type="button" onclick="alert('Contact administrator');"id="forgotPassword">Forgot Password</button>
      </div><!-- form group -->
	</td>
  </tr>
</table>
 </form>
</div><!-- body container -->
</body>
</html>
