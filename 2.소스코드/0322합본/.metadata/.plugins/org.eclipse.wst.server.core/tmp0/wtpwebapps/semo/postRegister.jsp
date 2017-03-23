<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head>
    <!-- Title -->
    <title>게시물등록</title>
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
                    <form class="signup-page margin-top-20" action="postRegister.do" enctype="multipart/form-data" method="post">
                        <div class="signup-header">
                            <h2 class="margin-bottom-20">게시물등록</h2> </div>
                            
                        <label>제목</label> <span class="color-red">*</span>
                        <input class="form-control margin-bottom-10" type="text" name="title">
                        
                        <label>카테고리 </label> <span class="color-red">*</span>
                        <select name="category" class="form-control margin-bottom-10">
                            <option value="">카테고리 선택</option>
                            <option value="정치와사회">정치/사회</option>
                            <option value="연예">연예</option>
                            <option value="스포츠">스포츠</option>
                            <option value="라이프스타일">라이프스타일</option>
                            <option value="IT와과학">IT/과학</option>
                            <option value="문화">문화</option>
                            <option value="피플">피플</option>
                            <option value="비즈니스">비즈니스</option>
                        </select>
                        
                        <label>투표 마감일</label> <span class="color-red">*</span>
                        <input class="form-control margin-bottom-10" type="date" name="endDate">
                        
                        <label>선택지 1</label> <span class="color-red">*</span>
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                이미지<input type="file" name="leftImage"></div>
                            <div class="panel-body">내용<input type="text" name="leftContent" class="form-control margin-bottom-10"></div>
                        </div>
                        
                        <label>선택지 2</label> <span class="color-red">*</span>
                        <div class="panel panel-info">
                            <div class="panel-heading">이미지<input type="file" name="rightImage"></div>
                            <div class="panel-body">내용<input type="text" name="rightContent" class="form-control margin-bottom-10"></div>
                        </div>
                        
                        
                        <hr size="50">
                        <div align="right">
                            <button class="btn btn-primary" type="reset">취소</button>
                            <button class="btn btn-primary" type="submit">등록</button>
                        </div>
                    </form>
                </div>
                <!-- End Register Box -->
            </div>
        </div>
    </div>
</body>
</html>