<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var='ctx' value="${pageContext.request.contextPath }" />
<!doctype>
<html>
    <head>
        <!-- Title -->
        <title>SEMOCHO</title>
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
	<%@ include file="header/header.jspf" %>
    <!-- === BEGIN CONTENT === -->
    <div style="padding-top: 50px; padding-bottom: 10px; text-align: center;">
    
        <span style="padding-right: 40px; padding-left: 40px;"><a class="btn btn-primary" href="postRegister.jsp">투표게시하기</a></span>
        <span style="padding-right: 40px; padding-left: 40px;"><a class="btn btn-primary" href="postList.do">투표하러가기</a></span>
        <span style="padding-right: 40px; padding-left: 40px;"><a class="btn btn-primary" href="goodList.do">경품목록가기</a></span>
    </div>
    <div id="content">
        <div class="container background-white">
            <div class="row margin-vert-30">
                <!-- Side Column -->
                <div class="col-md-3">
                    <!-- Recent Posts -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="text-center" style="font-weight: 500;">카테고리</h3> </div>
                        <div class="panel-body">
                            <ul class="posts-list margin-top-10">
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postList.do" class="fa-home">전체목록</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category=정치와사회" class="fa-home">정치/사회</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category=연예" class="fa-home">연예</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category="스포츠"" class="fa-home">스포츠</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category=라이프스타일" class="fa-home">라이프스타일</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category=IT와과학" class="fa-home">IT/과학</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category=문화" class="fa-home">문화</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category=피플" class="fa-home">피플</a>
                                        <br></div>
                                </li>
                                <li>
                                    <div style="padding-top: 10px; padding-bottom: 10px; text-align: center;">
                                        <a href="postCategory.do?category=비즈니스" class="fa-home">비지니스</a>
                                        <br></div>
                                </li>
                               
                            </ul>
                        </div>
                    </div>
                    <!-- End recent Posts -->
                </div>
                <!-- End Side Column -->
                <!-- Main Column -->
                <div id="content">
            <div class="container background-white">
                <div class="row portfolio-group">
                    <!-- Portfolio Item -->
                    
                    <c:forEach items="${posts }" var="post">
                    
                    <div class="portfolio-item col-sm-3 col-xs-6 margin-bottom-40 video">
                        <a href="postDetail.do?postId=${post.id }">
                            <figure class="animate <br />
<b>Notice</b>:  Undefined variable: animate in <b>C:\xampp\htdocs\bootstrap\html\php\portfolio-item-4col.php</b> on line <b>28</b><br />
">
                                <div class="grid-image">
                                    <div class="featured-info">
                                        <div class="info-wrapper">
                                            <p>${post.choiceLeft.content }</p>
                                            <P>${post.choiceRight.content }</P>
                                        </div>
                                    </div>
                                    <img alt="image1" src="${ctx }/choiceImage.do?choiceId=${post.choiceRight.id}&postId=${post.id}" width="300" height="200">
                                </div>
                            </figure>
                        </a>
                    </div>
                    
                    </c:forEach>
                    
                    <!-- End Portfolio Item -->
                    
                </div>
                    
            </div>
           
        </div>
        <!-- === END CONTENT === -->
                <!-- End Main Column -->
                  
            </div>
             
        </div>

    </div>
    
  

</body>

</html>