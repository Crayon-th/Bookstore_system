import { fileURLToPath, URL } from "node:url";

import { defineConfig } from "vite";
import vue from "@vitejs/plugin-vue";

// https://vitejs.dev/config/
export default defineConfig({
  base: "/admin-one-vue-tailwind/",
  plugins: [vue()],
  resolve: {
    alias: {
      "@": fileURLToPath(new URL("./src", import.meta.url)),
    },
  },
  server: {
    headers: {
      "Access-Control-Allow-Origin": "*",
    },
    disableHostCheck: true,
    cors: true, // 默认启用并允许任何源
    host: true,
    open: true, // 在服务器启动时自动在浏览器中打开应用程序
    ssr: false,
    //反向代理配置，注意rewrite写法，开始没看文档在这里踩了坑
    proxy: {
      "/api": {
        target: "http://1.117.159.206:3000/", //代理接口
        changeOrigin: true,
        ws: true,
        rewrite: (path) => path.replace(/^\/api/, ""),
      },
      "/outer": {
        target: "https://api.jike.xyz/situ/book/isbn/", //代理接口
        changeOrigin: true,
        ws: true,
        secure: false, //false为http访问，true为https访问
        rewrite: (path) => path.replace(/^\/outer/, ""),
      },
      "/bed": {
        target: "https://api.superbed.cn/upload", //代理接口
        changeOrigin: true,
        ws: true,
        secure: false, //false为http访问，true为https访问
        rewrite: (path) => path.replace(/^\/bed/, ""),
      },
    },
  },
});
