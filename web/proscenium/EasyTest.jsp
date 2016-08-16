<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% 
	String	path = request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HTOA</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui-1.4.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui-1.4.5/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
<script src="<%=path%>/js/jquery-3.0.0.js"></script>
<script src="<%=path%>/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script src="<%=path%>/jquery-easyui-1.4.5/locale/easyui-lang-zh_CN.js"></script>
<script>
	$(function(){
		$("#img-1").draggable();
		$("#img-2").draggable({
			proxy:'clone'
		});
		$("#img-3").draggable({
				 proxy:function(source){
				        var p = $('<div class="proxy">proxy</div>');
				        p.appendTo('body');
				        return p;
				    }
		});
		$("#img-4").draggable({
			revert:true,
		    proxy:'clone',
		    onStartDrag:function(){
		        $(this).draggable('options').cursor = 'not-allowed';
		        $(this).draggable('proxy').css('z-index',10);
		    },
		    onStopDrag:function(){
		        $(this).draggable('options').cursor='move';
		    }
		});
	})
	function AddMsg(title,url){
		if($("#tabs").tabs("exists",title)){
			$("#tabs").tabs("select",title);
		}else{
			$("#tabs").tabs("add",{
				title: title,
				content: tabsContent(url),
				border: false,
				closable:true
			})
		}
	}
	function tabsContent(url){
		return '<iframe scrolling="true" frameborder="0" src="' + url + '" style="width:100%;height:100%;"></iframe>'; 
	}
</script>
</head>
<body class="easyui-layout body">
	<div data-options="region:'north'" style="height:120px;">
		<img alt="100x100"  class ="img-circle" id = "tx" src="<%=path%>/img/head.jpg" />
		
		<div id ="user">
			欢迎你: 罗刹! <a href="#"	>退出</a>		
		</div>
		<p style="clear:both;"></p>
	</div>
	<div data-options="region:'west',split:true" title="菜单" style="width:140px;">
		<div class="easyui-accordion" style="width:100%;border:0px;">
		<div data-options="title:'',iconCls:'icon-edit'" style="overflow:auto;"></div>
			<div data-options="title:'用户管理',iconCls:'icon-edit'" style="overflow:auto;padding:10px;">
				<ul class="easyui-tree">
					<li>
						<span>R:</span>
						<ul>
									<li data-options="state:'closed'"><!-- 默认未展开 -->
										<span>Photos</span>
										<ul>
											<li>
												<span>Friend</span>
											</li>
											<li>
												<span>Wife</span>
											</li>
											<li>
												<span>Company</span>
											</li>
										</ul>
									</li>
									<li>
										<span>Program Files</span>
										<ul>
											<li>Intel</li>
											<li>Java</li>
											<li>Microsoft Office</li>
											<li>Games</li>
										</ul>
									</li>
									<li>index.html</li>
									<li>about.html</li>
									<li>welcome.html</li>
								</ul>
					</li>
				</ul>
			</div>
			<div data-options="title:'消息管理',iconCls:'icon-edit'" style="overflow:auto;padding:10px;">
				<p><a href="javascript:;" onclick="AddMsg('产品列表','tabs.jsp');">产品列表</a></p>
			</div>
		</div>
	</div>
	<div data-options="region:'center',iconCls:'icon-ok'"  style="border:0px;">
		<div id="tabs" class="easyui-tabs" style="height:100%;">
			<div title="主页" style="padding:10px;">
					<img src ="<%=path %>/img/Stick_36.jpg" id ="img-1" />
					<img src ="<%=path %>/img/Stick_37.jpg" id ="img-2" />
					<img src ="<%=path %>/img/Stick_38.jpg" id ="img-3" />
					<img src ="<%=path %>/img/Stick_36.jpg" id ="img-4" />
					<img src ="<%=path %>/img/Stick_37.jpg" id ="img-5" />
					<img src ="<%=path %>/img/Stick_38.jpg" id ="img-6" />
					<div  id="btn">
					  <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" >Cancel</a>
					  <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'" >Refresh</a>
					  <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" >Query</a>
					  <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-print'" >Print</a>
					  <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-help'" >&nbsp;</a>
					  <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'" ></a>
					  <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-back'" ></a>
					  <a href="#" class="easyui-linkbutton" >text-button</a> 				
					</div>
					<div>
						<form enctype="multipart/form-data">
							<p>价格:<input class="easyui-validatebox easyui-numberbox" name="price" data-options="required:true,precision:0"></p>
							<p>生产日期:<input class="easyui-datetimebox" value="10/11/2012 2:3:56" style="width:200px"></p>
							<p>
									种类:<select class="easyui-combobox" name="state" style="width:200px;">
										<option value="AL">Alabama</option>
										<option value="AK">Alaska</option>
									</select>				
							</p>
							<p>上传图片:<input class="easyui-filebox" name="img" data-options="prompt:'请选择一个图片'"></p>
						</form>
					</div>
			</div>
		</div>
	</div>
	<div data-options="region:'south',split:false" style="height:100px;">
		<p style="text-align: center; margin-top: 10px;">纯属娱乐,翻版随便! 如有雷同,你TM来打我!</p>
	</div>
</body>
</html>