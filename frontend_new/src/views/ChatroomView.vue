<template>
  <LayoutAuthenticated>
    <div>
        <!-- This is an example component -->
        <div class="container mx-auto shadow-lg rounded-lg">
            <!-- headaer -->
            <!-- end header -->
            <!-- Chatting -->
            <div class="flex flex-row justify-between bg-white">
                <!-- chat list -->
                <div class="flex flex-col w-2/5 border-r-2 overflow-y-auto">
                    <!-- search compt -->
                    <div class="border-b-2 py-4 px-2">
                        <input type="text" placeholder="search chatting"
                            class="py-2 px-2 border-2 border-gray-200 rounded-2xl w-full" />
                    </div>
                    <!-- end search compt -->
                    <!-- user list -->
                    <div v-for="(userChat, index) in userList" :key="index" class="flex flex-row py-4 px-2 justify-center items-center border-b-2">
                        <div class="w-1/4">
                            <img src="https://source.unsplash.com/_7LbC5J-jw4/600x600"
                                class="object-cover h-12 w-12 rounded-full" alt="" />
                        </div>
                        <div class="w-full">
                            <div class="text-lg font-semibold">{{userChat}}</div>
                            <!-- <span class="text-gray-500">Pick me at 9:00 Am</span> -->
                        </div>
                    </div>
                    <!-- <div class="flex flex-row py-4 px-2 items-center border-b-2">
                        <div class="w-1/4">
                            <img src="https://source.unsplash.com/otT2199XwI8/600x600"
                                class="object-cover h-12 w-12 rounded-full" alt="" />
                        </div>
                        <div class="w-full">
                            <div class="text-lg font-semibold">Everest Trip 2021</div>
                            <span class="text-gray-500">Hi Sam, Welcome</span>
                        </div>
                    </div>
                    <div class="flex flex-row py-4 px-2 items-center border-b-2 border-l-4 border-blue-400">
                        <div class="w-1/4">
                            <img src="https://source.unsplash.com/L2cxSuKWbpo/600x600"
                                class="object-cover h-12 w-12 rounded-full" alt="" />
                        </div>
                        <div class="w-full">
                            <div class="text-lg font-semibold">MERN Stack</div>
                            <span class="text-gray-500">Lusi : Thanks Everyone</span>
                        </div>
                    </div>
                    <div class="flex flex-row py-4 px-2 items-center border-b-2">
                        <div class="w-1/4">
                            <img src="https://source.unsplash.com/vpOeXr5wmR4/600x600"
                                class="object-cover h-12 w-12 rounded-full" alt="" />
                        </div>
                        <div class="w-full">
                            <div class="text-lg font-semibold">Javascript Indonesia</div>
                            <span class="text-gray-500">Evan : some one can fix this</span>
                        </div>
                    </div> -->
                    <!-- end user list -->
                </div>
                <!-- end chat list -->
                <!-- message -->
                <div class="w-full px-5 flex flex-col justify-between">
                    <div class="flex flex-col mt-5">
                        <div v-for="(message, index) in msgList" :key="index">
                            <div v-if="message.from===mainStore.userName" class="flex justify-end mb-4">
                                <div
                                    class="mr-2 py-3 px-4 bg-blue-400 rounded-bl-3xl rounded-tl-3xl rounded-tr-xl text-white">
                                    {{message.msg}}
                                </div>
                                <div class="grid grid-cols-1">
                                    <img src="https://source.unsplash.com/vpOeXr5wmR4/600x600"
                                    class="object-cover h-8 w-8 rounded-full" alt="" />
                                    <p>{{ message.from }}</p>
                                </div>
                            </div>
                            <div v-else class="flex justify-start mb-4">
                                <div class="grid grid-cols-1">
                                    <img src="https://source.unsplash.com/vpOeXr5wmR4/600x600"
                                    class="object-cover h-8 w-8 rounded-full" alt="" />
                                    <p>{{ message.from }}</p>
                                </div>
                                <div
                                    class="ml-2 py-3 px-4 bg-gray-400 rounded-br-3xl rounded-tr-3xl rounded-tl-xl text-white">
                                    {{message.msg}}
                                </div>
                            </div>
                        </div>
                        <!-- <div class="flex justify-start mb-4">
                            <img src="https://source.unsplash.com/vpOeXr5wmR4/600x600"
                                class="object-cover h-8 w-8 rounded-full" alt="" />
                            <div
                                class="ml-2 py-3 px-4 bg-gray-400 rounded-br-3xl rounded-tr-3xl rounded-tl-xl text-white">
                                Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat
                                at praesentium, aut ullam delectus odio error sit rem. Architecto
                                nulla doloribus laborum illo rem enim dolor odio saepe,
                                consequatur quas?
                            </div>
                        </div> -->
                        <!-- <div class="flex justify-end mb-4">
                            <div>
                                <div
                                    class="mr-2 py-3 px-4 bg-blue-400 rounded-bl-3xl rounded-tl-3xl rounded-tr-xl text-white">
                                    Lorem ipsum dolor, sit amet consectetur adipisicing elit.
                                    Magnam, repudiandae.
                                </div>

                                <div
                                    class="mt-4 mr-2 py-3 px-4 bg-blue-400 rounded-bl-3xl rounded-tl-3xl rounded-tr-xl text-white">
                                    Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                    Debitis, reiciendis!
                                </div>
                            </div>
                            <img src="https://source.unsplash.com/vpOeXr5wmR4/600x600"
                                class="object-cover h-8 w-8 rounded-full" alt="" />
                        </div> -->
                        <!-- <div class="flex justify-start mb-4">
                            <img src="https://source.unsplash.com/vpOeXr5wmR4/600x600"
                                class="object-cover h-8 w-8 rounded-full" alt="" />
                            <div
                                class="ml-2 py-3 px-4 bg-gray-400 rounded-br-3xl rounded-tr-3xl rounded-tl-xl text-white">
                                happy holiday guys!
                            </div>
                            
                        </div> -->
                    </div>
                    <div class="py-5">
                        <input class="w-full bg-gray-300 py-5 px-3 rounded-xl" type="text" @keyup.enter="send" v-model="message.msg"
                            placeholder="请输入友善的消息吧..." />
                    </div>
                </div>
                <!-- end message -->
            </div>
        </div>
    </div>
  </LayoutAuthenticated>
