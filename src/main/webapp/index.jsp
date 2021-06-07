<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" media="all" />
</head>
<body>
<div class="container">
	<div class="form-group">
		<input type="text" class="form-control" name="username" id="username"/>
	</div>
	<div class="form-group">
		<input type="password" class="form-control" name="password" id="password"/>
	</div><div class="form-group">
		<button class="btn btn-primary" onclick="login()">Enviar</button>
	</div>	
</div>
<div class="container" id="resultado"></div>

<script src="recursos/js/jquery.js"></script>
<script src="recursos/js/bootstrap.min.js"></script>
<script src="recursos/js/script.js"></script>
</body>
</html>