<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的维修单</title>
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
          <cite>我的维修单</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
    <form class="layui-form" action="">
        <div class="layui-inline">
            <label class="layui-form-label">维修单号</label>
            <div class="layui-input-inline">
                <input type="text" name="applyId" autocomplete="off" placeholder="请输入维修单号" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <div class="layui-inline">
                <label class="layui-form-label">状态</label>
                <div class="layui-input-inline">
                    <select name="applyStatus" lay-search="">
                        <option value="">直接选择或搜索选择</option>
                        <option value="0">录入</option>
                        <option value="1">送审中</option>
                        <option value="2">已审批</option>
                        <option value="3">已退回</option>
                        <option value="4">维修中</option>
                        <option value="5">已维修</option>
                        <option value="6">验收中</option>
                        <option value="7">已验收</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submitOrder">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                <button type="button" class="layui-btn layui-btn-primary">新增</button>
            </div>
        </div>
    </form>
    <table id="repairOrder" lay-filter="repairOrder"></table>
<script>
    layui.use(['layer','table','form','laydate'],function(){
        var table = layui.table;
        var form = layui.form;
        var laydate = layui.laydate;

        table.render({
            elem:'#repairOrder',
            url:'/repair/apply/examine?applyPeople=熊大',
            page:true,
            cols:[[
                {field: 'applyId', title: '申请单号',event:'edit', sort: true, fixed: 'left',width:90}
                ,{field: 'applyAssetName', title: '资产名称',event:'edit'}
                ,{field: 'applyAssetSpec', title: '规格型号',event:'edit'}
                ,{field: 'applyAssetNum', title: '数量',width:70,event:'edit'}
                ,{field: 'applyAssetPlace', title: '存放地点',event:'edit'}
                ,{field: 'applyContent', title: '维修内容',event:'edit'}
                ,{field: 'applyDegree', title: '紧急程度',templet:'#degree'}
                ,{field: 'applyExamine', title: '是否审核',templet:'#examine'}
            ]]
        });
        //监听是否审核开关
        form.on('switch(applyDegree)', function(data){
            console.log(data);
            $.ajax({
                type:'post',
                url:'/repair/apply/update',
                data:{
                    applyId:data.elem.id,
                    applyDegree:data.value
                },
                success:function(data){
                },
                error:function(data){
                }
            });
        });
        //监听提交
        form.on('submit(submitOrder)', function(data){
            table.reload('repairOrder', {
                type:'post',
                where: {
                    applyId:data.field.applyId,
                    applyStatus:data.field.applyStatus
                }
                ,page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
            return false;
        });
        //监听数据表格点击事件
        table.on('tool(repairOrder)',function(data){
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
<script type="text/html" id="degree">
    <input type="checkbox" id="{{d.applyId}}" {{d.applyExamine == 1 ?'disabled':''}} name="applyDegree" value="{{d.applyDegree}}" lay-skin="switch" lay-text="紧急|一般" lay-filter="applyDegree" {{ d.applyDegree == 1 ? 'checked' : ''}}>
</script>
<script type="text/html" id="examine">
    <input type="checkbox" disabled name="applyExamine" value="{{d.applyExamine}}" lay-skin="switch" lay-text="已审|未审" lay-filter="applyExamine" {{ d.applyExamine == 1 ? 'checked' : ''}}>
</script>
</body>
</html>
