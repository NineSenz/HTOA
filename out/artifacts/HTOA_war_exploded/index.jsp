<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/13 0013
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!-- css -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/fancybox/jquery.fancybox.css" rel="stylesheet">
    <link href="css/jcarousel.css" rel="stylesheet" />
    <link href="css/flexslider.css" rel="stylesheet" />
    <link href="js/owl-carousel/owl.carousel.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet" />
</head>
<body>
<div id="wrapper" class="home-page">
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
                        <li class="active"><a href="index.jsp">首页</a></li>
                        <li><a href="about.jsp">专家师资</a></li>
                        <li><a href="services.jsp">就业明星</a></li>
                        <li><a href="courses.jsp">校外活动</a></li>
                        <li><a href="pricing.jsp">学校课程</a></li>
                        <li><a href="contact.jsp">点击登录</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <!-- end header -->
    <section id="banner">

        <!-- Slider -->
        <div id="main-slider" class="flexslider">
            <ul class="slides">
                <li>
                    <img src="img/slides/OA1.jpg" alt="" />
                    <%--<div class="flex-caption container">
                        <h3>Success Oriented</h3>
                        <p>Doloribus omnis minus temporibus perferendis ipsa<br/> architecto non, magni quam</p>
                        <a href="#" class="btn btn-theme">Read More</a>
                    </div>--%>
                </li>
                <li>
                    <img src="img/slides/OA2.jpg" alt="" />
                    <div class="flex-caption container">
                        <h3>你心动了吗？</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing<br/> elitincidunt eius magni provident.</p>
                        <a href="#" class="btn btn-theme">不如行动</a>
                    </div>
                </li>
            </ul>
        </div>
        <!-- end slider -->

    </section>
    <section class="txt-area">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="aligncenter"><h1 class="aligncenter">宏图软件</h1>
                        宏图软件教育,是由在IT行业有着雄厚技术储备和丰富的行业经验的高科技IT企业——宏图科技集团主办，同时与江西农大、赣州技师学院、江西师范、江西财大、南昌大学等多所高校合作，以企业实训的模式定向培养高端IT精英人才的特色教育机构。
                    </div>
                </div>
            </div>
        </div>
    </section>


    <section id="content">


        <div class="container">
            <div class="row">
                <div class="features">
                    <div class="col-md-4 col-sm-6 wow fadeInUp animated" data-wow-duration="300ms" data-wow-delay="0ms" style="visibility: visible; -webkit-animation-duration: 300ms; -webkit-animation-delay: 0ms;">
                        <div class="media service-box">
                            <div class="pull-left">
                                <i class="fa fa-bullseye"></i>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">专家师资</h4>
                                <p>宏图软件教育的老师都是具有5年以上项目经验的资深专家</p>
                            </div>
                        </div>
                    </div><!--/.col-md-4-->

                    <div class="col-md-4 col-sm-6 wow fadeInUp animated" data-wow-duration="300ms" data-wow-delay="100ms" style="visibility: visible; -webkit-animation-duration: 300ms; -webkit-animation-delay: 100ms;">
                        <div class="media service-box">
                            <div class="pull-left">
                                <i class="fa fa-bullseye"></i>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">精英教学</h4>
                                <p>实现手把手教学 每天2个小时的理论课+6个小时以上的上机实战</p>
                            </div>
                        </div>
                    </div><!--/.col-md-4-->

                    <div class="col-md-4 col-sm-6 wow fadeInUp animated" data-wow-duration="300ms" data-wow-delay="200ms" style="visibility: visible; -webkit-animation-duration: 300ms; -webkit-animation-delay: 200ms;">
                        <div class="media service-box">
                            <div class="pull-left">
                                <i class="fa fa-bullseye"></i>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">就业保障</h4>
                                <p>入学即签定就业保障协议 保障100%对口就业 并且就业工资在4000元以上</p>
                            </div>
                        </div>
                    </div><!--/.col-md-4-->

                    <div class="col-md-4 col-sm-6 wow fadeInUp animated" data-wow-duration="300ms" data-wow-delay="300ms" style="visibility: visible; -webkit-animation-duration: 300ms; -webkit-animation-delay: 300ms;">
                        <div class="media service-box">
                            <div class="pull-left">
                                <i class="fa fa-bullseye"></i>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">最低成本</h4>
                                <p>只需你以后在外工作几个月的工资即可就读 详情请联系我们咨询</p>
                            </div>
                        </div>
                    </div><!--/.col-md-4-->

                    <div class="col-md-4 col-sm-6 wow fadeInUp animated" data-wow-duration="300ms" data-wow-delay="400ms" style="visibility: visible; -webkit-animation-duration: 300ms; -webkit-animation-delay: 400ms;">
                        <div class="media service-box">
                            <div class="pull-left">
                                <i class="fa fa-bullseye"></i>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">最高回报</h4>
                                <p>实习平均月薪四 五千元 实习完就业月薪高达五千至一万元元</p>
                            </div>
                        </div>
                    </div><!--/.col-md-4-->

                    <div class="col-md-4 col-sm-6 wow fadeInUp animated" data-wow-duration="300ms" data-wow-delay="500ms" style="visibility: visible; -webkit-animation-duration: 300ms; -webkit-animation-delay: 500ms;">
                        <div class="media service-box">
                            <div class="pull-left">
                                <i class="fa fa-bullseye"></i>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">质量第一</h4>
                                <p>没有教不会的学生 只有不会教的老师 这就是我们的教学态度</p>
                            </div>
                        </div>
                    </div><!--/.col-md-4-->
                </div>
            </div>


        </div>
    </section>

    <section class="aboutUs">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="aligncenter"><h2 class="aligncenter">宏图始终坚持</h2>“让学生用最低的成本，获得最大的回报”的办学理念。 “精英特训 创新教学 就业导向 质量第一”的教学理念。 “没有教不会的学生，只有不会教的老师”的教学态度。
                        宏图始终专注于两大高端IT精英人才培养——J2EE高级软件工程师和手机应用高级软件工程师（Android、IOS），是人才缺口最大、薪资待遇最高、发展前景最好的高端岗位。在校实战学习2年半，带薪实习半年，实习平均月薪四、五千元，实习完就业月薪高达五千至一万元元，宏图已经与中兴、华为、腾讯、百度、用友、东软等大型IT企业建立了人才培养合作，受到用人单位的高度认可。</div>
                    <br/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <img src="img/img1.png" alt="">
                    <div class="space"></div>
                </div>
                <div class="col-md-6">
                    <p>一流的专家师资
                        宏图软件教育的老师都是具有5年以上项目经验的资深专家</p>

                    <p>手把手教学，理论+大量上机实战
                        宏图软件学院采用小班授课，一个班在30人之内，每个班配备一名专业老师，实现手把手教学
                        每天2个小时的理论课+6个小时以上的上机实战</p>

                    <p>就业保障
                        入学即签定就业保障协议，保障100%对口就业；并且就业工资在4000元以上，否则退货全部学费，并提供终身就业服务。</p>

                    <ul class="list-unstyled">
                        <li><i class="fa fa-arrow-circle-right pr-10 colored"></i> 精英特训</li>
                        <li><i class="fa fa-arrow-circle-right pr-10 colored"></i> 创新教学</li>
                        <li><i class="fa fa-arrow-circle-right pr-10 colored"></i> 就业导向</li>
                        <li><i class="fa fa-arrow-circle-right pr-10 colored"></i> 质量第一</li>
                        <li><i class="fa fa-arrow-circle-right pr-10 colored"></i> 让学生用最低的成本，获得最大的回报</li>
                    </ul>
                </div>
            </div>

        </div>
    </section>
    <section id='events'>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="aligncenter"><h2 class="aligncenter">会学也会玩</h2>学习的时候拼命的学 玩的时候尽情的玩 热爱代码 热爱生活 热爱那个独一无二的自己</div>
                    <br>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <div class="post3">
                        <img src="img/e1.png" alt="">
                        <a href="#">
                            <time datetime="2015-03-01">
                                <span class="year">2016</span>
                                <span class="month">运动</span>
                            </time>
                            <p>每天晨练，给未来的自己打好身体的基础</p>
                        </a>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="post3">
                        <img src="img/e2.png" alt="">
                        <a href="#">
                            <time datetime="2015-03-01">
                                <span class="year">2016</span>
                                <span class="month">音乐</span>
                            </time>
                            <p>每周班会，尽情展示你的天籁之音</p>
                        </a>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="post3">
                        <img src="img/e3.png" alt="">
                        <a href="#">
                            <time datetime="2015-03-01">
                                <span class="year">2016</span>
                                <span class="month">学习</span>
                            </time>
                            <p>日常学习，只为更好的自己</p>
                        </a>
                    </div>
                </div>
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
<script src="js/owl-carousel/owl.carousel.js"></script>
</body>
</html>
