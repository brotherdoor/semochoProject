<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>�α���</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	padding : 10% 10%;
}
</style>
</head>
<body>

	<h3>�α���</h3>
	
	<br>
	<form action="login.do" method="post" >
		<table class="table">
			<tr>
				<th>ID</th>
				<td><input id="id"  name="id" class="form-control" type="text" value="" placeholder="ID�� �Է����ּ���."></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input id="password" name="password" class="form-control" type="password" value="" placeholder="��й�ȣ�� �Է����ּ���."></td>
			</tr>
		</table><br>
		<div align="center"><input class="btn" type="reset" value="���"> <input class="btn btn-success" type="submit" value="�α���"></div>
	</form>
	<br>
</body>
</html>
