<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!doctype>
<html>

<head>
    <!-- Title -->
    <title>세모초 블로그</title>
    <!-- Meta -->
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <!--문자 속성 알려주는 것-->
    <meta name="description" content="">
    <!-- "속성 = 값", 그리고 "/content = 내용물" -->
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <!-- 초기화 /-->
    <!-- Favicon -->
    <link href="favicon.ico" rel="shortcut icon">
    <!-- 웹사이트의 아이콘 -->
    <!-- Bootstrap Core CSS -->
    <!-- 꾸미기~ 링크들 -->
    <link rel="stylesheet" href="assets/css/bootstrap.css" rel="stylesheet">
    <!-- Template CSS -->
    <link rel="stylesheet" href="assets/css/animate.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/nexus.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/responsive.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/custom.css" rel="stylesheet">
    <!-- Google Fonts-->
    <link href="http://fonts.googleapis.com/css?family=Raleway:100,300,400" type="text/css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,300" type="text/css" rel="stylesheet"> </head>

<body>
	<%@ include file="header/header.jspf" %>
    <%@ include file="header/semoHeader.jspf" %>
    <!-- === BEGIN CONTENT === -->
    <div id="content">
        <div class="container background-white">
            <div class="row margin-vert-30">
                <!-- Main Column -->
                <div class="col-md-9">
                    <!-- Main Content -->
                    <!-- Recent Posts -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">${user.name } 님의 블로그 입니다.</h3> </div>
                        <div class="panel-body">
                            <p><img src="assets/img/blog/image1.jpg"></p>
                            <ul class="list-unstyled">
                                <li> <i class="fa-envelope color-primary"></i>${user.email }</li>
                            </ul>
                            <ul class="list-unstyled">
                                <li> <strong class="color-primary">투표 게시 횟수 : </strong>${posts }</li>
                                <li> <strong class="color-primary">투표 참여 횟수 : </strong>${joins }</li>
                                <li> <strong class="color-primary">경품 참여 횟수 : </strong>${goods }</li>
                            </ul>
                        </div>
                    </div>
                    <!-- End recent Posts -->
                    <!-- End Main Content -->
                </div>
                <!-- End Main Column -->
                <!-- Side Column -->
                <div class="col-md-3">
                    <!-- Recent Posts -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">친구 목록</h3></div>
                        <div class="panel-body">
                        <c:forEach items="${friends }" var="friend">
                            <ul class="posts-list margin-top-10">
                            
                                <li>
                                    <div class="recent-post">
                                        <a href="semoMain.do?id=${friend.id }"> <img class="pull-left" src="assets/img/blog/thumbs/thumb1.jpg" alt="thumb1"> </a> <br> <a href="semoMain.do?id=${friend.id }" class="posts-list-title">${friend.name }</a>
                                        <br> <span class="recent-post-date">
                                                ${friend.email }
                                            </span> </div>
                                    <div class="clearfix"></div>
                                </li>
                              
                            </ul>
                            </c:forEach> 
                        </div>
                    </div>
                     <!-- Recent Posts -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">친구 추천</h3> </div>
                        <div class="panel-body">
                            <c:forEach items="${recommend }" var="recommend">
                            <ul class="posts-list margin-top-10">
                            
                                <li>
                                    <div class="recent-post">
                                        <a href="semoMain.do?id=${recommend.id }"> <img class="pull-left" src="assets/img/blog/thumbs/thumb1.jpg" alt="thumb1"> </a> <br> <a href="semoMain.do?id=${recommend.id }" class="posts-list-title">${recommend.id }</a>
                                        <br> <span class="recent-post-date">
                                                ${recommend.email }
                                            </span> </div>
                                    <div class="clearfix"></div>
                                </li>
                              
                            </ul>
                            </c:forEach> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- === END CONTENT === -->
</body>

</html>