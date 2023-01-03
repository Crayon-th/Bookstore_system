<template>
  <LayoutAuthenticated>
    <CardBoxModal v-model="showSubmit" @confirm="getConfirmInfo" title="提交成功" button="success">
    </CardBoxModal>
    <!--出了点问题-->
    <CardBoxModal v-model="showProblem" @confirm="getConfirmInfo" title="系统开小差了" button="danger">
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
              @click="submit"
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

      <CardBox class="mb-6" @click="BookForSale">
        <p class="text-2xl" align="center">我 的 待 售</p>
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
import FormFilePicker from "@/components/FormFilePicker.vue";
import { useMainStore } from "@/stores/main.js";
import { ref } from "vue";
import { useRouter } from "vue-router";
import OSS from "ali-oss";
const mainStore = useMainStore();

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
  uid: mainStore.userId,
  isFinished: false,
});

const getConfirmInfo = (Info) => {
  showSubmit.value = false;
  console.log(Info);
}

//错误提示
var errorTip = ref("");
//显示提交成功
var showSubmit = ref(false);
//显示提交失败
var showProblem = ref(false);
const submit = () => {
  put();
  var uidIn = { uid: mainStore.userId };
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

const GetBookUrl = (val) => {
  form.imageurl = val.bookimg;
  console.log(form.imageurl);
};

const cleanAll = () => {
  form.isbn = "";
  form.bookName = "";
  form.author = "";
  form.version = "";
  form.imageurl = "";
  form.createTime = "";
  form.damageCondition = "";
  form.agingCondition = "";
  form.price = 0;
};

const router = useRouter();
const BookForSale = () => {
  if (mainStore.userName == "请登录") {
    router.push("/login");
  } else {
    router.push("/bookForSale");
  }
};


const client = new OSS({
  // yourregion填写Bucket所在地域。以华东1（杭州）为例，Region填写为oss-cn-hangzhou。
  region: 'oss-cn-shanghai',
  // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
  accessKeyId: 'LTAI5tLKDfAjWxMZQeUbDkDp',
  accessKeySecret: 'U07VCefFJvpg2JZPAcXeu9MaqAQp7X',
  // 填写Bucket名称。
  bucket: 'bucket-for-picgo-of-pikachu',
});

const headers = {
  // 指定Object的存储类型。
  'x-oss-storage-class': 'Standard',
  // 指定Object的访问权限。
  'x-oss-object-acl': 'private',
  // 设置Object的标签，可同时设置多个标签。
  'x-oss-tagging': 'Tag1=1&Tag2=2',
  // 指定PutObject操作时是否覆盖同名目标Object。此处设置为true，表示禁止覆盖同名Object。
  'x-oss-forbid-overwrite': 'true',
};

async function put () {
  try {
    // 填写OSS文件完整路径和本地文件的完整路径。OSS文件完整路径中不能包含Bucket名称。
    // 如果本地文件的完整路径中未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件。
    const result = await client.multipartUpload('pikachu.jpg', 'C:\\Users\\86137\\Pictures\\pikachu.jpg'
    // 自定义headers
    ,{headers}
    );
    console.log(result);
  } catch (e) {
    console.log(e);
  }
}
</script>
