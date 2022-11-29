import {
  mdiAccountCircle,
  mdiMonitor,
  mdiLock,
  mdiSquareEditOutline,
  mdiTable,
  mdiTelevisionGuide,
  mdiStackExchange,
  mdiBook,
} from "@mdi/js";

export default [
  {
    to: "/",
    label: "书籍交易",
    icon: mdiBook,
  },
  {
    to: "/responsive",
    label: "书籍交流",
    icon: mdiStackExchange,
  },
  {
    to: "/profile",
    label: "个人中心",
    icon: mdiAccountCircle,
  },
  {
    to: "/login",
    label: "用户登录",
    icon: mdiLock,
  },
  // {
  //   to: "/dashboard",
  //   icon: mdiMonitor,
  //   label: "Dashboard",
  // },
  // {
  //   to: "/tables",
  //   label: "Tables",
  //   icon: mdiTable,
  // },
  {
    to: "/userRegistration",
    label: "新人注册",
    icon: mdiSquareEditOutline,
  },
  {
    to: "/ui",
    label: "UI",
    icon: mdiTelevisionGuide,
  },
];
