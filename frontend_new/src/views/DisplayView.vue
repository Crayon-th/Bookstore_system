<!-- eslint-disable prettier/prettier -->
<template>
  <LayoutAuthenticated>
      <SectionMain>
          <!--标题-->
          <SectionTitleLineWithButton
          :icon="mdiBookOpenBlankVariant"
          title="百觅一书 · 书籍交易"
          main
          />

          <div style="display:flex">
            <BaseButton
            color="lightDark"
            label="搜索书籍信息"
            :icon="mdiSearchWeb"
            @click="SeachBookInfo"
            />
            <FormControl @keyup.enter.native="SeachBookInfo"
            v-model="SeachInfo"
            class="search-info-box"
            placeholder="请输入书籍信息"
            />
          </div>

          <br>

          <BookBox
              v-for="(each, index) in BookList"
              :key="index"
              :book-bg-url="each.imageurl"
              :book-name="each.bookName"
              :book-author="each.author"
              :book-version="each.version"
              :book-i-s-b-n="each.isbn"
              :book-create-time="each.createTime"
              :book-damage-condition="each.damageCondition"
              :book-aging-condition="each.agingCondition"
              :book-price="each.price"
              @click="GetDetail(each)"
          />

          <CardBox class="mb-6" @click="ToSellBook()">
            <p class="text-2xl" align="center">我 要 售 书</p>
          </CardBox>

          <CardBox class="mb-6" @click="ToGetMyOrder()">
            <p class="text-2xl" align="center">我 的 订 单</p>
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
import BookBox from "@/components/BookBox.vue";
import { ref, onMounted } from "vue";
import BaseButton from "@/components/BaseButton.vue";
import FormControl from "@/components/FormControl.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
import { useRouter } from "vue-router";
import { mdiBookOpenBlankVariant, mdiSearchWeb } from "@mdi/js";
import CardBox from "@/components/CardBox.vue";
import { useMainStore } from "@/stores/main.js";
import {
  CommodityDisplay,
  CommodityDisplayToBookName,
} from "@/api/ProductDisplay.js";

const SizeOnePage = ref(4);
var CurrentPage = ref(1);
var MaxPage = ref(1);

var GetInfo = ref({});

var BookList = ref([]);

var SeachInfo = ref("");

var IfSearch = ref(false);

const GetNowPage = (distance) => {
  //首次获取页面
  if ("frist" == distance) {
    let data = {
      current: CurrentPage.value,
      size: SizeOnePage.value,
    };
    //获取信息
    GetBookInfo(data)
      .then((response) => {
        GetInfo.value = response.data;
        BookList.value = GetInfo.value.records;
        MaxPage.value = GetInfo.value.pages;
        for (let each of BookList.value) {
          if (each.imageurl == null || each.imageurl == "") {
            each.imageurl = "../assets/img/bookCover1.jpg";
          }
        }
      })
      .catch((error) => {
        console.log(error);
      });

    // BookList.value = GetInfo.value.records;
    // MaxPage.value = GetInfo.value.pages;
  }
  //向前获取页面(新的)
  if ("forward" == distance) {
    if (CurrentPage.value < MaxPage.value) {
      //新的索引
      let data = {
        current: CurrentPage.value + 1,
        size: SizeOnePage.value,
      };
      //获取信息
      GetBookInfo(data)
        .then((response) => {
          GetInfo.value = response.data;
          BookList.value = GetInfo.value.records;
          MaxPage.value = GetInfo.value.pages;
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
        current: CurrentPage.value - 1,
        size: SizeOnePage.value,
      };
      //获取信息
      GetBookInfo(data)
        .then((response) => {
          GetInfo.value = response.data;
          BookList.value = GetInfo.value.records;
          MaxPage.value = GetInfo.value.pages;
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

const router = useRouter();

const GetDetail = (bookDetail) => {
  router.push({
    name: "buyBookDetail",
    params: bookDetail,
  });
};

onMounted(() => {
  GetNowPage("frist");
  console.log(mainStore.userName);
  console.log(mainStore.userAvatar);
});

const mainStore = useMainStore();

const ToSellBook = () => {
  if (mainStore.userName == "") {
    router.push("/login");
  } else {
    router.push("/sellBook");
  }
};

const ToGetMyOrder = () => {
  if (mainStore.userName == "") {
    router.push("/login");
  } else {
    router.push("/myOrder");
  }
};

const SeachBookInfo = () => {
  if (SeachInfo.value == null || SeachInfo.value == "") {
    IfSearch = false;
  } else {
    IfSearch = true;
  }

  console.log("aaaa");
  CurrentPage.value = 1;
  GetNowPage("frist");
};

const GetBookInfo = (data) => {
  if (IfSearch.value == false) {
    return CommodityDisplay(data);
  } else {
    let newData = {
      bookName: SeachInfo.value,
      current: data.current,
      size: data.size,
    };
    return CommodityDisplayToBookName(newData);
  }
};
</script>
<style scoped>
.search-info-box {
  width: 85%;
}
</style>
