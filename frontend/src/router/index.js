import Vue from 'vue'
import VueRouter from 'vue-router'

import CityManager from "../views/CityManager";
import CityAdd from "../views/CityAdd";
import PageThree from "../views/PageThree";
import PageFour from "../views/PageFour";
import Layout from "../views/Layout";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: '城市规划',
        component: Layout,
        redirect: '/cityManager',
        children: [
            {
                path: '/cityManager',
                name: '城市清单',
                component: CityManager
            },
            {
                path: '/cityAdd',
                name: '城市新增',
                component: CityAdd
            },
        ]
    },
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BABEL_ENV,
    routes
})

export default router
