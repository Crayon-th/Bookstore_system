<!-- eslint-disable prettier/prettier -->
<template>

    <CardBox class="mb-6 book-box-bg">
        <div style="display:flex">
            <img :src="getAssetsImages(props.bookBgUrl)" class="book-bg">
            <CardBox class="book-txt">
                <b class="font-black">书本名称：{{props.bookName}}</b>
                <br>
                <b class="font-black">ISBN：{{props.bookISBN}}</b>
                <br>
                <b class="font-black">书本作者：{{props.bookAuthor}}</b>
                <br>
                <b class="font-black">书籍版本：{{props.bookVersion}}</b>
                <br>
                <b class="font-black">创建时间：{{props.bookCreateTime}}</b>
                <br>
                <b class="font-black">损坏情况：{{props.bookDamageCondition}}</b>
                <br>
                <b class="font-black">新旧程度：{{props.bookAgingCondition}}</b>
                <br>
                <b class="font-black">书本价格：{{props.bookPrice}}</b>
                <br>
            </CardBox>
        </div>
    </CardBox>
           
</template>


<script setup>
import CardBox from "@/components/CardBox.vue";

const getAssetsImages = (name) => {
  return new URL(name, import.meta.url).href; //本地文件路径
};

const props = defineProps({
  bookBgUrl: {
    type: String,
    default: "../assets/img/bookCover1.jpg",
  },
  bookName: {
    type: String,
    default: "这本书还没有名字欸~",
  },
  bookAuthor: {
    type: String,
    default: "佚名",
  },
  bookVersion: {
    type: String,
    default: "未说明版本",
  },
  bookISBN: {
    type: String,
    default: "暂无ISBN码",
  },
  bookCreateTime: {
    type: String,
    default: "未知",
  },
  bookDamageCondition: {
    type: String,
    default: "未知",
  },
  bookAgingCondition: {
    type: String,
    default: "未知",
  },
  bookPrice: {
    type: String,
    default: "暂无价格",
  },
});
</script>

<style scoped>
.book-box-bg {
  display: flex;
  flex-direction: column;
  background-size: 100% 100%;
  background-image: url("@/assets/img/1.jpg");
  background-attachment: fixed;
  background-size: 100% 100%;
  height: 300px;
}
.book-bg {
  width: 200px;
  height: 250px;
}
.book-txt {
  width: 50%;
  height: 250px;
  position: absolute;
  left: 40%;
}
</style>
