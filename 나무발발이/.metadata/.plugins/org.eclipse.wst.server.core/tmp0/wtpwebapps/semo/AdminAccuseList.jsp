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
        <title>신고 리스트</title>
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