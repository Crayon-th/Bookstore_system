<template>
    <div>
        <span style="font-size:24px;"><b>&nbsp;电商平台系统</b></span>
      <div style="font-size:16px;">
        
      <p >讨论题：边界值测试可以适用于function(method) level，class level,，system level，分析电商平台系统测试时考虑的边界值情况。</p>

</div>

  <p style="margin-top:10px;font-size:20px;">一.问题分析</p>
  <p>在测试某电商平台时，需要使用不同的参数进行测试，包括商品价格、每页商品数、商家评价分数、商品图片数、商品评价数、店铺商品数、商品名称长度、收藏数量、商品分类数、搜索联想栏条数、购物车内商品数等。
由于这些变量的取值范围有一定的限制要求，当输入超出规定范围时，系统需要给出相应的提示或错误报告。在这种情况下，我们假设在参数错误时输出-1，在正常运行时输出0。因此，在使用边界值法进行测试时，我们需要进行健壮性的边界值测试，以测试系统在输入值适当低于下限或适当高于上限时的容错能力。
健壮性边界分析法基于"单缺陷"假设，即程序失效很少是由两个或多个缺陷同时作用引起的，而是由于单个变量在其边界值附近取值而引起的。在每个测试用例中，所有变量都取正常值，而其中一个变量取最小值、最小值加1、正常值、最大值减1和最大值，以进行全面的测试。</p>
  <p >1.功能测试</p>
  <p>测试依据为需求文档及需求分析文档，验证产品功能是否符合需求。</p>
<el-table
      :data="questionData"
      style="width: 60%;font-size:12px;"
      >
      <el-table-column
        prop="minute"
        label=""
        width="140"
        align="center">
      </el-table-column>
      <el-table-column
        prop="times"
        label="正常情况"
        width="240"
        align="center">
      </el-table-column>
      <el-table-column
        prop="level"
        label="边界值"
        align="center">
      </el-table-column>
    </el-table>
<p style="margin-top:50px;">举例：</p>
<p>账号密码输入次数限制为5：0，1，2，5，6</p>
<p style="margin-top:50px;">2.非功能需求</p>
<p>性能测试：响应时间，准确度等；</p>
<p>压力测试：考虑在如双十一等活动期间</p>
<p style="margin-top:50px;">三.Class level</p>
<p>考虑类之间，类内方法/函数之间的调用的变量边界等</p>
<p style="margin-top:50px;">四.Method level</p>
<p>输入/输出变量取值边界，循环次数等</p>

    </div>



</template>

<script>

export default {
  name: "SalesQuestion",
  components: {},
  props: {},
  data() {
    return {questionData:[{
          minute:"搜索商品",
          times:"显示符合条件的商品",
          level:"输入信息无意义，结果为空",

        },{
          minute:"登录",
          times:"登录成功",
          level:"账号/密码有误，重新输入次数限制;自动注销时间限制",
        },{
          minute:"购买商品使用优惠券",
          times:"使用成功",
          level:"优惠券张数限制",
        },{
          minute:"加入购物车",
          times:"加入成功",
          level:"购物车商品数量限制",
        },{
          minute:"添加地址",
          times:"添加成功",
          level:"地址无效",
        },{
          minute:"取消订单",
          times:"取消成功",
          level:"取消时间限制;退款金额限制",
        },
        {
          minute:"物流",
          times:"确认收货",
          level:"自动确认时间限制;商品丢失;商品损坏;超过预计时间;退货/换货",
        },
        {
          minute:"评价",
          times:"评价成功",
          level:"默认好评时间限制",
        },
       
        ], }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {

  },
};
</script>

<style scoped lang="less">


</style>