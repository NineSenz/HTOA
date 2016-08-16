<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/13 0013
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>about</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!-- css -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/fancybox/jquery.fancybox.css" rel="stylesheet">
    <link href="css/jcarousel.css" rel="stylesheet" />
    <link href="css/flexslider.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet" />

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>
<div id="wrapper">

    <!-- start header -->
    <header>
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><img src="img/logo.png" alt="logo"/></a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">首页</a></li>
                        <li class="active"><a href="about.jsp">专家师资</a></li>
                        <li><a href="services.jsp">就业明星</a></li>
                        <li><a href="courses.jsp">校外活动</a></li>
                        <li><a href="pricing.jsp">学校课程</a></li>
                        <li><a href="contact.jsp">点击登录</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header><!-- end header -->
    <section id="inner-headline">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="pageTitle">师资力量</h2>
                </div>
            </div>
        </div>
    </section>
    <section id="content">
        <div class="container">

            <div class="about">

                <div class="row">
                    <div class="col-md-12">
                        <div class="about-logo">
                            <h3>精英师资</h3>
                            <p>我们的老师是由具有五年以上项目经验，曾在大型国际软件公司担任过高级工程师、项目经理、架构设计师等重要职位的一线高水平工程师,将他们掌握的最新技术和丰富工程实践经验，经过精心组织后，由浅入深、循序渐进的传授给学员，使学员的技术能力和工程实战经验得到快速的提升...</p>
                        </div>
                        <a href="#" class="btn btn-color">查看全文</a>
                    </div>
                </div>

                <hr>
                <br>

                <div class="row">
                    <div class="col-md-4">
                        <!-- Heading and para -->
                        <div class="block-heading-two">
                            <h3><span>我们宗旨</span></h3>
                        </div>
                        <p>  从培养一流的国际化IT人才出发,赣州宏图科技软件工程师实训不仅面向国内外吸纳具有国际技术背景的高端IT精英,还诚邀长期工作在知名公司一线,具有丰富项目成功经验的技术专家加盟,所有教师均有五年以上项目实战经验，并具有在知名机构授课经验或进行授课技能的培训考核，全力打造业内最强大的高水平教师培训团队</p>
                    </div>
                    <div class="col-md-4">
                        <div class="block-heading-two">
                            <h3><span>教师信息</span></h3>
                        </div>
                        <!-- Accordion starts -->
                        <div class="panel-group" id="accordion-alt3">
                            <!-- Panel. Use "panel-XXX" class for different colors. Replace "XXX" with color. -->
                            <div class="panel">
                                <!-- Panel heading -->
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3" href="#collapseOne-alt3">
                                            <i class="fa fa-angle-right"></i> 廖校长
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseOne-alt3" class="panel-collapse collapse">
                                    <!-- Panel body -->
                                    <div class="panel-body">
                                       宏图学院副校长
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3" href="#collapseTwo-alt3">
                                            <i class="fa fa-angle-right"></i> 陈老师
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseTwo-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        宏图经理
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3" href="#collapseThree-alt3">
                                            <i class="fa fa-angle-right"></i> 李主任
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseThree-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        教务主任
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3" href="#collapseFour-alt3">
                                            <i class="fa fa-angle-right"></i> 何老师
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseFour-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        宏图班主任
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Accordion ends -->

                    </div>

                    <div class="col-md-4">

                        <h3>让优秀的企业找到优秀的你</h3>
                        <ul class="list2">
                            <li><a href="#">1000家知名企业在等你</a></li>
                            <li><a href="#">美好的未来在等你</a></li>
                            <li><a href="#">80万师兄在等你</a></li>
                            <li><a href="#">Come on我在这里等你</a></li>
                            <li><a href="#">遇见宏图，展翅飞翔</a></li>
                            <li><a href="#">梦想还是要有的，有梦想才有未来</a></li>
                        </ul>
                    </div>

                </div>



                <br>
                <!-- Our Team starts -->

                <!-- Heading -->
                <div class="block-heading-six">
                    <h4 class="bg-color">金牌讲师</h4>
                </div>
                <br>

                <!-- Our team starts -->

                <div class="team-six">
                    <div class="row">
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="img/qiu.JPG" alt="">
                                <!-- Name -->
                                <h4>邱老师</h4>
                                <span class="deg"><strong>学历:江西理工大学计算机硕士</strong></span>
                                <p>专业特长：Sun国际认证高级工程师，OCP认证数据库工程师</p>
                                <p>五年软件项目开发经验。精通JAVA EE平台及开源框架技术，对搜索引擎有深入研究</p>
                                <p>熟悉Unix/Linux操作系统，精通软件项目管理和软件测试技术.</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="img/guan.JPG" alt="">
                                <!-- Name -->
                                <h4>关老师</h4>
                                <span class="deg"><strong>学历：江西理工毕业</strong></span>
                                <p>职业规划师就业指导师具备大型企业人力资源规划经历。</p>
                                <p>中国蚂蚁营销核心成员 </p>
                                <p>中国中小型企业协会培训讲师</p>
                                <p>太平人寿赣州培训讲师</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="img/liu.JPG" alt="">
                                <!-- Name -->
                                <h4>刘老师</h4>
                                <span class="deg"><strong>学历：上海交通大学毕业</strong></span>
                                <p>国家一级培训师</p>
                                <p>香港中文大学讲师</p>
                                <p>中国教育协会讲师</p>
                                <p>八年职业经理人经验</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="img/zeng.JPG" alt="">
                                <!-- Name -->
                                <h4>曾老师</h4>
                                <span class="deg"><strong>学历：赣南师院毕业</strong></span>
                                <p>三年大型国企人力资源管理经验</p>
                                <p>江西中小企业协会培训素质拓展培训讲师</p>
                                <p>赣州市商业银行客户关系管理系统等大型应用系统的设计与开发。</p>
                                <p>八年职业经理人经验</p>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Our team ends -->


            </div>

        </div>
    </section>
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">关于我们</h5>
                        <address>
                            <strong>名师团队</strong><br>
                            新闻动态<br>
                            企业合作</address>
                        <p>
                            <i class="icon-phone"></i> (123) 456-789 - 1255-12584 <br>
                            <i class="icon-envelope-alt"></i> E-mail：gzhongtu@163.com
                        </p>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">资源下载</h5>
                        <ul class="link-list">
                            <li><a href="#">视频下载</a></li>
                            <li><a href="#">资料下载</a></li>
                            <li><a href="#">工具下载</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">加入我们</h5>
                        <ul class="link-list">
                            <li><a href="#">招聘岗位</a></li>
                            <li><a href="#">岗位介绍</a></li>
                            <li><a href="#">招贤纳师</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">联系我们</h5>
                        <ul class="link-list">
                            <li><a href="#">电话：15083587088</a></li>
                            <li><a href="#">邮箱：info@hongtu.com</a></li>
                            <li><a href="#">地址:赣州市沙石镇楼梯岭88号赣州技师学院办公大楼3楼 或 高校区江西应用技术学院实训楼 </a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div id="sub-footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="copyright">
                            <p>
                                Copyright &copy; 2016.赣州宏图软件所有
                            </p>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <ul class="social-network">
                            <li><a href="#" data-placement="top" title="Facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest"></i></a></li>
                            <li><a href="#" data-placement="top" title="Google plus"><i class="fa fa-google-plus"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>
<!-- javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/jquery.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.fancybox.pack.js"></script>
<script src="js/jquery.fancybox-media.js"></script>
<script src="js/portfolio/jquery.quicksand.js"></script>
<script src="js/portfolio/setting.js"></script>
<script src="js/jquery.flexslider.js"></script>
<script src="js/animate.js"></script>
<script src="js/custom.js"></script>

</body>
</html>
