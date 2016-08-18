<%--
  Created by IntelliJ IDEA.
  User: GMB
  Date: 2016/8/18
  Time: 下午 02:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/themes/metro/easyui.css" id="swicth-style">
    <link rel="stylesheet" type="text/css" href="<%=path %>/htoa/css/icon.css" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/htoa/css/style.css" />
    <script type="text/javascript" src="<%=path %>/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="<%=path %>/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        function addTab(title, url,iconCls){
            if ($('#tabs').tabs('exists', title)){
                $('#tabs').tabs('select', title);//选中并刷新
                var currTab = $('#tabs').tabs('getSelected');
                var url = $(currTab.panel('options').content).attr('src');
                if(url != undefined && currTab.panel('options').title != 'Home') {
                    $('#tabs').tabs('update',{
                        tab:currTab,
                        options:{
                            content:createFrame(url)
                        }
                    })
                }
            } else {
                var content = createFrame(url);
                $('#tabs').tabs('add',{
                    iconCls:iconCls,
                    title:title,
                    content:content,
                    closable:true
                });
            }
            tabClose();
        }
        function createFrame(url) {
            var s = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
            return s;
        }

        function tabClose() {
            /*双击关闭TAB选项卡*/
            $(".tabs-inner").dblclick(function(){
                var subtitle = $(this).children(".tabs-closable").text();
                $('#tabs').tabs('close',subtitle);
            })
            /*为选项卡绑定右键*/
            $(".tabs-inner").bind('contextmenu',function(e){
                $('#mm').menu('show', {
                    left: e.pageX,
                    top: e.pageY
                });

                var subtitle =$(this).children(".tabs-closable").text();

                $('#mm').data("currtab",subtitle);
                $('#tabs').tabs('select',subtitle);
                return false;
            });
        }
        //绑定右键菜单事件
        function tabCloseEven() {
            //刷新
            $('#mm-tabupdate').click(function(){
                var currTab = $('#tabs').tabs('getSelected');
                var url = $(currTab.panel('options').content).attr('src');
                if(url != undefined && currTab.panel('options').title != 'Home') {
                    $('#tabs').tabs('update',{
                        tab:currTab,
                        options:{
                            content:createFrame(url)
                        }
                    })
                }
            })
            //关闭当前
            $('#mm-tabclose').click(function(){
                var currtab_title = $('#mm').data("currtab");
                $('#tabs').tabs('close',currtab_title);
            })
            //全部关闭
            $('#mm-tabcloseall').click(function(){
                $('.tabs-inner span').each(function(i,n){
                    var t = $(n).text();
                    if(t != 'Home') {
                        $('#tabs').tabs('close',t);
                    }
                });
            });
            //关闭除当前之外的TAB
            $('#mm-tabcloseother').click(function(){
                var prevall = $('.tabs-selected').prevAll();
                var nextall = $('.tabs-selected').nextAll();
                if(prevall.length>0){
                    prevall.each(function(i,n){
                        var t=$('a:eq(0) span',$(n)).text();
                        if(t != 'Home') {
                            $('#tabs').tabs('close',t);
                        }
                    });
                }
                if(nextall.length>0) {
                    nextall.each(function(i,n){
                        var t=$('a:eq(0) span',$(n)).text();
                        if(t != 'Home') {
                            $('#tabs').tabs('close',t);
                        }
                    });
                }
                return false;
            });
            //关闭当前右侧的TAB
            $('#mm-tabcloseright').click(function(){
                var nextall = $('.tabs-selected').nextAll();
                if(nextall.length==0){
                    //msgShow('系统提示','后边没有啦~~','error');
                    alert('后边没有啦~~');
                    return false;
                }
                nextall.each(function(i,n){
                    var t=$('a:eq(0) span',$(n)).text();
                    $('#tabs').tabs('close',t);
                });
                return false;
            });
            //关闭当前左侧的TAB
            $('#mm-tabcloseleft').click(function(){
                var prevall = $('.tabs-selected').prevAll();
                if(prevall.length==0){
                    alert('到头了，前边没有啦~~');
                    return false;
                }
                prevall.each(function(i,n){
                    var t=$('a:eq(0) span',$(n)).text();
                    $('#tabs').tabs('close',t);
                });
                return false;
            });

            //退出
            $("#mm-exit").click(function(){
                $('#mm').menu('hide');
            })
        }

        $(function() {
            tabCloseEven();

            $('.cs-navi-tab').click(function() {
                var $this = $(this);
                var href = $this.attr('src');
                var title = $this.text();
                var iconCls = $(this).attr('data-icon');
                addTab(title, href,iconCls);
            });

            var themes = {
                'gray' : 'themes/gray/easyui.css',
                'black' : 'themes/black/easyui.css',
                'bootstrap' : 'themes/bootstrap/easyui.css',
                'default' : 'themes/default/easyui.css',
                'metro' : 'themes/metro/easyui.css'
            };

            var skins = $('.li-skinitem span').click(function() {
                var $this = $(this);
                if($this.hasClass('cs-skin-on')) return;
                skins.removeClass('cs-skin-on');
                $this.addClass('cs-skin-on');
                var skin = $this.attr('rel');
                $('#swicth-style').attr('href', themes[skin]);
                setCookie('cs-skin', skin);
                skin == 'dark-hive' ? $('.cs-north-logo').css('color', '#FFFFFF') : $('.cs-north-logo').css('color', '#000000');
            });

            if(getCookie('cs-skin')) {
                var skin = getCookie('cs-skin');
                $('#swicth-style').attr('href', themes[skin]);
                $this = $('.li-skinitem span[rel='+skin+']');
                $this.addClass('cs-skin-on');
                skin == 'dark-hive' ? $('.cs-north-logo').css('color', '#FFFFFF') : $('.cs-north-logo').css('color', '#000000');
            }
        });


        function setCookie(name,value) {//两个参数，一个是cookie的名子，一个是值
            var Days = 30; //此 cookie 将被保存 30 天
            var exp = new Date();    //new Date("December 31, 9998");
            exp.setTime(exp.getTime() + Days*24*60*60*1000);
            document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
        }

        function getCookie(name) {//取cookies函数
            var arr = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));
            if(arr != null) return unescape(arr[2]); return null;
        }
    </script>
