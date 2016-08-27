/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the table
 * 				in the zone sheet form. When the form is complete
 *				and submitted this form validates and extracts data 
 *				and send it to the output.php script to create the document.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: zonesheet.js
*/
function zonesheet(){
	$('#table1').append('<tbody>');
	for(var i = 0; i < 40; i++){
            $("#table1").append('<tr>'
								+ '<td class="col-lg-1"id="zone'+i+'">'+(i+1)+'</td>'
								+ '<td class="col-lg-1"><input type="text" class="form-control" id="area'+i+'"></td>'
								+ '<td class="col-lg-5"><input type="text" class="form-control" id="description'+i+'"></td>'
								+ '<td class="col-lg-1"><input type="text" class="form-control" id="wireNumber'+i+'"></td>'
								+ '<td class="col-lg-2"><input type="text" class="form-control" id="reportCode'+i+'"></td>'
								+ '</tr>');
	}
	$("#table1").append('</tbody>');
}

function validate(){
	var customerName = $("#cusName").val();
	var date = $("#date").val();
	var entry1Zones = $("#entry1Zones").val();
	var delay = $("#delay").val();
	var entry2Zones = $("#entry2Zones").val();
	var delay2 = $("#delay2").val();
	var followers = $("#followers").val();
	var bypass1 = $("#bypass1").val();
	var bypass2 = $("#bypass2").val();
	var exitDelay = $("#exitDelay").val();
	var notes = $("#notes").val();
	var keypads = new Array();
	var zones = new Array();
	var entryExit = [entry1Zones, delay, entry2Zones, delay2, followers, bypass1,
					bypass2, exitDelay, notes];
	
	function newZone(){
		this.zone = i+1;
		this.area = $("#area"+i).val();
		this.description = $("#description"+i).val();
		this.wireNumber = $("#wireNumber"+i).val();
		this.reportCode = $("#reportCode"+i).val();
	}
	function keypad(){
		this.keypadNumber = i+1;
		this.area = $("#kparea"+i).val();
		this.keypadLocation = $("#keypadLocation"+i).val();
		this.keypadWireNumber = $("#keypadWireNumber"+i).val();
		this.keypadSensorNumber = $("#keypadSensorNumber"+i).val();
	}
	
	for(var i = 0; i < 40; i++){
		zones[i] = new newZone();
	}
	for(var i = 0; i < 6; i++){
		keypads[i] = new keypad();
	}
	if(cusName == ""){
		alert("Please enter the customer's name.");
	}
	else if(date == ""){
		alert("Please enter the date.");
	}
	else{
		for(var i = 0; i < 40; i++){
			zones[i] = new newZone();
		}
		for(var i = 0; i < 6; i++){
			keypads[i] = new keypad();
		}
		$.ajax({  
				type: 'POST',  
				url: 'output.php', 
				data: { action: 'zonesheet', cusName: customerName, zoneInput: zones, keypadInput: keypads,
						currentDate: date, entryExits: entryExit},
				success: function(response) {
					alert(response);
				}
		});
	}
}