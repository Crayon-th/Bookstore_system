<script setup>
import { ref, onMounted } from "vue";
// import { useStyleStore } from "@/stores/style.js";
import {
  mdiArrowLeft,
  mdiArrowRight,
  mdiBookOpenBlankVariant,
  //   mdiClose,
} from "@mdi/js";
import { useRouter } from "vue-router";
import CardBoxBook from "@/components/CardBoxBook.vue";
import SectionMain from "@/components/SectionMain.vue";
import CardBox from "@/components/CardBox.vue";
import BaseButtons from "@/components/BaseButtons.vue";
import BaseButton from "@/components/BaseButton.vue";
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
// import CardBoxComponentEmpty from "@/components/CardBoxComponentEmpty.vue";
import { GetallBooks } from "@/api/BookManagement.js";
import { useMainStore } from "@/stores/main";

const mainStore = useMainStore();

const bookInfo = ref({});
// const topBookList = ref([]);
const newBookList = ref([
  {
    ID: 1,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover1.jpg",
  },
  {
    ID: 2,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover2.jpg",
  },
  {
    ID: 3,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover3.jpg",
  },
  {
    ID: 4,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover4.jpg",
  },
  {
    ID: 5,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover5.jpg",
  },
  {
    ID: 6,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover6.jpg",
  },
  {
    ID: 7,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover7.jpg",
  },
  {
    ID: 8,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover8.jpg",
  },
  {
    ID: 9,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover9.jpg",
  },
  {
    ID: 10,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover10.jpg",
  },
  {
    ID: 11,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover11.jpg",
  },
  {
    ID: 12,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover12.jpg",
  },
  {
    ID: 13,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover13.jpg",
  },
  {
    ID: 14,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover14.jpg",
  },
  {
    ID: 15,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover15.jpg",
  },
  {
    ID: 16,
    name: "BookWhichIsGood",
    author: "PanShuo",
    date: "1145-1-4",
    publisher: "高等教育出版社",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover16.jpg",
  },
]);

const router = useRouter();

const sizeOnePage = ref(6);
var currentPage = ref(1);
var maxPage = ref(1);

//❗️获取信息api名待更新❗️
const getRealtimeNewBookList = (target = "first") => {
  if ("frist" == target) {
    let data = {
      current: currentPage.value,
      size: sizeOnePage.value,
    };
    //获取信息
    GetallBooks(data)
      .then((response) => {
        bookInfo.value = response.data;
        newBookList.value = bookInfo.value.records;
        maxPage.value = bookInfo.value.pages;
      })
      .catch((error) => {
        console.log(error);
      });
  }
  //向前获取页面(新的)
  if ("Forward" == target) {
    if (currentPage.value < maxPage.value) {
      //新的索引
      let data = {
        current: currentPage.value + 1,
        size: sizeOnePage.value,
      };
      GetallBooks(data)
        .then((response) => {
          bookInfo.value = response.data;
          newBookList.value = bookInfo.value.records;
          maxPage.value = bookInfo.value.pages;
          //页面计数加一
          currentPage.value = currentPage.value + 1;
          // for (let book of newBookList.value) {
          //   if (book.imageurl == null || book.imageurl == "") {
          //     book.imageurl = "../assets/img/bookCover1.jpg";
          //   }
          // }
        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
  //向后获取页面(老的)
  if ("Backward" == target) {
    if (currentPage.value > 1) {
      //新的索引
      let data = {
        current: currentPage.value - 1,
        size: sizeOnePage.value,
      };
      //获取信息
      GetallBooks(data)
        .then((response) => {
          bookInfo.value = response.data;
          newBookList.value = bookInfo.value.records;
          maxPage.value = bookInfo.value.pages;
          //页面计数减一
          currentPage.value = currentPage.value - 1;
          // for (let book of newBookList.value) {
          //   if (book.imageurl == null || book.imageurl == "") {
          //     book.imageurl = "../assets/img/bookCover1.jpg";
          //   }
          // }
        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
};


onMounted(() => {
  getRealtimeNewBookList("frist");
  // getRealtimeTopBookList();
});

const GoToDetail = (bookInfo) => {
  router.push({
    name: "details",
    params: bookInfo,
  });
};

const GoToAddBook = () => {
  router.push("/adding");
};
</script>

<template>
  <LayoutAuthenticated>
    <SectionMain>
      <CardBox class="bg-indigo-100 mb-6 h-28" @click="GoToAddBook">
        <p class="text-3xl font-black text-gray-700 mt-3" align="center">
          🌟添加新书🌟
        </p>
      </CardBox>
      <SectionTitleLineWithButton
        title="新书速递"
        :icon="mdiBookOpenBlankVariant"
        main
      ></SectionTitleLineWithButton>
      <div class="grid grid-cols-2 gap-6 mb-4 lg:grid-cols-2">
        <CardBoxBook
          v-for="book in newBookList"
          :key="book"
          class="bg-white"
          @click="GoToDetail(book)"
        >
          <div style="display: flex">
            <div>
              <!--暂时固定了封面-->
              <img
                src="/admin-one-vue-tailwind/src/assets/img/bookCover15.jpg"
                alt="BookImg"
                class="w-32 h-52 space-x-5"
              />
              <p class="italic font-bold text-blue-400 mt-6">
                {{ book.bookname }}
              </p>
            </div>

            <CardBox class="bg-purple-50 w-2/3 ml-6">
              <p class="mt-6 text-lg font-bold">作者:{{ book.author }}</p>
              <p class="mt-6 text-lg font-bold">书籍类型:{{ book.type }}</p>
              <p class="mt-6 text-lg font-bold">书籍版本:{{ book.version }}</p>
            </CardBox>
          </div>
        </CardBoxBook>
      </div>
      <div>
        <BaseButtons>
          <BaseButton
            color="lightDark"
            type="submit"
            label="Last Page"
            :icon="mdiArrowLeft"
            @click="getRealtimeNewBookList('Backward')"
          />
          <BaseButton
            color="lightDark"
            type="reset"
            label="Next Page"
            :icon="mdiArrowRight"
            @click="getRealtimeNewBookList('Forward')"
          />
        </BaseButtons>
      </div>

      <!-- <SectionTitleLineWithButton
        :icon="mdiAlertCircle"
        title="Empty variation"
      />

      <CardBox>
        <CardBoxComponentEmpty />
      </CardBox> -->
    </SectionMain>
  </LayoutAuthenticated>
</template>
