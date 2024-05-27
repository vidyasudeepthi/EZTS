<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Student Information</h1>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Gender</th>
				<th scope="col">Email</th>
				<th scope="col">Phone</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tr>
			<th scope="row">001</th>
			<td>sudee</td>
			<td>F</td>
			<td>sudee@gmail.com</td>
			<td>9246243566</td>
			<td>
				<button class="btn btn-warning">
					<i class="bi bi-pencil-fill"></i>
				</button>
				<button class="btn btn-danger">
					<i class="bi bi-trash"></i>
				</button>
			</td>
		</tr>
	</table>
</body>
</html>
