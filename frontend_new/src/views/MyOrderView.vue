<template>
  <LayoutAuthenticated>
    <SectionMain>
      <!--标题-->
      <div style="display: flex">
        <SectionTitleLineWithButton
          :icon="mdiShopping"
          title="百觅一书 · 我的订单"
          main
        />
        <div class="title-button">
          <BaseButton
            color="lightDark"
            label="点我反馈"
            @click="ClickMakeComments()"
          />
        </div>
      </div>

      <div style="display: flex">
        <div class="buy-box">
          <h1 class="text-3xl">我购买的订单</h1>
          <br />
          <CardBox
            v-for="(each, index) in BuyOrderList"
            :key="index"
            class="mb-6"
          >
            <b class="font-black">订单类型：购买</b>
            <br />
            <b class="font-black">订单编号：{{ each.id }}</b>
            <br />
            <b class="font-black">订单价格：{{ each.price }}</b>
            <br />
            <b class="font-black">订单时间：{{ each.createTime }}</b>
            <br />
            <b class="font-black">售方ID：{{ each.sellerid }}</b>
            <br />
          </CardBox>
          <div>
            <BaseButton
              color="lightDark"
              label="上一页"
              :icon="mdiArrowLeft"
              rounded-full
              @click="GetNowBuyPage('backward')"
            />

            <div style="float: right">
              <BaseButton
                color="lightDark"
                label="下一页"
                :icon="mdiArrowRight"
                rounded-full
                @click="GetNowBuyPage('forward')"
              />
            </div>
          </div>
        </div>
        <div class="sell-box">
          <h1 class="text-3xl">我出售的订单</h1>
          <br />
          <CardBox
            v-for="(each, index) in SellOrderList"
            :key="index"
            class="mb-6"
          >
            <b class="font-black">订单类型：出售</b>
            <br />
            <b class="font-black">订单编号：{{ each.id }}</b>
            <br />
            <b class="font-black">订单价格：{{ each.price }}</b>
            <br />
            <b class="font-black">订单时间：{{ each.createTime }}</b>
            <br />
            <b class="font-black">买方ID：{{ each.buyerid }}</b>
            <br />
          </CardBox>
          <div>
            <BaseButton
              color="lightDark"
              label="上一页"
              :icon="mdiArrowLeft"
              rounded-full
              @click="GetNowSellPage('backward')"
            />

            <div style="float: right">
              <BaseButton
                color="lightDark"
                label="下一页"
                :icon="mdiArrowRight"
                rounded-full
                @click="GetNowSellPage('forward')"
              />
            </div>
          </div>
        </div>
      </div>
    </SectionMain>

    <!--反馈界面-->
    <CardBoxModal
      v-model="ShowMakeComments"
      title="反馈意见"
      button="success"
      button-label="提交评论"
      @confirm="ConfirmMakeComment()"
    >
      <div class="mt-8">
        <FormField label="Comment Content" help="">
          <FormControl
            v-model="FeedbackContent"
            type="tel"
            placeholder="请输入友善的评论吧"
          />
        </FormField>
      </div>
    </CardBoxModal>
    <!--成功提交-->
    <CardBoxModal
      v-model="showSubmit"
      title="提交成功"
      button="success"
      @confirm="getSuccessConfirmInfo"
    >
    </CardBoxModal>
    <!--出了点问题-->
    <CardBoxModal
      v-model="showProblem"
      title="系统开小差了"
      button="danger"
      @confirm="getErrorConfirmInfo"
    >
    </CardBoxModal>
  </LayoutAuthenticated>
</template>

<script setup>
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import SectionMain from "@/components/SectionMain.vue";
import { ref, onMounted } from "vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
import { mdiShopping, mdiArrowRight, mdiArrowLeft } from "@mdi/js";
import BaseButton from "@/components/BaseButton.vue";
import CardBox from "@/components/CardBox.vue";
import { useMainStore } from "@/stores/main.js";
import { BuyerGetOrder, SellerGetOrder } from "@/api/SellBookPart.js";
import { UserFeedBack } from "@/api/reportPart.js";
import CardBoxModal from "@/components/CardBoxModal.vue";
import FormField from "@/components/FormField.vue";
import FormControl from "@/components/FormControl.vue";

const SizeOnePage = ref(2);

var CurrentBuyPage = ref(1);
var MaxBuyPage = ref(1);

var CurrentSellPage = ref(1);
var MaxSellPage = ref(1);

var BuyOrderList = ref([]);
var SellOrderList = ref([]);

