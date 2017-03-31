<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = 'c' uri ="http://java.sun.com/jsp/jstl/core" %>

<!-- === BEGIN HEADER === -->
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <head>
        <!-- Title -->
        <title>Boss - Professional Bootstrap Template</title>
        <!-- Meta -->
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
        <!-- Favicon -->
        <link href="favicon.ico" rel="shortcut icon">
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="assets/css/bootstrap.css" rel="stylesheet">
        <!-- Template CSS -->
        <link rel="stylesheet" href="assets/css/animate.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/nexus.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/responsive.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/custom.css" rel="stylesheet">
        <!-- Google Fonts-->
        <link href="http://fonts.googleapis.com/css?family=Raleway:100,300,400" type="text/css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Roboto:400,300" type="text/css" rel="stylesheet">
    </head>
    <body>
    
      
        <!-- Header -->
        <div id="header" style="background-position: 50% 0%; <br />
<b>Notice</b>:  Undefined variable: full_page in <b>C:\xampp\htdocs\bootstrap\html\php\header.php</b> on line <b>46</b><br />
" data-stellar-background-ratio="0.5">
            <div class="container">
                <div class="row">
                    <!-- Logo -->
                    <div class="logo">
                        <a href="index.html" title="">
                            <img src="assets/img/logo.png" alt="Logo" />
                        </a>
                    </div>
                    <!-- End Logo -->
                </div>
                <!-- Top Menu -->
                <div id="hornav" class="row text-light">
                    <div class="col-md-12">
                        <div class="text-center visible-lg">
                            <ul id="hornavmenu" class="nav navbar-nav">
                                <li>
                                    <a href="index.html" class="fa-home ">Home</a>
                                </li>
                                <li>
                                    <span class="fa-gears ">Features</span>
                                    <ul>
                                        <li class="parent">
                                            <span>Typography</span>
                                            <ul>
                                                <li>
                                                    <a href="features-typo-basic.html">Basic Typography</a>
                                                </li> 
                                            </ul>
                                        </li>
                                        <li class="parent">
                                            <span>Components</span>
                                            <ul>
                                                <li>
                                                    <a href="features-labels.html">Labels</a>
                                                </li>         
                                            </ul>
                                        </li>
                                        <li class="parent">
                                            <span>Icons</span>
                                            <ul>
                                                <li>
                                                    <a href="features-icons.html">Icons General</a>
                                                </li>
                                            </ul>
                                        </li>
                                        
                                    </ul>
                                </li>
                                <li>
                                    <span class="fa-copy active">Pages</span>
                                    <ul>
                                        <li>
                                            <a href="pages-about-us.html">About Us</a>
                                        </li>
                                        
                                    </ul>
                                </li>
                                <li>
                                    <span class="fa-th ">Portfolio</span>
                                    <ul>
                                        <li>
                                            <a href="portfolio-2-column.html">2 Column</a>
                                        </li>
                                        <li>
                                            <a href="portfolio-3-column.html">3 Column</a>
                                        </li>
                                        
                                    </ul>
                                </li>
                                <li>
                                    <span class="fa-font ">Blog</span>
                                    <ul>
                                        <li>
                                            <a href="blog-list.html">Blog</a>
                                        </li>
                                        <li>
                                            <a href="blog-single.html">Blog Single Item</a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="contact.html" class="fa-comment ">Contact</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- End Top Menu -->
            </div>
        </div>
        <!-- End Header -->
        <!-- === END HEADER === -->
        <!-- === BEGIN CONTENT === -->
        <div id="content">
            <div class="container background-white">
                <div class="row margin-vert-30">
                    <div class="col-md-12">
                        <h2 class="margin-bottom-20">관리자 모드</h2>
                        <h1>신고관리</h1>
                        <hr class="margin-vert-40">
                        <div class="row">
                            <div class="col-md-8">
                                <div class="tab-content">
                                    <div class="tab-pane active in fade" id="faq">
                                        <div class="panel-group" id="accordion">
                                            <!-- FAQ Item -->
                                            <c:choose>
                                           <c:when test="${accuseList eq null || empty accuseList}">
                                           <div class="panel panel-default panel-faq">
                                                <div class="panel-heading">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#faq-sub">
                                                        <h4 class="panel-title">
                                                           		 신고리스트가 없습니다.                                                          
                                                        </h4>
                                                    </a>
                                                </div>
                                            </c:when>
                                            <c:otherwise>
                                            <c:forEach items="${accuseList}" var = "accuse" varStatus = "no">
                                            <div class="panel panel-default panel-faq">
                                                <div class="panel-heading">
                                                    <div data-toggle="collapse" data-parent="#accordion" href="#faq-sub-${no.count }">
                                                        <h4 class="panel-title">${no.count } &nbsp ${accuse.title }
                                                            	
                                                        </h4>
                                                    </div>
                                                </div>
                                                <div id="faq-sub-${no.count }" class="panel-collapse collapse">
                                                
                                                    <div class="panel-body">
                                                    <c:forEach items="${accuse.comments }" var = "comment" varStatus = "num">
                                                    <p>${num.count }&nbsp ${comment.content}&nbsp${comment.writerId } </p>
                                                     </c:forEach>
                                                     <div>
	                                                            <span class="pull-right" style="display: inline-flex">
	                                                               <a href="postDetail.do?postId=${accuse.id }"><i class="glyphicon glyphicon-search"></i></a> 
	                                                               <a href="accuseReset.do?postId=${accuse.id }"><i class="glyphicon glyphicon-refresh"></i></a>
	                                                               <a href="postDelete.do?postId=${accuse.id }"><i class="glyphicon glyphicon-ban-circle"></i></a>
	                                                            </span>
                                                            </div>
                                                    </div>
                                                </div>
                                            </div>
                                            </c:forEach>
                                            </c:otherwise>
                                            </c:choose>
                                            
                                              
                                        </div>
                                    </div>
                                </div>
                            </div>                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- === END CONTENT === -->
        <!-- === BEGIN FOOTER === -->
          <%@ include file="header/footer.jspf" %>
    </body>
</html>
<!-- === END FOOTER === -->