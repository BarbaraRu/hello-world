<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Shop</title>

<!-- Latest compiled and minified CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<link rel="stylesheet" href="css/mioStile.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,700" rel="stylesheet"> 


</head>
<body>


<div class="container">

	<!-- <div class="row" id="testata" class="col-md-12">
		<jsp:include page="header.jsp"></jsp:include>
	</div>-->
	
	<div class="row" id="menu" class="col-md-12">
		<%@ include file="menu.jsp" %>
	</div>
	
	<div class="row" class="col-md-12">
		<div id="content" class="col-md-12">
			<%@ include file="content.jsp" %> 
		</div>
		<div id="sidebar" class="col-md-3">
			<%@ include file="sidebar.jsp"  %>
		</div>
	
	</div>
	
	<div class="row" id="footer"  class="col-md-12">
		<jsp:include page="footer.jsp"></jsp:include>
	</div>

</div>

<script
			  src="https://code.jquery.com/jquery-1.12.4.min.js"
			  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
			  crossorigin="anonymous"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 <!--<script src="js/mioScript.js"></script>
<!--<script src="js/mioScriptJQuery.js"></script>-->


</body>
</html>