<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administración</title>

    <link rel="stylesheet" type="text/css" href="assets/bootstrap/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/local.css" />

    <script type="text/javascript" src="assets/js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.min.js"></script>

    <style>
      div {
          padding-bottom:20px;
      }
    </style>
  </head>
  
  <body>

    <div id="wrapper">
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header">
          
        </div>
        
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          
          <%@include file="navbar.jsp" %>
          
          <%@include file="logout.jsp" %>
          
        </div>
      </nav>
      <div>
        <div class="row text-center">
          <h2>Dashboard</h2>
        </div>
        <div>
          <label for="firstname" class="col-md-2">
            First Name:
          </label>
          <div class="col-md-9">
            <input type="text" class="form-control" id="firstname" placeholder="Enter First Name">
          </div>
          <div class="col-md-1">
            <i class="fa fa-lock fa-2x"></i>
          </div>
        </div>
        <div>
          <label for="lastname" class="col-md-2">
            Last Name:
          </label>
          <div class="col-md-9">
            <input type="text" class="form-control" id="lastname" placeholder="Enter Last Name">
          </div>
          <div class="col-md-1">
            <i class="fa fa-lock fa-2x"></i>
          </div>
        </div>
        <div>
          <label for="emailaddress" class="col-md-2">
            Email address:
          </label>
          <div class="col-md-9">
            <input type="email" class="form-control" id="emailaddress" placeholder="Enter email address">
            <p class="help-block">
              Example: yourname@domain.com
            </p>
          </div>
          <div class="col-md-1">
            <i class="fa fa-lock fa-2x"></i>
          </div>
        </div>
        <div>
          <label for="password" class="col-md-2">
            Password:
          </label>
          <div class="col-md-9">
            <input type="password" class="form-control" id="password" placeholder="Enter Password">
            <p class="help-block">
              Min: 6 characters (Alphanumeric only)
            </p>
          </div>
          <div class="col-md-1">
            <i class="fa fa-lock fa-2x"></i>
          </div>
        </div>
        <div>
          <label for="sex" class="col-md-2">
            Gender:
          </label>
          <div class="col-md-10">
            <label class="radio">
              <input type="radio" name="sex" id="sex" value="male" checked>
              Male
            </label>
            <label class="radio">
              <input type="radio" name="sex" id="Radio1" value="female">
              Female
            </label>
          </div>
        </div>
        <div>
          <label for="country" class="col-md-2">
            Country:
          </label>
          <div class="col-md-9">
            <select name="country" id="country" class="form-control">
              <option>--Please Select--</option>
              <option>India</option>
              <option>United States</option>
              <option>Canada</option>
              <option>United Kingdom</option>
              <option>Others</option>
            </select>
          </div>
        </div>
        <div>
          <label for="uploadimage" class="col-md-2">
            Upload Image:
          </label>
          <div class="col-md-10">
            <input type="file" name="uploadimage" id="uploadimage">
            <p class="help-block">
              Allowed formats: jpeg, jpg, gif, png
            </p>
          </div>
        </div>
        <div>
          <div class="col-md-2">
          </div>
          <div class="col-md-10">
            <label>
              <input type="checkbox">I hereby accept the terms and conditions for using this site</label>
          </div>
        </div>
        <div class="row">
          <div class="col-md-2">
          </div>
          <div class="col-md-10">
            <button type="submit" class="btn btn-info">Register</button>
          </div>
        </div>
      </div>
    </div>

  </body>
</html>
