<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>修改酒店信息</title>
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
                <h3 class="panel-title">修改酒店</h3>
            </div>
            <div class="panel-body">

           <!-- 请求方式 如：edit_hotel.html?id=123  -->


            <form action="" method="" >

                <div class="form-area form-group" >
                    <div>
                        <span>酒店ID</span>
                        <input type="text" name="hId" id="hId" class="form-control" readonly>
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>酒店名称</span>
                        <input type="text" name="hname" id="hname" class="form-control">
                    </div>
                </div>

                <div class="form-area form-group" >
                    <div>
                        <span>城市</span>
                        <!-- 此处需要使用JSTL 遍历出 数据库中存在的城市数据 一下为示例数据 -->
                        <select class="form-control" name="hcity" id="hcity">
                            <option value="北京">北京</option>
                            <option value="上海">上海</option>
                            <option value="广州">广州</option>
                            <option value="深圳">深圳</option>
                            <option value="天津">天津</option>
                        </select>
                    </div>
                </div>  
                    
                <div class="form-area form-group" >
                    <div>
                        <span>酒店地址</span>
                        <input type="text" name="haddr" id="haddr" class="form-control">
                    </div>
                </div>  

                <div class="form-area form-group" >
                    <div>
                        <span>酒店介绍</span>
                        <input type="text" name="hdesc" id="hdesc" class="form-control">
                    </div>
                </div>  

                <div class="form-area form-group" >
                    <div>
                        <span>联系方式</span>
                        <input type="text" name="hcontact" id="hcontact" class="form-control">
                    </div>
                </div>  

                <div class="form-area form-group" >
                    <div>
                        <span>酒店品牌</span>
                        <!-- 此处需要使用 JSTL 获取目前数据库中存在的品牌 此处为示例-->
                        <select class="form-control" name="hband" id="hband">
                            <option value="汉庭酒店">汉庭酒店</option>
                            <option value="如家酒店">如家酒店</option>
                            <option value="全季酒店">全季酒店</option>
                        </select>
                    </div>
                </div>  

                <div class="form-area form-group" >
                    <div>
                        <span>星级</span>
                        <select class="form-control" name="hstar" id="hstar">
                            <option value="5">5星级</option>
                            <option value="4">4星级</option>
                            <option value="3">3星级</option>
                            <option value="2">2星级</option>
                            <option value="1">1星级</option>
                        </select>
                    </div>
                </div>  
                
                <div class="form-area form-group" >
                    <div>
                        <span>售卖状态</span>
                        <!-- 此处注意： 数据库中 在售 1  停售 0 -->
                        <select class="form-control" name="hstatus" id="hstatus">
                            <option value="1">在售</option>
                            <option value="0">停售</option>
                        </select>
                    </div>
                </div>  

                <div class="form-area form-group" >
                    <div>
                        <span>最晚预定时间</span>
                        <input type="time" name="hordertime" id="hordertime" class="form-control">
                    </div>
                </div>  

                <div class="form-area form-group" >
                    <div>
                        <span>最晚确定时间</span>
                        <input type="time" name="hconfirmtime" id="hconfirmtime" class="form-control">
                    </div>
                </div>  

            </form>
            </div>

            <div class="panel-footer">
                <div class="hbtn" >
                    <button class="btn btn-default" type="submit" onclick="go()">返回</button>

                    <button style="margin-left: 10px;" class="btn btn-danger"  onclick="dodelete()">删除</button>

                    <!-- 若使用ajax的方式进行提交 需要去掉type="submit"！！ -->
                    <button style="margin-left: 10px;" class="btn btn-primary"  onclick="doedit()">修改</button>
                </div>
            </div>
        </div>
    </div>
</body>

