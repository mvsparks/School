<?php
/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to add, remove or update any
 * 				employee information from the database. Also, this file 
 * 				verifies user login and returns employee name for paperwork
 * 				submission.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: admin.php
*/	
if (isset($_POST['action'])) {
    switch ($_POST['action']) {
        case 'add':
            addEmployee();
            break;
        case 'update':
            updateEmployee();
            break;
		case 'remove':
			removeEmployee();
			break;
		case 'reset':
			resetFields();
			break;
		case 'search':
			search();
			break;
		case 'login':
			login();
			break;
		case 'empName':
			empName();
			break;
		default:
			echo "default";
			break;
    }
}
else{
	print "failure";
}

function addEmployee(){
	$servername = "localhost";
	$username = "c2230a07";
	$password = "c2230a07";
	$dbname = "c2230a07test";
	
	$empNum = $_POST['empNum'];
	$empFirst = $_POST['empFirst'];
	$empLast = $_POST['empLast'];
	$empEmail = $_POST['empEmail'];
	$empPassword = $_POST['empPass'];
	$timesheet = $_POST['empTimesheet'];
	$serviceform = $_POST['empServiceForm'];
	$zonesheet = $_POST['empZonesheet'];
	$changeorder = $_POST['empChangeOrder'];
	$mailinglist = $_POST['empMailingList'];
	$placeorder = $_POST['empPlaceOrder'];
	$payroll = $_POST['empPayroll'];
	$administrator = $_POST['empAdministrator'];
	
	// Create connection
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Check connection
	if ($conn->connect_error) {
		die("Connection failed: " . $conn->connect_error);
	}

	$sql = "INSERT INTO employee (empNum, empEmail, empFirstName, empLastName, empPassword, 
									timesheet, serviceform, zonesheet, changeorder, mailinglist, 
									placeorder, payroll, administrator)
	VALUES ('$empNum', '$empEmail', '$empFirst', '$empLast', '$empPassword', 
			'$timesheet', '$serviceform', '$zonesheet', '$changeorder', '$mailinglist', 
			'$placeorder', '$payroll', '$administrator')";

	if ($conn->query($sql) === TRUE) {
		echo "Employee created successfully";
	}
	else {
		echo "Error: " . $conn->error;
	}

	$conn->close();
}
function removeEmployee(){
	$servername = "localhost";
	$username = "c2230a07";
	$password = "c2230a07";
	$dbname = "c2230a07test";
	$empNum = $_POST['empNum'];
	
	// Create connection
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Check connection
	if ($conn->connect_error) {
		die("Connection failed: " . $conn->connect_error);
	}

	$sql = "delete from employee where empNum = $empNum";

	if ($conn->query($sql) === TRUE) {
		echo "Employee removed successfully";
	}
	else {
		echo "Error: " . $conn->error;
	}

	$conn->close();
}
function updateEmployee(){
	$servername = "localhost";
	$username = "c2230a07";
	$password = "c2230a07";
	$dbname = "c2230a07test";
	
	$empNum = $_POST['empNum'];
	$empFirst = $_POST['empFirst'];
	$empLast = $_POST ['empLast'];
	$empEmail = $_POST['empEmail'];
	$empPass = $_POST['empPass'];
	$timesheet = $_POST['empTimesheet'];
	$serviceform = $_POST['empServiceForm'];
	$zonesheet = $_POST['empZonesheet'];
	$changeorder = $_POST['empChangeOrder'];
	$mailinglist = $_POST['empMailingList'];
	$placeorder = $_POST['empPlaceOrder'];
	$payroll = $_POST['empPayroll'];
	$administrator = $_POST['empAdministrator'];
	
	// Create connection
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Check connection
	if ($conn->connect_error) {
		die("Connection failed: " . $conn->connect_error);
	}
	
	if($empFirst == ""){
		if($empLast == ""){
			if($empEmail == ""){
				if($empPass == ""){
					//firstname, lastname, email, password empty
					$sql = "update employee set timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
				}
				else{
					//firstname, lastname, email empty - password not empty
					$sql = "update employee set empPassword='$empPass', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
				}
			}
			else if($empPass == ""){
				//firstname, lastname, password empty - email not empty
					$sql = "update employee set empEmail='$empEmail', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
			}
			else{
				//firstname, lastname empty - email, password not empty
					$sql = "update employee set empEmail='$empEmail', empPassword='$empPass', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
			}
		}
		else if($empEmail == ""){
			if($empPass == ""){
				//firstname, email, password empty - lastname not empty
				$sql = "update employee set empLastName='$empLast', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
				where empNum='$empNum'";
			}
			else{
				//firstname, email empty - lastname, password not empty
				$sql = "update employee set empLastName='$empLast', empPassword='$empPass', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
				where empNum='$empNum'";
			}
		}
		else if($empPass == ""){
			//firstname, password empty - lastname, email not empty
					$sql = "update employee set empFirstName='$empFirst', empEmail='$empEmail', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
		}
		else{
			//firstname empty only - lastname, email, password not empty
			$sql = "update employee set empLastName='$empLast', empEmail='$empEmail', empPassword='$empPass', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
			where empNum='$empNum'";
		}
	}
	else if($empLast == ""){
			if($empEmail == ""){
				if($empPass == ""){
					//lastname, email, pass empty - firstname not empty
					$sql = "update employee set empFirstName='$empFirst', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
				}
				else{
					//lastname, email empty - firstname, password not empty
					$sql = "update employee set empFirstName='$empFirst', empPassword='$empPass', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
				}
			}
			else if($empPass == ""){
				//lastname, password empty - firstname, email, password not empty
				$sql = "update employee set empFirstName='$empFirst', empEmail='$empEmail', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
				where empNum='$empNum'";
			}
			else{
				//lastname empty only - firstname, email, password not empty
				$sql = "update employee set empFirstName='$empFirst', empEmail='$empEmail', empPassword='$empPass', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
				where empNum='$empNum'";
			}
	}
	else if($empEmail == ""){
		if($empPass == ""){
					//email, password empty - firstname, lastname not empty
					$sql = "update employee set empFirstName='$empFirst', empLastName='$empLast', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
		}
		else{
			//email empty only - password, firstname, lastname not empty
			$sql = "update employee set empFirstName='$empFirst', empLastName='$empLast', empPassword='$empPass', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
			where empNum='$empNum'";
		}
	}
	else if($empPass == ""){
					//password empty only - email, firstname, lastname not empty
					$sql = "update employee set empFirstName='$empFirst', empLastName='$empLast', empEmail='$empEmail', timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
					where empNum='$empNum'";
	}	
	else{
			//none empty
			$sql = "update employee set empFirstName='$empFirst', empLastName='$empLast', empEmail='$empEmail', empPassword='$empPass',
											timesheet='$timesheet', serviceform='$serviceform', zonesheet='$zonesheet',  
											changeorder='$changeorder', mailinglist='$mailinglist', placeorder='$placeorder', 
											payroll='$payroll', administrator='$administrator' 
			where empNum='$empNum'";
	}
	if ($conn->query($sql) === TRUE) {
		echo "Employee updated";
	}
	else {
		echo "Error: " . $conn->error;
	}

	$conn->close();
}
function search(){
	$servername = "localhost";
	$username = "c2230a07";
	$password = "c2230a07";
	$dbname = "c2230a07test";
	$empNum = $_POST['empNum'];

	// Create connection
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Check connection
	if ($conn->connect_error) {
		die("Connection failed: " . $conn->connect_error);
	}

	$sql = "SELECT * FROM employee";
	$result = $conn->query($sql);

	if ($result->num_rows > 0) {
    // output data of each row
		echo '<table class="table-condensed table-striped" id="table1" style="padding: 20px; align: center;">';
		echo "<thead><th>Employee Number</th><th>Employee Name</th><th>Employee Email</th><th>Time Sheet</th><th>Service Form</th><th>Zone Sheet</th><th>Change Order</th><th>Mailing List</th><th>Place Order</th><th>Payroll</th><th>Administrator</th></thead><tbody>";
		while($row = $result->fetch_assoc()) {
			echo "<tr><td>" . $row["empNum"]. "</td><td>" . $row["empFirstName"]. " " . $row["empLastName"]. "</td>";
			echo "<td>" . $row["empEmail"]. "</td><td>" . $row['timesheet'] . "</td><td>" . $row['serviceform'] . "</td>";
			echo "<td>" . $row['zonesheet'] . "</td><td>" . $row['changeorder'] . "</td><td>" . $row['mailinglist'] . "</td>";
			echo "<td>" . $row['placeorder'] . "</td><td>" . $row['payroll'] . "</td>";
			echo "<td>" . $row['administrator'] . "</td></tr>";
		}	
		echo "</tbody></table>";
	} 
	else {
		echo "0 results";
	}
	$conn->close();
}
function login(){
	$servername = "localhost";
	$username = "c2230a07";
	$password = "c2230a07";
	$dbname = "c2230a07test";
	$loginName = $_POST['email'];
	$pw = $_POST['pw'];
	
	// Create connection
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Check connection
	if ($conn->connect_error) {
		die("Connection failed: " . $conn->connect_error);
	}
	$sql = "SELECT * FROM employee where empEmail='$loginName'";
	$result = $conn->query($sql);

	while($row = $result->fetch_assoc()){
		if($row['empPassword'] == $pw){
			echo $row['timesheet'] . $row['serviceform'] . $row['zonesheet'] . 
			$row['changeorder'] . $row['mailinglist'] . $row['placeorder'] . 
			$row['payroll'] . $row['administrator'];
		}
		else{
			echo 'false';
		}
	}
	

	$conn->close();
}
function empName(){
	$servername = "localhost";
	$username = "c2230a07";
	$password = "c2230a07";
	$dbname = "c2230a07test";
	$loginName = $_POST['email'];
	$pw = $_POST['pw'];
	
	// Create connection
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Check connection
	if ($conn->connect_error) {
		die("Connection failed: " . $conn->connect_error);
	}
	$sql = "SELECT * FROM employee where empEmail='$loginName'";
	$result = $conn->query($sql);

	while($row = $result->fetch_assoc()){
		echo $row['empFirstName'] . " " . $row['empLastName'];
	}
	$conn->close();
}
?>