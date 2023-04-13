<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>

	<h1>All Trains</h1>

	
	<table border="1" align="center">
	<tr>
		<th>Train Number</th>
		<th>Name</th>
		<th>Type</th>
		<th>Source Station</th>
		<th>Arrival Time</th>
		<th>Departure Time</th>
		<th>Destination station</th>
		<th colspan="2">Actions</th>
	</tr>
	
	<c:forEach var="train" items="${ trains }">
		<tr>
			<td>${ train.trainNumber }</td>
			<td>${ train.name }</td>
			<td>${ train.type }</td>
			<td>${ train.sourceStation }</td>
			<td>${ train.arrivalTime }</td>
			<td>${ train.departureTime }</td>
			<td>${ train.destinationStation }</td>
			<td><a href='./edit/${ train.trainNumber }'>EDIT</a></td>
			<td><a href='./delete/${ train.trainNumber }'>DELETE</a></td>
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>