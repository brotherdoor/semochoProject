<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = 'c' uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head>
    <!-- Title -->
    <title>게시물신고</title>
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
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,300" type="text/css" rel="stylesheet"> </head>

</head>
<body>
    <div id="content">
        <div class="container background-white">
            <div class="row margin-vert-30">
                <!-- Register Box -->
                <div class="col-md-6 col-md-offset-3 col-sm-offset-3">
                    <form class="signup-page margin-top-20" action="accuseRegister.do" method="post">
                        <div class="signup-header">
                            <h2 class="margin-bottom-20">게시물 신고</h2> </div>
                            <input type="hidden" name="postId" value="${postId }">
                        <label>사유</label> <span class="color-red">*</span>
                        <input class="form-control margin-bottom-10" type="text" name="content">
                        
                                                
                        
                        <hr size="50">
                        <div align="right">
                            <button class="btn btn-primary" type="reset">취소</button>
                            <button class="btn btn-primary" type="submit">신고</button>
                        </div>
                    </form>
                </div>
                <!-- End Register Box -->
            </div>
        </div>
    </div>
</body>
</html>