<script>

    function go(){
        window.history.go(-1);
    }

    function dosubmit(){

    }

    function getUrlParam(name) { //封装方法
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg); //匹配目标参数
        if(r != null) return unescape(r[2]);
        return null; //返回参数值
    }

    function init(){
        // 测试使用
        document.getElementById("hId").value=getUrlParam("id");
        console.log("开始");
        console.log(getUrlParam("id"));
        let id = getUrlParam("id");   //从网址中获得携带的参数 id 
        $.ajax({
        	 url:'HotelServlet?cmd=find'+"&hotelid="+id,
             method:'get',
            success:function(resp){
                //将从servlet中获得的数据 填写到网页的input表单中
				console.log("这是从Servlet中获取到的数据："+resp[0]);
				document.getElementById("hname").value=resp[0].hotelname;
				document.getElementById("hcity").value=resp[0].hotelcity;
				document.getElementById("haddr").value=resp[0].hoteladdr;
				document.getElementById("hdesc").value=resp[0].hoteldesc;
				document.getElementById("hcontact").value=resp[0].hotelcontact;
				document.getElementById("hband").value=resp[0].hotelband;
				document.getElementById("hstar").value=resp[0].hotelstar;
				document.getElementById("hstatus").value=resp[0].hotelstatus;
				document.getElementById("hordertime").value=resp[0].hotelordertime;
				document.getElementById("hconfirmtime").value=resp[0].hotelconfirmtime;
            }       
        })
    }

    function dodelete(){
        // 在此处填写删除逻辑
        //跳转 至servlet 或 ajax方式
            let id = getUrlParam("id"); 
         	BootstrapDialog.confirm({
    	    title : '确认',
    	    message : "确认要删除？",
    	    type : BootstrapDialog.TYPE_WARNING, // <-- Default value is
    	    // BootstrapDialog.TYPE_PRIMARY
    	    closable : true, // <-- Default value is false，点击对话框以外的页面内容可关闭
    	    draggable : true, // <-- Default value is false，可拖拽
    	    btnCancelLabel : '取消', // <-- Default value is 'Cancel',
    	    btnOKLabel : '确定', // <-- Default value is 'OK',
    	    btnOKClass : 'btn-warning', // <-- If you didn't specify it, dialog type
    	    size : BootstrapDialog.SIZE_SMALL,
    	    // 对话框关闭的时候执行方法
    	    onhide : function () {
    	        
    	    },
    	    callback : function(result) {
    	        // 点击确定按钮时，result为true
    	        if (result) {
    	            // 执行方法
    	        	$.ajax({
    	                url: 'HotelServlet?cmd=del&hotelid='+id,
    	                method: 'GET',
    	                success: function(data) {
    	                    if (data===true) {
    	                       window.location.href="hotel_manage.html"
    	                    }else {
    	                        BootstrapDialog.show({
    	                            title:"提示",
    	                            message:"删除失败",
    	                            type:BootstrapDialog.TYPE_WARNING
    	                        })
    	                    }
    	                },
    	                error: function () {

    	                }
    	            })              
    	            //执行方法  
    	        }
    	    }
    	});
     }

    function doedit(){
        // 请在此处编写 自定义ajax提交逻辑
          let id = getUrlParam("id");
           $.ajax({
           url:"HotelServlet?cmd=edit&hotelid="+id+"&hname="+$("#hname").val()+"&hcity="+$("#hcity").val()+"&haddr="+$("#haddr").val()+"&hdesc="+$("#hdesc").val()+"&hcontact="+$("#hcontact").val()+"&hband="+$("#hband").val()+"&hstar="+$("#hstar").val()+"&hstatus="+$("#hstatus").val()+"&hordertime="+$("#hordertime").val()+"&hconfirmtime="+$("#hconfirmtime").val(),
           method:'get',
           success:function(data) {
               if (data===true) {
               	window.location.href="hotel_manage.html"
               }else {
                   BootstrapDialog.show({
                       title:"提示",
                       message:"更新失败",
                       type:BootstrapDialog.TYPE_WARNING
                   })
               }
           },
           error: function () {

           },


           fail:function () {
               BootstrapDialog.show({
                   title:"提示",
                   message:"更新失败",
                   type:BootstrapDialog.TYPE_WARNING
               })
           }

       })
    }
    
    function submit(){
        $.ajax({
            method:'',
            url:'',
            data:{
                // 向服务器发送的数据
                // id:getUrlParam("id")
            },
            success:function(){

            }
        })
    }
    init();

</script>

</html>