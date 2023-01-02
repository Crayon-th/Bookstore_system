<template>
  <LayoutAuthenticated>
    <CardBoxModal
      v-model="showAskCard"
      title="请确认是否要购买书籍"
      button-label="取消购买"
    >
      <BaseButton
        color="lightDark"
        label="如果确认购买，请点击此处"
        :icon="mdiShopping"
        @click="SureBuy()"
      />
    </CardBoxModal>
    <!--购买成功-->
    <CardBoxModal v-model="sureBuy" title="购买成功" button="success">
    </CardBoxModal>
    <!--出了点问题-->
    <CardBoxModal v-model="showProblem" title="系统开小差了" button="danger">
      <p>{{ errorTip }}</p>
    </CardBoxModal>
    <SectionMain>
      <!--标题-->
      <SectionTitleLineWithButton
        :icon="mdiBookOpenBlankVariant"
        title="百觅一书 · 商品详情"
        main
      />
      <CardBox>
        <div style="display: flex">
          <img :src="getAssetsImages(BookDetail.imageurl)" class="book-bg" />
          <div class="book-txt">
            <b class="text-2xl">书本名称：{{ BookDetail.bookName }}</b>
            <br />
            <br />
            <b class="text-2xl">ISBN：{{ BookDetail.isbn }}</b>
            <br />
            <br />
            <b class="text-2xl">书本作者：{{ BookDetail.author }}</b>
            <br />
            <br />
            <b class="text-2xl">书籍版本：{{ BookDetail.version }}</b>
            <br />
            <br />
            <b class="text-2xl">创建时间：{{ BookDetail.createTime }}</b>
            <br />
            <br />
            <b class="text-2xl">损坏情况：{{ BookDetail.damageCondition }}</b>
            <br />
            <br />
            <b class="text-2xl">新旧程度：{{ BookDetail.agingCondition }}</b>
            <br />
            <br />
            <b class="text-2xl">书本价格：{{ BookDetail.price }}</b>
            <br />
            <br />
            <div>
              <BaseButton
                color="lightDark"
                label="立即购买"
                :icon="mdiShopping"
                rounded-full
                @click="BuyNow()"
              />

              <div style="float: right">
                <BaseButton
                  color="lightDark"
                  label="返回"
                  :icon="mdiBackburger"
                  rounded-full
                  @click="GoBack()"
                />
              </div>
            </div>
          </div>
        </div>
      </CardBox>
    </SectionMain>
  </LayoutAuthenticated>
</template>

<script setup>
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import SectionMain from "@/components/SectionMain.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
import { mdiBookOpenBlankVariant, mdiShopping, mdiBackburger } from "@mdi/js";
import CardBox from "@/components/CardBox.vue";
import { useRouter } from "vue-router";
import { ref } from "vue";
import BaseButton from "@/components/BaseButton.vue";
import CardBoxModal from "@/components/CardBoxModal.vue";
import { useMainStore } from "@/stores/main.js";
import { CreateOrder } from "@/api/SellBookPart.js";

const mainStore = useMainStore();
const router = useRouter();
var BookDetail = ref(router.currentRoute.value.params);

const getAssetsImages = (name) => {
  return new URL(name, import.meta.url).href; //本地文件路径
};

const GoBack = () => {
  router.go(-1);
};

//显示是否要购买的询问
var showAskCard = ref(false);
const BuyNow = () => {
  if (mainStore.userName == "请登录") {
    router.push("/login");
  }
  showAskCard.value = true;
};

//错误提示语
var errorTip = ref("");
//确定购买后
var sureBuy = ref(false);
var showProblem = ref(false);
const SureBuy = () => {
  let buyer = { buyerid: mainStore.userId };
  let data = {
    id: BookDetail.value.id,
    isbn: BookDetail.value.isbn,
    bookName: BookDetail.value.bookName,
    author: BookDetail.value.author,
    version: BookDetail.value.version,
    imageurl: "",
    createTime: BookDetail.value.createTime,
    damageCondition: BookDetail.value.damageCondition,
    agingCondition: BookDetail.value.agingCondition,
    price: BookDetail.value.price,
    uid: BookDetail.value.uid,
    isFinished: BookDetail.value.isFinished,
  };
  console.log(BookDetail.value);
  CreateOrder(buyer, data)
    .then((response) => {
      console.log(response);
      if (response.data.message == "创建订单成功") {
        //购买成功
        showAskCard.value = false;
        sureBuy.value = true;
      } else {
        errorTip.value = response.data.message;
        showAskCard.value = false;
        showProblem.value = true;
      }
    })
    .catch((error) => {
      //购买失败
      errorTip.value = "网络问题";
      showAskCard.value = false;
      showProblem.value = true;
      console.log(error);
    });
};
</script>

<style scoped>
.book-bg {
  width: 400px;
  height: 500px;
}
.book-txt {
  width: 40%;
  height: 500px;
  position: absolute;
  left: 52%;
}
</style>
