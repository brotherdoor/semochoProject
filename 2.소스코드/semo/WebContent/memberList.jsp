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
       
<%@ include file="header/header.jspf"%>
        <!-- === BEGIN CONTENT === -->
        <div id="content">
            <div class="container background-white">
                <div class="row margin-vert-30">
                    <div class="col-md-12">
                        <h2 class="margin-bottom-20">관리자 모드</h2>
                         <div><a href="accuseList.do"><h1>신고관리</h1></a>&nbsp&nbsp&nbsp&nbsp&nbsp<a href="memberList.do"><h1>회원관리</h1></a></div>
                        <hr class="margin-vert-40">
                        <div class="row">
                            <div class="col-md-8">
                                <div class="tab-content">
                                    <div class="tab-pane active in fade" id="faq">
                                        <div class="panel-group" id="accordion">
                                            <!-- FAQ Item -->
                                            <c:choose>
                                           <c:when test="${Users eq null || empty Users}">
                                           <div class="panel panel-default panel-faq">
                                                <div class="panel-heading">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#faq-sub">
                                                        <h4 class="panel-title">
                                                           		 회원리스트가 없습니다.                                                          
                                                        </h4>
                                                    </a>
                                                </div>
                                            </c:when>
                                            <c:otherwise>
                                            <c:forEach items="${Users}" var = "user" varStatus = "no">
                                            <div class="panel panel-default panel-faq">
                                                <div class="panel-heading">
                                                    <div data-toggle="collapse" data-parent="#accordion" href="#faq-sub-${no.count }">
                                                        <h4 class="panel-title">${no.count } &nbsp ${user.id } &nbsp ${user.name}
	                                                            <span class="pull-right" style="display: inline-flex">
	                                                               <a href="delectMember.do?userId=${user.id }"><i class="glyphicon glyphicon-ban-circle"></i></a>
	                                                            </span>
                                                        </h4>
                                                    </div>
                                                </div>
                                                <div id="faq-sub-${no.count }" class="panel-collapse collapse">
                                                    <div class="panel-body">
                                                    <p>생년 :${user.birth }</p>
                                                    <p>연락처 :${user.tel }</p>
                                                    <p>관심사 :${user.interest }</p>
                                                    <p>이메일 :${user.email }</p>
                                                    <p>성별 :${user.gender }</p>
                                                    <p>등급 :${user.grade }</p>
                                                    <p>세모 :${user.semo }</p>
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
                         <div class="col-md-3">
                         <div class="panel panel-default">
                         <form action="memberList.do" method="post">
                            <div class="panel-heading">
                                 <h3 class="panel-title">회원검색</h3>&nbsp<input type="radio" name="search" value="id" checked="checked">ID <input type="radio" name="search" value="name">이름
                            </div>
                            <div class="panel-heading">
                                <input type="text" name="serachText" size="10"style="height:23px;">&nbsp<input type="submit"value="검색">
                            </div>
                            </form>
                            <div class="panel-body">
                            <c:forEach items="${searchList}" var = "searcher">
                               <p>${searcher.name } <a href="delectMember.do?userId=${user.id }"><i class="glyphicon glyphicon-ban-circle"></i></a></p>
                           </c:forEach>
                            </div>
                        </div>
                        <!-- End About -->
                    </div>
                    </div>
                    
                </div>
                
            </div>
            
        </div>
        <!-- === END CONTENT === -->
        <!-- === BEGIN FOOTER === -->
        <div id="base" class="background-dark text-light">
            <div class="container padding-vert-30">
                <div class="row">
                    <!-- Disclaimer -->
                    <div class="col-md-6 margin-bottom-30">
                        <h3 class="margin-bottom-10">Disclaimer</h3>
                        <p>All stock images on this template demo are for presentation purposes only, intended to represent a live site and are not included with the template or in any of the Joomla51 club membership plans.</p>
                        <p>Dribbble images are property of their respective owners. All other images are freely available from
                            <a class="nobold" href="http://www.unsplash.com/" target="_blank">Unsplash</a>.</p>
                    </div>
                    <!-- End Disclaimer -->
                    <!-- Image Credits -->
                    <div class="col-sm-6 col-md-3 margin-bottom-30">
                        <h3 class="margin-bottom-10">Image Credits</h3>
                        <ul class="menu">
                            <li>
                                <a href="http://www.coffeeandplaid.com/" target="_blank">Coffee & Plaid</a>
                            </li>
                            <li>
                                <a href="https://dribbble.com/OMFGdesign" target="_blank">Olly Freeman</a>
                            </li>
                            <li>
                                <a href="https://dribbble.com/artnok" target="_blank">Niko Picard</a>
                            </li>
                            <li>
                                <a href="https://dribbble.com/forsuregraphic" target="_blank">Forsuregraphic</a>
                            </li>
                            <li>
                                <a href="https://www.unsplash.com" target="_blank">Unsplash</a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <!-- End Image Credits -->
                    <!-- Friends -->
                    <div class="col-sm-6 col-md-3 margin-bottom-30">
                        <h3 class="margin-bottom-10">Friends</h3>
                        <ul class="menu">
                            <li>
                                <a href="#">Amanda Allen</a>
                            </li>
                            <li>
                                <a href="#">John Adams</a>
                            </li>
                            <li>
                                <a href="#">Mark Sanchez</a>
                            </li>
                            <li>
                                <a href="#">Diane Reed</a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <!-- End Friends -->
                </div>
            </div>
        </div>
        <%@ include file="header/footer.jspf" %>
    </body>
</html>
<!-- === END FOOTER === -->