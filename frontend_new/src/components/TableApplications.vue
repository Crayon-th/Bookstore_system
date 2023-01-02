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
import { AddNewBook, GetApply, DeleteApply} from "@/api/BookManagement.js";

defineProps({
  checkable: Boolean,
});

const mainStore = useMainStore();

const applicationList = ref([]);

//错误提示
const errorTip = ref("");
//显示提交成功
const showSubmit = ref(false);
//显示提交失败
const showProblem = ref(false);

const GetApplicationList = () => {
  let data = {
      current: 1,
      size: 20,
    };
  GetApply(data)
    .then((response) => {
      applicationList.value = response.data.records;
      console.log(applicationList.value[0]);
    })
    .catch((error) => {
      console.log(error);
    });

}

onMounted(() => {
  GetApplicationList();
  // console.log(mainStore.userName)
  // console.log(mainStore.userAvatar)
});

const items = computed(() => applicationList.value);

let detail = {
  bookName : "",
  author : "",
  isbn: "",
  type: "",
  introduction: "",
  state: "",
  version: "",
}

const isModalActive = ref(false);

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

const remove = (arr, cb) => {
  const newArr = [];

  arr.forEach((item) => {
    if (!cb(item)) {
      newArr.push(item);
    }
  });

  return newArr;
};

const checked = (isChecked, apply) => {
  if (isChecked) {
    checkedRows.value.push(apply);
  } else {
    checkedRows.value = remove(
      checkedRows.value,
      (row) => row.id === apply.id
    );
  }
};

const getMessage = (val) => {
    console.log(val);
    isModalActive.value = false;
}

const checkApply = (apply) => {
  isModalActive.value = true;
  detail.author = apply.author;
  detail.bookName = apply.bookname;
  detail.isbn = apply.isbn;
  detail.type = apply.type;
  detail.state = apply.state;
  detail.version = apply.version;
  detail.introduction = apply.introduction;
}

const submitDirectly = () => {
  let data = {
    author: detail.author,
    bookname: detail.bookName,
    introduction: detail.introduction,
    isbn: detail.isbn,
    score: 0,
    state: detail.state,
    type: detail.type,
    version: detail.version
  }
  console.log(data);
  AddNewBook(data)
    .then((response) => {
      console.log(response);
      if (response.data.message == "成功添加书籍") {
        //提交成功
        isModalActive.value = false;
        showSubmit.value = true;
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
  // console.log(data);
  // DeleteApply(data)
  // .then((response) => {
  //   console.log(response);
  // })
  // .catch((error) => {
  //   console.log(error);
  // });

}

const getSubmitConfirm = (Info) => {
  showSubmit.value = false;
  showProblem.value = false;
  console.log(Info);
}

const deleteApply = (data) => {
  DeleteApply(data)
  .then((response) => {
    console.log(response);
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

  <CardBoxModal v-model="isModalActive" @confirm="getMessage" title="申请详情">
    <div>
        <p class="italic">书籍名称: {{detail.bookName}}</p>
        <!-- <FormControl
            v-model="itemsPaginated[0]"
            type="tel"
            placeholder="请输入友善的评论吧"
        /> -->
        <p class="italic">书籍作者: {{detail.author}}</p>
        <p class="italic">书籍ISBN: {{detail.isbn}}</p>
        <p class="italic">书籍类型: {{detail.type}}</p>
        <p class="italic">书籍版本: {{detail.version}}</p>
        <p class="italic">书籍介绍: {{detail.introduction}}</p>
        <BaseButtons class="mt-4" type="justify-start" no-wrap>
          <BaseButton
            label="通过申请"
            color="success"
            small
            @click="submitDirectly"
          />
          <BaseButton
            label="API添加"
            color="success"
            small
          />
        </BaseButtons>
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
        <th>Book Author</th>
        <th>Book Name</th>
        <th>Book ISBN</th>
        <th>Type</th>
        <th />
      </tr>
    </thead>
    <tbody>
      <tr v-for="apply in itemsPaginated" :key="apply.id">
        <TableCheckboxCell
          v-if="checkable"
          @checked="checked($event, apply)"
        />
        <td class="border-b-0 lg:w-6 before:hidden">
          <UserAvatar
            :username="apply.author"
            class="w-24 h-24 mx-auto lg:w-6 lg:h-6"
          />
        </td>
        <td data-label="author">
          {{ apply.author }}
        </td>
        <td data-label="bookName">
          {{ apply.bookname }}
        </td>
        <td data-label="isbn">
          {{ apply.isbn }}
        </td>
        <td data-label="type" class="lg:w-1 whitespace-nowrap">
          <small
            class="text-gray-500 dark:text-slate-400"
            :title="apply.type"
            >{{ apply.type }}</small
          >
        </td>
        <td class="before:hidden lg:w-1 whitespace-nowrap">
          <BaseButtons type="justify-start lg:justify-end" no-wrap>
            <BaseButton
              label="detail"
              color="info"
              :icon="mdiEye"
              small
              @click="checkApply(apply)"
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
