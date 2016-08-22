/**
 * Created by GMB on 2016/8/21.
 */
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
