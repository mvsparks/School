/*
 * Class: CSIT2230 Internet Software
 * Instructor: Andrey Puretskiy
 * Description: The purpose of this file is to validate the login.
 *				If the username and password is correct then this script
 *				extracts the employee name and puts it into local storage,
 *				to be used when the paperwork submissions, then switches to 
 *				the first form.
 * Due: 11/25/2015
 * Programmer: Vince Sparks
 * Assignment: login.js
*/

function checkLogin(){
	var loginName = $("#email").val();
	var password = $("#pwd").val();
	if(loginName == ""){
		$("#email").css("box-shadow","0 0 5px red");
	}
	else if(password == ""){
		$("#pwd").css("box-shadow","0 0 5px red");
	}
	else{
		$.ajax({  
			type: 'POST',  
			url: 'admin.php', 
			data: { action: 'login', email: loginName, pw: password },
			success: function(response) {
				if(response == 'false'){
					alert("Incorrect username or password");
				}
				else{
					localStorage.nav = response;
					$.ajax({  
						type: 'POST',  
						url: 'admin.php', 
						data: { action: 'empName', email: loginName },
						success: function(response) {
							if(response == 'false'){
								alert("Name failed");
							}
							else{
								localStorage.empName = response;
								window.location.href='timesheet.php';
							}
						}
					});
				}
			}
		});
	}
}