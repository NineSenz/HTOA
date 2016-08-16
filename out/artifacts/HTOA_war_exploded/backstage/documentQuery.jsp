<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="Css/style.css" />
<script type="text/javascript" src="Js/jquery2.js"></script>
<script type="text/javascript" src="Js/jquery2.sorted.js"></script>
<script type="text/javascript" src="Js/bootstrap.js"></script>
<script type="text/javascript" src="Js/ckform.js"></script>
<script type="text/javascript" src="Js/common.js"></script>

<style type="text/css">
body {font-size: 20px;
	padding-bottom: 40px;
	background-color: #e9e7ef;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
</head>
<body>
	<form class="form-inline definewidth m20" action="#" method="get">
		 <font color="#777777"><strong>部门名称：</strong></font> <input type="text"
			name="menuname" id="menuname" class="abc input-default"
			placeholder="" value="">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">查询</button>
		&nbsp;&nbsp;
		<button type="button"  id="addnew">
			<a href="documentAdd.jsp">添加部门</a>
		</button>
	</form>
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>部门编号</th>
				<th>部门名称</th>
				<th>部门状态</th>
				<th>创建时间</th>
				<th>管理菜单</th>
			</tr>
		</thead>

		<tr>
			<td>蒹葭</td>
			<td>策</td>
			<td><a href="studentdetail.jsp">小强</a></td>
			<td>2016.07.22</td>

			<td>
				<button type="submit">修改</button> </a>
			</td>
			<td>
				<button type="submit">删除</button> </a>
			</td>

		</tr>


	</table>

</body>
</html>
