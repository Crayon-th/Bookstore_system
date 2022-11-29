<template>
  <LayoutAuthenticated>
    <SectionMain>
      <SectionTitleLineWithButton
        :icon="mdiBallotOutline"
        title="百觅一书 · 用户注册"
        main
      >
      </SectionTitleLineWithButton>
      <CardBox>
        <FormField label="用户名 & 邮箱">
          <FormControl
            v-model="form.username"
            :icon="mdiAccount"
            placeholder="输入用户名"
          />
          <FormControl
            v-model="form.email"
            type="email"
            :icon="mdiMail"
            placeholder="输入邮箱"
          />
        </FormField>

        <FormField label="邮箱验证码" help="请在点击获取验证码后查看邮箱">
          <FormControl
            v-model="form.code"
            type="tel"
            placeholder="请输入邮箱验证码"
          />
        </FormField>

        <FormField label="设置密码">
          <FormControl
            v-model="form.password"
            type="tel"
            placeholder="请输入密码"
          />
        </FormField>

        <BaseDivider />

        <template #footer>
          <BaseButtons>
            <BaseButton
              type="submit"
              color="info"
              label="注册用户"
              @click="Submit"
            />
            <BaseButton
              type="reset"
              color="info"
              outline
              label="获取邮箱验证码"
              @click="GetCode"
            />
          </BaseButtons>
        </template>
      </CardBox>
    </SectionMain>
  </LayoutAuthenticated>
</template>

<script setup>
import { reactive } from "vue";
import { mdiBallotOutline, mdiAccount, mdiMail } from "@mdi/js";
import SectionMain from "@/components/SectionMain.vue";
import CardBox from "@/components/CardBox.vue";
import FormField from "@/components/FormField.vue";
import FormControl from "@/components/FormControl.vue";
import BaseDivider from "@/components/BaseDivider.vue";
import BaseButton from "@/components/BaseButton.vue";
import BaseButtons from "@/components/BaseButtons.vue";
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
import { GetEmailCode } from "@/api/LoginApi.js";

const form = reactive({
  username: "John Doe",
  email: "john.doe@example.com",
  password: "",
  code: "",
});

const Submit = () => {
  //
};

const GetCode = () => {
  var email = { email: form.email };
  GetEmailCode(email)
    .then((response) => {
      console.log(response);
    })
    .catch((error) => {
      console.log(error);
    });
};
</script>
