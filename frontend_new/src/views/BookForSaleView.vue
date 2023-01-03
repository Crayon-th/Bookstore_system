<!-- eslint-disable prettier/prettier -->
<template>
  <LayoutAuthenticated>
      <CardBoxModal
      v-model="showAskCard"
      title="请确认是否要删除书籍"
      button-label="取消删除"
      >
          <BaseButton
              color="lightDark"
              label="如果确认删除，请点击此处"
              @click="DeleteBookForSale()"
          />
      </CardBoxModal>
      <!--删除成功-->
      <CardBoxModal v-model="sureDelete" title="删除成功" button="success">
      </CardBoxModal>
      <!--出了点问题-->
      <CardBoxModal v-model="showProblem" title="系统开小差了" button="danger">
      <p>{{ errorTip }}</p>
      </CardBoxModal>
      <SectionMain>
          <!--标题-->
          <SectionTitleLineWithButton
          :icon="mdiShopping"
          title="百觅一书 · 我的待售"
          main
          />

          <CardBox 
          v-for="(each, index) in BookList"
          :key="index"
          class="mb-6"
          >
              <BookBox
                  :book-bg-url="each.imageurl"
                  :book-name="each.bookName"
                  :book-author="each.author"
                  :book-version="each.version"
                  :book-i-s-b-n="each.isbn"
                  :book-create-time="each.createTime"
                  :book-damage-condition="each.damageCondition"
                  :book-aging-condition="each.agingCondition"
                  :book-price="each.price"
              />
              <CardBox @click="SureDeleteBookForSale(each.id)">
                  <h1 class="text-2xl" align="center">删除交易</h1>
              </CardBox>
          </CardBox>

          <div >
              <BaseButton
              color="lightDark"
              label="上一页"
              :icon="mdiArrowLeft"
              rounded-full
              @click="GetNowPage('backward')"
              />

              <div style="float: right">
                  <BaseButton
                  color="lightDark"
                  label="下一页"
                  :icon="mdiArrowRight"
                  rounded-full
                  @click="GetNowPage('forward')"
                  />
              </div>
          </div>
                   
      </SectionMain>
  </LayoutAuthenticated>
</template>

<script setup>
import { mdiArrowLeft, mdiArrowRight } from "@mdi/js";
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import SectionMain from "@/components/SectionMain.vue";
import { ref, onMounted } from "vue";
import BaseButton from "@/components/BaseButton.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
import { mdiShopping } from "@mdi/js";
import CardBox from "@/components/CardBox.vue";
import BookBox from "@/components/BookBox.vue";
import CardBoxModal from "@/components/CardBoxModal.vue";
import { useMainStore } from "@/stores/main.js";
import { CommodityDisplayToSeller } from "@/api/ProductDisplay.js";
import { DeleteMyBook } from "@/api/SellBookPart.js";

const SizeOnePage = ref(2);
var CurrentPage = ref(1);
var MaxPage = ref(1);

var BookList = ref([]);

const mainStore = useMainStore();
//获取购买的订单
const GetNowPage = (distance) => {
//首次获取页面
if ("frist" == distance) {
  let data = {
    uid: mainStore.userId,
    current: CurrentPage.value,
    size: SizeOnePage.value,
  };
  CommodityDisplayToSeller(data)
    .then((response) => {
      BookList.value = response.data.records;
      MaxPage.value = response.data.pages;
      for (let each of BookList.value) {
        if (each.imageurl == null || each.imageurl == "") {
          each.imageurl = "../assets/img/bookCover1.jpg";
        }
      }
    })
    .catch((error) => {
      console.log(error);
    });
}
//向前获取页面(新的)
if ("forward" == distance) {
  if (CurrentPage.value < MaxPage.value) {
    //新的索引
    let data = {
      uid: mainStore.userId,
      current: CurrentPage.value + 1,
      size: SizeOnePage.value,
    };
    CommodityDisplayToSeller(data)
      .then((response) => {
        MaxPage.value = response.data.pages;
        BookList.value = response.data.records;
        //页面计数加一
        CurrentPage.value = CurrentPage.value + 1;
        for (let each of BookList.value) {
          if (each.imageurl == null || each.imageurl == "") {
            each.imageurl = "../assets/img/bookCover1.jpg";
          }
        }
      })
      .catch((error) => {
        console.log(error);
      });
  }
}
//向后获取页面(老的)
if ("backward" == distance) {
  if (CurrentPage.value > 1) {
    //新的索引
    let data = {
      uid: mainStore.userId,
      current: CurrentPage.value - 1,
      size: SizeOnePage.value,
    };
    CommodityDisplayToSeller(data)
      .then((response) => {
        MaxPage.value = response.data.pages;
        BookList.value = response.data.records;
        //页面计数减一
        CurrentPage.value = CurrentPage.value - 1;
        for (let each of BookList.value) {
          if (each.imageurl == null || each.imageurl == "") {
            each.imageurl = "../assets/img/bookCover1.jpg";
          }
        }
      })
      .catch((error) => {
        console.log(error);
      });
  }
}
};

onMounted(() => {
GetNowPage("frist");
});

var showAskCard = ref(false);
//错误提示语
var errorTip = ref("");
//确定删除后
var sureDelete = ref(false);
var showProblem = ref(false);
//记录要删除的ID
var deteleId = ref(0);

const SureDeleteBookForSale = (BookId) => {
deteleId.value = BookId;
showAskCard.value = true;
};

const DeleteBookForSale = () => {
let data = {
  uid: mainStore.userId,
  id: deteleId.value,
};
DeleteMyBook(data)
  .then((response) => {
    if (response.data.message == "商品删除成功") {
      //删除成功
      showAskCard.value = false;
      sureDelete.value = true;
    } else {
      errorTip.value = response.data.message;
      showAskCard.value = false;
      showProblem.value = true;
    }

    console.log(response);
  })
  .catch((error) => {
    //删除失败
    errorTip.value = "网络问题";
    showAskCard.value = false;
    showProblem.value = true;
    console.log(error);
  });
};
</script>
