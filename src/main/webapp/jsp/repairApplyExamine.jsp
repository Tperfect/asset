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
          <cite>申请审核</cite></a>
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
<form class="layui-form" action="" >
    <input type="radio" lay-filter="examineu" name="applyExamine" value="0" title="未审" >
    <input type="radio" lay-filter="examined" name="applyExamine" value="1" title="已审" >
</form>
<table id="repairApplyExamine" lay-filter="repairApplyExamine"></table>
<script>
    layui.use(['layer','table','form','laydate'],function(){
        var table = layui.table;
        var layer = layui.layer;
        var laydate = layui.laydate;
        var form = layui.form;
        laydate.render({
            elem: '#date',
            range: true
        });
        //监听是否审核选项
        form.on('radio(examined)', function(data){
            table.reload('repairApplyExamine', {
                where: {
                    applyExamine: data.value
                }
                ,page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
        });
        form.on('radio(examineu)', function(data){
            table.reload('repairApplyExamine', {
                where: {
                    applyExamine: data.value
                }
                ,page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
        });
        //监听是否审核开关
        form.on('switch(applyExamine)', function(data){
            $.ajax({
                type:'post',
                url:'/repair/apply/update',
                data:{
                    applyId:data.elem.id,
                    applyExamine:data.value
                },
                success:function(data){

                },
                error:function(data){

                }
            });
        });
        //监听提交
        form.on('submit(submitExamine)', function(data){
            table.reload('repairApplyExamine', {
                type:'post',
                where: {
                    applyId:data.field.applyId,
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
                {field: 'applyId', title: '申请单号',event:'edit', sort: true, fixed: 'left',width:90}
                ,{field: 'applyPeople', title: '申请人',event:'edit'}
                ,{field: 'applyDept', title: '申请部门',event:'edit'}
                ,{field: 'applyAssetName', title: '资产名称',event:'edit'}
                ,{field: 'applyAssetSpec', title: '规格型号',event:'edit'}
                ,{field: 'applyAssetNum', title: '数量',width:70,event:'edit'}
                ,{field: 'applyAssetPlace', title: '存放地点',event:'edit'}
                ,{field: 'applyContent', title: '维修内容',event:'edit'}
                ,{field: 'applyExamine', title: '是否审核',templet:'#examine'}
            ]]
        });
        //监听数据表格点击事件
        table.on('tool(repairApplyExamine)',function(data){
            layer.open({
                type:2,
                title:'详情',
                area: ['800px', '500px'],
                content:"repairApplyDetail.jsp",
                success:function(layero,index){
                    var body = layer.getChildFrame('body', index);
                    var input = $(body).find("input,textarea");
                    for (var i = 0; i < input.length; i++) {
                        for(item in data.data){
                            if(item === input[i].name){
                                if(item === 'applyDegree'){
                                    if(data.data[item] === 0){
                                        input[i].value = '一般';
                                    }else if(data.data[item] === 1){
                                        input[i].value = '紧急';
                                    }
                                }else if(item === 'applyStatus'){
                                    if(data.data[item] === 0){
                                        input[i].value = '录入';
                                    }else if(data.data[item] === 1){
                                        input[i].value = '送审中';
                                    }else if(data.data[item] === 2){
                                        input[i].value = '已审批';
                                    }else if(data.data[item] === 3){
                                        input[i].value = '已退回';
                                    }else if(data.data[item] === 4){
                                        input[i].value = '维修中';
                                    }else if(data.data[item] === 5){
                                        input[i].value = '已维修';
                                    }else if(data.data[item] === 6){
                                        input[i].value = '验收中';
                                    }else if(data.data[item] === 7){
                                        input[i].value = '已验收';
                                    }
                                }else if(item === 'applyExamine'){
                                    if(data.data[item] === 0){
                                        input[i].value = '未审核';
                                    }else if(data.data[item] === 1){
                                        input[i].value = '已审核';
                                    }
                                }else if(item === 'applyRepairdate' || item === 'applyDate' || item === 'applyFinishdate'){
                                    input[i].value = new Date(data.data[item]).toLocaleDateString().replace(/\//g,"-");
                                }else{
                                    input[i].value = data.data[item];
                                }
                            }
                        }
                    }
                },
                btn: ['确认', '取消']
                ,yes: function(index, layero){
                    //按钮【按钮一】的回调
                    var applyId = layer.getChildFrame('body', index).find("input[name='applyId']")[0]
                    var applyFinishdate = layer.getChildFrame('body', index).find("input[name='applyFinishdate']")[0];
                    console.log()
                    $.ajax({
                        type:'post',
                        url:'/repair/apply/updateFinishdate',
                        data:{
                            applyFinishdate:applyFinishdate.value,
                            applyId:applyId.value
                        },
                        success:function(data){

                        },
                        error:function(data){

                        }
                    });
                    layer.closeAll('iframe');
                }
                ,btn2: function(index, layero){
                    //按钮【按钮二】的回调
                    //return false 开启该代码可禁止点击该按钮关闭
                }
                ,cancel: function(){
                    //右上角关闭回调
                    //return false 开启该代码可禁止点击该按钮关闭
                }
            });
        });
    });
</script>
<%-- layui模板 --%>
<script type="text/html" id="examine">
    <input type="checkbox" id="{{d.applyId}}" {{d.applyExamine == 1 ? 'disabled' : ''}} name="applyExamine" value="{{d.applyExamine}}" lay-skin="switch" lay-text="已审|未审" lay-filter="applyExamine" {{ d.applyExamine == 1 ? 'checked' : ''}}>
</script>
</body>
</html>