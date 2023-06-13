<template>
  <n-card class="home-box" content-style="padding-bottom: 0;" footer-style="margin-bottom: 0;padding-bottom: 0;">
    <n-space justify="center">
      <n-icon class="css3-logo" size="9em" color="#1E90FF">
        <Rocket />
      </n-icon>
    </n-space>
    <n-space justify="center">
      <n-p class="project-title">欢迎来到同济大学软件测试课程测试平台👏</n-p>
    </n-space>
    <n-divider class="divider" />
    <n-space justify="center">
      <n-p class="intro">本系统主要包含两部分测试内容，第一部分为平时练习的测试，第二部分为期末项目的测试</n-p>
    </n-space>
    
  </n-card>
</template>

<script setup lang="ts">
import { NIcon, NCard, NSpace, NP, NDivider } from 'naive-ui'
import { AddSharp, LogoCss3,Rocket } from '@vicons/ionicons5'
import IconNaiveUi from '../components/icons/IconNaiveUI.vue'
import IconVite from '../components/icons/IconVite.vue'
import IconVue from '../components/icons/IconVue.vue'

</script>

<style scoped>
.home-box {
  width: 100%;
  height: 88vh;
  overflow: auto;
}

.css3-logo {
  margin: .4em 0 .1em 0;
}

.project-title {
  font-size: 2.4em;
  font-weight: 500;
  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
}

.divider {
  width: 60%;
  margin: .8em auto;
}

.tech-stack {
  font-size: 1.2em;
  font-weight: 500;
  margin-bottom: .8em;
}

.vue-logo {
  padding-top: .05em;
}

.intro {
  margin-top: .8em;
  font-size: 1.2em;
  font-weight: 510;
}

.try {
  font-size: 1.2em;
  font-weight: 500;
  margin: .8em 0 3.6em 0;
}

.flex-wrapper {
  display: flex;
  flex-direction: column;
  justify-content: center;
  height: 100%;
}

::-webkit-scrollbar {
  height: 0;
  width: 0;
}

.flex-column {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.icp {
  color: #777;
  margin: 0;
  padding: 0;
  overflow: auto;
}

.icp:link {
  text-decoration: none;
}

.icp:visited {
  color: #777;
  text-decoration: underline;
}

.icp:hover {
  color: deepskyblue;
  text-decoration: underline;
}

icp:active {
  color: springgreen;
  text-decoration: underline;
}
</style>