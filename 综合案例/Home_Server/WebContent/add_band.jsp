<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>添加酒店信息</title>
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
 
 <!-- 对话框  -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.7/css/bootstrap-dialog.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.7/js/bootstrap-dialog.min.js"></script>

</head>

<style>

    #main{
        margin-top: 20px;
    }

    #panel{
        width: 600px;
        /* 使得面板居中的Css */
        margin: auto;
        position: absolute;
        left: 0;
        right: 0;

    }

    .hbtn{
        text-align: right;
    }
</style>

<body>
    <div id="main">
        <div class="panel panel-default" id="panel">
            <div class="panel-heading">
                <h3 class="panel-title">添加品牌</h3>
            </div>
            <div class="panel-body">
            <!-- 网页传统方式提交表单： 请在此填写需要提交到的页面 以及请求方式 -->
            <form enctype="multipart/form-data" id="hform" name="hform">
                <div class="form-area form-group" >
                    <div>
                        <span>品牌名称</span>
                        <input type="text" name="bname" id="bname" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>品牌图标</span>
                        <input type="file"  name="bIcon" id="bIcon">
                    </div>
                </div>
                    
                <div class="form-area form-group" >
                    <div>
                        <span>品牌详情</span>
                        <input type="text" name="bDetail" id="bDetail" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>备注</span>
                        <input type="text" name="bRemark" id="bRemark" class="form-control">
                    </div>
                </div>

                
            </form>
            </div>

            <div class="panel-footer">
                <div class="hbtn" >
                    <button class="btn btn-default" type="submit" onclick="go()">返回</button>

                    <button style="margin-left: 10px;" class="btn btn-primary" type="submit" onclick="dosubmit()">提交</button>
                </div>
            </div>
        </div>
    </div>
</body>

<script>

     function go(){
        window.history.go(-1);
     }
     
     function dosubmit() {
    	 console.log("开始！")
         var formdata = new FormData(document.getElementById("hform"));
         formdata.append("bandname",bname);
         formdata.append("bandicon",bIcon)
         formdata.append("banddetail",bDetail);
         formdata.append("bandremark",bRemark);

         $.ajax({
             url:'BandServlet?cmd=add',
             method:'POST',
             data:formdata,
             contentType: false, 
             processData: false,
             cache: false,
             success: function(data) {
            	 window.location.href="band_manage.html"
             },
             error: function () {
                 BootstrapDialog.show({
                     title:"提示",
                     message:"保存失败",
                     type:BootstrapDialog.TYPE_WARNING
                 })
             }
         })
     }

     // Ajax 方式提交，请 注释表单 form 标签
    /* function dosubmit(){
         // 请在此处编写 自定义ajax提交逻辑
       
         $.ajax({
            url: 'BandServlet?cmd=add&bname='+$("#bname").val()+"&bIcon=a.png"+"&bDetail="+$("#bDetail").val()+"&bRemark="+$("#bRemark").val(),
            method: 'get',
            success:function(data) {
                if (data===true) {
                	window.location.href="band_manage.html"
                }else {
                    BootstrapDialog.show({
                        title:"提示",
                        message:"保存失败",
                        type:BootstrapDialog.TYPE_WARNING
                    })
                }
            },
            error: function () {

            },


            fail:function () {
                BootstrapDialog.show({
                    title:"提示",
                    message:"保存失败",
                    type:BootstrapDialog.TYPE_WARNING
                })
            }

        })
     }*/

</script>

</html>