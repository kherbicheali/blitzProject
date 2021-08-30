$(document).ready(function listTank (){
		$.ajax({
 		url: "http://localhost:8080/simple-webapp/mehenna", 
 		method: 'GET',
 		data: {
 		mth: "listTank",
 		},
		success: function(data){
			if (data !== 0){    
				for (let i = 0; i < data.length; i++){
					console.log(data[i]);
					let idd = data[i].label;
					$("#tanks > tbody:last").append("<tr>");  
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].label +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].dpm +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].speed +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].frontalArmor +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].healthPoints +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].gunDepression +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].silverAlpha +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].goldAlpha +"</td>");
					$("#tanks > tbody:last").append("<td class='text-center'>" +data[i].heAlpha +"</td>");
					$("#tanks > tbody:last").append('<button type="submit" id ="'+data[i].label+'" class="btn btn-danger text-center" onclick="removeTank()">Remove</button>');
					$("#tanks > tbody:last").append("<button type='button' class='btn btn-primary text-center'>Edit</button>");
					$("#tanks > tbody:last").append("</tr>");					
				}
			} else {console.log("data est nul");}
		},
		error: function (error) {
			console.log("Error1:", error);
		} 	
	});
});	

function removeTank(){
	let idd = event.srcElement.id;
	console.log("id= "+idd);
	$.ajax({
		url: 'http://localhost:8080/simple-webapp/mehenna',
		method: 'GET',
		data: { 
    	mth: "removeTank", 
    	tankID: idd, 
  	},
		success: function () {
 			console.log('record has been deleted');
 			location.reload();
		},
		error: function (error) {
			console.log("Error2:", error);
		}
	});
}

function saveTank() {
	$.ajax({
		url: 'http://localhost:8080/simple-webapp/mehenna',
		method: 'POST',
		data: { 
    	label:document.getElementById('Label').value,
			dpm:document.getElementById('DPM').value,
			speed:document.getElementById('Speed').value,
			frontalArmor:document.getElementById('Frontal Armor').value,
			healthPoints:document.getElementById('Health Points').value,
			gunDepression:document.getElementById('Gun Depression').value,
			silverAlpha:document.getElementById('Silver Alpha').value,
			goldAlpha:document.getElementById('Gold Alpha').value,
			heAlpha:document.getElementById('HE Alpha').value 
  	},
		success: function () {
 			console.log('new Tank has been added');
 			location.reload();
		},
		error: function (error) {
			console.log("Error3:", error);
		}
	});
}
