$("button").on("click", function() {
	console.log("Inside click\n");
	$.ajax({ url: 'admin.php',
         data: {action: 'add'},
         type: 'post',
         success: function(output) {
                      alert(output);
					  console.log("Inside click\n");
                  }
	}); 
});