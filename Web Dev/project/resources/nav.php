<nav class="navbar navbar-default">
  <div class="container">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#Navbar">
      <span class="glyphicon glyphicon-menu-hamburger"></span>
    </button>
  </div><!--glyphicon nav container -->
  <div class="navbar-header">
    <a class="navbar-brand"><img src="resources/safensoundsmall.png" style="width: 130px; height: 30px;"></a>
  </div>
  <div class="collapse navbar-collapse" id="Navbar" style="align: right;">
          <ul class="nav navbar-nav">
            <li><a href="login.php">Logout</a></li>
          </ul>
  </div><!-- navbar -->
</nav>

<div class="col-lg-2" id="leftNav">
<ul class="nav nav-pills nav-stacked" data-offset-top="250" id='nav1'>
						
</ul>
</div><!-- col-lg-2 -->
<script>
var navBar = ['<li><a href="timesheet.php">Time Sheet</a></li>',
						'<li><a href="serviceform.php">Service Form</a></li>',
						'<li><a href="zonesheet.php">Zone Sheet</a></li>',
						'<li><a href="changeorder.php">Change Order</a></li>',
						'<li><a href="mailinglist.php">Mailing List</a></li>',
						'<li><a href="placeorder.php">Place Order</a></li>',
						'<li><a href="payroll.php">Payroll</a></li>',
						'<li><a href="administrator.php">Administrator</a></li>'];
var nav = localStorage.nav;

for(var i = 0; i < 8; i++){
	if(nav.charAt(i) == '1'){
		$("#nav1").append(navBar[i]);
	}
}
</script>