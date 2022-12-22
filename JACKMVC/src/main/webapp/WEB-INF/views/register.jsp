<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
 <link href="<c:url value="/resources/css/tyle.css" />" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">


		<div class="row content">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div class="form-login">
					<p class="title px-3 py-2">Register</p>
					<form:form class="mx-3 my-3"
						action="./register" method="POST" modelAttribute="userDTO">
						<div class="form-group">
							<form:input type="text" class="form-control" id="Username"
								placeholder="User name" path = "userName" /> <form:errors path="userName" Class="error"/>
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control" id="Email"
								placeholder="E-mail" path = "email" /> <form:errors path="email" Class="error"/>
						</div>
						<div class="form-group">
							<form:input type="password" class="form-control" id="Password"
								placeholder="Password" path = "password" /><form:errors path="password" Class="error"/>
						</div>
						<div class="form-group">
							<input type="password" class="form-control" id="RePassword"
								placeholder="Re Password" name="rePassword"> 
						</div>
						<button type="submit" class="btn btn-primary w-100 my-3"
							id="register">Register</button>
						<a href="./login" class="login my-3">Click here to Login</a>
					</form:form>
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>




	</div>




	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</body>

</html>