</template>

<script setup>
import LayoutAuthenticated from "@/layouts/LayoutAuthenticated.vue";
import { computed, ref, onMounted } from "vue";
import { useRouter } from "vue-router";
import { useMainStore } from "@/stores/main";

const mainStore = useMainStore()

const router = useRouter();

let user = '';
// 消息记录列表
let msgList= ref([]);
// 发送的消息
let message= {
    time:null,//时间
    to: '',//发给谁
    from: '',
    msg: ''
};
// 在线用户列表
let userList = ref([]);

let socket = null;

const init = () => {
    // 如果sessionStorage中没有用户信息，则跳转登录页面
    user = mainStore.userName;
    if (!mainStore.isAuthenticated) {
        router.push('/login')
    }
    if (typeof (WebSocket) == "undefined") {
        console.log("您的浏览器不支持WebSocket");
    } else {
        console.log("您的浏览器支持WebSocket");
        let socketUrl = "ws://1.117.159.206:3000/socket/" + user;
        if (socket != null) {
        socket.close();
        socket = null;
        }
        // 开启一个websocket服务
        socket = new WebSocket(socketUrl);
        //打开事件
        socket.onopen = function () {
        console.log("websocket已打开");
        };
        //  浏览器端收消息，获得从服务端发送过来的文本消息
        socket.onmessage = function (msg) {
        console.log("收到数据====" + msg.data)
        let data = JSON.parse(msg.data)
        console.log(data);
        if (data.userNames) {
            // userNames存在则是有人登录，获取在线人员信息
            userList.value = data.userNames
            console.log(userList);
        } else {
            // userNames不存在则是有人发消息
            msgList.value.push(data)
        }
        };
        //关闭事件
        socket.onclose = function () {
        console.log("websocket已关闭");
        };
        //发生了错误事件
        socket.onerror = function () {
        console.log("websocket发生了错误");
        }
    }
};

onMounted(() => {
  init();
});

const send = () => {
    if (!message.msg) {
        this.$message({
        message: '请输入聊天消息！',
        type: 'warning'
        });
    } else {
        if (typeof (WebSocket) == "undefined") {
        console.log("您的浏览器不支持WebSocket");
        } else {
        console.log("您的浏览器支持WebSocket");
        message.from=user;
        message.time=new Date().toLocaleTimeString();
        socket.send(JSON.stringify(message));
        message.msg = '';
        }
    }
    console.log(msgList);
    console.log(userList);
};
</script>