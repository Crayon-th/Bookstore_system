<script setup>
import { computed, ref, onMounted } from "vue";
// import { useMainStore } from "@/stores/main";
import { mdiEye } from "@mdi/js";
import CardBoxModal from "@/components/CardBoxModal.vue";
import TableCheckboxCell from "@/components/TableCheckboxCell.vue";
import BaseLevel from "@/components/BaseLevel.vue";
import BaseButtons from "@/components/BaseButtons.vue";
import BaseButton from "@/components/BaseButton.vue";
import UserAvatar from "@/components/UserAvatar.vue";
import { GetFeedback, FinishFeedback } from "@/api/reportPart.js";

defineProps({
  checkable: Boolean,
});

// const mainStore = useMainStore();

const feedbackList = ref([]);

const items = computed(() => feedbackList.value);

let isModalActive = ref(false);

// let isModalDangerActive = ref(false);

const perPage = ref(5);

const currentPage = ref(0);

const checkedRows = ref([]);

const itemsPaginated = computed(() =>
  items.value.slice(
    perPage.value * currentPage.value,
    perPage.value * (currentPage.value + 1)
  )
);

let detail = {
  content: "",
  createtime: "",
  handle: false,
  id: 0,
  userid: 0,
};

const numPages = computed(() => Math.ceil(items.value.length / perPage.value));

const currentPageHuman = computed(() => currentPage.value + 1);

const pagesList = computed(() => {
  const pagesList = [];

  for (let i = 0; i < numPages.value; i++) {
    pagesList.push(i);
  }

  return pagesList;
});

//错误提示
const errorTip = ref("");
//显示提交成功
const showSubmit = ref(false);
//显示提交失败
const showProblem = ref(false);

onMounted(() => {
  GetFeedbackList();
  // console.log(mainStore.userName)
  // console.log(mainStore.userAvatar)
});

const GetFeedbackList = () => {
  let data = {
    current: 1,
    size: 20,
  };
  GetFeedback(data)
    .then((response) => {
      feedbackList.value = response.data.records;
      console.log(feedbackList.value);
    })
    .catch((error) => {
      console.log(error);
    });
};

const remove = (arr, cb) => {
  const newArr = [];

  arr.forEach((item) => {
    if (!cb(item)) {
      newArr.push(item);
    }
  });

  return newArr;
};

const checked = (isChecked, feedback) => {
  if (isChecked) {
    checkedRows.value.push(feedback);
  } else {
    checkedRows.value = remove(
      checkedRows.value,
      (row) => row.id === feedback.id
    );
  }
};

const getSubmitConfirm = (Info) => {
  showSubmit.value = false;
  showProblem.value = false;
  console.log(Info);
};

const submitFinish = (val) => {
  console.log(val);
  isModalActive.value = false;
  let data = {
    id: detail.id,
  };
  console.log(data);
  FinishFeedback(data)
    .then((response) => {
      console.log(response);
      if (response.data.message == "成功处理反馈") {
        //提交成功
        isModalActive.value = false;
        showSubmit.value = true;
      } else {
        errorTip.value = response.data.message;
        isModalActive.value = false;
        showProblem.value = true;
      }
    })
    .catch((error) => {
      //提交失败
      errorTip.value = "网络问题";
      isModalActive.value = false;
      showProblem.value = true;
      console.log(error);
    });

  // console.log(data);
  // DeleteApply(data)
  // .then((response) => {
  //   console.log(response);
  // })
  // .catch((error) => {
  //   console.log(error);
  // });
};

const checkFeedback = (feedback) => {
  isModalActive.value = true;
  detail.content = feedback.content;
  detail.createtime = feedback.bookname;
  detail.handle = feedback.handle;
  detail.id = feedback.id;
  detail.userid = feedback.userid;
};
</script>

<template>
  <CardBoxModal
    v-model="showSubmit"
    title="提交成功"
    button="success"
    @confirm="getSubmitConfirm"
  >
  </CardBoxModal>
  <CardBoxModal
    v-model="showProblem"
    title="系统开小差了"
    button="danger"
    @confirm="getSubmitConfirm"
  >
    <p>{{ errorTip }}</p>
  </CardBoxModal>
  <CardBoxModal
    v-model="isModalActive"
    title="反馈详情"
    button-label="完成记录"
    @confirm="submitFinish"
  >
    <div class="mt-6">
      <p class="font-bold">反馈内容: {{ detail.content }}</p>
    </div>
  </CardBoxModal>

  <div v-if="checkedRows.length" class="p-3 bg-gray-100/50 dark:bg-slate-800">
    <span
      v-for="checkedRow in checkedRows"
      :key="checkedRow.id"
      class="inline-block px-2 py-1 rounded-sm mr-2 text-sm bg-gray-100 dark:bg-slate-700"
    >
      {{ checkedRow.name }}
    </span>
  </div>

  <table>
    <thead>
      <tr>
        <th v-if="checkable" />
        <th />
        <th>User Name</th>
        <th>feedback content</th>
        <th>Created</th>
        <th />
      </tr>
    </thead>
    <tbody>
      <tr v-for="feedback in itemsPaginated" :key="feedback.id">
        <TableCheckboxCell
          v-if="checkable"
          @checked="checked($event, feedback)"
        />
        <td class="border-b-0 lg:w-6 before:hidden">
          <UserAvatar
            :username="String(feedback.userid)"
            class="w-24 h-24 mx-auto lg:w-6 lg:h-6"
          />
        </td>
        <td data-label="Name">
          {{ feedback.userid }}
        </td>
        <td data-label="Company">
          {{ feedback.content }}
        </td>
        <td data-label="createtime" class="lg:w-1 whitespace-nowrap">
          <small
            class="text-gray-500 dark:text-slate-400"
            :title="feedback.createtime"
            >{{ feedback.createtime }}</small
          >
        </td>
        <td class="before:hidden lg:w-1 whitespace-nowrap">
          <BaseButtons type="justify-start lg:justify-end" no-wrap>
            <BaseButton
              label="detail"
              color="info"
              :icon="mdiEye"
              small
              @click="checkFeedback(feedback)"
            />
          </BaseButtons>
        </td>
      </tr>
    </tbody>
  </table>
  <div class="p-3 lg:px-6 border-t border-gray-100 dark:border-slate-800">
    <BaseLevel>
      <BaseButtons>
        <BaseButton
          v-for="page in pagesList"
          :key="page"
          :active="page === currentPage"
          :label="page + 1"
          :color="page === currentPage ? 'lightDark' : 'whiteDark'"
          small
          @click="currentPage = page"
        />
      </BaseButtons>
      <small>Page {{ currentPageHuman }} of {{ numPages }}</small>
    </BaseLevel>
  </div>
</template>
