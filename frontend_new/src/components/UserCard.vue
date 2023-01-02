<script setup>
import { computed, reactive, ref } from "vue";
import { useMainStore } from "@/stores/main";
import { mdiBookEdit, mdiCheckDecagram, mdiAccount, mdiPencil, mdiAccountStar } from "@mdi/js";
import BaseLevel from "@/components/BaseLevel.vue";
import BaseButton from "@/components/BaseButton.vue";
import UserAvatarCurrentUser from "@/components/UserAvatarCurrentUser.vue";
import CardBox from "@/components/CardBox.vue";
import FormCheckRadio from "@/components/FormCheckRadio.vue";
import FormField from "@/components/FormField.vue";
import FormControl from "@/components/FormControl.vue";
import PillTag from "@/components/PillTag.vue";
import SectionTitleLineWithButton from "@/components/SectionTitleLineWithButton.vue";

const emit = defineEmits(["updatedAvatar"]);
const mainStore = useMainStore();

const profileForm = reactive({
  name: mainStore.userName,
  email: mainStore.userEmail,
  avatar: mainStore.userAvatar
});

const userName = computed(() => mainStore.userName);

const seedForm = reactive({
  userSeed : "",
})

const userSwitchVal = ref(false);


const submitProfile = () => {
  profileForm.avatar = "https://avatars.dicebear.com/api/adventurer/" + seedForm.userSeed + ".svg";
  emit("updatedAvatar", seedForm);
  console.log(profileForm);
};
</script>

<template>
  <CardBox class="flex">
    <BaseLevel type="justify-around lg:justify-center">
      <CardBox is-form @submit.prevent="submitProfile" class="w-72 h-72">
        <FormField label="" help="">
          <SectionTitleLineWithButton title="Try New!" :icon = "mdiPencil" main></SectionTitleLineWithButton>
        </FormField>

        <FormField label="Seed" help="Maybe something you like...">
          <FormControl
            v-model="seedForm.userSeed"
            :icon="mdiAccountStar"
            name="userAvatar"
            required
            autocomplete="userAvatar"
          />
        </FormField>
        <template #footer>
            <BaseButton color="info" type="submit" label="Submit" class="mb-6"/>
        </template>
        <!-- <FormField label="E-mail" help="Required. Your e-mail">
          <FormControl
            v-model="userEmail"
            :icon="mdiMail"
            type="email"
            name="email"
            required
            autocomplete="email"
          />
        </FormField> -->
      </CardBox>

      <UserAvatarCurrentUser class="lg:mx-12" />
      <div class="space-y-3 text-center md:text-left lg:mx-12">
        <div class="flex justify-center md:block">
          <FormCheckRadio
            v-model="userSwitchVal"
            name="notifications-switch"
            type="switch"
            label="Notifications"
            :input-value="true"
          />
        </div>
        <h1 class="text-2xl">
          Howdy, <b>{{ userName }}</b
          >!
        </h1>
        <!-- <p>Last login <b>12 mins ago</b> from <b>127.0.0.1</b></p> -->
        <div class="flex justify-center md:block">
          <PillTag label="Verified" color="info" :icon="mdiCheckDecagram" />
        </div>
      </div>
    </BaseLevel>
  </CardBox>
</template>
