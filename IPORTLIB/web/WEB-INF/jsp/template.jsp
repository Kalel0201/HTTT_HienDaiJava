<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title><tiles:insertAttribute name="title" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="${pageContext.request.contextPath}/images/frontend-style.css" rel="stylesheet" type="text/css" media="all" />
<!--slider-->
<link href="${pageContext.request.contextPath}/images/slider.css" rel="stylesheet" type="text/css" media="all"/>
<link href="${pageContext.request.contextPath}/images/bootstrap.min.css" rel="stylesheet" type="text/css" media="all"/>
<link href="${pageContext.request.contextPath}/images/bootstrap-theme.min.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/images/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/images/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/images/jquery.nivo.slider.js"></script>
<script type="text/javascript">
    $(window).load(function () {
        $('#slider').nivoSlider();
    });
    </script>
</head>
<body>
    <div class="btm_border">
        <div class="h_bg">
            <div class="wrap">
	            <div class="header">
		            <div class="logo">
			            <h1><a href="/"><img src="${pageContext.request.contextPath}/images/logo.png" alt=""></a></h1>
		            </div>
		            <div>
			            <!-- Navigation -->
                        <nav class="navbar-static-top" role="navigation" style="margin-bottom: 0">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                            <!-- /.navbar-header -->
                            <ul class="nav navbar-top-links navbar-right">
                                <li class="dropdown" style="float: left">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-messages" style="width: 300px">
                                        <li>
                                            <a href="#">
                                                <div>
                                                    <strong>The title</strong>
                                                    <span class="pull-right text-muted">
                                                        <em>Yesterday</em>
                                                    </span>
                                                </div>
                                                <div>The book over day</div>
                                            </a>
                                        </li>
                                        <li class="divider"></li>
                                        <li>
                                            <a href="#">
                                                <div>
                                                    <strong>The title</strong>
                                                    <span class="pull-right text-muted">
                                                        <em>Yesterday</em>
                                                    </span>
                                                </div>
                                                <div>The book over day</div>
                                            </a>
                                        </li>
                                        <li class="divider"></li>
                                        <li>
                                            <a href="#">
                                                <div>
                                                    <strong>The title</strong>
                                                    <span class="pull-right text-muted">
                                                        <em>Yesterday</em>
                                                    </span>
                                                </div>
                                                <div>The book over day</div>
                                            </a>
                                        </li>
                                        <li class="divider"></li>
                                        <li>
                                            <a class="text-center" href="${pageContext.request.contextPath}/notifications">
                                                <strong>Read All Messages</strong>
                                                <i class="fa fa-angle-right"></i>
                                            </a>
                                        </li>
                                    </ul>
                                    <!-- /.dropdown-messages -->
                                </li>
                                <!-- /.dropdown -->
                                <li class="dropdown"  style="float: left">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                                        </li>
                                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                                        </li>
                                        <li class="divider"></li>
                                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                                        </li>
                                    </ul>
                                    <!-- /.dropdown-user -->
                                </li>
                                <!-- /.dropdown -->
                            </ul>
                            <!-- /.navbar-top-links -->
                        </nav>
		            </div>	
		            <div class="clear"></div>
	            </div>
	            <div class='h_btm'>
		            <div class='cssmenu'>
			            <ul>
			                <li><a href="${pageContext.request.contextPath}"><span>Trang chủ</span></a></li>
                            <li><a href="${pageContext.request.contextPath}/search"><span>Tra cứu OPAC</span></a></li>
			 	            <div class="clear"></div>
			             </ul>
	                </div>
	                <div class="search">
    	                <form method="post" action="/Home/ResultSearch">
    		                <input type="text" value="" placeholder="Tra cứu nhanh...">
    		                <input type="submit" value="">
    	                </form>
	                </div>
	                <div class="clear"></div>
                </div>
            </div>
        </div>
    </div>


    <tiles:insertAttribute name="main" />

	<!--footer-->
	<div class="ftr-bg">
		<div class="wrap">
			<div class="footer">
			<div class="copy">
				<p class="w3-link">© All Rights Reserved | Design by&nbsp; <a href="http://w3layouts.com/"> W3Layouts</a></p>
			</div>
			<div class="clear"></div>	
		</div>
		</div>
	</div>
    <script src="${pageContext.request.contextPath}/images/frontend_js.js"></script>
    <script src="${pageContext.request.contextPath}/images/bootstrap.min.js"></script>
</body>
</html>