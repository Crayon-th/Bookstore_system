<script setup>
import AsideMenuItem from "@/components/AsideMenuItem.vue";
import { mdiAccountCircle, mdiBriefcaseAccount } from "@mdi/js";

defineProps({
  isDropdownList: Boolean,
  menu: {
    type: Array,
    required: true,
  },
  id: {
    type: Number,
    default: ""
  }
});

const emit = defineEmits(["menu-click"]);

const menuClick = (event, item) => {
  emit("menu-click", event, item);
};

const ItemWork = {
    to: "/administrator",
    label: "工作中心",
    icon: mdiBriefcaseAccount,
  }

const ItemUser = {
    to: "/profile",
    label: "个人中心",
    icon: mdiAccountCircle,
}

</script>

<template>
  <ul>
    <AsideMenuItem
      v-if="(id > 9000)"
      :item="ItemWork"
      :is-dropdown-list="isDropdownList"
      @menu-click="menuClick"
    />
    <AsideMenuItem
      v-else
      :item="ItemUser"
      :is-dropdown-list="isDropdownList"
      @menu-click="menuClick"
    />
    <AsideMenuItem
      v-for="(item, index) in menu"
      :key="index"
      :item="item"
      :is-dropdown-list="isDropdownList"
      @menu-click="menuClick"
    />
  </ul>
</template>
