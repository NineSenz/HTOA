<%--
  Created by IntelliJ IDEA.
  User: GMB
  Date: 2016/8/19
  Time: 上午 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/htoa/css/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/htoa/css/style.css"/>
    <script type="text/javascript" src="<%=path %>/htoa/js/jquery-3.0.0.min.js"></script>
    <script type="text/javascript" src="<%=path %>/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=path %>/jquery.easyui.min.js"></script>
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
                $.post(
                        'product/update',
                        $("#editForm").serialize(),
                        function(data){
                            if(data.result == 'success'){
                                $.messager.alert("提示",data.msg,"info",function(){
                                    $("#editWin").window("close");
                                    $("#list").datagrid("reload");
                                });
                            }else{
                                $.messger.alert("提示",data.msg+"请稍后再试","info");
                            }
                        },"JSON")
            }
        }
        function add() {
            $("#addWin").window("open");
        }

        function doAdd(){

            if($("#addForm").form("validate")){
                $.post('<%=path%>/admin/save',$("#addForm").serialize());
                $("#addWin").window("close");
                $("#list").datagrid("reload");
                $("#addForm").form("clear");
            }
        }
        function removePro(){
            var row = $("#list").datagrid("getSelected");
            if(row){
                $.post(
                        'product/remove',{'id':row.id},function(data){
                            if(data.result == 'success'){
                                $.messager.alert("提示",data.msg,"info",function(){
                                    $("#list").datagrid("reload");
                                });
                            }
                        },"JSON");
            }else{
                $.messager.alert("提示","请选择要移除的管理","info");
            }
        }
    </script>
</head>
<body>
    <table id="list" class="easyui-datagrid" toolbar="#tb" data-options="
            url:'<%=path %>/admin/queryByPager',
            method:'get',
            rownumbers:true,
            singleSelect:true,
            autoRowHeight: true,
            pagination:true,
            border:false,
            pageSize:10">
        <thead>
        <tr>
            <th field="t_adm_id" width="100">管理编号</th>
            <th field="t_adm_name" width="100">姓名</th>
            <th field="t_adm_email"  width="100">邮箱</th>
            <th field="t_adm_pwd"  width="100">密码</th>
            <th field="t_adm_phone"  width="100">电话</th>
            <th field="t_adm_identity" width="100">管理部门</th>
        </tr>
        </thead>
    </table>
    <div id="tb" style="padding:10px;">
        <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-picture-add'" onclick="add();">添加</a>
        <!-- 链接按钮控件 -->
        <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-picture-edit'" onclick="edit();">修改</a>
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-picture-delete'" onclick="removePro();">移除</a>
    </div>

    <div id="addWin" class="easyui-window" title="添加管理员" data-options="iconCle:'icon-monitor-edit',closable:true, closed:true" style="width:300px;height:200px;padding:5px;">
        <form id="addForm" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>管理编号</td>
                    <td>
                        <input class="textbox" name="t_admin.t_adm_id"  />
                    </td>
                </tr>
                <tr>
                    <td>姓名</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_admin.t_adm_name" data-options="required:true, novalidate:true" />
                    </td>
                </tr>
                <tr>
                    <td>邮箱</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_admin.t_adm_email" data-options="required:true, novalidate:true"/>
                    </td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_admin.t_adm_pwd" data-options="required:true, novalidate:true"/>
                    </td>
                </tr>
                <tr>
                    <td>电话</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_admin.t_adm_phone" data-options="required:true, novalidate:true"/>
                    </td>
                </tr>
                <tr>
                    <td>管理部门</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="t_admin.t_adm_identity" data-options="required:true, novalidate:true"/>
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
    <div id="editWin" class="easyui-window" title="修改管理" data-options="iconCls:'icon-edit', closable:true, closed:true"  style="width:300px;height:200px;padding:5px;">
        <form id="editForm" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>管理编号</td>
                    <td>
                        <input class="textbox" name="id" readonly />
                    </td>
                </tr>
                <tr>
                    <td>姓名</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="name" data-options="required:true, novalidate:true" />
                    </td>
                </tr>
                <tr>
                    <td>邮箱</td>
                    <td>
                        <input class="easyui-validatebox easyui-numberbox" name="price" data-options="required:true, novalidate:true, precision:2"/>
                    </td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td>
                        <input class="easyui-validatebox easyui-numberbox" name="price" data-options="required:true, novalidate:true, precision:2"/>
                    </td>
                </tr>
                <tr>
                    <td>电话</td>
                    <td>
                        <input class="easyui-validatebox easyui-numberbox" name="price" data-options="required:true, novalidate:true, precision:2"/>
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
</body>
</html>