</head>
<body class="easyui-layout">
<div region="north" border="true" class="cs-north">
    <div class="cs-north-bg">
        <div class="cs-north-logo" style="float:left;">宏图软件OA系统</div>
        <ul class="ui-skin-nav" style="float:left;margin-left:35%;">
            <li class="li-skinitem" title="gray"><span class="gray" rel="gray"></span></li>
            <li class="li-skinitem" title="default"><span class="default" rel="default"></span></li>
            <li class="li-skinitem" title="bootstrap"><span class="bootstrap" rel="bootstrap"></span></li>
            <li class="li-skinitem" title="black"><span class="black" rel="black"></span></li>
            <li class="li-skinitem" title="metro"><span class="metro" rel="metro"></span></li>
        </ul>
        <div class="cs-north-right" style="float:right;">
            <p style="margin-bottom:0px;height:15px;margin-right:20px;"><strong class="easyui-tooltip" title="2条未读消息">admin</strong>，欢迎您！</p>
            <p style="margin-bottom:0px;height:15px;"><a href="#">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="#">安全退出</a></p>
        </div>
        <p style="clear:both"></p>
    </div>
</div>
<div region="west" border="true" split="true" title="Navigation" class="cs-west">
    <div class="easyui-accordion" fit="true" border="false">
        <div title="快捷菜单" data-options="iconCls:'icon-application-cascade'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-chart-organisation">菜单导航</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-users">用户管理</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-user-group">角色管理</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-book">数据字典</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-cog">系统参数</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-application-osx-error">操作日志</a></li>
            </ul>
        </div>
        <div title="内容管理" data-options="iconCls:'icon-application-form-edit'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-chart-organisation">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-users">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-user-group">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-book">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-cog">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-application-osx-error">导航标题</a></li>
            </ul>
        </div>
        <div title="商品管理" data-options="iconCls:'icon-creditcards'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-chart-organisation">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-users">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-user-group">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-book">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-cog">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-application-osx-error">导航标题</a></li>
            </ul>
        </div>
        <div title="订单管理" data-options="iconCls:'icon-cart'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-chart-organisation">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-users">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-user-group">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-book">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-cog">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-application-osx-error">导航标题</a></li>
            </ul>
        </div>
        <div title="广告管理" data-options="iconCls:'icon-bricks'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-chart-organisation">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-users">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-user-group">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-book">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-cog">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-application-osx-error">导航标题</a></li>
            </ul>
        </div>
        <div title="报表中心" data-options="iconCls:'icon-chart-curve'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-chart-organisation">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-users">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-user-group">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-book">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-cog">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-application-osx-error">导航标题</a></li>
            </ul>
        </div>
        <div title="系统设置" data-options="iconCls:'icon-wrench'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-chart-organisation">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-users">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-user-group">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-book">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-cog">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" class="cs-navi-tab" src="#" data-icon="icon-application-osx-error">导航标题</a></li>
            </ul>
        </div>
    </div>
</div>
<div id="mainPanle" region="center" border="true" border="false">
    <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
        <div title="Home" data-options="closable:false,iconCls:'icon-tip'">
            <div class="cs-home-remark">
                <h1>HTOA办公系统</h1> <br>
                制作：高铭波 <br>
                博客：<a href="http://www.cnblogs.com/purediy" target="_blank">http://www.cnblogs.com/purediy</a><br>
                说明：纯属娱乐,翻版不究。
            </div>
        </div>
    </div>
</div>

<div region="south" border="false" id="south"><center>@3140378543@qq.com</center></div>

<div id="mm" class="easyui-menu cs-tab-menu">
    <div id="mm-tabupdate">刷新</div>
    <div class="menu-sep"></div>
    <div id="mm-tabclose">关闭</div>
    <div id="mm-tabcloseother">关闭其他</div>
    <div id="mm-tabcloseall">关闭全部</div>
</div>
</body>
</html>
