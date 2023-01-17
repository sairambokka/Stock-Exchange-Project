<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Update Stock</title>
</head>
<body>
<h1 align="center">Update Stock</h1>
	<form:form action="/updateStock" method="post" modelAttribute="stock">

		<div align="center">

			<p>
				<label style="width: 240px; display: inline-block; text-align: right;" for="companyName">Company Name : </label>
				<form:input id="companyName" value="${stock.companyName}" path="companyName" />
			</p>
			
			<p>
				<label style="width: 240px; display: inline-block; text-align: right;" for="sharePrice">Share Price : </label>
				<form:input id="sharePrice" value="${stock.sharePrice}" path="sharePrice" />
			</p>
			<br>

			<input type="submit" value="Update Data" />

		</div>

	</form:form>
</body>
</html>