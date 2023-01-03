<script setup>
import { ref, computed, reactive, onMounted } from "vue";
import { useStyleStore } from "@/stores/style.js";
import { useMainStore } from "@/stores/main";
import {
    mdiArrowLeftThick,
    mdiArrowRightThick,
    mdiComment,
    mdiPencil,
    mdiStar
} from "@mdi/js";
import { useRouter } from "vue-router";
import BaseButton from "@/components/BaseButton.vue";
import BaseDivider from "@/components/BaseDivider.vue";
import CardBoxBook from "@/components/CardBoxBook.vue";
import SectionMain from "@/components/SectionMain.vue";
import CardBox from "@/components/CardBox.vue";
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import BaseIcon from "@/components/BaseIcon.vue";
import SectionTitleLineWithButton from "../components/SectionTitleLineWithButton.vue";
import StarRating from '../components/StarRating.vue'
import FormField from "@/components/FormField.vue";
import FormControl from "@/components/FormControl.vue";
import CardBoxModal from "@/components/CardBoxModal.vue";
import {UserPostReview, UserGetReview, UserPostRating} from "@/api/CommentPart.js"
import {ReportComment} from "@/api/reportPart.js";

const mainStore = useMainStore()
const router = useRouter();

const showTextBox = ref(false);
const showReportBox = ref(false);

const submitRating = () => {
    console.log(ratingForm.rating)
  //
};

const submitComment = () => {
    //
    console.log(commentForm)
    let data = {
        isbn: commentForm.isbn,
        content: commentForm.content,
        replyID: commentForm.userId,
    }

    console.log(data);

    UserPostReview(data)
    .then((response) => {
      console.log(response);
      if (response.data == 1) {
        //提交成功
        showSubmit.value = true;
      } else {
        errorTip.value = response.data.message;
        showProblem.value = true;
      }
    })
    .catch((error) => {
      //提交失败
      errorTip.value = "网络问题";
      showProblem.value = true;
      console.log(error);
    });
}

const getConfirmInfo = (Info) => {
  showSubmit.value = false;
}

const getRating = (val) => {
    ratingForm.rating = val;
    console.log(ratingForm.rating);

    let data = {
        isbn: BookDetail.value.isbn,
        score: ratingForm.rating
    }
    console.log(data)
    UserPostRating(data)
    .then((response) => {
      console.log(response);
      if (response.data == 1) {
        //提交成功
        showSubmit.value = true;
      } else {
        errorTip.value = response.data.message;
        showProblem.value = true;
      }
    })
    .catch((error) => {
      //提交失败
      errorTip.value = "网络问题";
      showProblem.value = true;
      console.log(error);
    });
}

var BookInfo = ref(router.currentRoute.value.params);

console.log(BookInfo)

const book = {
    ISBN: "114514514514",
    bookName: "La Peste",
    author: "Albert Camus",
    publisher: "Shanghai Translation Publishing House",
    pageNum: "280",
    publishTime: "2014-8-10",
    price: "34.00(yuan)",
    url: "/admin-one-vue-tailwind/src/assets/img/bookCover16.jpg",
    rate: 9.1
}

const SizeOnePage = ref(10);
var CurrentPage = ref(1);
var MaxPage = ref(1);
var commentsList = ref([])
//错误提示
const errorTip = ref("");
//显示提交成功
const showSubmit = ref(false);
//显示提交失败
const showProblem = ref(false);

var BookDetail = ref(router.currentRoute.value.params);

const replyToUser = (comment) =>{
    showTextBox.value = true
    replyToUserForm.targetUserId = comment.replyID
    console.log(replyToUserForm)
}

const ratingForm = reactive({
    rating : 0
})

const commentForm = reactive({
    content : "",
    isbn : BookDetail.value.isbn,
    userId : mainStore.userId
})

const replyToUserForm = reactive({
    content : "",
    isbn : BookDetail.value.isbn,
    replyUserId : mainStore.userId,
    targetUserId : 0
})

