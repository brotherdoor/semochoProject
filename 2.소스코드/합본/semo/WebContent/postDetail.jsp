
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var='ctx' value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- Title -->
        <title>${post.title }</title>
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
        <!-- === BEGIN CONTENT === -->
        <div id="content">
            <div class="container background-white">
                <div class="row margin-vert-30">
                    <!-- Main Column -->
                    <div class="col-md-9"><a href="postRegister.jsp" type="button" class="btn btn-info">
                    게시물 등록</a>
        </div>
        
        
        </div>
        </div></div></div>
        
        
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
                                    <a href="#">
                                        ${post.title }</a>
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
                                    	<a href="choiceVote.do?postId=${post.id }&choiceId=${post.choiceLeft.id}"><button type="button" class="btn btn-aqua">선 택</button></a>
                                        <img class="margin-bottom-20" src="${ctx }/choiceImage.do?choiceId=${post.choiceLeft.id}&postId=${post.id}">
                                        <p style="text-align: center;">${post.choiceLeft.content }</p>
                                        
                                    </div>
                                    <div class="col-md-5">
                                    	<a href="choiceVote.do?postId=${post.id }&choiceId=${post.choiceRight.id}"><button type="button" class="btn btn-aqua">선 택</button></a>
                                        <img class="margin-bottom-20" src="${ctx }/choiceImage.do?choiceId=${post.choiceRight.id}&postId=${post.id}">
                                        <p style="text-align: center;">${post.choiceRight.content }</p>
                                        
                                    </div>
                                    <div class="col-md-0" >
                                    	
                                        <a href="alamingRegister.do?postId=${post.id }" type="button" class="fa-bell-o">알리미 등록</a>
                            			<br>
                          			    <a href="accuseRegister.do?postId=${post.id }" type="button" class="fa-legal">게시물 신고</a>
                          			    <br>
                          			   
                          			    <br>
                          			     
                          			    <br><br><br>
                          			    <a href="postModify.do?postId=${post.id }" type="button" class="fa-edit">게시물 수정</a>
                          			    <br>
                          			    <a href="postDelete.do?postId=${post.id }" type="button" class="fa-eraser">게시물 삭제</a>
                          			    
                                        
                                    </div>
                                    
                                </div>
                            </div>
                           
                            <!-- End Blog Item Body -->
                            
                       
                        <!-- End Blog Item -->        
                        <!-- Comments -->
                                    <div class="blog-recent-comments panel panel-default margin-bottom-30">
                                        <div class="panel-heading">
                                            <h3>Comments</h3>
                                        </div>
                                        <c:choose>
                                        	<c:when test="${post.comments eq null || empty post.comments }">
                                        	<hr><p style="text-align: center;">등록된 댓글이 없습니다. 댓글을 달아주세요</p><hr>
                                        	</c:when>
                                        	<c:otherwise>
                                        		<c:forEach items="${post.comments }" var="comment">
                                        
                                        
                                        <ul class="list-group">
                                            <li class="list-group-item">
                                                <div class="row">
                                                    <div class="col-md-2 profile-thumb">
                                                        <a href="#">
                                                            <img class="media-object" src="assets/img/profiles/99.jpg" alt="">
                                                        </a>
                                                    </div>
                                                    <div class="col-md-10">
                                                        <h4>${comment.writerId }</h4>
                                                        <p>${comment.content }</p>
														
                                                    </div>
                                                </div>
                                            </li>
                                        	</c:forEach>
                                        	</c:otherwise>
                                        </c:choose>
                                        
                                           
                                            <!-- Comment Form -->
                                            <li class="list-group-item">
                                                <div class="blog-comment-form">
                                                    <div class="row margin-top-20">
                                                        <div class="col-md-12">
                                                            <div class="pull-left">
                                                                <h3>Leave a Comment</h3>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row margin-top-20">
                                                        <div class="col-md-12">
                                                            <form action="commentRegist.do" method="post">
                                                                <input type="hidden" name="postId" value="${post.id }">
                                                                <label>Message</label>
                                                                <div class="row margin-bottom-20">
                                                                    <div class="col-md-11 col-md-offset-0">
                                                                        <input type="text" class="form-control" name="comment">
                                                                    </div>
                                                                </div>
                                                                <p>
                                                                    <input class="btn btn-primary" type="submit" value="등록">
                                                                </p>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <!-- End Comment Form -->
                                       
                                    </div>
                                    <!-- End Comments -->
                    
                    </div>
                    <!-- End Main Column -->
                </div>
            </div>
            
            
            
        </div>
        <!-- === END CONTENT === -->
        
  
        
         
        
            <!-- JS -->
            <script type="text/javascript" src="assets/js/jquery.min.js" type="text/javascript"></script>
            <script type="text/javascript" src="assets/js/bootstrap.min.js" type="text/javascript"></script>
            <script type="text/javascript" src="assets/js/scripts.js"></script>
            <!-- Isotope - Portfolio Sorting -->
            <script type="text/javascript" src="assets/js/jquery.isotope.js" type="text/javascript"></script>
            <!-- Mobile Menu - Slicknav -->
            <script type="text/javascript" src="assets/js/jquery.slicknav.js" type="text/javascript"></script>
            <!-- Animate on Scroll-->
            <script type="text/javascript" src="assets/js/jquery.visible.js" charset="utf-8"></script>
            <!-- Stellar Parallax -->
            <script type="text/javascript" src="assets/js/jquery.stellar.js" charset="utf-8"></script>
            <!-- Sticky Div -->
            <script type="text/javascript" src="assets/js/jquery.sticky.js" charset="utf-8"></script>
            <!-- Slimbox2-->
            <script type="text/javascript" src="assets/js/slimbox2.js" charset="utf-8"></script>
            <!-- Modernizr -->
            <script src="assets/js/modernizr.custom.js" type="text/javascript"></script>
            <!-- End JS -->

</body>
</html>