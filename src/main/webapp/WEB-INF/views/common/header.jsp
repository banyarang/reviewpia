<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header id="header">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-xs-4">
				</div>
				<div class="col-sm-6 col-xs-8">
					<c:choose>
					<c:when test="${empty sessionScope.seq}">
						<form class="navbar-form navbar-right" role="search" id="loginForm">
							<div class="form-group input-group-sm">
								<input type="text" class="form-control" name="email" placeholder="Email">
							</div>
							<div class="form-group input-group-sm">
								<input type="text" class="form-control" name="password" placeholder="Password">
							</div>
							<div class="btn-group">
								<button class="btn btn-default btn-sm" type="submit" aria-expanded="false" id="signin">
								Sign In
								</button>
							</div>
						</form>
					</c:when>
					<c:otherwise>
						<div style="height:30px;margin-top:8px;margin-bottom:8px;">
							<p class="log-text"><a href="./">Home</a> | ${sessionScope.name} </p>
						</div>
					</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div><!--/.container-->

        <nav class="navbar" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="./"><img src="images/logo.png" alt="logo"></a>
                </div>
				
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                    	<!-- 
                        <li class="active"><a href="./">Home</a></li>
                         -->
                        <li><a href="aboutUs">About Us</a></li>
                        <!-- 
                        <li><a href="services">Services</a></li>
                         -->
                        <li><a href="gallery">Gallery</a></li>
                        <!-- 
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="blog-item.html">Blog Single</a></li>
                                <li><a href="pricing.html">Pricing</a></li>
                                <li><a href="404.html">404</a></li>
                                <li><a href="shortcodes.html">Shortcodes</a></li>
                            </ul>
                        </li>
                         -->
                        <li><a href="blog.html">Blog</a></li> 
                        <li><a href="contact-us.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
		
    </header><!--/header-->

	<div class="container agenda">
		Gallery | 2015
	</div>