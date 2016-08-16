<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<html>
<head>
	<meta charset="utf-8">
	<title>宏图OA办公</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="Css/adminStyle.css" rel="stylesheet" type="text/css" />

	<title>宏图OA办公</title>
	<script type="text/javascript" src="Js/jquery1.js"></script>
	<script type="text/javascript">
		$(document).ready(
				function() {
					$(".div2").click(
							function() {
								$(this).next("div").slideToggle("slow").siblings(
										".div3:visible").slideUp("slow");
							});
				});
		function openurl(url) {
			var rframe = parent.document.getElementById("rightFrame");
			rframe.src = url;
		}
	</script>
	<style>
		body {
			margin: 0;
			font-family: 微软雅黑;
			background-image: url(images/bg51.jpg);
			background-size: cover;
			background-attachment: fixed;
			background-color: #DDDDDD

		}

		.top1 {
			position: absolute;
			top: 0px;
			width: 100%;
			height: 20px;
			text-align: center;
			color: #FFFFFF;
			font-size: 17px;
			font-height: 20px;
			font-family: 楷体;
			background-color: #888888
		}

		.title {
			float:left;
			margin:-32px 20px;
			font-size: 40px;
			color: #FFFFFF;
			font-height: 55px;
			font-family: 隶书;
		}

		.top2 {
			position: absolute;
			top: 20px;
			width: 100%;
			height: 77px;
			text-align: center;
			color: #ccffff;
			background-color: #888888
		}

		.left {
			position: absolute;
			left: 0px;
			top: 97px;
			width: 200px;
			height: 85%;
			border-right: 1px solid #9370DB;
			color: #000000;
			font-size: 20px;
			text-align: center;
			background-color: #B3B3B3
		}

		.right {
			position: absolute;
			left: 200px;
			top:97px;
			width: 85.2%;
			height: 85%;
			border-top: 0px solid #484860;
			font-size: 14px;
			text-align: center;
		}

		.end {
			position: absolute;
			bottom: 0px;
			width: 100%;
			height: 30px;
			text-align: center;
			color: #556B2F;
			font-size: 17px;
			font-height: 20px;
			font-family: 楷体;
			background-color: #C0C0C0
		}

		.div1 {
			text-align: center;
			width: 200px;
			padding-top: 10px;
		}

		.div2 {
			height: 40px;
			line-height: 40px;
			cursor: pointer;
			font-size: 18px;
			position: relative;
			border-bottom: #ccc 0px dotted;
		}

		.spgl {
			position: absolute;
			height: 20px;
			width: 20px;
			left: 40px;
			top: 10px;
			background: url(images/1.png);
		}

		.yhgl {
			position: absolute;
			height: 20px;
			width: 20px;
			left: 40px;
			top: 10px;
			background: url(images/4.png);
		}

		.gggl {
			position: absolute;
			height: 20px;
			width: 20px;
			left: 40px;
			top: 10px;
			background: url(images/4.png);
		}

		.zlgl {
			position: absolute;
			height: 20px;
			width: 20px;
			left: 40px;
			top: 10px;
			background: url(images/4.png);
		}

		.pjgl {
			position: absolute;
			height: 20px;
			width: 20px;
			left: 40px;
			top: 10px;
			background: url(images/4.png);
		}

		.tcht {
			position: absolute;
			height: 20px;
			width: 20px;
			left: 40px;
			top: 10px;
			background: url(images/2.png);
		}

		.div3 {
			display: none;
			cursor: pointer;
			font-size: 15px;
		}

		.div3 ul {
			margin: 0;
			padding: 0;
		}

		.div3 li {
			height: 30px;
			line-height: 30px;
			list-style: none;
			border-bottom: #ccc 1px dotted;
			text-align: center;
		}

		.a {
			text-decoration: none;
			color: #000000;
			font-size: 15px;
		}

		.a1 {
			text-decoration: none;
			color: #000000;
			font-size: 18px;
		}
	</style>
</head>
<body>

<div class="top1">
	<marquee scrollAmount=2 width=300>数据无价，请谨慎操作！</marquee>
</div>
<div class="top2">
	<div class="logo">
		<img src="images/admin_logo.png" title="在哪儿" />
	</div>
	<div class="title" >
		<h3>宏图OA办公</h3>
	</div>
	<div class="fr top-link">
		<a href="admin_list.jsp" target="mainCont" title="DeathGhost">
			<i class="adminIcon"></i><span>管理员：DeathGhost</span></a>
	</div>
</div>

<div class="left">
	<div class="div1">
		<div class="left_top">
			<img src="images/bbb_01.jpg"><img src="images/bbb_02.jpg"
											  id="2"><img src="images/bbb_03.jpg"><img
				src="images/bbb_04.jpg">
		</div>

		<div class="div2">
			<div class="spgl"></div>
			管理员
		</div>
		<div class="div3">
			<li><a class="a" href="javascript:void(0);"
				   onClick="openurl('videoQuery.jsp');">查看管理</a></li>
			<li><a class="a" href="javascript:void(0);"
				   onClick="openurl('t_department.jsp');">部门列表</a></li>
			<li><a class="a" href="javascript:void(0);"
				   onClick="openurl('uservideoQuery.jsp');">部门列表</a></li>
			<li><a class="a" href="javascript:void(0);"
				   onClick="openurl('t_staff.jsp');">员工列表</a></li>

		</div>
		<div class="div2">
			<div class="spgl"></div>
			人力
		</div>
		<div class="div3">
			<ul>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('documentQuery.jsp');">报名学生</a></li>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('userdocumentQuery.jsp');">试读学生</a></li>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('userdocumentQuery.jsp');">正式学员</a></li>

			</ul>
		</div>
		<div class="div2">
			<div class="spgl"></div>
			教务
		</div>
		<div class="div3">
			<ul>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('classQuery.jsp');">班级管理</a></li>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('classQuery.jsp');">课程管理</a></li>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('classQuery.jsp');">宿舍管理</a></li>

			</ul>
		</div>
		<div class="div2">
			<div class="yhgl"></div>
			财务
		</div>
		<div class="div3">
			<ul>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('studentQuery.jsp');">收入</a></li>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('teacherQuery.jsp');">支出</a></li>
			</ul>
		</div>
		<div class="div2">
			<div class="yhgl"></div>
			后勤
		</div>
		<div class="div3">
			<ul>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('studentQuery.jsp');">暂无</a></li>
				<li><a class="a" href="javascript:void(0);"zh
					   onClick="openurl('teacherQuery.jsp');">暂无</a></li>
			</ul>
		</div>
		<div class="div2">
			<div class="gggl"></div>
			留言管理
		</div>
		<div class="div3">

			<ul>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('deletecomment.jsp');">留言删除</a></li>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('useredit.jsp');">学生禁言</a></li>
			</ul>

		</div>
		<div class="div2">
			<div class="pjgl"></div>
			公告管理
		</div>
		<div class="div3">
			<ul>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('afficheQuery.jsp');">查看公告</a></li>
				<li><a class="a" href="javascript:void(0);"
					   onClick="openurl('afficheAdd.jsp');">添加公告</a></li>
			</ul>
		</div>
		<a class="a1" href="login.jsp"><div class="div2">
			<div class="tcht"></div>
			退出后台
		</div></a>
	</div>
</div>

<div class="right">
	<iframe id="rightFrame" name="rightFrame" width="100%" height="100%"
			scrolling="auto" marginheight="0" marginwidth="0" align="center"
			style="border: 0px solid #CCC; margin: 0; padding: 0;"></iframe>
</div>







</body>
</html>
