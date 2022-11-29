import { mdiAccount, mdiEmail, mdiLogout, mdiThemeLightDark } from "@mdi/js";

export default [
  {
    isCurrentUser: true,
    menu: [
      {
        icon: mdiAccount,
        label: "个人中心",
        to: "/profile",
      },
      {
        icon: mdiEmail,
        label: "我的信息",
      },
      {
        isDivider: true,
      },
      {
        icon: mdiLogout,
        label: "退出登录",
        isLogout: true,
      },
    ],
  },
  {
    icon: mdiThemeLightDark,
    label: "Light/Dark",
    isDesktopNoLabel: true,
    isToggleLightDark: true,
  },
];
