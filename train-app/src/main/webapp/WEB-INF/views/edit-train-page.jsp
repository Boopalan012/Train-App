<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
	
	<div class="container">
		<form action="/train-app/update-train" method="POST">
			<label>Train Number</label><br>
			<input type="text" name="trainNumber" value="${train.trainNumber }" readonly="readonly">
			<br><br>
		
			<label>Train Name</label><br>
			<input type="text" name="name" value="${train.name }">
			<br><br>
			
			<label>Train Type</label><br>
			<c:choose>
				<c:when test="${train.type.equals(\"Superfast\") }">
					<label for="supfast">Super fast</label><input type="radio" name="type" checked="checked" value="Superfast" id="supfast">
					<label for="exp">Express</label><input type="radio" name="type"  value="Express" id="exp">
					<label for="pass">Passenger</label><input type="radio" name="type" value="Passanger" id="pass">
				</c:when>
				<c:when test="${train.type.equals(\"Express\") }">
					<label for="supfast">Super fast</label><input type="radio" name="type"  value="Superfast" id="supfast">
					<label for="exp">Express</label><input type="radio" name="type" checked="checked" value="Express" id="exp">
					<label for="pass">Passenger</label><input type="radio" name="type" value="Passanger" id="pass"></c:when>
				<c:when test="${train.type.equals(\"Passanger\") }">
					<label for="supfast">Super fast</label><input type="radio" name="type"  value="Superfast" id="supfast">
					<label for="exp">Express</label><input type="radio" name="type"  value="Express" id="exp">
					<label for="pass">Passenger</label><input type="radio" name="type" checked="checked" value="Passanger" id="pass">	</c:when>
			</c:choose>
			<br><br>
			
			
			<label>Source Station</label><br>
			<input type="text" name="sourceStation" value="${train.sourceStation }">
			<br><br>
			
			<label>Source Station Arrival Time</label><br>
			<input type="time" name="arrivalTime" value="${train.arrivalTime }">
			<br><br>
			
			<label>Source Station Departure Time</label><br>
			<input type="time" name="departureTime" value="${train.departureTime }">
			<br><br>
			
			<label>Destination Station</label><br>
			<input type="text" name="destinationStation" value="${train.destinationStation }">
			<br><br>
			
			<input type="submit" value="Update TRAIN">
			
		</form>
	</div>
</body>
</html>