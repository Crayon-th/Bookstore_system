import {
    mdiAccount,
    mdiAccountPlus,
    mdiBookArrowRight,
    mdiLogin,
    mdiShoppingOutline,
    mdiThemeLightDark,
  } from "@mdi/js";
  
  export default [
    {
      isCurrentUser: false,
      isUnauthenticated:mdiAccount,
      menu: [
        {
          icon: mdiLogin,
          label: "Log In",
          isLogIn: true,
        },
        {
          icon: mdiAccountPlus,
          label: "Register",
          isRegister: true,
        },
        {
          isDivider: true,
        },
        {
          icon: mdiBookArrowRight,
          label: "Read Center",
          isRead: true,
        },
        {
          icon: mdiShoppingOutline,
          label: "Shopping Center",
          isShopping: true,
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
  