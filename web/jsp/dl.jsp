<%--
  Created by IntelliJ IDEA.
  User: 曾可德
  Date: 2020/7/31
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/1.8.3/jquery.js"></script>
<link rel="stylesheet" href="/statics/bootstrap.css">
<script>
    $(function () {
        $("#dl").click(function () {
            var dogname = $("#dogname").val()
            var dogpwd = $("#dogpwd").val()
            $.post("/dl",{"dogname":dogname,"dogpwd":dogpwd},function (data) {

                if (data!=null){
                    alert(data)
                    window.location.href="../home.jsp";
                }
            })
        })
    })
</script>
<html>
<head>
    <title>登录</title>
</head>
<body>
<input type="text" name="dogname" id="dogname" >
<input type="password" name="dogpwd" id="dogpwd" >
<input type="button" value="登录" id="dl">
</body>
</html>
