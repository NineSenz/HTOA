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
    <script type="text/javascript" src="<%=path %>/jquery.min.js"></script>
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
                        '<%=path%>/test/update',
                        $("#editForm").serialize(),
                        function(data){
                            if(data.result.result == 'success'){
                                $.messager.alert("提示",data.result.msg,"info",function(){
                                    $("#editWin").window("close");
                                    $("#list").datagrid("reload");
                                });
                            }else{
                                $.messger.alert("提示",data.result.msg+"请稍后再试","info");
                            }
                        },'json')
            }
        }
        function add() {
            $("#addWin").window("open");
        }

        function doAdd(){

            if($("#addForm").form("validate")){
                $.post('<%=path%>/test/save',$("#addForm").serialize(),
                    function(data) {

                        if (data.result.result == 'success') {
                            $.messager.alert("提示", data.result.msg, "info", function() {
                                $("#addWin").window("close");
                                $("#list").datagrid("reload");
                                $("#addForm").form("clear");
                            });
                        } else {
                            $.messager.alert("提示",data.result.msg,"info");
                        }
                    },'json')
            }
        }
        function removePro(){
            var row = $("#list").datagrid("getSelected");
            if(row){
                $.post(
                        '<%=path%>/test/remove',{'id':row.id},function(data){
                            if(data.result.result == 'success'){
                                $.messager.alert("提示",data.result.msg,"info",function(){
                                    $("#list").datagrid("reload");
                                });
                            }
                        },'json');
            }else{
                $.messager.alert("提示","请选择要移除的管理","info");
            }
        }
    </script>
</head>
<body>
    <table id="list" class="easyui-datagrid" toolbar="#tb" data-options="
            url:'<%=path %>/test/pagerList',
            method:'get',
            rownumbers:true,
            singleSelect:true,
            autoRowHeight: true,
            pagination:true,
            border:false,
            pageSize:10">
        <thead>
        <tr>
            <th  data-options="field:'id',checkbox:true" width="100">编号</th>
            <th field="name" width="100">姓名</th>
            <th field="money"  width="100">票子</th>
            <th field="birth"  width="100">生日</th>
        </tr>
        </thead>
    </table>
    <div id="tb" style="padding:10px;">
        <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-basket-add'" onclick="add();">添加</a>
        <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-basket-edit'" onclick="edit();">修改</a>
        <a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-basket-delete'" onclick="removePro();">移除</a>
    </div>

    <div id="addWin" class="easyui-window" title="添加管理员" data-options="iconCle:'icon-monitor-edit',closable:true, closed:true" style="width:300px;height:200px;padding:5px;">
        <form id="addForm" enctype="multipart/form-data" style="text-align: center; margin-left: 25px;">
            <table>
                <tr>
                    <td>编号</td>
                    <td>
                        <input class="textbox" name="test.id" readonly />
                    </td>
                </tr>
                <tr>
                    <td>姓名</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="test.name" data-options="required:true, novalidate:true" />
                    </td>
                </tr>
                <tr>
                    <td>票子</td>
                    <td>
                        <input class="easyui-validatebox easyui-numberbox" name="test.money" data-options="required:true, novalidate:true"/>
                    </td>
                </tr>
                <tr>
                    <td>生日</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="test.birth" data-options="required:true, novalidate:true"/>
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
        <form id="editForm" enctype="multipart/form-data" style="text-align: center; margin-left: 25px;">
            <table>
                <tr>
                        <input type="hidden"  name="id" />

                </tr>
                <tr>
                    <td>姓名</td>
                    <td>
                        <input class="easyui-validatebox textbox" name="name" data-options="required:true, novalidate:true" />
                    </td>
                </tr>
                <tr>
                    <td>票子</td>
                    <td>
                        <input class="easyui-validatebox easyui-numberbox" name="money" data-options="required:true, novalidate:true, precision:2"/>
                    </td>
                </tr>
                <tr>
                    <td>生日</td>
                    <td>
                        <input class="easyui-datetimebox" value="1/5/2016 2:3:56" name="birth" />
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
    </div>
</body>
</html>
