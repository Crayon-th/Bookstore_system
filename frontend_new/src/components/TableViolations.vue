<script setup>
import { computed, ref, onMounted } from "vue";
import { useMainStore } from "@/stores/main";
import { mdiEye } from "@mdi/js";
import CardBoxModal from "@/components/CardBoxModal.vue";
import TableCheckboxCell from "@/components/TableCheckboxCell.vue";
import BaseLevel from "@/components/BaseLevel.vue";
import BaseButtons from "@/components/BaseButtons.vue";
import BaseButton from "@/components/BaseButton.vue";
import UserAvatar from "@/components/UserAvatar.vue";
import {GetReport, GetSpecificReport, DeleteSpecificReport} from "@/api/reportPart.js";
import {AdministratorDeleteReview} from "@/api/CommentPart.js"

defineProps({
  checkable: Boolean,
});

//错误提示
const errorTip = ref("");
//显示提交成功
const showSubmit = ref(false);
//显示提交失败
const showProblem = ref(false);

const reportList = ref([]);

const mainStore = useMainStore();

const items = computed(() => reportList.value);

let isModalActive = ref(false);

let isModalDangerActive = ref(false);

const perPage = ref(5);

const currentPage = ref(0);

const checkedRows = ref([]);

const itemsPaginated = computed(() =>
  items.value.slice(
    perPage.value * currentPage.value,
    perPage.value * (currentPage.value + 1)
  )
);

const numPages = computed(() => Math.ceil(items.value.length / perPage.value));

const currentPageHuman = computed(() => currentPage.value + 1);

const pagesList = computed(() => {
  const pagesList = [];

  for (let i = 0; i < numPages.value; i++) {
    pagesList.push(i);
  }

  return pagesList;
});

let detail = {
  bookreviewid : 0,
  date : "",
  id: 0,
  reportID: 0,
  violationDescription: "",
  violationType: "",
  content: "",
  reviewDate: "",
}

onMounted(() => {
  GetReportList();
  // console.log(mainStore.userName)
  // console.log(mainStore.userAvatar)
});

const GetReportList = () => {
  let data = {
      current: 1,
      size: 20,
    };
  GetReport(data)
    .then((response) => {
      reportList.value = response.data.records;
      console.log(reportList.value);
    })
    .catch((error) => {
      console.log(error);
    });

}

const remove = (arr, cb) => {
  const newArr = [];

  arr.forEach((item) => {
    if (!cb(item)) {
      newArr.push(item);
    }
  });

  return newArr;
};

const checked = (isChecked, report) => {
  if (isChecked) {
    checkedRows.value.push(report);
  } else {
    checkedRows.value = remove(
      checkedRows.value,
      (row) => row.id === report.id
    );
  }
};

const deleteComment = (val) => {
  console.log(val);
  let data = {
    id: detail.bookreviewid,
  }
  console.log(data);
  AdministratorDeleteReview(data)
    .then((response) => {
      console.log(response);
      if (response.data == 1) {
        //提交成功
        isModalActive.value = false;
        showSubmit.value = true;
        DeleteSpecificReport(data)
        .then((response) => {
          console.log(response);
        })
        .catch((error) => {
          //提交失败
          errorTip.value = "网络问题";
          isModalActive.value = false;
          showProblem.value = true;
          console.log(error);
        });

      }
      else {
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
}

const getSubmitConfirm = (Info) => {
  console.log(Info);
}

const checkReport = (report) => {
  detail.bookreviewid = report.bookreviewid;
  detail.date = report.date;
  detail.id = report.id;
  detail.reportID = report.reportID;
  detail.violationDescription = report.violationDescription;
  detail.violationType = report.violationType
  let data = {
      id: detail.bookreviewid,
    };
  GetSpecificReport(data)
    .then((response) => {
      detail.content = response.data.content;
      detail.reviewDate = response.data.date;
      console.log(detail.content)
      isModalActive.value = true;
    })
    .catch((error) => {
      console.log(error);
    });

}

</script>

<template>
  <CardBoxModal v-model="showSubmit" @confirm="getSubmitConfirm" title="提交成功" button="success">
  </CardBoxModal>
  <CardBoxModal v-model="showProblem" @confirm="getSubmitConfirm" title="系统开小差了" button="danger">
    <p>{{ errorTip }}</p>
  </CardBoxModal>
  <CardBoxModal v-model="isModalActive" @confirm="deleteComment" title="举报详情" hasCancel buttonLabel="删除评论" button="danger">
    <div>
        <p class="italic">评论日期: {{ detail.reviewDate }}</p>
        <p>被举报评论详情: </p>
        <p class="font-bold text-xl">{{detail.content}}</p>
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
        <th>Report User Name</th>
        <th>Reported User Name</th>
        <th>Reported Comment</th>
        <th>Created</th>
        <th />
      </tr>
    </thead>
    <tbody>
      <tr v-for="report in itemsPaginated" :key="report.id">
        <TableCheckboxCell
          v-if="checkable"
          @checked="checked($event, report)"
        />
        <td class="border-b-0 lg:w-6 before:hidden">
          <UserAvatar
            :username="report.date"
            class="w-24 h-24 mx-auto lg:w-6 lg:h-6"
          />
        </td>
        <td data-label="被举报人">
          {{ report.reportID }}
        </td>
        <td data-label="Company">
          {{ report.violationType }}
        </td>
        <td data-label="City">
          {{ report.violationDescription }}
        </td>
        <td data-label="Created" class="lg:w-1 whitespace-nowrap">
          <small
            class="text-gray-500 dark:text-slate-400"
            :title="report.date"
            >{{ report.date }}</small
          >
        </td>
        <td class="before:hidden lg:w-1 whitespace-nowrap">
          <BaseButtons type="justify-start lg:justify-end" no-wrap>
            <BaseButton
              label="detail"
              color="info"
              :icon="mdiEye"
              small
              @click="checkReport(report)"
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
