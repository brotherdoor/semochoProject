<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var='ctx' value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
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
         <%@ include file="header/header.jspf" %>
        <!-- End Header -->
        <!-- === END HEADER === -->
        
         <c:choose>
						<c:when test="${loginUser eq null }">
							
						</c:when>
						<c:otherwise>
						<div id="content">
							<div class="container background-white">
                <div class="row margin-vert-30">
                    <!-- Main Column -->
                    <div class="col-md-9"><a href="postRegister.jsp" type="button" class="btn btn-info">
                    게시물 등록</a>
        </div>
        
        </div>
        </div></div></div>
						</c:otherwise>
					</c:choose>
        <c:choose>
			<c:when test="${posts eq null || empty posts }">
				<hr>
					<p style="text-align: center;">등록된 게시물이 없습니다.</p>
				<hr>
			</c:when>
			<c:otherwise>
        <c:forEach items="${posts }" var="post">
        
        
        <!-- === BEGIN CONTENT === -->
        <div id="content">
            <div class="container background-white">
                <div class="row margin-vert-30">
                    <!-- Main Column -->
                    <div class="col-md-9">
                        <!-- Blog Post -->
                        <div class="blog-post padding-bottom-20">
                            <!-- Blog Item Header -->
                            <div class="blog-post-date pull-left">
                                <span class="day">End Date</span>
                                
                                <br>
                                <span class="year">${post.endDate }</span>
                            </div>
                            <div class="blog-item-header">
                                <!-- Title -->
                                <h2>
                                    <a href="postDetail.do?postId=${post.id }">${post.title }</a>
                                </h2>
                                
                                
                                <!-- End Title -->
                                <!-- Blog Item Details -->
                                <div class="blog-post-details">
                                    <!-- Author Name -->
                                    <div class="blog-post-details-item blog-post-details-item-left">
                                        <i class="fa fa-user color-gray-light"></i>
                                        <a href="#">${post.writerId }</a>
                                    </div>
                                    <!-- End Author Name -->
                                    <!-- Date -->
                                    <div class="blog-post-details-item blog-post-details-item-left">
                                        <i class="fa fa-tasks color-gray-light"></i>
                                        <a href="#"> ${post.category }</a>
                                    </div>
                                    <!-- End Date -->
                                    
                                    <!-- # of Comments -->
                                    <div class="blog-post-details-item blog-post-details-item-left blog-post-details-item-last">
                                        <a href="">
                                            <i class="fa fa-comments color-gray-light"></i>
                                            <c:set var="count" value="0"/>
                                            <c:forEach items="${post.comments }" var="comment">
                                            	<c:set var="count" value="${count + 1 }"/>
                                            </c:forEach>
                                            ${count }
                                        </a>
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
                                    <div class="col-md-5">
                                        <img class="margin-bottom-20" src="${ctx }/choiceImage.do?choiceId=${post.choiceLeft.id}&postId=${post.id}">
                                    </div>
                                    <div class="col-md-5">
                                        <img class="margin-bottom-20" src="${ctx }/choiceImage.do?choiceId=${post.choiceRight.id}&postId=${post.id}">
                                    </div>
                                    
                                </div>
                            </div>
                            <!-- End Blog Item Body -->
                        </div>
                        <!-- End Blog Item -->
                        
                        
                    
                    </div>
                    <!-- End Main Column -->
                </div>
            </div>
        </div>
        <hr>
        </c:forEach>
        </c:otherwise>
        </c:choose>
       
</body>
</html>