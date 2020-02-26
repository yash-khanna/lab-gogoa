<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOTEL</title>
<link rel="stylesheet" type="text/css" href="./assets/newstyle.css"/>
</head>
<body>
<header>
<img class="logo" src="./assets/logo.svg"></img>
</header>
<section class="result">
<div><p>YOUR DETAILS </p></div>
<div><p>ROOM TYPE: ${hotel.getRoomType() } </p></div>
<div><p>CHECK-IN:	${hotel.getFromdate() } </p></div>
<div><p>CHECK-OUT:	${hotel.getTodate() } </p></div>
<div><p>TOTAL GUESTS: ${hotel.getNoOfPersons()}</p></div>
<!-- <div><p>TOTAL DAYS:</p></div> -->
<div><p>TOTAL FARE	${hotelfare } </p></div>
</section>


</body>
</html>