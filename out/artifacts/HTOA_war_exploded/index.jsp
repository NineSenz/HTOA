<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String path = request.getContextPath();
    %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宏图OA办公</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/htoa/css/style.css"/>
<script type="text/javascript" src="<%=path %>/htoa/js/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="<%=path %>/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=path %>/jquery-easyui/jquery.easyui.min.js"></script>
<script>
	function addTab(title, url) {
		if ($("#tabs").tabs("exists", title)) { // "exists"表示去判断指定title的tab选项卡是否已经打开
			$("#tabs").tabs("select", title); // 如果tab选项卡已经被打开过，则直接显示出该选项卡
		} else {
			$("#tabs").tabs("add", {
				title: title, // 指定标题
				content: tabContent(url), // 指定选项卡里的内容，一个新的页面，用iframe来展示
				border:false, // 边框
				closable:true // 选项卡是否可关闭
			})
		}
	}
	
	function tabContent(url) {
		return '<iframe scrolling="true" frameborder="0" src="' + url + '" style="width:100%;height:100%;"></iframe>';
	}
</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north'" style="height: 15%;">
		<img class="img1" src="<%=path %>/img/logo1.png" >
		<div style="float:right; margin-right: 30px;">晚上好！ <a href="#">安全退出</a></div>
		<marquee behavior="alternate" width="70%" scrollamount="13">
		  <p align="center">
		  <img src="img/xr.gif">&nbsp;&nbsp;2组人员全体加班3天&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  <img src="img/xr.gif"></p>
		 </marquee>
	</div>
	
	<div data-options="region:'west',split:true" title="&nbsp;宏图OA" style="width:10%;">
		<div class="easyui-accordion" style="width:100%;border:0px;">
			<div data-options="title:'',iconCls:'icon-edit'" style="overflow:auto;"></div>
			<div data-options="title:'&nbsp;&nbsp;&nbsp;&nbsp;宏图&nbsp;', iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="addTab('查看管理', 'easyui/t_admin.jsp')">查看管理</a></p>
				<p><a href="javascript:;" onclick="addTab('部门列表', 'easyui/t_department.jsp')">部门列表</a></p>
				<p><a href="javascript:;" onclick="addTab('员工列表', 'easyui/t_staff.jsp')">员工列表</a></p>
			</div>
			<div title="&nbsp;&nbsp;&nbsp;&nbsp;人力" data-options="iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="addTab('报名学生', 'aa.jsp')">报名学生</a></p>
				<p><a href="javascript:;" onclick="addTab('试读学生', 'aa.jsp')">试读学生</a></p>
				<p><a href="javascript:;" onclick="addTab('正式学员', 'products.jsp')">正式学员</a></p>
			</div>
			<div title="&nbsp;&nbsp;&nbsp;&nbsp;教务" data-options="iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="addTab('班级管理', 'products.jsp')">班级管理</a></p>
				<p><a href="javascript:;" onclick="addTab('课程管理', 'products.jsp')">课程管理</a></p>
				<p><a href="javascript:;" onclick="addTab('宿舍管理', 'products.jsp')">宿舍管理</a></p>

			</div>
			<div title="&nbsp;&nbsp;&nbsp;&nbsp;财务" data-options="iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="addTab('收入', 'products.jsp')">收入</a></p>
				<p><a href="javascript:;" onclick="addTab('支出', 'products.jsp')">支出</a></p>
				<p><a href="javascript:;" onclick="addTab('工资', 'products.jsp')">工资</a></p>
			</div>
			<div title="&nbsp;&nbsp;&nbsp;&nbsp;行政" data-options="iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="addTab('产品列表', 'products.jsp')">部门列表</a></p>
				<p><a href="javascript:;" onclick="addTab('每周研讨', 'products.jsp')">每周研讨</a></p>
				<p><a href="javascript:;" onclick="addTab('学生意见', 'products.jsp')">学生意见</a></p>

			</div>
			<div title="&nbsp;&nbsp;&nbsp;&nbsp;后勤" data-options="iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="addTab('领用物品', 'products.jsp')">领用物品</a></p>
				<p><a href="javascript:;" onclick="addTab('暂无', 'products.jsp')">暂无</a></p>
			</div>
			<div title="&nbsp;&nbsp;&nbsp;&nbsp;公告" data-options="iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="addTab('查看公告', 'products.jsp')">查看公告</a></p>
			</div>
			<div title="&nbsp;&nbsp;&nbsp;&nbsp;退出" data-options="iconCls:'icon-edit'" style="overflow:auto;padding:10px;"></div>
		</div>
	</div>
	<div data-options="region:'center',iconCls:'icon-ok'" style="border:0px;">
		<div id="tabs" class="easyui-tabs" style="height:100%;">
			<div title="主页" style="padding:10px;">
				<div class="">
					
				</div>
			</div>
		</div>
	</div>
	<div data-options="region:'south',split:false" style="height:50px;">
		<a style="margin-left: 70%;color:#ff33ff;font-size:26px;line-height: 50px">2016&copy;赣州宏图软件学院</a>
	</div>
</body>
</html>