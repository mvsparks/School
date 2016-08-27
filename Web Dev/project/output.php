<?php
/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the proper
 * 				output files with the extracted data passed to scripts.
 *				The files are created and name appropriately then
 *				loaded into a folder called output on the server. 
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: output.php
*/
if (isset($_POST['action'])) {
    switch ($_POST['action']) {
        case 'timesheet':
            timesheetOutput();
            break;
		case 'zonesheet':
			zonesheetOutput();
			break;
		case 'serviceform':
			serviceFormOutput();
			break;
		case 'changeorder':
			changeOrderOutput();
			break;
		case 'mailinglist':
			mailingListOutput();
			break;
		case 'placeorder':
			placeOrderOutput();
			break;
		case 'payroll':
			payrollOutput();
			break;
		default:
			echo "default";
			break;
    }
}
else{
	print "failure";
}

function timesheetOutput(){
	$empName = $_POST['employee'];
	$tableInput = $_POST['tableInput']; 
	$date = $_POST['currentDate'];
	$startMileage = $_POST['startMileage'];
	$endMileage = $_POST['endMileage'];
	$startTime = $_POST['starttime'];
	$breakTime = $_POST['breakTime'];
	$jobTime = $_POST['jobTime'];
	$paidTime = $_POST['paidTime'];
	
	$txt = '<!DOCTYPE html><html lang="en"><head><title>TS ' . $empName . ' ' . $date . '</title><meta charset="utf-8">' . 
		   '<meta name="viewport" content="width=device-width, initial-scale=1">' . 
		   '<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">' .
		   '<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>' .
		   '<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script></head>';

	$txt .= '<div class="container"><table class="table table-bordered" style="width: 300px;"><tr><td>Employee Name:</td><td>' . $empName . 
			'</td></tr><tr><td>Date:</td><td>' . $date . 
			'</td></tr><tr><td>Starting Mileage:</td><td>' . $startMileage . 
			'</td></tr><td>Ending Mileage:</td><td>' . $endMileage . 
			'</td></tr><td>Start Time:</td><td>' . $startTime . '</td></tr></table><br><br>' .
			'<table class="table table-bordered" style="margin: auto;"><thead><th style="height: 20px;">Arrival Time</th>' .
			'<th style="height: 20px;">Job Name</th><th style="height: 20px;">Description</th><th style="height: 20px;">Break Time</th>' .
			'<th style="height: 20px;">Depart Time</th><th style="height: 20px;">Job Time</th></thead>';
	
	for($i = 0; $i < 15; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $tableInput[$i]['arrivalTime'] . '</td><td style="height: 35px;">' . $tableInput[$i]['jobName'] . '</td><td style="height: 35px;">' . $tableInput[$i]['description'] . 
		'</td><td style="height: 35px;">' . $tableInput[$i]['breakTime'] . '</td><td style="height: 35px;">' . $tableInput[$i]['departTime'] . '</td><td style="height: 35px;">' . $tableInput[$i]['jobTime'] . '</td></tr>';
	} 
	$txt .= '</table><table class="table table-bordered"><tr><td>Break Time: </td><td>' . $breakTime . '</td></tr><tr><td>Job Time: </td><td>' . $jobTime . '</td></tr><tr><td>Total Paid Time: </td><td>' . $paidTime . '</td></tr></table></div></html>';
	$myfile = "./output/TS " . $empName . " " . $date . ".html";
	
	$fileOpen = fopen($myfile, "w") or die("Unable to open file: " . $myfile);
	fwrite($fileOpen, $txt);
	fclose($fileOpen);
	
	echo "Time Sheet created";
}
function zonesheetOutput(){
	$keypadArray = $_POST['keypadInput'];
	$zoneArray = $_POST['zoneInput']; 
	$date = $_POST['currentDate'];
	$entryExitArray = $_POST['entryExits'];
	$cusName = $_POST['cusName'];
	
	$txt = '<!DOCTYPE html><html lang="en"><head><title>ZS ' . $cusName . ' ' . $date . '</title><meta charset="utf-8">' . 
		   '<meta name="viewport" content="width=device-width, initial-scale=1">' . 
		   '<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">' .
		   '<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>' .
		   '<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script></head>';
	
	$txt .= '<div class="container"><table class="table table-bordered"><tr><td>Customer Name:</td><td>' . $cusName . 
			'</td></tr><tr><td>Date:</td><td>' . $date . '</td></tr>' .
			'<table class="table table-bordered"><thead><th>Zone</th><th>Area</th><th>Description</th><th>Wire #</th><th>Report Code</th></thead><tbody>';
	
	for($i = 0; $i < 40; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $zoneArray[$i]['zone'] . '</td><td style="height: 35px;">' . $zoneArray[$i]['area'] . '</td><td style="height: 35px;">' . $zoneArray[$i]['description'] . 
		'</td><td style="height: 35px;">' . $zoneArray[$i]['wireNumber'] . '</td><td style="height: 35px;">' . $zoneArray[$i]['reportCode'] . '</td></tr>';
	} 
	$txt .= '</tbody></table><table class="table table-bordered"><thead><th>Keypad #</th><th>Area</th><th>Location</th><th>Wire #</th><th>Sensor #</th></thead><tbody>';
	for($i = 0; $i < 6; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $keypadArray[$i]['keypadNumber'] . '</td><td style="height: 35px;">' . $keypadArray[$i]['area'] . '</td><td style="height: 35px;"> ' . 
				$keypadArray[$i]['keypadLocation'] . '</td><td style="height: 35px;">' . $keypadArray[$i]['keypadWireNumber'] . '</td><td style="height: 35px;">' .
				$keypadArray[$i]['keypadSensorNumber'] . '</td></tr>';
	}
	$txt .= '</tbody></table><table id="table1"><tbody><tr><td class="col-lg-3"><label for="entry1Zones">Entry 1 Zones</label></td><td>' . $entryExitArray[0] . '</td>' .
			'<td class="col-lg-2"><label for="entry1Delay">Delay</label></td><td>' . $entryExitArray[1] . '</td></tr>' .
			'<tr><td class="col-lg-3"><label for="entry2Zones">Entry 2 Zones</label></td><td>' . $entryExitArray[2] . 
			'</td><td class="col-lg-2"><label for="entry2Delay">Delay 2</label></td><td>' . $entryExitArray[3] . '</td></tr>' .
			'<tr><td class="col-lg-3"><label for="followers">Followers</label></td><td>' . $entryExitArray[4] . '</td>' .
			'<td class="col-lg-2"><label for="exitDelay">Exit Delay</label></td><td>' . $entryExitArray[7] . '</td></tr>' .
			'<tr><td class="col-lg-3"><label for="bypass1">Bypass 1</label></td><td>' . $entryExitArray[5] . '</td></tr>' . 
			'<tr><td class="col-lg-3"><label for="bypass2">Bypass 2</label></td><td>' . $entryExitArray[6] . '</td></tr>' .
			'</tbody></table>' .
			'<div><label for="notes">Notes:</label>' . $entryExitArray[8] . '</div>';
	$txt .= '</div></html>';
	$myfile = "./output/ZS " . $cusName . " " . $date . ".html";
	
	$fileOpen = fopen( $myfile, "w") or die("Unable to open file: " . $myfile);
	fwrite($fileOpen, $txt);
	fclose($fileOpen);
	
	echo "Service Form Created";
}
function serviceFormOutput(){
	$materials = $_POST['materials'];
	$inputArray = $_POST['input'];
	$paid = $inputArray[12];
	
	if($paid == "No"){
		$paid = "N/a";
	}
	else{
		$paid = $inputArray[13];
	}
	
	$txt = '<!DOCTYPE html><html lang="en"><head><title>SMF '. $inputArray[1] . ' ' . $inputArray[0] . '</title><meta charset="utf-8">' . 
		   '<meta name="viewport" content="width=device-width, initial-scale=1">' . 
		   '<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">' .
		   '<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>' .
		   '<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script></head>';
		   
	$txt .= '<div class="container"><table class="table table-bordered"><tr><td>Customer Name: ' . $inputArray[1] . '</td></tr>' . 
			'<tr><td>Date: ' . $inputArray[0] . '</td></tr>' .
			'<tr><td>Arrival Time: ' . $inputArray[2] . '</td></tr>' .
			'<tr><td>Departure time: ' . $inputArray[3] . '</td></tr></table><br><br><table class="table table-bordered"> ' .
			'<tr><td>Charging Voltage: ' . $inputArray[4] . '</td>' .
			'<td>Battery Voltage: ' . $inputArray[5] . '</td>' .
			'<td>Wireless Signal: ' . $inputArray[6] . '</td></tr></table>' .
			'<table class="table table-bordered"><thead><th>Quantity</th><th>Item</th><th>Price</th></thead><tbody>';
	
	for($i = 0; $i < 10; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $materials[$i]['quantity'] . '</td><td style="height: 35px;">' . $materials[$i]['item'] . '</td><td style="height: 35px;">' . $materials[$i]['price'] . '</td></tr>';
	} 
	$txt .= '</tbody></table><table class="table table-bordered"><tr><td>Service Calls</td><td>' . $inputArray[8] . '</td><tr>' . 
			'<tr><td>Service Charge</td><td>$' . number_format($inputArray[9],2) . '</td><tr>' .
			'<tr><td>Additional Labor</td><td>' . $inputArray[10] . '</td><tr>' .
			'<tr><td>Additional Labor Charge</td><td>$' . number_format($inputArray[11],2) . '</td><tr>' .
			'<tr><td>Total Charge</td><td>$' . number_format($inputArray[14], 2) . '</td><tr>' .
			'<tr><td>Customer Paid</td><td>' . $inputArray[12] . '</td><tr>' .
			'<tr><td>Paid With</td><td>' . $paid . '</td><tr>' .
			'</table></div></html>';
	$myfile = "./output/SMF " . $inputArray[1] . " " . $inputArray[0] . ".html";
	
	$fileOpen = fopen( $myfile, "w") or die("Unable to open file: " . $myfile);
	fwrite($fileOpen, $txt);
	fclose($fileOpen);
	
	echo "Service Form Created";
}
function changeOrderOutput(){
	$itemsArray = $_POST['itemArray'];
	$inputArray = $_POST['input'];
	
	$txt = '<!DOCTYPE html><html lang="en"><head><title>CO '. $inputArray[0] . ' ' . $inputArray[2] . '</title><meta charset="utf-8">' . 
		   '<meta name="viewport" content="width=device-width, initial-scale=1">' . 
		   '<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">' .
		   '<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>' .
		   '<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script></head>';
	
	$txt .= '<div class="container"><table class="table table-bordered"><tr><td>Customer Name: ' . $inputArray[0] . '</td></tr>' .
			'<tr><td>Customer Address: ' . $inputArray[1] . '</td></tr>' . 
			'<tr><td>Date: ' . $inputArray[2] . '</td></tr>' .
			'<tr><td>Change Order Regarding: ' . $inputArray[3] . ' System</td></tr>' .
			'<tr><td>Additional Terms: ' . $inputArray[4] . '</td></tr>' .
			'<table class="table table-bordered"><thead><th>Quantity</th><th>Item</th><th>Price</th></thead><tbody>';
	
	for($i = 0; $i < 10; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $itemsArray[$i]['count'] . '</td><td style="height: 35px;">' . $itemsArray[$i]['item'] . '</td><td style="height: 35px;">' . $itemsArray[$i]['priceEach'] . '</td></tr>';
	} 
	$txt .= '<tr><td></td><td class="text-right">Total</td><td>$' . number_format($inputArray[5],2) . '</td></tr></tbody></table></div></html>';
	$myfile = "./output/CO " . $inputArray[0] . " " . $inputArray[2] . ".html";
	
	$fileOpen = fopen( $myfile, "w") or die("Unable to open file: " . $myfile);
	fwrite($fileOpen, $txt);
	fclose($fileOpen);
	
	echo "Change Order Created";
}
function mailingListOutput(){
	$date = $_POST['currentDate'];
	$inputArray = $_POST['input'];
	
	$txt = '<!DOCTYPE html><html lang="en"><head><title>Add to MailChimp ' . $date . '</title><meta charset="utf-8">' . 
		   '<meta name="viewport" content="width=device-width, initial-scale=1">' . 
		   '<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">' .
		   '<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>' .
		   '<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script></head>';
	
	$txt .= '<div class="container"><table class="table table-bordered"><tr><td>Date: </td><td>' . $date . '</td></tr></table>' .
			'<table class="table table-bordered"><thead><th>Customer Name</th><th>Customer Email</th></thead><tbody>';
	
	 for($i = 0; $i < 15; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $inputArray[$i]['cusName'] . '</td><td style="height: 35px;">' . $inputArray[$i]['cusEmail'] . '</td></tr>';
	} 
	$txt .= '</tbody></table></div></html>'; 
	$myfile = "./output/Add to MailChimp " . $date . ".html";
	
	$fileOpen = fopen( $myfile, "w") or die("Unable to open file: " . $myfile);
	fwrite($fileOpen, $txt);
	fclose($fileOpen);
	
	echo "Mailing List Created";
}

