<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>长包房 用户登录</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>

</head>

<style>

    #main{
        margin: 50px;
    }

    #panel{
        width: 500px;
        height: 300px;
        /* 使得面板居中的Css */
        margin: auto;
        position: absolute;
        left: 0;
        right: 0;

    }

    .form-area{
        margin: 20px;
    }

    .uname{
        margin-top: 20px;
    }

    .upwd{
        margin-top: 20px;
    }

    .ubtn{
        margin: 30px;
        text-align: center;
    }
</style>



<body>
    <div id="main">
        <div class="panel panel-default" id="panel">
            <div class="panel-heading">
                <h3 class="panel-title">用户认证</h3>
            </div>
            <div class="panel-body">
            <!-- 网页传统方式提交表单： 请在此填写需要提交到的页面 以及请求方式 -->
            <form action="UserServlet" method="post" >
                <div class="form-area form-group" >
                    <div id="" class="uname">
                        <span id="uname-label">用户名：</span>
                        <input type="text" name="username" id="username" class="form-control" placeholder="请输入您的用户名">
                    </div>

                    <div class="upwd">
                        <span id="upwd-label">密码：</span>
                        <input type="password" name="password" id="password" class="form-control"  placeholder="请输入您的密码">
                    </div>

                    <div class="ubtn">
                        <button class="btn btn-primary" type="submit" onclick="dosubmit()">登录</button>
                    </div>
                    
                </div>
            </form>
            </div>
        </div>
    </div>
      
</body>

<script>
    
    // Ajax 方式提交，请 注释表单 form 标签
    function dosubmit(){
        // 获得用户名
        var username =document.getElementById("username").value;
        // 获取密码
        var password=document.getElementById("password").value;
        // 请在此处编写 自定义ajax提交逻辑
        $.ajax()
    }

</script>


</html>