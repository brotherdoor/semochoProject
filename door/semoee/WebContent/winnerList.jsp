<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>����~~</title>
</head>
<body>

	<h1>��÷�� ����Ʈ</h1>

	<c:forEach items="${winners }" var="winner" varStatus="sts">
		<table class="section">
			<tr>
				<td>��ȣ</td>
				<td>${sts.count }</td>
			</tr>

			<tr>
				<td>���̵�</td>
				<td>${winner.id }</td>
			</tr>

			<tr>
				<td>�̸�</td>
				<td>${winner.name }</td>
			</tr>

			<tr>
				<td>�̸���</td>
				<td>${winner.email }</td>
			</tr>

			<hr>
		</table>
	</c:forEach>
	<c:if test="${empty winners }">
		<h3>��ǰ ���� ������ ����ڰ� �����ϴ�.</h3>
	</c:if>
</body>
</html>