let reportDetail = {
  bookreviewid : "",
  reportID : "",
  violationType: "",
  violationDescription: "",
}

const submitReply = () => {
    console.log(replyToUserForm)
    let data = {
        isbn: replyToUserForm.isbn,
        content: replyToUserForm.content,
        replyID: replyToUserForm.replyUserId,
        targetID: replyToUserForm.targetUserId
    }
    showTextBox.value = false;

    console.log(replyToUserForm)
    console.log(data);

    UserPostReview(data)
    .then((response) => {
      console.log(response);
      if (response.data == 1) {
        //提交成功
        showSubmit.value = true;
      } else {
        errorTip.value = response.data.message;
        showProblem.value = true;
      }
    })
    .catch((error) => {
      //提交失败
      errorTip.value = "网络问题";
      showProblem.value = true;
      console.log(error);
    });
}

const createReport = (comment) => {
  reportDetail.bookreviewid = comment.id;
  reportDetail.reportID = comment.replyID;
  showReportBox.value = true;
}

const submitCommentReport = () => {
  let data = {
    bookreviewid : reportDetail.bookreviewid,
    reportID : reportDetail.reportID,
    violationDescription : reportDetail.violationDescription,
    violationType : reportDetail.violationType,
  }
  console.log(data);
  ReportComment(data)
    .then((response) => {
      console.log(response.data);
      if (response.data == 1) {
        //提交成功
        showSubmit.value = true;
      }
      else {
        errorTip.value = response.data.message;
        showProblem.value = true;
      }
    })
    .catch((error) => {
      //提交失败
      errorTip.value = "网络问题";
      showProblem.value = true;
      console.log(error);
    });
}

const GetNowCommentPage = () => {
    let data = {
        isbn : BookDetail.value.isbn
    }
    UserGetReview(data).then((response) => {
          commentsList.value = response.data;
          console.log(commentsList.value)
        })
        .catch((error) => {
          console.log(error);
        });
};

onMounted(() => {
  GetNowCommentPage();
  console.log(BookDetail.value);
//   console.log(mainStore.userAvatar)
});


</script>

