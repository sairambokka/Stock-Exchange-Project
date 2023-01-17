<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.concentrix.entity.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Stock Data</title>
</head>
<body>
	<h1 align="center">STOCK DATA</h1>

	<div class="col-8">
		<table class="table table-striped table-bordered">
			<tr>
				<th>ID</th>
				<th>Company Name</th>
				<th>Share Price</th>
				<th class="col-4">Actions</th>
			</tr>

			<c:forEach items="${stocks}" var="stock">
				<tr>
					<td>${stock.id}</td>
					<td>${stock.companyName}</td>
					<td>${stock.sharePrice}</td>
					<td><a href="/update/${stock.id}" class="btn btn-warning"> Edit Stock</a>
						| <a href="/delete/${stock.id}"
						onclick="if(!(confirm('Are You sure you want to delete this stock ?'))) return false"
						class="btn btn-danger"> Delete Company </a></td>
				</tr>
			</c:forEach>
		</table>

		<a href="add-stock" class="btn btn-primary">Enlist A New Company</a>
	</div>

</body>
</html>