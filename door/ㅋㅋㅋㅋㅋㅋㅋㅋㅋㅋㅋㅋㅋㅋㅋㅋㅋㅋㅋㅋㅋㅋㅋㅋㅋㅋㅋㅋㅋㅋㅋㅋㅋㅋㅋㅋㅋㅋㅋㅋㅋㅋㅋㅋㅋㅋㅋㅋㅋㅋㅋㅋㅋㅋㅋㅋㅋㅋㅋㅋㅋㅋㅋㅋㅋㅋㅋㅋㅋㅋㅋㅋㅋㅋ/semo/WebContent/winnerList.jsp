<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>위너~~</title>
</head>
<body>

	<h1>당첨자 리스트</h1>

	<c:forEach items="${winners }" var="winner" varStatus="sts">
		<table class="section">
			<tr>
				<td>번호</td>
				<td>${sts.count }</td>
			</tr>

			<tr>
				<td>아이디</td>
				<td>${winner.id }</td>
			</tr>

			<tr>
				<td>이름</td>
				<td>${winner.name }</td>
			</tr>

			<tr>
				<td>이메일</td>
				<td>${winner.email }</td>
			</tr>

			<hr>
		</table>
	</c:forEach>
	<c:if test="${empty winners }">
		<h3>경품 응모에 참여한 사용자가 없습니다.</h3>
	</c:if>
</body>
</html>