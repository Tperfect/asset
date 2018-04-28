<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2018/4/26
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>维修单查询</title>
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
          <cite>维修单查询</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<form class="layui-form" action="">
    <div class="layui-inline">
        <label class="layui-form-label">维修单号</label>
        <div class="layui-input-inline">
            <input type="text" name="id" lay-verify="title" autocomplete="off" placeholder="请输入维修单号" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">维修人</label>
        <div class="layui-input-inline">
            <input type="text" name="repairPeople" lay-verify="required" placeholder="请输入维修人" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">维修原因</label>
        <div class="layui-input-inline">
            <input type="text" name="repairCause" lay-verify="required" placeholder="请输入维修原因" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <div class="layui-inline">
            <label class="layui-form-label">状态</label>
            <div class="layui-input-inline">
                <select name="repairStatus" lay-verify="required" lay-search="">
                    <option value="">直接选择或搜索选择</option>
                    <option value="1">录入</option>
                    <option value="2">送审中</option>
                    <option value="3">已审批</option>
                    <option value="4">已退回</option>
                    <option value="5">维修中</option>
                    <option value="6">已维修</option>
                    <option value="7">验收中</option>
                    <option value="8">已验收</option>
                </select>
            </div>
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">开始时间</label>
        <div class="layui-input-inline">
            <input type="text" name="startDate" id="startDate" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">结束时间</label>
        <div class="layui-input-inline">
            <input type="text" name="endDate" id="endDate" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="submit">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            <button type="button" class="layui-btn layui-btn-primary">新增</button>
        </div>
    </div>
</form>

<table id="repairOrder" lay-filter="repairOrder"></table>
<script>
    layui.use(['layer','table','laydate'],function(){
        var table = layui.table;
        var laydate = layui.laydate;
        laydate.render({
            elem: '#startDate'
        });
        laydate.render({
            elem: '#endDate'
        });
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
