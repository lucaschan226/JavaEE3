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
                <h3 class="panel-title">添加房型</h3>
            </div>
            <div class="panel-body">
            <!-- 网页传统方式提交表单： 请在此填写需要提交到的页面 以及请求方式 -->
            <form action="" method="">
                <div class="form-area form-group" >
                    <div>
                        <span>房型名称</span>
                        <input type="text" name="houseStyleName" id="houseStyleName" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>房间数量</span>
                        <input type="text" name="houseStyleCount" id="houseStyleCount" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>楼层</span>
                        <input type="text" name="houseStyleLocate" id="houseStyleLocate" class="form-control"> 
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>面积</div>
                    <div class="input-group">
                        <input type="number" class="form-control" placeholder="" aria-describedby="basic-addon2" id="houseStyleSpace" name="houseStyleSpace">
                        <span class="input-group-addon" id="basic-addon2">㎡</span>
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>床型</span>
                        <select id="houseStyleType" name='houseStyleType' class="form-control">
                            <option>大床</option>
                            <option>双床</option>
                            <option>单人床</option>
                            <option>多张床</option>
                        </select>
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>加床</span>
                        <input type="text" name="houseStyleAddBed" id="houseStyleAddBed" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>是否有窗</span>
                        <select id="houseStyleHasWindow" name='houseStyleHasWindow' class="form-control">
                            <option>无窗</option>
                            <option>有窗</option>
                            <option>部分有窗</option>
                        </select>
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>最大入住人数</span>
                        <input type="text" name="houseStyleMaxPeople" id="houseStyleMaxPeople" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>网络连接</span>
                        <select id="houseStyleInternet" name='houseStyleInternet' class="form-control">
                            <option value="1">免费</option>
                            <option value="2">收费</option>
                        </select>
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>无烟信息</span>
                        <select id="houseStyleSmoke" name='houseStyleSmoke' class="form-control">
                            <option value="1">可吸烟</option>
                            <option value="2">全禁烟</option>
                        </select>
                    </div>
                </div>


                <div class="form-area form-group" >
                    <div>
                        <span>关键信息</span>
                        <input type="text" name="houseStyleKeyInfo" id="houseStyleKeyInfo" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>售价</div>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">￥</span>
                        <input type="number" class="form-control" placeholder="售价" aria-describedby="basic-addon1" name="houseStylePrice" id="houseStylePrice">
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
     function getUrlParam(name) { //封装方法
         var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
         var r = window.location.search.substr(1).match(reg); //匹配目标参数
         if(r != null) return unescape(r[2]);
         return null; //返回参数值
     }
     function dosubmit(){
         // 请在此处编写 自定义ajax提交逻辑
            let shotel = getUrlParam("sHotel");
            console.log("shotel:"+shotel);
            $.ajax({
            url:"HouseStyleServlet?cmd=add&houseStyleName="+$("#houseStyleName").val()+"&houseStyleCount="+$("#houseStyleCount").val()+"&houseStyleLocate="+$("#houseStyleLocate").val()+"&houseStyleSpace="+$("#houseStyleSpace").val()+"&houseStyleType="+$("#houseStyleType").val()+"&houseStyleAddBed="+$("#houseStyleAddBed").val()+"&houseStyleHasWindow="+$("#houseStyleHasWindow").val()+"&houseStyleMaxPeople="+$("#houseStyleMaxPeople").val()+"&houseStyleInternet="+$("#houseStyleInternet").val()+"&houseStyleSmoke="+$("#houseStyleSmoke").val()+"&houseStyleKeyInfo="+$("#houseStyleKeyInfo").val()+"&houseStylePrice="+$("#houseStylePrice").val()+"&hotelname="+shotel,
            method:'get',
            success:function(data) {
                if (data===true) {
                	window.location.href="house_style_manage.html"
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
     }


</script>

</html>