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




		<div class="profile">
			<div class="row header">
				<div class="col-md-12">
					<div
						class="header d-flex justify-content-between align-items-center">
						<div>AUTOMOTIVE REPAIR</div>
					</div>
				</div>
			</div>
			<div class="row vh-100">
				<div class="col-md-3 sidebar border">
					
					<a href=""><div
							class="row view-contents py-3 pl-3 border-bottom border-top">
							Add a new Car</div></a> <a
						href=""><div
							class="row form-contents py-3 pl-3 border-bottom">
							Add Management</div></a>


				</div>

				<div class="col-md-9 page border-top">


					<div class="title m-3 border-bottom">
						<h1>Car Detail</h1>
					</div>
					
					<div class="edit-form m-3 border">
						<form:form class="ml-3 mb-3" method="POST" modelAttribute="car" action="/car/addnewCar">
						
						
							  <div class="form-group row">
							    <label for="inputEmail3" class="col-sm-2 col-form-label">license plate*</label>
							    <div class="col-sm-10">
							      <form:input type="text" class="form-control" 
								placeholder="89A-8989" path = "license_plate" />
							    </div>
							  </div>
							  
							  
							  <div class="form-group row">
							    <label for="inputEmail3" class="col-sm-2 col-form-label">repair_date*</label>
							    <div class="col-sm-10">
							      <form:input type="date" class="form-control" 
								placeholder="89A-8989" path = "repair_date" />
							    </div>
							  </div>
							  
							  <div class="form-group row">
							    <label for="inputEmail3" class="col-sm-2 col-form-label">Scustomer Name*</label>
							    <div class="col-sm-10">
							      <form:input type="text" class="form-control" 
								placeholder="89A-8989" path = "customerName" />
							    </div>
							  </div>
							  
							  <div class="form-group row">
							    <label for="inputEmail3" class="col-sm-2 col-form-label">catalogs*</label>
							    <div class="col-sm-10">
							      <form:input type="text" class="form-control" 
								placeholder="89A-8989" path = "catalogs" />
							    </div>
							  </div>
							  
							  <div class="form-group row">
							    <label for="inputEmail3" class="col-sm-2 col-form-label">carMaker*</label>
							    <div class="col-sm-10">
							      <form:input type="text" class="form-control" 
								placeholder="89A-8989" path = "carMaker" />
							    </div>
							  </div>
							  
							 
							  
							  
							  
							  
							  
							  
							  
							  <div class="form-group row">
							    <div class="col-sm-10 offset-sm-2">
							      <button type="submit" class="btn btn-primary">Save Car</button>
							    </div>
							  </div>
							  
							  <a href="/accessory" class="register my-3">Accessory Detail</a>
							  
							  
						</form:form>
					</div>
					
					

				</div>
			</div>
		</div>

		<!-- ... MAIN HERE ... -->










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