//显示提意见窗口
const ShowMakeComments = ref(false);
//提出意见的内容
var FeedbackContent = ref("");
//点击提出意见
const ClickMakeComments = () => {
  //
  ShowMakeComments.value = true;
};
//结束提出意见
const ConfirmMakeComment = () => {
  //
  ShowMakeComments.value = false;
  //如果评论不为空
  if (FeedbackContent.value != "") {
    //发送的反馈
    let data = {
      id: 0,
      userid: mainStore.userId,
      content: FeedbackContent.value,
      handle: false,
      createtime: "",
    };
    //发送反馈
    UserFeedBack(data)
      .then((response) => {
        console.log(response);
        showSubmit.value = true;
      })
      .catch((error) => {
        showProblem.value = true;
        console.log(error);
      });
  }
};
//显示提交成功
const showSubmit = ref(false);
//显示提交失败
const showProblem = ref(false);
//结束成功窗口
const getSuccessConfirmInfo = () => {
  //
  showSubmit.value = false;
};
//结束失败窗口
const getErrorConfirmInfo = () => {
  //
  showProblem.value = false;
};

const mainStore = useMainStore();

//获取购买的订单
const GetNowBuyPage = (distance) => {
  //首次获取页面
  if ("frist" == distance) {
    let data = {
      buyerid: mainStore.userId,
      current: CurrentBuyPage.value,
      size: SizeOnePage.value,
      sort: false,
    };
    BuyerGetOrder(data)
      .then((response) => {
        BuyOrderList.value = response.data.records;
        MaxBuyPage.value = response.data.pages;
        console.log(BuyOrderList.value);
      })
      .catch((error) => {
        console.log(error);
      });
  }
  //向前获取页面(新的)
  if ("forward" == distance) {
    if (CurrentBuyPage.value < MaxBuyPage.value) {
      //新的索引
      let data = {
        buyerid: mainStore.userId,
        current: CurrentBuyPage.value + 1,
        size: SizeOnePage.value,
        sort: false,
      };
      BuyerGetOrder(data)
        .then((response) => {
          BuyOrderList.value = response.data.records;
          //页面计数加一
          CurrentBuyPage.value = CurrentBuyPage.value + 1;
          console.log(BuyOrderList.value);
        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
  //向后获取页面(老的)
  if ("backward" == distance) {
    if (CurrentBuyPage.value > 1) {
      //新的索引
      let data = {
        buyerid: mainStore.userId,
        current: CurrentBuyPage.value - 1,
        size: SizeOnePage.value,
        sort: false,
      };
      BuyerGetOrder(data)
        .then((response) => {
          BuyOrderList.value = response.data.records;
          //页面计数减一
          CurrentBuyPage.value = CurrentBuyPage.value - 1;
          console.log(BuyOrderList.value);
        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
};

//获取出售的订单
const GetNowSellPage = (distance) => {
  //首次获取页面
  if ("frist" == distance) {
    let data = {
      sellerid: mainStore.userId,
      current: CurrentSellPage.value,
      size: SizeOnePage.value,
      sort: false,
    };
    SellerGetOrder(data)
      .then((response) => {
        SellOrderList.value = response.data.records;
        MaxSellPage.value = response.data.pages;
        console.log(SellOrderList.value);
      })
      .catch((error) => {
        console.log(error);
      });
  }
  //向前获取页面(新的)
  if ("forward" == distance) {
    if (CurrentSellPage.value < MaxSellPage.value) {
      //新的索引
      let data = {
        sellerid: mainStore.userId,
        current: CurrentSellPage.value + 1,
        size: SizeOnePage.value,
        sort: false,
      };
      SellerGetOrder(data)
        .then((response) => {
          SellOrderList.value = response.data.records;
          //页面计数加一
          CurrentSellPage.value = CurrentSellPage.value + 1;
          console.log(SellOrderList.value);
        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
  //向后获取页面(老的)
  if ("backward" == distance) {
    if (CurrentSellPage.value > 1) {
      //新的索引
      let data = {
        sellerid: mainStore.userId,
        current: CurrentSellPage.value - 1,
        size: SizeOnePage.value,
        sort: false,
      };
      SellerGetOrder(data)
        .then((response) => {
          SellOrderList.value = response.data.records;
          //页面计数减一
          CurrentSellPage.value = CurrentSellPage.value - 1;
          console.log(SellOrderList.value);
        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
};

onMounted(() => {
  GetNowBuyPage("frist");
  GetNowSellPage("frist");
});
</script>
<style scoped>
.buy-box {
  width: 45%;
}
.sell-box {
  width: 35%;
  position: absolute;
  left: 60%;
}

.title-button {
  position: relative;
  left: 62%;
}
</style>
