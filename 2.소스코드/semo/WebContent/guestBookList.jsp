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
    <div style="width: 50%; display: table; margin-left: auto; margin-right: auto;">
        <!-- 방명록 리스트 -->
        <div class="row margin-top-20">
            <div class="col-md-12">
                <div class="pull-left">
                    <h1>${userId } 님의 방명록 </h1> </div>
            </div>
        </div>
        <c:forEach items="${guestBooks }" var="guestBook" varStatus="status">
        <div class="list-group-item">
            <div class="row">
                <div class="col-md-10">
                    <h3>${guestBook.id }. 작성자 : ${guestBook.writerId }</h3>
                    <br>
                    <p>${guestBook.content } </p>
                    <c:if test="${userId eq writerId}">
                    <a class="btn btn-xs btn-info btnPlay" href="guestBookRemove.do?id=${guestBook.id }">삭제</a>
                    <!--<a class="btn btn-xs btn-info btnPlay" href="modify.do?id=${guestBook.id }">수정</a>-->
                    </c:if>
                </div>
            </div>
        </div>
        </c:forEach>
        <!-- 방명록 리스트 끝-->
        <!-- Comment Form -->
        <div>
            <div class="list-group-item">
                <div class="blog-comment-form">
                    <div class="row margin-top-20">
                        <div class="col-md-12">
                            <form action="guestBookRegister.do" method="post">
                            <input type="hidden" name="semoHomeId" value="${semoHomeId }">
                                    <label>Message</label>
                                    <div style=float:right>
                                        <label>작성자 : ${writerId }</label>
                                    </div>
                                    <div class="row margin-bottom-20">
                                        <div class="col-md-11 col-md-offset-0">
                                            <textarea class="form-control" rows="6" id="contents" name="contents"></textarea>
                                        </div>
                                    </div>
                                    <button class="btn btn-primary" type="submit">방명록 작성</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Comment Form -->
        <!-- End Comments -->
    </div>
    <%@ include file="header/footer.jspf" %>
	</body>
</html>