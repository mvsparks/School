/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to create the table
 * 				in the mailing list form. When the form is complete 
 *				and submitted this form validates and extracts data
 * 				and send it to the output.php script to create the document.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: mailinglist.js
*/

function mailingList(){
	$("#table1").append("<tbody>");
	for(var i = 0; i < 15; i++){
		$("#table1").append('<tr>'
							+ '<td class="col-lg-2"><input type="text" class="form-control" id="cusName'+i+'"></input></td>'
							+ '<td class="col-lg-3"><input type="text" class="form-control" id="cusEmail'+i+'"></input></td>'
							+ '</tr>');
	}
	$("#table1").append("</tbody>");
}

function validate(){
	var date = $("#date").val();
	var inputArray = new Array();
	
	function customer(){
		this.cusName = $("#cusName"+i).val();
		this.cusEmail = $("#cusEmail"+i).val();
	}
	
	for(var i = 0; i < 15; i++){
		inputArray[i] = new customer;
	}
	$.ajax({  
				type: 'POST',  
				url: 'output.php', 
				data: { action: 'mailinglist', input: inputArray, currentDate: date },
				success: function(response) {
					alert(response);
				}
		});
}