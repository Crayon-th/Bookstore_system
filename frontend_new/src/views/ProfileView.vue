<script setup>
import { reactive } from "vue";
import { useMainStore } from "@/stores/main";
import {
  mdiAccount,
  mdiMail,
  mdiAsterisk,
  mdiFormTextboxPassword,
  mdiBookEdit,
} from "@mdi/js";
import SectionMain from "@/components/SectionMain.vue";
import CardBox from "@/components/CardBox.vue";
import BaseDivider from "@/components/BaseDivider.vue";
import FormField from "@/components/FormField.vue";
import FormControl from "@/components/FormControl.vue";
import FormFilePicker from "@/components/FormFilePicker.vue";
import BaseButton from "@/components/BaseButton.vue";
import BaseButtons from "@/components/BaseButtons.vue";
import UserCard from "@/components/UserCard.vue";
import CardBoxModal from "@/components/CardBoxModal.vue";
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";
import {UserPostSeed, UserPostName, UserPostPassword} from "@/api/ProfileApi.js";
import { ref } from "vue";

const mainStore = useMainStore();

//错误提示
const errorTip = ref("");
//显示提交成功
const showSubmit = ref(false);
//显示提交失败
const showProblem = ref(false);

const profileForm = reactive({
  name: mainStore.userName,
  email: mainStore.userEmail,
  avatar: mainStore.userAvatar,
  Token: mainStore.userToken
});

const passwordForm = reactive({
  password_current: "",
  password: "",
  password_confirmation: "",
});

const getConfirmInfo = (Info) => {
  showSubmit.value = false;
  showProblem.value = false;
  console.log(Info);
}

const submitProfile = () => {
  console.log(profileForm)
  // mainStore.setUser(profileForm);
};

const submitPass = () => {
  //
};

const getSeed = (SeedForm) => {
    // ratingForm.rating = AvatarForm;
    console.log(SeedForm.userSeed);
    console.log(mainStore.userId);

    UserPostSeed(mainStore.userId, SeedForm.userSeed)
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

</script>

<template>
  <LayoutAuthenticated>
    <CardBoxModal v-model="showSubmit" @confirm="getConfirmInfo" title="提交成功" button="success">
    </CardBoxModal>
    <CardBoxModal v-model="showProblem" @confirm="getConfirmInfo" title="系统开小差了" button="danger">
      <p>{{ errorTip }}</p>
    </CardBoxModal>
    <SectionMain>
      <SectionTitleLineWithButton :icon="mdiAccount" title="Profile" main>
      </SectionTitleLineWithButton>

      <UserCard @updatedAvatar="getSeed" class="mb-6" />

      <div class="grid grid-cols-1 lg:grid-cols-2 gap-6">
        <CardBox is-form @submit.prevent="submitProfile">
          <FormField label="" help="">
            <SectionTitleLineWithButton title="Edit Profile" :icon = "mdiBookEdit" main></SectionTitleLineWithButton>
          </FormField>

          <FormField label="Name" help="Required. Your name">
            <FormControl
              v-model="profileForm.name"
              :icon="mdiAccount"
              name="username"
              required
              autocomplete="username"
            />
          </FormField>
          <FormField label="E-mail" help="Required. Your e-mail">
            <FormControl
              v-model="profileForm.email"
              :icon="mdiMail"
              type="email"
              name="email"
              required
              autocomplete="email"
            />
          </FormField>

          <template #footer>
            <BaseButtons>
              <BaseButton color="info" type="submit" label="Submit" />
              <!-- <BaseButton color="info" label="Options" outline /> -->
            </BaseButtons>
          </template>
        </CardBox>

        <CardBox is-form @submit.prevent="submitPass">
          <FormField
            label="Current password"
            help="Required. Your current password"
          >
            <FormControl
              v-model="passwordForm.password_current"
              :icon="mdiAsterisk"
              name="password_current"
              type="password"
              required
              autocomplete="current-password"
            />
          </FormField>

          <BaseDivider />

          <FormField label="New password" help="Required. New password">
            <FormControl
              v-model="passwordForm.password"
              :icon="mdiFormTextboxPassword"
              name="password"
              type="password"
              required
              autocomplete="new-password"
            />
          </FormField>

          <FormField
            label="Confirm password"
            help="Required. New password one more time"
          >
            <FormControl
              v-model="passwordForm.password_confirmation"
              :icon="mdiFormTextboxPassword"
              name="password_confirmation"
              type="password"
              required
              autocomplete="new-password"
            />
          </FormField>

          <template #footer>
            <BaseButtons>
              <BaseButton id="submitbut" type="submit" color="info" label="Submit" />
              <!-- <BaseButton color="info" label="Options" outline /> -->
            </BaseButtons>
          </template>
        </CardBox>
      </div>
    </SectionMain>
  </LayoutAuthenticated>
</template>
