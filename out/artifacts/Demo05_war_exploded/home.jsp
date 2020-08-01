<%--
  Created by IntelliJ IDEA.
  User: 曾可德
  Date: 2020/8/1
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/1.8.3/jquery.js"></script>
<link rel="stylesheet" href="/statics/bootstrap.css">
<script type="text/javascript" src="js/m_ajax.js"></script>
<html>
<head>
    <title>首页</title>
</head>
<script>
    // $(function () {
    //     $.post("/home",function (data) {
    //         alert(data)
    //         for (var i=0;i<data.length;i++){
    //             $("#tb").append(
    //                 "<tr>" +
    //                 "<td><input type='checkbox' name='listid' value='"+data[i].dogId+"'  /></td>"+
    //                 "<td>"+data[i].dogId+"</td>" +
    //                 "<td>"+data[i].dogname+"</td>" +
    //                 "<td>"+data[i].dogpwd+"</td>" +
    //                 "<td>"+data[i].dogAge+"</td>" +
    //
    //                 "</tr>"
    //             )
    //         }
    //     })
    // })


        //页面加载 默认应该第一页
        $(function() {

            init(1);
        });

    //5//////
    function init(currentPage) {

        $("#tbody").empty();
        var url = "loadUsersListPager";
        var data = {
            currentPage : currentPage
        };
        ajax(url, data, function(result) {
            //list,totalPage,currentPage,pageSize,start,
            var trs="";
            $.each(result.list, function(i, v) {
                //v即为对象，通过属性去访问值
                trs += "<tr>";
                trs += "<td>"+ v.dogId +"</td>";

                trs += "<td>"+ v.dogname +"</td>";
                trs += "<td>"+ v.dogpwd +"</td>";
                trs += "<td>"+ v.dogAge +"</td>";
                // trs += "<td>"+ v.stuaddress +"</td>";
                // trs += "<td><a href='javascript:upd("+ v.stuId +")'>详细信息</a><a href='javascript:del("+ v.stuId +")'>删除</a></td>";
                trs += "</tr>";
            });
            //6/ 做上一页，需要注意判断是否是首页
            trs+="<tr>";
            trs+="<td colspan='5'>";
            if(result.currentPage==1){
                trs+="<a href='#'>«</a>";
            }else{
                //不是第一页
                trs+="<a href='javascript:pre("+(result.currentPage-1)+")'>«</a>";
            }

            if(result.currentPage==result.totalPage){
                trs+="<a href='#'>»</a>";
            }else{
                trs+="<a href='javascript:nxt("+(result.currentPage+1)+")'>»</a>";
            }
            trs+="</td></tr>";
            $("#tbody").append(trs);
        });



    }

    function pre(i){
        //alert(i);
        init(i);
    }

    function nxt(i){
        init(i);
    }
    function cpg(i){
        init(i);
    }
</script>
<body>
<table class="table table-hover">
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>密码</td>
        <td>年龄</td>
    </tr>
</table>
<table class="table table-hover" id="tb">

</table>
<input type="button" value="全选">
</body>
</html>
