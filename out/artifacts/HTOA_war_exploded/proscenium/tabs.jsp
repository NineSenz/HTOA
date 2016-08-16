<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path =request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.4.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.4.5/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
<script src="<%=path%>/js/jquery-2.2.3.min.js"></script>
<script src="<%=path%>/js/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script src="<%=path%>/js/jquery-easyui-1.4.5/locale/easyui-lang-zh_CN.js"></script>

<script>
function pagination(tableId){
	var p = $("#"+tableId).datagrid("getPager");
	$(p).pagination({
		pageList:[10,20,30],
		beforePageText:"第",
		afterPageText:"页    共{pages}页",
		displayMsg:"当前显示 {from}-{to} 条记录  共{total}条记录",
		onBeforeRefresh: function(){
			$(this).pagination("loading");
			$(this).pagination("loaded");
		}
	});
}
$(function (){
	pagination("list");
	$("#new").click(function (){
		$.messager.alert("提示","新建菜单","info");
	});
	$("#list").datagrid({
		onRowContextMenu: function(e,rowIndex,rowData){
			e.preventDefault();
			$("#menu").menu('show',{
				left:e.pageX,
				top:e.pageY
			});
		}
	});
});
function add() {
		$("#addWin").window("open");
}
function doAdd() {
	if ($("#addForm").form("validate")) { // 验证整个表单里的所有validatabox是否通过验证
		$.post(
				'message/addMsg',
				$("#addForm").serialize(), // 直接把表单数据序列化成服务端可以接收的数据格式
				function(data) {
					if (data.result == 'success') {
						$.messager.alert("提示", data.msg, "info", function() {
							$("#addWin").window("close");
							$("#list").datagrid("reload");
							$("#addForm").form("clear");
						});
					} else {
						$.messger.alert("提示", data.msg + " 请稍候再试", "info");
					}
				});
	} 
}
function edit() {
	var row = $("#list").datagrid("getSelected");
	if(row){
		$("#editForm").form("load",row);
		$("#editWin").window("open");
	}else{
		$.messager.alert("提示","请选择需要修改的消息","info");
	}
}
function doEdit() {
	if ($("#editForm").form("validate")) { // 验证整个表单里的所有validatabox是否通过验证
		$.post(
				'message/editMsg',
				$("#editForm").serialize(), // 直接把表单数据序列化成服务端可以接收的数据格式
				function(data) {
					if (data.result == 'success') {
						$.messager.alert("提示", data.msg, "info", function() {
								$("#editWin").window("close");
								$("#list").datagrid("reload");
						});
					} else {
						$.messger.alert("提示", data.msg + " 请稍候再试", "info");
					}
				});
	} 
}
function rem() {
	var row = $("#list").datagrid("getSelected");
	if(row){
		//$messger.还要一个确认框
		$.post(
				'message/remMsg',
				{'id':row.id}, // 直接把表单数据序列化成服务端可以接收的数据格式
				function(data) {
					
						if (data.result == "success") {
							$.messager.alert("提示", data.msg, "info", function() {
								$("#list").datagrid("reload");
							});
						}
					else {
						$.messger.alert("提示", data.msg + " 请稍候再试", "info");
					}
				});
	}else{
		$.messager.alert("提示","请选择需要删除的消息","info");
	}
}
</script>
</head>
<body>
	<table id="list" class="easyui-datagrid" data-options="
		toolbar:'#tb' ,
		url:'<%=path %>/message/queryAll', 
		method:'get', 
		rownumbers:true,
		singleSelect:true,
		autoRowHeight: true,
		pagination:true,
		border:false,
		pageSize:20">
		<thead>
			<tr>
				<th  data-options="field:'id',checkbox:'true'" width="100">ID</th>
				<th data-options="field:'name'" width="100">名称</th>
				<th data-options="field:'message'"  width="100">消息</th>
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding:10px;">
		<a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="add();">添加</a>
		<a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="edit();">修改</a>
		<a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="rem();">删除</a>
	</div>
	<div id="menu" class="easyui-menu" style="width: 120px;">
		<div id="new" data-options="name:'new'">New</div>
		<div id="save" data-options="name:'save',iconCls:'icon-save'">Save</div>
		<div id="print" data-options="name:'print',iconCls:'icon-print'">Print</div>
		<div class="menu-sep"></div>
		<div data-options="name:'exit'">Exit</div>
	</div>
	<div id ="editWin" class="easyui-window" title="修改消息" data-options="iconCls:'icon-edit', closable:true, closed:true"  style="width:300px;height:200px;padding:20px;">
		<form id="editForm" enctype="multipart/form-data">
			<table>
				<tr>
				<td>编号</td>
				<td>
					<input class="textbox" name="id" readonly>
				</td>
				</tr>
				<tr>
				<td>名字</td>
				<td>
					<input class="easyui-validatebox textbox" name="name" data-options="required:true">
				</td>
				</tr>
				<tr>
				<td>消息</td>
				<td>
					<textarea  class="easyui-validatebox  textbox" name="message" data-options="required:true" rows="5" cols="22"></textarea>
				</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="button" onclick="doEdit();" value="确认" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id ="addWin" class="easyui-window" title="添加消息" data-options="iconCls:'icon-add', closable:true, closed:true"  style="width:300px;height:200px;padding:20px;">
		<form id="addForm" enctype="multipart/form-data">
			<table>
				<tr>
				<td>名字</td>
				<td>
					<input  class="easyui-validatebox textbox" name="name" data-options="required:true" style="border: none;">
				</td>
				</tr>
				<tr>
				<td>消息</td>
				<td>
				<textarea  class="easyui-validatebox  textbox" name="message" data-options="required:true" style="border: none;" rows="5" cols="22"></textarea>
				</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="button" onclick="doAdd();" value="确认" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>