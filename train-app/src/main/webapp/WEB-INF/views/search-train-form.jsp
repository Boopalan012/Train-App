<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search train</title>
</head>
<body>
	<jsp:include page="index.jsp"/>
	
	<div class="container">
		<form action="search-train">
			<label>Train Number</label><br>
			<input type="text" name="trainNumber">
			
			<input type="submit" value="SEARCH">
		</form>
	</div>
</body>
</html>