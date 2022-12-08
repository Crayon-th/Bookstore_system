import { createRouter, createWebHashHistory } from "vue-router";
//import Style from "@/views/StyleView.vue";
import Home from "@/views/HomeView.vue";

const routes = [
  {
    meta: {
      title: "书籍交易",
    },
    path: "/",
    name: "display",
    component: () => import("@/views/DisplayView.vue"),
  },
  {
    // Document title tag
    // We combine it with defaultDocumentTitle set in `src/main.js` on router.afterEach hook
    meta: {
      title: "Dashboard",
    },
    path: "/dashboard",
    name: "dashboard",
    component: Home,
  },
  {
    meta: {
      title: "Tables",
    },
    path: "/tables",
    name: "tables",
    component: () => import("@/views/TablesView.vue"),
  },
  {
    meta: {
      title: "用户注册",
    },
    path: "/userRegistration",
    name: "userRegistration",
    component: () => import("@/views/FormsView.vue"),
  },
  {
    meta: {
      title: "个人中心",
    },
    path: "/profile",
    name: "profile",
    component: () => import("@/views/ProfileView.vue"),
  },
  {
    meta: {
      title: "Ui",
    },
    path: "/ui",
    name: "ui",
    component: () => import("@/views/UiView.vue"),
  },
  {
    meta: {
      title: "Responsive layout",
    },
    path: "/responsive",
    name: "responsive",
    component: () => import("@/views/ResponsiveView.vue"),
  },
  {
    meta: {
      title: "用户登录",
    },
    path: "/login",
    name: "login",
    component: () => import("@/views/LoginView.vue"),
  },
  {
    meta: {
      title: "Error",
    },
    path: "/error",
    name: "error",
    component: () => import("@/views/ErrorView.vue"),
  },
  {
    meta: {
      title: "商品详情",
    },
    path: "/buyBookDetail",
    name: "buyBookDetail",
    component: () => import("@/views/BuyBookDetailView.vue"),
  },
  {
    meta: {
      title: "我要售书",
    },
    path: "/sellBook",
    name: "sellBook",
    component: () => import("@/views/SellBookView.vue"),
  },
  {
    meta: {
      title: "chatroom",
    },
    path: "/chatroom",
    name: "chatroom",
    component: () => import("@/views/ChatroomView.vue"),
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
  scrollBehavior(to, from, savedPosition) {
    return savedPosition || { top: 0 };
  },
});

export default router;
