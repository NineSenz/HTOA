<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CSS3动态背景登录框代码</title>

<link rel="stylesheet" type="text/css" href="Css/styles.css">

</head>
<body>


<div class="wrapper">

	<div class="container">
		<h1>登陆</h1>
		<form class="form">
			<input type="text" placeholder="Username">
			<input type="password" placeholder="Password"><br>
			<button type="submit" id="login-button" onclick="window.location.href='index.jsp';"><strong>登陆</strong></button>
			
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
	</ul>
	
</div>



</body>
</html>