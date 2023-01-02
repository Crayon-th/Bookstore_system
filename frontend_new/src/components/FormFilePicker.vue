<script setup>
import { mdiUpload } from "@mdi/js";
import { computed, ref, watch } from "vue";
import BaseButton from "@/components/BaseButton.vue";
// import { BookImage } from "@/api/SellBookPart.js";
import { PutPictrueInBed } from "@/api/SellBookPart.js";

const props = defineProps({
  modelValue: {
    type: [Object, File, Array],
    default: null,
  },
  label: {
    type: String,
    default: null,
  },
  icon: {
    type: String,
    default: mdiUpload,
  },
  accept: {
    type: String,
    default: null,
  },
  color: {
    type: String,
    default: "info",
  },
  isRoundIcon: Boolean,
});

const emit = defineEmits(["bookimg"]);

const root = ref(null);

const file = ref(props.modelValue);

const showFilename = computed(() => !props.isRoundIcon && file.value);

const modelValueProp = computed(() => props.modelValue);

watch(modelValueProp, (value) => {
  file.value = value;

  if (!value) {
    root.value.input.value = null;
  }
});

const upload = (event) => {
  const value = event.target.files || event.dataTransfer.files;

  file.value = value[0];

  // Use this as an example for handling file uploads
  let formData = new FormData();
  formData.append("file", file.value);
  //传递token
  let params = {
    token: "cf716756cc4549578638aebd82bbdc94",
  };
  //上传到图床
  PutPictrueInBed(formData, params)
    .then((response) => {
      let emitData = {
        bookimg: response.data.url,
      };
      emit("bookimg", emitData);
      console.log(response);
    })
    .catch((error) => {
      console.log(error);
    });
};
</script>

<template>
  <div class="flex items-stretch justify-start relative">
    <label class="inline-flex">
      <BaseButton
        as="a"
        :class="{ 'w-12 h-12': isRoundIcon, 'rounded-r-none': showFilename }"
        :icon-size="isRoundIcon ? 24 : undefined"
        :label="isRoundIcon ? null : label"
        :icon="icon"
        :color="color"
        :rounded-full="isRoundIcon"
      />
      <input
        ref="root"
        type="file"
        class="absolute top-0 left-0 w-full h-full opacity-0 outline-none cursor-pointer -z-1"
        :accept="accept"
        @input="upload"
      />
    </label>
    <div
      v-if="showFilename"
      class="px-4 py-2 bg-gray-100 dark:bg-slate-800 border-gray-200 dark:border-slate-700 border rounded-r"
    >
      <span class="text-ellipsis line-clamp-1">
        {{ file.name }}
      </span>
    </div>
  </div>
</template>
