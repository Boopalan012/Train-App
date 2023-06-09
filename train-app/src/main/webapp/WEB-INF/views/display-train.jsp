<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display</title>
</head>
<body>
	

	<c:choose>
		<c:when test="${ msg.getClass().getSimpleName().equals(\"String\")}">
			<h2>${msg }</h2>
		</c:when>
		<c:when test="${ msg.getClass().getSimpleName().equals(\"TrainDto\")}">
			<table border="1" align="center">
				<tr>
					<th>Train Number</th>
					<th>Name</th>
					<th>type</th>
					<th>Source station</th>
					<th>Arrival Time</th>
					<th>Departure Time</th>
					<th>Destination Station</th>
				</tr>
				<tr>
					<td>${ msg.trainNumber }</td>
					<td>${ msg.name }</td>
					<td>${ msg.type }</td>
					<td>${ msg.sourceStation }</td>
					<td>${ msg.arrivalTime }</td>
					<td>${ msg.departureTime }</td>
					<td>${ msg.destinationStation }</td>
				</tr>
			</table>
		</c:when>
	</c:choose>

</body>
</html>