<template>
    <LayoutAuthenticated>
        <CardBoxModal v-model="showSubmit" @confirm="getConfirmInfo" title="提交成功" button="success">
        </CardBoxModal>
        <!--出了点问题-->
        <CardBoxModal v-model="showProblem" @confirm="getConfirmInfo" title="系统开小差了" button="danger">
        <p>{{ errorTip }}</p>
        </CardBoxModal>

      <CardBoxModal v-model="showTextBox" @confirm="submitReply" title="输入评论: " button="success" hasCancel>
        <FormControl
            v-model="replyToUserForm.content"
            type="tel"
            placeholder="请输入友善的评论吧"
        />
      </CardBoxModal>
      <CardBoxModal v-model="showReportBox" @confirm="submitCommentReport" title="举报评论: " button="success" hasCancel>
        <FormControl
            v-model="reportDetail.violationType"
            type="tel"
            placeholder="违规类型..."
        />
        <FormControl
            v-model="reportDetail.violationDescription"
            type="tel"
            placeholder="简要描述(可选)..."
        />
      </CardBoxModal>
        <SectionMain>
            <div class="grid grid-cols-1 gap-6 mb-4 mr-24">
                <CardBoxBook  class="bg-white">
                    <div class="flex">
                        <div class="ml-10">
                            <img :src="book.url" alt="BookImg" class="w-48 h-80 flex-none">
                        </div>

                        <CardBox class="w-4/7 ml-16">
                            <p class="text-base font-bold text-blue-400 mt-4">书名:{{ BookDetail.bookname }}</p>
                            <p class="mt-4 text-base font-bold">作者:{{ BookDetail.author }}</p>
                            <!-- <p class="mt-6 text-base font-bold">出版日期:{{ BookDetail.publishTime }}</p>
                            <p class="mt-6 text-base font-bold">出版社:{{ BookDetail.publisher }}</p>
                            <p class="mt-6 text-base font-bold">页数:{{ BookDetail.pageNum }}</p>
                            <p class="mt-6 text-base font-bold">价格:{{ BookDetail.price }}</p> -->
                            <p class="mt-6 text-base font-bold">类型:{{ BookDetail.type }}</p>
                            <p class="mt-6 text-base font-bold">状态:{{ BookDetail.state }}</p>
                            <p class="mt-6 text-base font-bold">ISBN:{{ BookDetail.isbn }}</p>
                            <p class="mt-6 text-base font-bold">介绍:{{ BookDetail.introduction }}</p>
                        </CardBox>
                        <CardBox class="bg-purple-50 w-1/4 ml-16">
                            <p class="mt-16 text-base font-bold ml-5 text-gray-500">评分:</p>
                            <p class="mt-4 text-4xl font-bold ml-3 text-gray-700">{{Number(BookDetail.score).toFixed(1)}}</p>
                            <div class="grid grid-cols-5 mt-8">
                                <BaseIcon v-for='index in 5' :path="mdiStar" class="mr-2" size="24" />
                            </div>
                        </CardBox>
                    </div>
                </CardBoxBook>

            </div>

        </SectionMain>

        <CardBox class="bg-blue-500 w-5/6 h-28 ml-16">
            <div class="flex">
                <BaseButton @click="submitRating" class="mb-6" label="评分: " :icon="mdiPencil" color="info"></BaseButton>
                <div class="ml-16" id="app">
                    <StarRating @rating="getRating" :increment="0.5" :star-size="40" :show-rating="true"
                        :rounded-corners="true" :border-width="4" 
                        :star-points="[23,2, 14,17, 0,19, 10,34, 7,50, 23,43, 38,50, 36,34, 46,19, 31,17]">
                    </StarRating>
                    <p> </p>
                </div>
            </div>

        </CardBox>

        <BaseDivider />

        <SectionMain>
            <SectionTitleLineWithButton title="Book Reviews:" :icon = "mdiComment" main></SectionTitleLineWithButton>
            <div>
                <CardBox v-for="comment in commentsList" :key="comment" class="bg-white mr-20 h-36 mb-4">
                    <div class="flex">
                        <p class="text-blue-500 text-sm mr-6">{{comment.userName}}</p>
                        <p class="text-gray-500 text-sm">{{comment.commentTime}}</p>
                    </div>
                    <p class="mb-6 mt-2">{{comment.content}}</p>
                    <BaseButton @click="replyToUser(comment)" label="回复... " :icon="mdiPencil" color="whiteDark"></BaseButton>
                    <BaseButton style="float: right" @click="createReport(comment)" label="举报评论 " :icon="mdiPencil" color="danger"></BaseButton>
                    <!-- <BaseDivider /> -->
                </CardBox>


            </div>
            <div class="grid grid-cols-12">
                <BaseButton class="col-start-1 col-span-1"
                color="whiteDark"
                label="上一页"
                :icon="mdiArrowLeftThick"
                />
                <BaseButton class="col-start-11 col-span-1"
                color="whiteDark"
                label="下一页"
                :icon="mdiArrowRightThick"
                />
            </div>
            <div class="mt-8">
                <FormField label="Comment Content" help="">
                <FormControl
                    v-model="commentForm.content"
                    type="tel"
                    placeholder="请输入友善的评论吧"
                />
                </FormField>
                <BaseButton
                label="发表"
                color="whiteDark"
                :icon="mdiPencil"
                @click="submitComment"
                />
            </div>
        </SectionMain>

    </LayoutAuthenticated>
</template>

<style scoped>

body {
  font-family: 'Raleway', sans-serif;
}

.custom-text {
  font-weight: bold;
  font-size: 1.9em;
  border: 1px solid #cfcfcf;
  padding-left: 10px;
  padding-right: 10px;
  border-radius: 5px;
  color: #999;
  background: #fff;
}


</style>