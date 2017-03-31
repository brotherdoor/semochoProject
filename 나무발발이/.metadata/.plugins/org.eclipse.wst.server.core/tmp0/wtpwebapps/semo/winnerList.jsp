<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>경품 추첨 페이지</title>
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
				<div class="col-md-12">
					<h2 class="margin-bottom-20">관리자 모드</h2>
					<h1>경품관리</h1>
					<hr class="margin-vert-40">
					<div class="row">
						<div class="col-md-8">
							<div class="tab-content">
								<div class="tab-pane active in fade" id="faq">
									<div class="panel-group" id="accordion">
										<!-- FAQ Item -->
										<c:choose>
											<c:when test="${winners eq null || empty winners}">
												<div class="panel panel-default panel-faq">
													<div class="panel-heading">
														<a data-toggle="collapse" data-parent="#accordion"
															href="#faq-sub">
															<h4 class="panel-title">응모자 리스트가 없습니다.</h4>
														</a>
													</div>
												</div>
											</c:when>
											<c:otherwise>
												<c:forEach items="${winners}" var="winner" varStatus="no">
													<div class="panel panel-default panel-faq">
														<div class="panel-heading">
															<div data-toggle="collapse" data-parent="#accordion"
																href="#faq-sub-${no.count }">
																<h4 class="panel-title">${no.count }
																	&nbsp ${winner.id } &nbsp ${winner.name} &nbsp ${winner.tel }
																</h4>
															</div>
														</div>
														<div id="faq-sub-${no.count }" class="panel-collapse collapse">
															<div class="panel-body">
																<p>생년월일 :${winner.birth }</p>
																<p>연락처 :${winner.tel }</p>
																<p>관심사 :${winner.interest }</p>
																<p>이메일 :${winner.email }</p>
																<p>성별 :${winner.gender }</p>
																<p>등급 :${winner.grade }</p>
																<p>세모 :${winner.semo }</p>
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

</body>
</html>
<!-- === END FOOTER === -->