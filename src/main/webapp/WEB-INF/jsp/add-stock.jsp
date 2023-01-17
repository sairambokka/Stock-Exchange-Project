<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Add a Stock</title>
</head>
<body>
	<h1 align="center">Add Stock Details</h1>
	<form align="center" class="form-horizontal" action="addstock"
		method="get">
		<label style="width: 240px; display: inline-block; text-align: right;"
			for="companyName">Company Name : </label> <input type="text"
			name="companyName" /><br> <br> <label
			style="width: 240px; display: inline-block; text-align: right;"
			for="sharePrice">Share Price : </label> <input type="number"
			name="sharePrice" /><br> <br> <input type="submit"
			value="Submit data" />
	</form>
</body>
</html>