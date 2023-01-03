import {
  mdiAccountCircle,
  mdiBookOpenPageVariant,
  mdiMessage,
  mdiLock,
  mdiSquareEditOutline,
  mdiTelevisionGuide,
  mdiShoppingOutline,
  mdiCart,
} from "@mdi/js";

export default [
  {
    to: "/",
    label: "交易市场",
    icon: mdiShoppingOutline,
  },
  {
    to: "/reading",
    label: "阅·读",
    icon: mdiBookOpenPageVariant,
  },
  {
    to: "/chatting",
    label: "我的消息",
    icon: mdiMessage,
  },
  // {
  //   to: "/login",
  //   label: "用户登录",
  //   icon: mdiLock,
  // },
  {
    to: "/userRegistration",
    label: "新人注册",
    icon: mdiSquareEditOutline,
  },
  {
    to: "/myOrder",
    label: "订单中心",
    icon: mdiCart,
  },
  {
    to: "/ui",
    label: "UI",
    icon: mdiTelevisionGuide,
  },
  // {
  //   label: "Dropdown",
  //   icon: mdiViewList,
  //   menu: [
  //     {
  //       label: "Item One",
  //     },
  //     {
  //       label: "Item Two",
  //     },
  //   ],
  // },
  // {
  //   href: "https://github.com/justboil/admin-one-vue-tailwind",
  //   label: "GitHub",
  //   icon: mdiGithub,
  //   target: "_blank",
  // },
  // {
  //   href: "https://github.com/justboil/admin-one-react-tailwind",
  //   label: "React version",
  //   icon: mdiReact,
  //   target: "_blank",
  // },
];
