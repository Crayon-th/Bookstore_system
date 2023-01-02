import axios from "axios";
import { useMainStore } from "@/stores/main.js";
// import qs from "qs";

const mainStore = useMainStore();

// 每次请求携带cookies信息
axios.defaults.headers.post["Content-Type"] = "application/json";
axios.defaults.withCredentials = true;

// export function getDomainUrl() {
//   return "http://81.68.224.209:3000/";
// }

// create an axios instance
const service = axios.create({
  // baseURL:'https://api.guisu.fun:6001/api/',
  baseURL: "/api",
  // withCredentials: true, // send cookies when cross-domain requests
  timeout: 50000, // request timeout
  //withCredentials: true
  async: true,
  crossDomain: true,
});

// request interceptor
service.interceptors.request.use(
  (config) => {
    if (config.baseURL != "/outer") {
      config.headers["Authorization"] = mainStore.userToken;
    }
    console.log(config);
    return config;
  },
  (error) => {
    return Promise.reject(error);
  }
);

service.interceptors.response.use(
  (response) => {
    console.log("response:", response);
    return response;
  },
  (error) => {
    return Promise.reject(error);
  }
);

export default service;
