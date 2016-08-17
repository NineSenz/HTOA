<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/15 0015
  Time: 14:19
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
    <title>easyui测试</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-3.1.0/jquery-easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-3.1.0/jquery-easyui/themes/icon.css">
    <script type="text/javascript" src="<%=path %>/js/jquery-3.1.0/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path %>/js/jquery-3.1.0/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=path %>/js/jquery-3.1.0/jquery-easyui/jquery.easyui.min.js"></script>
    <style>
        *{
            margin:0px;
            padding: 0px;
        }
        body {
            width: 100%;
            height: 100%;
            margin:0px;
            padding: 0px;
        }
        .left01 p{
            text-align: center;
            color: #ffab3f;
            margin-bottom: 10px;
            font-size: 30px;
        }
        .img1{
            margin-left: 15px;
        }
        a:link {
            font-size:16px;
            text-decoration: none;
        }
        a:visited{
            color:#ccccff;
            font-size:16px;|font-family:'华文隶书';
            text-decoration: none;
        }
        a:active{
            color:#99ffff;
            font-size:18px;
            text-decoration: none;
        }
        a:hover{
            color:#ff33ff;
            font-size:20px;
            text-decoration: none;
        }
    </style>
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
<div data-options="region:'north'" style="height: 10%;">
    <img class="img1" src="<%=path %>/img/logo1.png" >
    <div style="float:right; margin-right: 30px;">晚上好！ <a href="#">安全退出</a></div>
    <marquee behavior="alternate" width="70%" scrollamount="13">
        <p align="center"><font color="#ff33ff" size="6" face="华文行楷"></font>
            <img src="image/xr.gif">&nbsp;&nbsp;2组人员全体加班3天&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <img src="image/xr.gif"></p>
    </marquee>
</div>

<div data-options="region:'west',split:true" title="&nbsp;宏图Htt" style="width:10%;">
    <div class="easyui-accordion" style="width:100%;border:0px;">
        <div data-options="title:'&nbsp;&nbsp;&nbsp;部门管理', iconCls:'icon-edit'" class="left01" style="overflow:auto;padding:10px;">
            <%--<ul class="easyui-tree">
                <li>
                    <span>lIKE</span>
                    <ul>
                        <li data-options="state:'closed'">
                            <span>    宏图</span>
                            <ul>
                                <li>
                                    <span>htt</span>
                                </li>

                            </ul>
                        </li>
                        <li>
                            <span>iEAM</span>
                            <ui>
                        <li>C++</li>
                        <li>SQL2005</li>
                        <li>JAVA</li>
                        <li>JSP</li>
                        </ui>
                        </li>
                        <li>index.html</li>
                        <li>about.html</li>
                        <li>welcome.html</li>
                    </ul>
                </li>
            </ul>--%>
            <p><a href="javascript:;" onclick="addTab('管理员', '<%=path%>/ui/guanli.jsp')">管理员</a></p>
            <p><a href="javascript:;" onclick="addTab('部门管理', '<%=path%>/ui/bumen.jsp')">部门管理</a></p>
            <p><a href="javascript:;" onclick="addTab('正式学员', 'products.jsp')">正式学员</a></p>
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
        <div title="&nbsp;&nbsp;&nbsp;&nbsp;财务" data-options="iconCls:'icon-edit'" style="overflow:auto;padding:10px;">
            <p><a href="javascript:;" onclick="addTab('收入', 'products.jsp')">收入</a></p>
            <p><a href="javascript:;" onclick="addTab('支出', 'products.jsp')">支出</a></p>
        </div>
        <div title="&nbsp;&nbsp;&nbsp;&nbsp;行政" data-options="iconCls:'icon-edit'" style="overflow:auto;padding:10px;">
            <p><a href="javascript:;" onclick="addTab('产品列表', 'products.jsp')">产品列表</a></p>
            <p><a href="javascript:;" onclick="addTab('产品列表', 'products.jsp')">产品列表</a></p>
            <p><a href="javascript:;" onclick="addTab('产品列表', 'products.jsp')">产品列表</a></p>
        </div>
        <div title="&nbsp;&nbsp;&nbsp;&nbsp;后勤" data-options="iconCls:'icon-edit'" style="overflow:auto;padding:10px;">
            <p><a href="javascript:;" onclick="addTab('暂无', 'products.jsp')">暂无</a></p>
        </div>
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
    <a style="margin-left: 70%;color:#ff33ff;font-size:26px;">版权所有&copy;宏图软件学院</a>
</div>
</body>
</html>