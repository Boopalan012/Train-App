<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Train</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	
	<div class="container">
		<form action="trains" method="POST">
			<label>Train Name</label><br>
			<input type="text" name="name">
			<br><br>
			
			<label>Train Type</label><br>
			<label for="supfast">Super fast</label><input type="radio" name="type" value="Superfast" id="supfast">
			<label for="exp">Express</label><input type="radio" name="type" value="Express" id="exp">
			<label for="pass">Passenger</label><input type="radio" name="type" value="Passanger" id="pass">
			<br><br>
			
			<label>Source Station</label><br>
			<input type="text" name="sourceStation">
			<br><br>
			
			<label>Source Station Arrival Time</label><br>
			<input type="time" name="arrivalTime">
			<br><br>
			
			<label>Source Station Departure Time</label><br>
			<input type="time" name="departureTime">
			<br><br>
			
			<label>Destination Station</label><br>
			<input type="text" name="destinationStation">
			<br><br>
			
			
			<input type="submit" value="ADD TRAIN">
			
		</form>
	</div>
	
</body>
</html>