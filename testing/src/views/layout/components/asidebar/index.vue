<template>
    <el-menu class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" background-color="white"
        text-color="#000" active-text-color="orange" :collapse="isCollapse" :default-openeds="openeds" router>
        <el-menu-item index="/triangle"> <i class="el-icon-star-off"></i>判断三角形类型</el-menu-item>
        <el-menu-item index="/calendar"> <i class="el-icon-star-off"></i>万年历问题</el-menu-item>
        <el-menu-item index="/two"> <i class="el-icon-star-off"></i>销售管理系统</el-menu-item>
        <el-menu-item index="/sales"> <i class="el-icon-star-off"></i>电脑销售系统</el-menu-item>
        <el-menu-item index="/four"> <i class="el-icon-star-off"></i>电商平台系统</el-menu-item>
        <el-menu-item index="/cash"> <i class="el-icon-star-off"></i>电信收费问题</el-menu-item>
        <el-menu-item index="/seven"> <i class="el-icon-star-off"></i>实时C/S系统</el-menu-item>
        <el-menu-item index="/nine"> <i class="el-icon-star-off"></i>ATM系统</el-menu-item>
        <el-menu-item index="/ten"> <i class="el-icon-star-off"></i>ERP系统</el-menu-item>
        <el-menu-item index="/eleven"> <i class="el-icon-star-off"></i>实时Web系统</el-menu-item>
        <el-menu-item index="/twelve"> <i class="el-icon-star-off"></i>构建程序图</el-menu-item>
        <el-menu-item index="/thirteen"> <i class="el-icon-star-off"></i>销售系统</el-menu-item>
    </el-menu>
</template>

<script>
export default {
    name: 'AsideBar',
    components: {},
    props: ['is-collapse'],
    data() {
        return {
            openeds: ['1'],
        }
    },
    computed: {},
    watch: {},
    created() { },
    mounted() { },
    methods: {
        handleOpen(key, keyPath) {
            console.log(key, keyPath)
        },
        handleClose(key, keyPath) {
            console.log(key, keyPath)
        },
    },
}
</script>

<style scoped lang="less">
.el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
}

.el-menu-item:hover {
    background-color: #c4c2c2 !important;
}
</style>
