<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="./resources/assets/css/tyle.css">
  </head>
  <body>
      <div class="container-fluid">
    
    

<div class="row content">
  <div class="col-md-3">
  </div>
  <div class="col-md-6">
    <div class="form-login">
      <p class="title px-3 py-2">Register</p>
      <form class="mx-3 my-3" action="<%=request.getContextPath() + "/register"%>" method = "POST">
        <div class="form-group">
          <input type="text" class="form-control" id="Username" placeholder="User name" name="userName">
          <span class="text-danger error"><%=request.getAttribute("userName") == null ? "" : request.getAttribute("userName")%></span>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" id="Email" placeholder="E-mail" name="email">
            <span class="text-danger error"><%=request.getAttribute("email") == null ? "" : request.getAttribute("email")%></span>
        </div>
        <div class="form-group">
          <input type="password" class="form-control" id="Password" placeholder="Password" name="password">
          <span class="text-danger error"><%=request.getAttribute("password") == null ? "" : request.getAttribute("password")%></span>
        </div>
        <div class="form-group">
            <input type="password" class="form-control" id="RePassword" placeholder="Re Password" name="rePassword">
            <span class="text-danger error"><%=request.getAttribute("rePassword") == null ? "" : request.getAttribute("rePassword")%></span>
        </div>
        <button type="submit" class="btn btn-primary w-100 my-3" id="register" >Register</button>
        <a href="./login" class="login my-3">Click here to Login</a>
      </form>        
    </div>
  </div>
  <div class="col-md-3">
  </div>
</div>

	
</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="/js/main.js" type="module"></script>
  </body>

</html>

