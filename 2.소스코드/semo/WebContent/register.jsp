<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery 회원가입</title>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script type="text/javascript" src="jquery.ui.datepicker-ko.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		//$("#birth").datepicker();
		//$.datepicker.setDefaults( $.datepicker.regional[ "" ] );
		//$("#birth").datepicker($.datepicker.regional["ko"]);
		$("#birth").datepicker();
	});

	function formCheck() {
		// submit을 제외한 모든 input태그의 갯수를 가져옴
		var length = document.forms[0].length - 1;

		for (var i = 0; i < length; i++) { // 길이만큼 루프를 돌면서

			if (document.forms[0][i].value == null
					|| document.forms[0][i].value == "") {
				// 경고창을 띄우고
				alert(document.forms[0][i].name + "을(를) 입력하세요.");
				// null인 태그에 포커스를 줌
				document.forms[0][i].focus();
				return false;
			}//end if
		}//end for
	}

	$(function() {
		$('#id').keypress(function() {
			$(this).val($(this).val().replace(/^[A-za-z0-9]{10}/g, ''));
			$('font[name=idfont]').html("대소문자, 숫자 포함 10자 이내로 입력해주세요.");
		});
	});

	$(function() {
		var st = $(":input:radio[name=gender]:checked").val();
		$('input:radio[name=gender]:input[value=' + st + ']').attr("checked",
				true);
	});

	$(function() {
		$('#tel').keyup(function() {
			$(this).val($(this).val().replace(/[^0-9]/g, ""));
		}); //#tel.keyup 
	});

	$(function() {
		$("#password").keyup(function() {
			$('font[name=check]').text('');
		});
		$("#passwordCheck").keyup(function() {
			if ($("#password").val() != $("#passwordCheck").val()) {
				$('font[name=check]').text('');
				$('font[name=check]').html("password가 다릅니다.");
			} else {
				$('font[name=check]').text('');
				$('font[name=check]').html("password가 동일합니다.");
			}
		});
	});
</script>
<!-- Meta -->
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<!-- Bootstrap -->
<link href="form/css/bootstrap.min.css" rel="stylesheet">
<!-- font awesome -->
<link rel="stylesheet" href="form/css/font-awesome.min.css"
	media="screen" title="no title" charset="utf-8">
<!-- Custom style -->
<link rel="stylesheet" href="form/css/style.css" media="screen"
	title="no title" charset="utf-8">

</head>
<body>
<!--  <%@ include file="header/header.jspf"%> -->
	<article class="container">
	<div class="page-header">
		<h1>
			회원 가입<small>SEMOCHO</small>
		</h1>
	</div>
	<br>
	<form name="register" action="registerUser.do" method="post"
		onsubmit="return formCheck();">
		<table class="table">
			<colgroup>
				<col width="100">
				<col width="*">
			</colgroup>
			<div class="col-md-6 col-md-offset-3">
				<tr>
					<th>이름</th>
					<td><input type="text" id="name" name="name"
						class="form-control" value="" placeholder="이름 입력"></td>
				</tr>

				<tr>
					<th>아이디</th>
					<td><input type="text" id="id" name="id" class="form-control"
						value="" placeholder="ID 입력"> <font name="idfont" size="2"
						color="red"></font> <span id="idCheckResult"></span></td>
				</tr>
				<tr>
					<th>비밀 번호</th>
					<td><input type="password" id="password" name="password"
						placeholder="비밀번호 입력" class="form-control" value="" maxlength=""></td>
				</tr>

				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" id="passwordCheck"
						name="passwordCheck" class="form-control" placeholder="비밀번호 확인">
						<font name="check" size="2" color="red"></font></td>
				</tr>

				<tr>
					<td id="title">성별</td>
					<td><input type="radio" name="gender" value="M"
						checked="checked">남 <input type="radio" name="gender"
						value="F">여</td>
				</tr>

				<tr>
					<th>생년월일</th>
					<td><input type="text" id="birth" name="birth" value=""
						class="form-control" placeholder="생년월일  click"></td>
				</tr>

				<tr>
					<td id="title">관심사</td>
					<td><select name="interest" class="form-control">
							<option>society</option>
							<option>entertainment</option>
							<option>sports</option>
							<option>lifeStyle</option>
							<option>IT</option>
							<option>culture</option>
							<option>peole</option>
							<option>business</option>
					</select></td>
				</tr>
				
				<tr>
					<th>이메일</th>
					<td><input type="text" id="email" name="email"
						class="form-control" placeholder="이메일 입력"></td>
					<td><select id="emailDomain" name="emailDomain"
								class="form-control">
								<option value="" selected>이메일 선택</option>
								<option value="@naver.com">@naver.com</option>
								<option value="@nate.com">@nate.com</option>
								<option value="@daum.net">@daum.net</option>
								<option value="@gmail.com">@gmail.com</option>
							</select></td>
				</tr>
			<tr>
				<th>휴대폰 번호</th>
				<td><input type="text" id="tel" name="tel" class="form-control"
					placeholder="숫자만 입력 가능,-제외"></td>

			</tr>

			<tr>
				<td><input type="hidden" id="grade" name="grade" value="50"></td>
			</tr>

			<tr>
				<td><input type="hidden" id="semo" name="semo" value="50"></td>
			</tr>




		</table>


		<br>
		<div align="center">
			<input class="btn" type="reset" value="취소"> <input
				class="btn btn-success" id="btn_join" type="submit" value="저장">
		</div>

	</form>
	</article>




</body>
</html>