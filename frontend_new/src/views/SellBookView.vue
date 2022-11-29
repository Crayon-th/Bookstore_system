<template>
  <LayoutAuthenticated>
    <CardBoxModal v-model="showSubmit" title="提交成功" button="success">
    </CardBoxModal>
    <!--出了点问题-->
    <CardBoxModal v-model="showProblem" title="系统开小差了" button="danger">
      <p>{{ errorTip }}</p>
    </CardBoxModal>
    <SectionMain>
      <SectionTitleLineWithButton
        :icon="mdiBallotOutline"
        title="百觅一书 · 我要售书"
        main
      >
      </SectionTitleLineWithButton>
      <CardBox class="mb-6">
        <FormField label="ISBN" help="书籍的ISBN码">
          <FormControl
            v-model="form.isbn"
            type="tel"
            placeholder="请在此处输入isbn"
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍名称" help="要出售书籍的名称">
          <FormControl
            v-model="form.bookName"
            type="tel"
            placeholder="请在此处输入要出售书籍的名称"
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

        <FormField label="损坏情况" help="描述书籍的损坏情况">
          <FormControl
            v-model="form.damageCondition"
            type="tel"
            placeholder="请在此处描述书籍的损坏情况"
          />
        </FormField>
        <BaseDivider />

        <FormField label="新旧程度" help="描述书籍的新旧程度">
          <FormControl
            v-model="form.agingCondition"
            type="tel"
            placeholder="请在此处描述书籍的新旧程度"
          />
        </FormField>
        <BaseDivider />

        <FormField label="书籍价格" help="给出您预期的价格">
          <FormControl
            v-model="form.price"
            type="tel"
            placeholder="请在此处给出您预期的价格"
          />
        </FormField>
        <BaseDivider />

        <template #footer>
          <BaseButtons>
            <BaseButton
              type="submit"
              color="info"
              label="提交"
              @click="submit"
            />
            <BaseButton
              type="reset"
              color="info"
              outline
              label="清空"
              @click="CleanAll"
            />
          </BaseButtons>
        </template>
      </CardBox>

      <CardBox class="mb-6">
        <p class="text-2xl" align="center">我 的 商 品</p>
      </CardBox>
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
import { TradeBook } from "@/api/SellBookPart.js";
import { ref } from "vue";

var uid = ref(1);

const form = reactive({
  isbn: "",
  bookName: "",
  author: "",
  version: "",
  imageurl: "",
  createTime: "",
  damageCondition: "",
  agingCondition: "",
  price: 0,
  uid: uid.value,
  isFinished: false,
});

//错误提示
var errorTip = ref("");
//显示提交成功
var showSubmit = ref(false);
//显示提交失败
var showProblem = ref(false);
const submit = () => {
  var uidIn = { uid: uid.value };
  var data = form;
  TradeBook(uidIn, data)
    .then((response) => {
      console.log(response);
      if (response.data.提示 == "上传书本成功") {
        //购买成功
        showSubmit.value = true;
      } else {
        errorTip.value = response.data.提示;
        showProblem.value = true;
      }
    })
    .catch((error) => {
      //购买失败
      errorTip.value = "网络问题";
      showProblem.value = true;
      console.log(error);
    });
};
const CleanAll = () => {
  form.isbn = "";
  form.bookName = "";
  form.author = "";
  form.version = "";
  form.imageurl = "";
  form.damageCondition = "";
  form.agingCondition = "";
  form.price = 0;
};
</script>
