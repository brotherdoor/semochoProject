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
    <%@ include file="header/semoHeader.jspf" %>
    <!-- === BEGIN CONTENT === -->
    <c:forEach items="${goods }" var="good" varStatus="status">
    <div id="content" style= "width: 100%; display: table; margin-left: auto; margin-right: auto;">
        <div class="container background-white">
            <div class="row margin-vert-30">
                <!-- Main Column -->
                <div class="col-md-9">
                    <!-- Main Content -->
                    <!-- Main Column -->
                    <div class="col-md-9">
                        <!-- Blog Post -->
                        <div class="blog-post padding-bottom-20">
                            <!-- Blog Item Header -->
                            <div class="blog-post-date pull-left"><span> 게시물 수 : </span> </div>
                            <div class="blog-item-header">
                                <!-- Title -->
                                <h2>
                                    <a href="#">
                                        ${good.title }</a>
                                </h2>
                                <!-- End Title -->
                                <!-- Blog Item Details -->
                                <div class="blog-post-details">
                                    <!-- Author Name -->
                                    <div class="blog-post-details-item blog-post-details-item-left"> <i class="fa fa-calendar color-gray-light"></i>  ${good.startDate } </div>
                                    <!-- End Author Name -->
                                    <!-- Date -->
                                    <div class="blog-post-details-item blog-post-details-item-left"> <i class="fa fa-calendar color-gray-light"></i>  ${good.endDate } </div>
                                    <!-- End Date -->
                                    <!-- Tags -->
                                    <div class="blog-post-details-item blog-post-details-item-left blog-post-details-tags"> △ : ${good.useSemo } </div>
                                    <!-- End Tags -->
                                    <!-- # of Comments -->
                                    <div class="blog-post-details-item blog-post-details-item-left blog-post-details-item-last">
                                        <a href=""> <i class="fa fa-comments color-gray-light"></i> ${size } </a>
                                    </div>
                                    <!-- End # of Comments -->
                                </div>
                                <!-- End Blog Item Details -->
                            </div>
                            <!-- End Blog Item Header -->
                            <!-- Blog Item Body -->
                            <div class="blog">
                                <div class="clearfix"></div>
                                <div class="blog-post-body row margin-top-15">
                                    <div class="col-md-5"> <img class="margin-bottom-20" src="assets/img/blog/image1.jpg" alt="thumb1"> </div>
                                    <div class="col-md-7">
                                        <p> 제품 : ${good.product }</p>
                                        <p> 내용 : ${good.content }</p>
                                        <!-- End Read More -->
                                    </div>
                                </div>
                            </div>
                            <!-- End Blog Item Body -->
                        </div>
                        <!-- End Blog Item -->
                        <!-- End Main Column -->
                    </div>
                </div>
            </div>
            <!-- === END CONTENT === -->
		</div>
	</div>
</c:forEach>
</body>

</html>