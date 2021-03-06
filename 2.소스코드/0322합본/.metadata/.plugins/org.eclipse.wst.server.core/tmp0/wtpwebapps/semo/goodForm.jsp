<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var='ctx' value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="en">

<head>
<title>세상의 모든 투표</title>
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
<!-- Google Fonts-->
<link href="http://fonts.googleapis.com/css?family=Raleway:100,300,400"
	type="text/css" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Roboto:400,300"
	type="text/css" rel="stylesheet">
</head>

<body>

	<div id="content">
		<div class="container background-white">
			<div class="row margin-vert-30">
				<!-- Register Box -->
				<div class="col-md-6 col-md-offset-3 col-sm-offset-3">
					<form class="signup-page margin-top-20" action="${ctx }/good/register.do" method="post" enctype="multipart/form-data">
						<div class="signup-header">
							<h2 class="margin-bottom-20">경품등록</h2>


						</div>

						<label>제목</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="title"> 
						<label>내용</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="content">
						<label>경품</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="product">
						<label>소모세모</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="useSemo"> 
						<label>시작일</label>	<span class="color-red">*</span> <input	class="form-control margin-bottom-10" type="text" name="startDate">
						<label>종료일</label>	<span class="color-red">*</span> <input	class="form-control margin-bottom-10" type="text" name="endDate"> 
						<label>파일첨부</label><span class="color-red">*</span> <input	class="form-control margin-bottom-10" type="file" id="attachFile" name="attachFile">


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
	<!-- === END CONTENT === -->
	<!-- === BEGIN FOOTER === -->

	<!-- JS -->
	<script type="text/javascript" src="assets/js/jquery.min.js"
		type="text/javascript"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script type="text/javascript" src="assets/js/scripts.js"></script>
	<!-- Isotope - Portfolio Sorting -->
	<script type="text/javascript" src="assets/js/jquery.isotope.js"
		type="text/javascript"></script>
	<!-- Mobile Menu - Slicknav -->
	<script type="text/javascript" src="assets/js/jquery.slicknav.js"
		type="text/javascript"></script>
	<!-- Animate on Scroll-->
	<script type="text/javascript" src="assets/js/jquery.visible.js"
		charset="utf-8"></script>
	<!-- Stellar Parallax -->
	<script type="text/javascript" src="assets/js/jquery.stellar.js"
		charset="utf-8"></script>
	<!-- Sticky Div -->
	<script type="text/javascript" src="assets/js/jquery.sticky.js"
		charset="utf-8"></script>
	<!-- Slimbox2-->
	<script type="text/javascript" src="assets/js/slimbox2.js"
		charset="utf-8"></script>
	<!-- Modernizr -->
	<script src="assets/js/modernizr.custom.js" type="text/javascript"></script>
	<!-- End JS -->
</body>

</html>
<!-- === END FOOTER === -->