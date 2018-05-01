<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看详情</title>
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
          <cite>查看详情</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<form class="layui-form" action="">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">申请单号</label>
            <div class="layui-input-inline">
                <input type="text" name="applyId" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">申请人</label>
            <div class="layui-input-inline">
                <input type="text" name="applyPeople" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">申请部门</label>
            <div class="layui-input-inline">
                <input type="text" name="applyDept" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">申请日期</label>
            <div class="layui-input-inline">
                <input type="text" name="applyDate" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">资产编号</label>
            <div class="layui-input-inline">
                <input type="text" name="applyAssetId" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">资产名称</label>
            <div class="layui-input-inline">
                <input type="text" name="applyAssetName" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">规格型号</label>
            <div class="layui-input-inline">
                <input type="text" name="applyAssetSpec" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">维修数量</label>
            <div class="layui-input-inline">
                <input type="number" name="applyAssetNum" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">存放地点</label>
            <div class="layui-input-inline">
                <input type="text" name="applyAssetPlace" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">维修预算</label>
            <div class="layui-input-inline">
                <input type="text" name="applyBudget" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">紧急程度</label>
            <div class="layui-input-inline">
                <input type="text" name="applyDegree" id="applyDegree" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">要求修复日期</label>
            <div class="layui-input-inline">
                <input type="text" name="applyRepairdate" id="applyRepairdate" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">预计修复日期</label>
            <div class="layui-input-inline">
                <input type="text" name="applyFinishdate" id="applyFinishdate" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">维修状态</label>
            <div class="layui-input-inline">
                <input type="text" name="applyStatus" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">是否审核</label>
            <div class="layui-input-inline">
                <input type="text" name="applyExamine" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">维修内容</label>
            <div class="layui-input-block">
                <textarea name="applyContent" placeholder="请输入内容" class="layui-textarea" disabled></textarea>
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">故障原因</label>
            <div class="layui-input-block">
                <textarea name="applyCase" placeholder="请输入内容" class="layui-textarea" disabled></textarea>
            </div>
        </div>
    </div>
</form>
<script>
    layui.use(['form', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,laydate = layui.laydate;
        //日期
        laydate.render({
            elem: '#applyFinishdate',
            value:new Date()
        });
        //监听提交
        form.on('submit(applyAdd)', function(data){
            $.ajax({
                type:'post',
                url:'/repair/apply/add',
                data:data.field,
                success:function(data){
                    layer.alert("维修申请提交成功");
                },
                error:function(data){
                    layer.alert("维修申请提交失败");
                }
            });
            return false;
        });
    });
</script>
</body>
</html>
