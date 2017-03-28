<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>경품등록 페이지</title>
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
	<%@ include file="header/header.jspf"%>
	<div id="content">
		<div class="container background-white">
			<div class="row margin-vert-30">
				<!-- Register Box -->
				<div class="col-md-6 col-md-offset-3 col-sm-offset-3">
					<form class="signup-page margin-top-20" action="goodRegister.do" method="post" enctype="multipart/form-data">
						<div class="signup-header">
							<h2 class="margin-bottom-20">경품등록</h2>


						</div>

						<label>제목</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="title"> 
						<label>내용</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="content">
						<label>경품</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="product">
						<label>소모세모</label> <span class="color-red">*</span> <input class="form-control margin-bottom-10" type="text" name="useSemo"> 
						<label>시작일</label>	<span class="color-red">*</span> <input	class="form-control margin-bottom-10" type="date" name="startDate">
						<label>종료일</label>	<span class="color-red">*</span> <input	class="form-control margin-bottom-10" type="date" name="endDate"> 
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
	<%@ include file="header/footer.jspf" %>
</body>

</html>
<!-- === END FOOTER === -->