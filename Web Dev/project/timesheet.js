/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the table
 * 				in the time sheet. Also, this file updates
 *				the running total as the data is entered. When
 *				the form is complete and submitted this form validates
 *				and extracts data and send it to the output.php
 *				script to create the document.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: timesheet.js
*/
function loadPage(){
	$("#table2").append('<tbody>');
	for(var i = 0; i<15; i++){$("#table2").append('<tr>'
					+ '<td class="col-lg-1"><input type="text" class="time form-control" id="arrivalTime'+i+'"></td>'
					+ '<td class="col-lg-2"><input type="text" class="form-control" id="jobName'+i+'"></td>'
					+ '<td class="col-lg-4"><input type="text" class="form-control" id="description'+i+'"></td>'
					+ '<td class="col-lg-1"><input type="text" class="time form-control" id="breakTime'+i+'"></td>'
					+ '<td class="col-lg-1"><input type="text" class="time form-control" id="departTime'+i+'"></td>'
					+ '<td class="col-lg-1"><input type="text" class="form-control" id="jobTime'+i+'"></td></tr>');
	}
	$("#table2").append('</tbody>');
	$(function() {
		$( "#date" ).datepicker({dateFormat: 'mm-dd-yy'});
	});
	$(function(){
		$(".time").clockpicker({
			placement: 'bottom',
			align: 'left',
			autoclose: true,
			'default': 'now'
		});
	});
}
$(document).on('focus', 'input',  function(e){
	
	var arriveTime;
	var departTime;
	var timeStart;
	var timeEnd;
	var timeDiff;
	var hh;
	var mm;
	var inputArray = new Array();
	
	function input(){
		this.arrivalTime = $('#arrivalTime'+i).val();
		this.departTime = $('#departTime'+i).val();
	}
	for(var i = 0; i<15; i++){
		inputArray[i] = new input();
		if(inputArray[i].arrivalTime == "" || inputArray[i].departTime == ""){
			continue;
		}
		else{
			//updating job time after depart time is inputted and focus is changed
			arriveTime = inputArray[i].arrivalTime;
			departTime = inputArray[i].departTime;
			//Example revised from http://stackoverflow.com/questions/19583557/time-difference-and-convert-into-hours-and-minutes-in-javascript
			
			timeStart = new Date("01/01/2015 " + arriveTime);
			timeEnd = new Date("01/01/2015 " + departTime);
			timeDiff = timeEnd - timeStart;
			
			hour = Math.floor(timeDiff / 1000 / 60 / 60);
			if(hour < 10) {
				hour = '0' + hour;
			}
			timeDiff -= hour * 1000 * 60 * 60;
			min = Math.floor(timeDiff / (1000*60));
			if(min < 10) {
				min = '0' + min;
			}
			$('#jobTime'+i).val(hour + ":" + min);
		}
	}
});

function validate(){
	var date = $("#date").val();
	var startingMileage = $("#startingMileage").val();
    var endingMileage = $("#endingMileage").val();
	var startTime = $("#startTime").val();
	var inputArray = new Array();
	var breakTime;
	var totalBreakTime;
	var totalJobTime;
	var totalPaidTime;
	var hoursJob = 0;
	var minJob = 0;
	var hoursBreak = 0;
	var minBreak = 0;
	var hour;
	var min;
	var endTime;
	
	function input(){
		this.arrivalTime = $("#arrivalTime"+i).val();
		this.jobName = $("#jobName"+i).val();
		this.description = $("#description"+i).val();
		this.breakTime = $("#breakTime"+i).val();
		this.departTime = $("#departTime"+i).val();
		this.jobTime = $("#jobTime"+i).val();
	}
	
	if(date == ""){
		alert("Please enter the date.");
	}
	else if(startTime == ""){
		alert("Please enter your start time.");
	}
	else{
		for(i = 0; i<15; i++){
			inputArray[i] = new input();
			if(inputArray[i].breakTime != ""){
				//adding up break time hours and min
				breakTime = new Date("01/01/2015 " + inputArray[i].breakTime);
				hoursBreak += breakTime.getHours();
				minBreak += breakTime.getMinutes();
			}
			if(inputArray[i].jobTime != ""){
				//adding up job time hours and min
				dateJobTime = new Date("01/01/2015 " + inputArray[i].jobTime);
				hoursJob += dateJobTime.getHours();
				minJob += dateJobTime.getMinutes();
			}
			if(inputArray[i].departTime != ""){
				//getting last filled out departTime
				endTime = inputArray[i].departTime;
			}
		}
		//getting total job hours
		var division = Math.floor(minJob / 60);
		hoursJob += division;
		minJob = minJob % 60;
		totalJobTime = hoursJob + ":" + minJob;
		
		//getting total break time
		division = Math.floor(minBreak / 60);
		hoursBreak += division;
		minBreak = minBreak % 60;
		totalBreakTime = hoursBreak + ":" + minBreak;
		
		
		var startingTime = new Date("01/01/2015 " + startTime);
		endingTime = new Date("01/01/2015 " + endTime); 
		breakTime = new Date("01/01/2015 " + totalBreakTime);
		
		//getting total work time
		totalPaidTime = (endingTime - startingTime);
		hour = Math.floor(totalPaidTime / 1000 / 60 / 60);
			if(hour < 10) {
				hour = '0' + hour;
			}
			totalPaidTime -= hour * 1000 * 60 * 60;
			min = Math.floor(totalPaidTime / (1000*60));
			if(min < 10) {
				min = '0' + min;
			}
		totalPaidTime = hour + ':' + min;
		
		//changing total time back to date
		startingTime = new Date("01/01/2015 " + totalPaidTime);
		
		//getting total paid time
		totalPaidTime = (startingTime - breakTime);
		
		hour = Math.floor(totalPaidTime / 1000 / 60 / 60);
			if(hour < 10) {
				hour = '0' + hour;
			}
			totalPaidTime -= hour * 1000 * 60 * 60;
			min = Math.floor(totalPaidTime / (1000*60));
			if(min < 10) {
				min = '0' + min;
			}
		totalPaidTime = hour + ':' + min;

		$.ajax({  
				type: 'POST',  
				url: 'output.php', 
				data: { action: 'timesheet', employee: localStorage.empName, tableInput: inputArray, 
						currentDate: date, startMileage: startingMileage, endMileage: endingMileage, 
						starttime: startTime, breakTime: totalBreakTime, jobTime: totalJobTime, paidTime: totalPaidTime },
				success: function(response) {
					alert(response);
				}
		});
	}
}

function clearInput(){
	$("#table1").empty();
	loadPage();
}

