<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>维修申请审核</title>
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
          <cite>维修申请审核</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<form class="layui-form" action="">
    <div class="layui-inline">
        <label class="layui-form-label">申请单号</label>
        <div class="layui-input-inline">
            <input type="text" name="applyId" autocomplete="off" placeholder="请输入申请单号" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">申请人</label>
        <div class="layui-input-inline">
            <input type="text" name="applyPeople" placeholder="请输入申请人" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">日期范围</label>
        <div class="layui-input-inline">
            <input type="text" name="date" class="layui-input" id="date" placeholder=" - ">
        </div>
    </div>

    <div class="layui-inline">
        <div class="layui-input-inline">
            <button class="layui-btn" lay-submit="" lay-filter="submitExamine">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<table id="repairApplyExamine" lay-filter="repairApplyExamine"></table>
<script>
    layui.use(['layer','table','laydate'],function(){
        var table = layui.table;
        var laydate = layui.laydate;
        var form = layui.form;
        laydate.render({
            elem: '#date',
            range: true
        });
        //监听提交
        form.on('submit(submitExamine)', function(data){
            table.reload('repairApplyExamine', {
                where: { //设定异步数据接口的额外参数，任意设
                    applyId: data.field.applyId,
                    applyPeople:data.field.applyPeople,
                    date:data.field.date
                }
                ,page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
            return false;
        });

        table.render({
            elem:'#repairApplyExamine',
            url:'/repair/apply/examine',
            page:true,
            cols:[[
                {field: 'applyId', title: '申请单号', sort: true, fixed: 'left',width:90}
                ,{field: 'applyPeople', title: '申请人'}
                ,{field: 'applyDept', title: '申请部门'}
                ,{field: 'applyAssetName', title: '资产名称'}
                ,{field: 'applyAssetSpec', title: '规格型号'}
                ,{field: 'applyAssetNum', title: '数量',width:70}
                ,{field: 'applyAssetPlace', title: '存放地点'}
                ,{field: 'applyContent', title: '维修内容'}
                ,{field: 'applyExamine', title: '是否审核'}
            ]]
        });
    });
</script>
</body>
</html>
