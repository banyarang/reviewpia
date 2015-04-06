<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>REVIEWPIA</title>

    <!-- Bootstrap Core CSS -->
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	
	<!-- fontawesome Core CSS -->
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
	<link href='http://fonts.googleapis.com/css?family=Wire+One' rel='stylesheet' type='text/css'>
	
    <!-- Custom CSS -->
    <link href="./resources/css/magister.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="./resources/css/custom.css" rel="stylesheet">
     	
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
</head>

<body class="theme-invert">

<jsp:include page="./common/navigation.jsp" flush="false"/>

<jsp:include page="${view}" flush="false"/>
 
 <!-- 
<section class="section" id="about">
	<iframe src="sectionAbout" height='600px'></iframe>
</section>
  -->
  
    <!-- jQuery -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

	<!-- Custom template scripts -->
	<!-- 
	<script src="./resources/js/magister.js"></script>
	 -->
	 
	<script>
	$(document).ready(function() {
		$('html').css('background-image', 'url(./resources/images/body1.jpg)');
	});
	</script>
	
</body>

</html>
