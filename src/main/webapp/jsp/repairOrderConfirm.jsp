<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2018/4/26
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>维修单确认</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">
    <script type="text/javascript" src="/js/jquery-1.11.1.min.js"></script>
    <script src="/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/js/xadmin.js"></script>
</head>
<body>
<div class="x-nav">
      <span class="layui-breadcrumb" lay-separator=">">
        <a href="">首页</a>
        <a href="">资产维修</a>
        <a>
          <cite>维修单确认</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<form class="layui-form" action="">
    <input type="radio" name="confirm" value="confirmed" title="已确认申请" checked>
    <input type="radio" name="confirm" value="confirm" title="待确认申请" >
</form>
<table id="repairOrder" lay-filter="repairOrder"></table>
<script>
    layui.use(['layer','table','laydate'],function(){
        var table = layui.table;
        table.render({
            elem:'#repairOrder',
            url:'/repair/order',
            page:true,
            cols:[[
                {field: 'id', title: '维修单号', sort: true, fixed: 'left'}
                ,{field: 'repairCreatedate', title: '报修日期'}
                ,{field: 'repairPeople', title: '维修员', sort: true}
                ,{field: 'repairMoney', title: '实际费用'}
                ,{field: 'repairServicesMoney', title: '劳务费'}
                ,{field: 'repairMaterialMoney', title: '材料费用', sort: true}
                ,{field: 'repairCause', title: '维修原因', sort: true}
                ,{field: 'repairStatus', title: '状态'}
                ,{field: 'repairOperation', title: '操作', sort: true}
            ]]
        });
    });
</script>
</body>
</html>
