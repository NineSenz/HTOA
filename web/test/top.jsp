<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%
	String path = request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/bootstrap/css/bootstrap.min.css">
<script src="<%=path %>/htoa/js/jquery-3.0.0.min.js"></script>
<script src="<%=path %>/bootstrap/js/bootstrap.min.js"></script>
<script>

	$(function(){
		$("#secAll").click(function(){
			$.get("message/queryAll",
			function(data){
				$("#message").html("<thead><tr><td>ID</td><td>NAME</td><td>Message</td></tr></thead><tbody id='tbMsg'></tbody>");
				var tb = $("#tbMsg");
				var count =0;
				var col = null;
				if(data.result=='success'){
					$(data.message).each(function(){
						count++;
						switch (count%4){
						case 0:
							col="success";
							break;
						case 1:
							col="error";
							break;
						case 2:
							col="warning";
							break;
						case 3:
							col="info";
							break;
						default:
							break;
						}
						tb.append("<tr  class='"+col+"' ><td>" + this.id + "</td><td>" + this.name + "</td><td>" + this.message + "</td></tr>");
						
					})
					//$(".my_tr:odd").css("background-color", "orange");
					//$(".my_tr:even").css("background-color", "cyan");
					$("#context").fadeIn(2000);
				}
			},"json")
		})
	})
</script>
<style>
body{
    background: url("../img/75.JPG")no-repeat center center fixed;
}
</style>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid" style="text-align: center;line-height: 120px;">
		<div class="span2">
			<img alt="140x140" src="<%=path%>/img/head.jpg" class="img-circle" style="height: 120px;" />
		</div>
		<div class="span2">
			 <button class="btn" type="button" id="secAll">查看所有</button>
		</div>
		<div class="span2">
			 <button class="btn" type="button">查看留言</button>
		</div>
		<div class="span2">
			 <button class="btn" type="button">修改留言</button>
		</div>
		<div class="span2">
			 <button class="btn" type="button">删除留言</button>
		</div>
		<div class="span2">
			 <button class="btn" type="button">新增留言</button>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span12">
			<div>
			<!-- 
				<a href="javascript:;" id="secAll" >查看所有</a>
				<a href="javascript:;" id="secOne" >查看留言</a>
				<a href="javascript:;" id="altMsg" >修改留言</a>
				<a href="javascript:;" id="romMsg" >删除留言</a>
				<a href="javascript:;" id="addMsg" >新增留言</a>
				<div id ="context" style="display:none;">
			 -->
				
				<table id ="message" class="table table-hover"></table>
				</div>	
			</div>
			<ul id = "main-menu"class="main-menu">
				<li></li>
			</ul>
		</div>
	</div>
</body>
</html>