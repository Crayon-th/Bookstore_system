<script setup>
import { reactive } from "vue";
import { useRouter } from "vue-router";
import { mdiAccount, mdiAsterisk } from "@mdi/js";
import SectionFullScreen from "@/components/SectionFullScreen.vue";
import CardBox from "@/components/CardBox.vue";
import FormField from "@/components/FormField.vue";
import FormControl from "@/components/FormControl.vue";
import BaseButton from "@/components/BaseButton.vue";
import BaseButtons from "@/components/BaseButtons.vue";
import LayoutGuest from "@/layouts/LayoutGuest.vue";
import CardBoxModal from "@/components/CardBoxModal.vue";
import { useMainStore } from "@/stores/main.js";
import { UserLogin } from "@/api/LoginApi.js";
import { ref } from "vue";

const form = reactive({
  login: "",
  pass: "",
});

const router = useRouter();

let showProblem = ref(false);

const submit = () => {
  //传输输入信息
  let UserInfo = {
    username: form.login,
    password: form.pass,
  };
  UserLogin(UserInfo)
    .then((response) => {
      //存储用户信息
      useMainStore().setUser({
        name: response.data.user.user.username,
        email: response.data.user.user.email,
        id: response.data.user.user.id,
        Token: response.data.token,
        avatar: response.data.user.user.seed,
        isAuthenticated: true,
      });
      //页面跳转
      router.push("/");
      router.push("/");
    })
    .catch((error) => {
      //弹窗
      showProblem.value = true;
      console.log(error);
    });
};
</script>

<template>
  <LayoutGuest>
    <SectionFullScreen v-slot="{ cardClass }" bg="purplePink">
      <!--显示登录出错-->
      <CardBoxModal
        v-model="showProblem"
        title="登录失败请检查用户名和密码"
        button="danger"
      >
      </CardBoxModal>
      <CardBox :class="cardClass" is-form>
        <FormField label="用户名" help="请输入您的用户名">
          <FormControl
            id="usernamefield"
            v-model="form.login"
            :icon="mdiAccount"
            name="login"
            autocomplete="username"
          />
        </FormField>

        <FormField label="密码" help="请输入您的密码">
          <FormControl
            id="pwfield"
            v-model="form.pass"
            :icon="mdiAsterisk"
            type="password"
            name="password"
            autocomplete="current-password"
          />
        </FormField>

        <template #footer>
          <BaseButtons>
            <BaseButton
              id="button1"
              type="submit"
              color="info"
              label="登 录"
              @click="submit"
            />
            <BaseButton
              id="button2"
              to="/userRegistration"
              color="info"
              outline
              label="注 册"
            />
          </BaseButtons>
        </template>
      </CardBox>
    </SectionFullScreen>
  </LayoutGuest>
</template>
