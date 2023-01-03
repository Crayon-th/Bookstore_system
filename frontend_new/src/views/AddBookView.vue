<template>
  <LayoutAuthenticated>
    <CardBoxModal
      v-model="showSubmit"
      title="提交成功"
      button="success"
      @confirm="getConfirmInfo"
    >
    </CardBoxModal>
    <!--出了点问题-->
    <CardBoxModal
      v-model="showProblem"
      title="系统开小差了"
      button="danger"
      @confirm="getConfirmInfo"
    >
      <p>{{ errorTip }}</p>
    </CardBoxModal>
    <SectionMain>
      <SectionTitleLineWithButton
        :icon="mdiBallotOutline"
        title="百觅一书 · 书籍申请"
        main
      >
      </SectionTitleLineWithButton>
      <CardBox class="mb-6">
        <FormField label="ISBN" help="书籍的ISBN码">
          <FormControl
            v-model="form.isbn"
            type="tel"
            placeholder="请在此处输入书籍的isbn码"
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍名称" help="要出售书籍的名称">
          <FormControl
            v-model="form.bookname"
            type="tel"
            placeholder="请在此处输入申请书籍的名称"
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍作者" help="要出售书籍的作者的名称">
          <FormControl
            v-model="form.author"
            type="tel"
            placeholder="请在此处输入作者名称"
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍版本" help="要出售的书籍的版本">
          <FormControl
            v-model="form.version"
            type="tel"
            placeholder="请在此处输入书籍版本"
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍类型" help="描述书籍的类型题材">
          <FormControl
            v-model="form.type"
            type="tel"
            placeholder="请在此处输入书籍的类型题材..."
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍状态" help="请输入书籍的状态">
          <FormControl
            v-model="form.state"
            type="tel"
            placeholder="请输入书籍的状态"
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍简介">
          <FormControl
            v-model="form.introduction"
            type="textarea"
            placeholder="请在此处输入书籍的简介"
          />
        </FormField>

        <FormField help="Max 2MB">
          <FormFilePicker label="上传书籍封面" @bookimg="GetBookUrl" />
        </FormField>
        <BaseDivider />

        <template #footer>
          <BaseButtons>
            <BaseButton
              type="submit"
              color="info"
              label="提交"
              @click="submitApplication"
            />
            <BaseButton
              type="reset"
              color="info"
              outline
              label="清空内容"
              @click="cleanAll"
            />
          </BaseButtons>
        </template>
      </CardBox>

      <!-- <CardBox class="mb-6" @click="BookForSale">
          <p class="text-2xl" align="center">我 的 待 售</p>
        </CardBox> -->
    </SectionMain>
  </LayoutAuthenticated>
</template>

<script setup>
import { reactive } from "vue";
import { mdiBallotOutline } from "@mdi/js";
import SectionMain from "@/components/SectionMain.vue";
import CardBox from "@/components/CardBox.vue";
import FormField from "@/components/FormField.vue";
import FormControl from "@/components/FormControl.vue";
import BaseDivider from "@/components/BaseDivider.vue";
import BaseButton from "@/components/BaseButton.vue";
import BaseButtons from "@/components/BaseButtons.vue";
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
import CardBoxModal from "@/components/CardBoxModal.vue";
import { ApplyNewBook } from "@/api/BookManagement.js";
import FormFilePicker from "@/components/FormFilePicker.vue";
import { useMainStore } from "@/stores/main.js";
import { ref } from "vue";
// import { useRouter } from "vue-router";
const mainStore = useMainStore();

const form = reactive({
  isbn: "",
  bookname: "",
  author: "",
  version: "",
  type: "",
  state: "",
  introduction: "",
  picurl: "",
});

//错误提示
var errorTip = ref("");
//显示提交成功
var showSubmit = ref(false);
//显示提交失败
var showProblem = ref(false);

const getConfirmInfo = (Info) => {
  showSubmit.value = false;
  showProblem.value = false;
  console.log(Info);
};

const submitApplication = () => {
  var data = form;
  let param = {
    uid: mainStore.userId,
  };
  console.log(data);
  ApplyNewBook(data, param)
    .then((response) => {
      console.log(response);
      if (response.data.message == "申请成功") {
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
};

const GetBookUrl = (val) => {
  form.picurl = val.bookimg;
};

const cleanAll = () => {
  form.isbn = "";
  form.bookname = "";
  form.author = "";
  form.version = "";
  form.type = "";
  form.state = "";
  form.introduction = "";
  form.picurl = "";
};
</script>
