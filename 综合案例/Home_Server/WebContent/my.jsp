<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>长包房 管理中心</title>
</head>

<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>


<body>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">

            <a class="navbar-brand" href="#">
                <img alt="Brand" src="images/homelogo.png" width="30px" height="20px">
              </a>
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">长包房 管理中心</a>
          </div>
      
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">酒店 <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#" onclick="switich('hotel_manage.html')">酒店管理</a></li>
                    <li><a href="#" onclick="switich('band_manag.html')">品牌管理</a></li>
                    <li><a href="#" onclick="switich('city_manage.html')">区域管理</a></li>
                </ul>
            </li>



            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">房型 <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#" onclick="switich('house_style_manage.html')">房型管理</a></li>
                </ul>
              </li>

              
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">订单 <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#"onclick="switich('order_manage.html')">订单管理</a></li>
                </ul>
              </li>
            </ul>
           
            <ul class="nav navbar-nav navbar-right">
              <li> <a >欢迎你：${user.username} 管理员</a>    </li>
              <li> <a href="login.jsp"> 注销 </a> </li>
            </ul>
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
      </nav>

      <div id="browserArea">
        <iframe name="frame" id="frame" width="100%" height="90%" src="hotel_manage.html" frameborder="0" scrolling="1">
            您的浏览器不支持HTML5，请升级浏览器再试
        </iframe>
      </div>



</body>

<script>
    function switich(url) {
        $("#frame").attr('src',url);
    }

</script>
</html>
