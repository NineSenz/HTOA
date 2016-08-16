<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/13 0013
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />

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
                        <li><a href="about.jsp">专家师资</a></li>
                        <li class="active"><a href="services.jsp">就业明星</a></li>
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
                    <h2 class="pageTitle">就业龙虎榜</h2>
                </div>
            </div>
        </div>
    </section>
    <section id="content">
        <div class="container content">
            <!-- Service Blcoks -->
            <div class="row service-v1 margin-bottom-40">
                <div class="col-md-4 md-margin-bottom-40">
                    <img class="img-responsive" src="img/jy1.JPG" alt="">
                    <h2>姓名：姜*源</h2>
                    <h3>学历：本科</h3>
                    <h4>公司：淘宝网</h4>
                    <h4>月薪：8500</h4>
                </div>
                <div class="col-md-4">
                    <img class="img-responsive" src="img/jy2.JPG" alt="">
                    <h2>姓名：张*工</h2>
                    <h3>学历：大专</h3>
                    <h4>公司：深圳市新宇软件科技</h4>
                    <h4>月薪：8000</h4>
                </div>
                <div class="col-md-4 md-margin-bottom-40">
                    <img class="img-responsive" src="img/jy3.JPG" alt="">
                    <h2>姓名：刘*明</h2>
                    <h3>学历：本科</h3>
                    <h4>公司：上海市品高软件科技</h4>
                    <h4>月薪：7400</h4>
                </div>
            </div>
            <!-- End Service Blcoks -->

            <hr class="margin-bottom-50">

            <!-- Info Blcoks -->
            <div class="row">
                <div class="col-sm-4 info-blocks">
                    <i class="icon-info-blocks fa fa-bell-o"></i>
                    <div class="info-blocks-in">
                        <h3>Awesome Design</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt</p>
                    </div>
                </div>
                <div class="col-sm-4 info-blocks">
                    <i class="icon-info-blocks fa fa-hdd-o"></i>
                    <div class="info-blocks-in">
                        <h3>FontAwesome</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt</p>
                    </div>
                </div>
                <div class="col-sm-4 info-blocks">
                    <i class="icon-info-blocks fa fa-lightbulb-o"></i>
                    <div class="info-blocks-in">
                        <h3>Bootstrap</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt</p>
                    </div>
                </div>
            </div>
            <!-- End Info Blcoks -->


            <!-- Info Blcoks -->
            <div class="row">
                <div class="col-sm-4 info-blocks">
                    <i class="icon-info-blocks fa fa-code"></i>
                    <div class="info-blocks-in">
                        <h3>SEO Ready</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt</p>
                    </div>
                </div>
                <div class="col-sm-4 info-blocks">
                    <i class="icon-info-blocks fa fa-compress"></i>
                    <div class="info-blocks-in">
                        <h3>Fully Responsive</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt</p>
                    </div>
                </div>
                <div class="col-sm-4 info-blocks">
                    <i class="icon-info-blocks fa fa-html5"></i>
                    <div class="info-blocks-in">
                        <h3>CSS3 + HTML5</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro consequatur aliquam, incidunt</p>
                    </div>
                </div>
            </div>
            <!-- End Info Blcoks -->


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