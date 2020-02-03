<template>
    <div id="app">
        <el-container style="height: 600px; border: 0px solid #eee">
            <el-scrollbar>
                <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
<!--                    <el-header height="60px" style="text-align: right; font-size: 14px; background-color: #226A62;">-->
<!--                        <div align="center" style="color: aliceblue;"><i class="el-icon-star-on"></i> Topsail</div>-->
<!--                    </el-header>-->
                    <el-menu router
                             default-active="1"
                             class="el-menu-vertical-demo"
                             @open="handleOpen"
                             @close="handleClose"
                             background-color="#545c64"
                             text-color="#fff"
                             active-text-color="#ffd04b">
                        <el-submenu v-for="(item, index) in $router.options.routes" :index="'index'">
                            <template slot="title">
                                <i class="el-icon-location"></i>
                                {{item.name}}
                            </template>
                            <el-menu-item v-for="(e, i) in item.children"
                                          :index="e.path"
                                          :class="$route.path == e.path ? 'is-active' : ''">{{e.name}}
                            </el-menu-item>
                        </el-submenu>
                    </el-menu>
                </el-aside>
            </el-scrollbar>
            <el-container>
                <el-header height="60px" style="text-align: right; font-size: 12px; background-color: #2f9688;">
                    <el-dropdown>
                        <i class="el-icon-setting" style="color: aliceblue; margin-right: 5px"></i>
                        <el-dropdown-menu slot="dropdown">
                            <el-dropdown-item>查看</el-dropdown-item>
                            <el-dropdown-item>新增</el-dropdown-item>
                            <el-dropdown-item>删除</el-dropdown-item>
                        </el-dropdown-menu>
                    </el-dropdown>
                    <span style="color: aliceblue">Steven</span>
                </el-header>
                <el-main>
                    <router-view></router-view>
                </el-main>

            </el-container>
        </el-container>
    </div>
</template>

<script>
    export default {
        name: "Index",
        methods: {
            handleOpen() {

            },
            handleClose() {

            },
        }
    }
</script>

<style scoped>

    .el-header, .el-footer {
        background-color: #B3C0D1;
        color: #333;
        text-align: center;
        line-height: 60px;
    }

    .el-aside {
        background-color: #D3DCE6;
        color: #333;
        text-align: center;
        line-height: 200px;
    }

    /*.el-main {*/
    /*    background-color: #E9EEF3;*/
    /*    color: #333;*/
    /*    text-align: center;*/
    /*    line-height: 160px;*/
    /*}*/

    body > .el-container {
        margin-bottom: 40px;
    }

    .el-container:nth-child(5) .el-aside,
    .el-container:nth-child(6) .el-aside {
        line-height: 260px;
    }

    .el-container:nth-child(7) .el-aside {
        line-height: 320px;
    }

</style>