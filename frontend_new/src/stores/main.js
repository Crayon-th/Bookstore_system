import { defineStore } from "pinia";
import PiniaPluginPersist from "pinia-plugin-persist";
import axios from "axios";

export const useMainStore = defineStore("main", {
  state: () => ({
    /* User */
    userId: "",
    userName: "",
    userEmail: "",
    userAvatar: null,
    userToken: "",
    isAuthenticated: false,

    /* Field focus with ctrl+k (to register only once) */
    isFieldFocusRegistered: false,

    /* Sample data (commonly used) */
    clients: [],
    history: [],
  }),
  actions: {
    setUser(payload) {
      if (payload.id) {
        this.userId = payload.id;
      }
      if (payload.name) {
        this.userName = payload.name;
      }
      if (payload.email) {
        this.userEmail = payload.email;
      }
      if (payload.avatar) {
        this.userAvatar = payload.avatar;
      }
      if (payload.Token) {
        this.userToken = payload.Token;
      }
      if (payload.Token) {
        this.isAuthenticated = payload.isAuthenticated;
      }
    },

    LogOut() {
      console.log(this.userName);
      localStorage.clear();
      this.userId = "";
      this.userName = "";
      this.userEmail = "";
      this.userAvatar = null;
      this.userToken = "";
      this.isAuthenticated = false;
    },

    fetch(sampleDataKey) {
      axios
        .get(`data-sources/${sampleDataKey}.json`)
        .then((r) => {
          if (r.data && r.data.data) {
            this[sampleDataKey] = r.data.data;
          }
        })
        .catch((error) => {
          alert(error.message);
        });
    },
  },
  persist:{
    enabled: true,
  }
});
