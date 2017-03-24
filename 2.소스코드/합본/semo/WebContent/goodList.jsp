<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>
<title>경품응모 페이지</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link href="favicon.ico" rel="shortcut icon">
<link rel="stylesheet" href="assets/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/animate.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/font-awesome.css"
	rel="stylesheet">
<link rel="stylesheet" href="assets/css/nexus.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/responsive.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/custom.css" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Raleway:100,300,400"
	type="text/css" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Roboto:400,300"
	type="text/css" rel="stylesheet">
</head>

<body>


	<div id="content">
		<div class="container background-white">
			<div class="row margin-vert-30">
				<div class="col-md-9">
					<div class="blog-post padding-bottom-20">
					<a href="goodRegister.do" class="btn btn-primary">새로운 경품 등록하기<i	class="icon-chevron-right readmore-icon"></i></a>
					<div class="panel panel-default">
                            <div class="panel-heading">
                                <h6 class="panel-title"></h6>
                            </div>
                            </div>
							<div class="panel-heading">
							</div>
						<c:forEach items="${goods }" var="good">
							<h2>${good.title }</h2>
							<div class="blog-post-date pull-left">
								<span>&nbsp;&nbsp;&nbsp;${good.startDate }&nbsp;&nbsp;&nbsp;</span>~ <span>&nbsp;&nbsp;&nbsp;${good.endDate }&nbsp;&nbsp;&nbsp;</span>
								<a href="goodEnter.do?goodId=${good.id }&useSemo=${good.useSemo}" class="btn btn-primary">응모하기<i class="icon-chevron-right readmore-icon"></i></a>
									<a href="goodWinner.do?goodId=${good.id }" class="btn btn-primary">추첨하기<i	class="icon-chevron-right readmore-icon"></i></a>
									<a href="goodRemove.do?goodId=${good.id }" class="btn btn-primary">삭제하기<i	class="icon-chevron-right readmore-icon"></i></a>
							</div>
							<div class="blog">
								<div class="clearfix"></div>
								<div class="blog-post-body row margin-top-15">
									<div class="col-md-5">
										<img class="margin-bottom-20" src="goodImage.do?goodId=${good.id}" width ="250" height = "150"	alt="thumb1">
									</div>
									<div class="col-md-7">
										<p><b>경품</b> : ${good.product }</p>
										<p><b>세모</b> : ${good.useSemo }</p>
										<p><b>설명</b> : ${good.content }</p>
									</div>
								</div>
							</div>
							<div class="panel panel-default">
                            <div class="panel-heading">
                                <h6 class="panel-title"></h6>
                            </div>
                            </div>
							<div class="panel-heading">
							</div>
						</c:forEach>



					</div>
				</div>
			</div>
		</div>
	</div>
	<ul class="pagination">
		<li><a href="#">&laquo;</a></li>
		<li class="active"><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li class="disabled"><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li><a href="#">&raquo;</a></li>
	</ul>

</body>