function placeOrderOutput(){
	$array = $_POST['newArray'];
	$inputArray = $_POST['inputArray'];
	
	$txt = '<!DOCTYPE html><html lang="en"><head><title>PO ' . $array[0] . ' ' . $array[2] . '</title><meta charset="utf-8">' . 
		   '<meta name="viewport" content="width=device-width, initial-scale=1">' . 
		   '<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">' .
		   '<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>' .
		   '<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script></head>';
	
	$txt .= '<div class="container"><table class="table table-bordered"><tr><td>Date: </td><td>' . $array[2] . '</td></tr>' .
			'<tr><td>Vendor: </td><td>' . $array[0] . '</td></tr>' . 
			'<tr><td>Open Account: </td><td>' . $array[1] . '</td></tr>' .
			'</table><table class="table table-bordered"><thead><th>Job Name</th><th>Description</th><th>Qty</th><th>Unit Price</th><th>Total Price</th>' . 
			'<th>Billed On Inv #</th><th>Back Order</th></thead><tbody>';
	
	 for($i = 0; $i < 15; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $inputArray[$i]['jobName'] . '</td><td style="height: 35px;">' . 
				$inputArray[$i]['partDescription'] . '</td><td style="height: 35px;">' . 
				$inputArray[$i]['qty'] . '</td><td style="height: 35px;">'. 
				$inputArray[$i]['unitPrice'] . '</td><td style="height: 35px;">'. 
				$inputArray[$i]['totalPrice'] . '</td><td style="height: 35px;">'.
				$inputArray[$i]['billedOnInvNumber'] . '</td><td style="height: 35px;">'. 
				$inputArray[$i]['backOrder'] . '</td></tr>';
	} 
	$txt .= '</tbody></table><table class="table table-bordered">' .
			'<tr><td>Total Price: </td><td>$' . number_format($array[3],2) . '</td></tr></table></div></html>'; 
	$myfile = "./output/PO " . $array[0] . " " . $array[2] . ".html";
	
	$fileOpen = fopen( $myfile, "w") or die("Unable to open file: " . $myfile);
	fwrite($fileOpen, $txt);
	fclose($fileOpen);
	
	echo "Place Order Created";
}
function payrollOutput(){
	$payWeek = $_POST['pay'];
	$inputArray = $_POST['inputArray'];
	$jobCommission = $_POST['jobCommission'];
	$carryOver = $_POST['carryOver1'];
	
	$txt = '<!DOCTYPE html><html lang="en"><head><title>Payroll ' . $inputArray[5] . '</title><meta charset="utf-8">' . 
		   '<meta name="viewport" content="width=device-width, initial-scale=1">' . 
		   '<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">' .
		   '<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>' .
		   '<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script></head>';
	
	$txt .= '<div class="container"><br><table style="width: 700px; margin: auto;"><tr><td>Employee:</td><td> ' . $inputArray[5] . '</td><td>Mileage:</td><td>' . $inputArray[8] .'</td></tr>';
	$txt .= '<tr><td>Carry over week</td><td>' . $carryOver[1] . ' thru ' . $carryOver[2] . '</td><td>' . $inputArray[6] . ' hrs.</td></tr>';
	$txt .= '<tr><td>Carry over week</td><td>' . $carryOver[3] . ' thru ' . $carryOver[4] . '</td><td>' . $inputArray[7] . ' hrs.</td></tr></table><br><br>';
	$txt .= '<table class="table table-bordered"><thead><th>Week</th><th>Thru</th><th>Regular Hrs</th><th>Overtime Hrs</th></thead><tbody>';
	for($i = 0; $i < 5; $i++){
		$txt .= '<tr><td style="height: 35px;">' . 
				$payWeek[$i]['week'] . '</td><td style="height: 35px;">' .
				$payWeek[$i]['thru'] . '</td><td style="height: 35px;">' .
				$payWeek[$i]['regHours'] . '</td><td style="height: 35px;">' .
				$payWeek[$i]['overtimeHours'] . '</td></tr>';
	}
	$txt .= '</tbody></table><table class="table table-bordered"><thead><th>Job</th><th>Commission</th></thead></tbody>';
	for($i = 0; $i < 8; $i++){
		$txt .= '<tr><td style="height: 35px;">' . $jobCommission[$i]['job'] . '</td><td style="height: 35px;">' . $jobCommission[$i]['commission'] . '</td></tr>';
	}	
	$txt .= '</tbody></table><table class="table table-bordered">' . 
			'<tr><td>Regular Hours:</td><td>' . $inputArray[3] . '</td></tr>' .
			'<tr><td>Overtime Hours:</td><td>' . $inputArray[4] . '</td></tr>' . 
			'<tr><td>Commission Total:</td><td>$' . number_format($inputArray[1],2) . '</td></tr>' .
			'<tr><td>Pay Rate:</td><td>$' . number_format($inputArray[0],2) . '</td></tr>' .
			'<tr><td>Total Pay:</td><td>$' . number_format($inputArray[2],2) . '</td></tr></table></div></html>';
			
	$myfile = "./output/Payroll " . $inputArray[5] . ".html";
	
	$fileOpen = fopen( $myfile, "w") or die("Unable to open file: " . $myfile);
	fwrite($fileOpen, $txt);
	fclose($fileOpen);
	
	echo "Payroll Complete";
}
?>