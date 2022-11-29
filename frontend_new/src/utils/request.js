import axios from "axios";
// import qs from "qs";

// 每次请求携带cookies信息
axios.defaults.headers["X-Requested-With"] = "XMLHttpRequest";
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
    // if the custom code is not 200, it is judged as an error.
    // if (response.status != 200) {
    //   //判断token是否失效
    //   if (response.status == 400) {
    //     return Promise.reject(new Error("您尚未登录" || "Error"));
    //   }

    //   // eslint-disable-next-line no-undef
    //   return Promise.reject(new Error(res.msg || "Error"));
    // } else {
    //   return response;
    // }
    return response;
  },
  (error) => {
    return Promise.reject(error);
  }
);

export default service;
