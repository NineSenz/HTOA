<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/15 0015
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/htoa/css/style.css"/>
    <script type="text/javascript" src="<%=path %>/htoa/js/jquery-3.0.0.min.js"></script>
    <script type="text/javascript" src="<%=path %>/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=path %>/jquery-easyui/jquery.easyui.min.js"></script>

    <script>

        function setPagination(tableId) {
            var p = $("#" + tableId).datagrid("getPager"); // 获取由tableId指定的datagrid控件的分页组件
            $(p).pagination({
                pageList:[10, 15, 20],
                beforePageText:"第",
                afterPageText:"页    共{pages}页",
                displayMsg:"当前显示{from} - {to} 条记录    共{total}条记录",
                onBeforeRefresh:function() {
                    $(this).pagination("loading");
                    $(this).pagination("loaded");
                }
            });
        }

        $(function() {
            setPagination("list");
        });

        function edit() {
            var row = $("#list").datagrid("getSelected"); // 获取datagrid中被选中的行
            if (row) {
                $("#editForm").form("load", row);
                $("#editWin").window("open");
            } else {
                $.messager.alert('提示', '请选中需要修改的管理', 'info');// messager消息控件
            }
        }



        function doEdit() {
            if ($("#editForm").form("validate")) { // 验证整个表单里的所有validatabox是否通过验证
                $.post('<%=path%>/department/update', $("#editForm").serialize())
            }
            $("#editWin").window("close");
            $("#editForm").form("clear");
            $("#list").datagrid("reload");
        }
        function add() {
            $("#addWin").window("open");
        }

        function doAdd(){

            if($("#addForm").form("validate")){
                $.post('<%=path%>/department/save',$("#addForm").serialize());
                $("#addWin").window("close");
                $("#addForm").form("clear");
                $("#list").datagrid("reload");
            }
            $("#list").datagrid("reload");
        }
        function removePro(){
            var row = $("#list").datagrid("getSelected"); // 获取datagrid中被选中的行

            if (row) {
                $.post('<%=path%>/department/delete', {'id': row.t_dep_id});
                $("#list").datagrid("reload");
            } else {
                $.messager.alert('提示', '请选中需要删除的管理', 'info');// messager消息控件
            }
            $("#list").datagrid("reload");
        }
    </script>

</head>
<body>
<table id="list" class="easyui-datagrid" toolbar="#tb" data-options="
		url:'<%=path %>/department/queryByPager',
		method:'get',
		rownumbers:true,
		singleSelect:true,
		autoRowHeight: true,
		pagination:true,
		border:false,
		pageSize:10">
    <thead>
    <tr>
        <th data-options="field:'t_dep_id',checkbox:true"width="100">管理编号</th>
        <th field="t_dep_name" width="100">部门名称</th>
        <th field="t_dep_status"  width="100">部门状态</th>
        <th field="t_dep_createtime"  width="120">创建时间</th>
        <th field="t_dep_admname"  width="100">管理员</th>
    </tr>
    </thead>
</table>
<div id="tb" style="padding:10px;">
    <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="add();">添加</a>
    <!-- 链接按钮控件 -->
    <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="edit();">修改</a>
    <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="removePro();">移除</a>
</div>

<div id="addWin" class="easyui-window" title="添加部门" data-options="iconCle:'icon-edit',closable:true, closed:true" style="width:300px;height:200px;padding:5px;">
    <form id="addForm" enctype="multipart/form-data">
        <table>

            <tr>
                <td>部门名称</td>
                <td>
                    <input class="easyui-validatebox textbox" name="t_department.t_dep_name" data-options="required:true, novalidate:true" />
                </td>
            </tr>
            <tr>
                <td>部门状态</td>
                <td>
                    <input class="easyui-validatebox textbox" name="t_department.t_dep_status" data-options="required:true, novalidate:true"/>
                </td>
            </tr>

            <tr>
                <td>管理员</td>
                <td>
                    <input class="easyui-validatebox textbox" name="t_department.t_dep_admid" data-options="required:true, novalidate:true"/>
                </td>
            </tr>
            <tr>
                <td>管理员姓名</td>
                <td>
                    <input class="easyui-validatebox textbox" name="t_department.t_dep_admname" data-options="required:true, novalidate:true"/>
                </td>
            </tr>

            <tr>
                <td></td>
                <td>
                    <input type="button" value="确认" onclick="doAdd();" />
                </td>
            </tr>
        </table>
    </form>
</div>
<div id="editWin" class="easyui-window" title="修改部门" data-options="iconCls:'icon-edit', closable:true, closed:true"  style="width:300px;height:200px;padding:5px;">
        <form id="editForm" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>部门编号</td>
                    <td>
                        <input class="textbox" name="t_dep_id" readonly />
                    </td>
                </tr>
                <tr>
                    <td>部门名称</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_department.t_dep_name" data-options="required:true, novalidate:true" />
                    </td>
                </tr>
                <tr>
                    <td>部门状态</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_department.t_dep_status" data-options="required:true, novalidate:true"/>
                    </td>
                </tr>

                <tr>
                    <td>管理员</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_department.t_dep_admid" data-options="required:true, novalidate:true"/>
                    </td>
                </tr>
                <tr>
                    <td>管理员姓名</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_department.t_dep_admname" data-options="required:true, novalidate:true"/>
                    </td>
                </tr>

                <tr>
                    <td></td>
                    <td>
                        <input type="button" value="确认" onclick="doEdit();" />
                    </td>
                </tr>
            </table>
        </form>
        </table>
    </form>
</div>
</body>
</html>
