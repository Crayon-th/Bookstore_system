<script setup>
// import RatingStar from '@/components/RatingStar.vue';
import {  mdiStar } from '@mdi/js';
import BaseButton from '../components/BaseButton.vue';
// import { createApp } from 'vue';
// import { defineComponent } from 'vue';
import StarRating from '../components/StarRating.vue'

const submit = () => {
  //
};

// const app = Vue.createApp({
//   methods: {
//     showCurrentRating(rating) {
//       this.currentSelectedRating =
//         rating === 0
//           ? this.currentSelectedRating
//           : "Click to select " + rating + " stars";
//     },
//     setCurrentSelectedRating(rating) {
//       this.currentSelectedRating = "You have Selected: " + rating + " stars";
//     }
//   },
//   computed: {
//     currentRatingText() {
//       return this.rating
//         ? "You have selected " + this.rating + " stars"
//         : "No rating selected";
//     },
//     mouseOverRatingText() {
//       return this.mouseOverRating
//         ? "Click to select " + this.mouseOverRating + " stars"
//         : "No Rating";
//     }
//   },
//   data() {
//     return {
//       rating: null,
//       resetableRating: 2,
//       currentRating: "No Rating",
//       mouseOverRating: null
//     };
//   }
// });
// app.component("star-rating", VueStarRating.default);

// app.mount("#app");

</script>

<template>
  <!-- <RatingStar :score.sync="curScore" showText/> -->
  <div id="app">
    <h2>Stars means Shut the asshole rXXX shit</h2>
    <StarRating :increment="0.5" :star-size="50" :show-rating="false"
      :rounded-corners="true" :border-width="4" 
      :star-points="[23,2, 14,17, 0,19, 10,34, 7,50, 23,43, 38,50, 36,34, 46,19, 31,17]">
    </StarRating>

    <StarRating :animate="true" :active-color="['#fed766','#fed766']" :active-border-color="['#cccccc','#cccccc']" :border-width="4" 
      :star-points="[23,2, 14,17, 0,19, 10,34, 7,50, 23,43, 38,50, 36,34, 46,19, 31,17]" :show-rating="false"
      :active-on-click="true" :clearable="true" :padding="3">
    </StarRating>


</div>
  <BaseButton @click="submit"
            color="info"
            label="Submit"
            :icon="mdiStar"
            class="mt-6"
          />
</template>

<style scoped>

body {
  font-family: 'Raleway', sans-serif;
}

.custom-text {
  font-weight: bold;
  font-size: 1.9em;
  border: 1px solid #cfcfcf;
  padding-left: 10px;
  padding-right: 10px;
  border-radius: 5px;
  color: #999;
  background: #fff;
}


</style>