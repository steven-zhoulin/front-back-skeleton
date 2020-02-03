import Vue from 'vue'
import VueRouter from 'vue-router'

import BookManager from "../views/BookManager";
import BookAdd from "../views/BookAdd";
import PageThree from "../views/PageThree";
import PageFour from "../views/PageFour";
import Index from "../views/Index";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: '图书管理',
        component: Index,
        redirect: '/bookManager',
        children: [
            {
                path: '/bookManager',
                name: '图书管理',
                component: BookManager
            },
            {
                path: '/bookAdd',
                name: '图书新增',
                component: BookAdd
            },
        ]
    },
    {
        path: '/nav',
        name: '导航二',
        component: Index,
        children: [
            {
                path: '/pageThree',
                name: '页面三',
                component: PageThree
            },
            {
                path: '/pageFour',
                name: '页面四',
                component: PageFour
            }
        ]
    },
    {
        path: '/nav',
        name: '导航二',
        component: Index,
        children: [
            {
                path: '/pageThree',
                name: '页面三',
                component: PageThree
            },
            {
                path: '/pageFour',
                name: '页面四',
                component: PageFour
            }
        ]
    },
    {
        path: '/nav',
        name: '导航二',
        component: Index,
        children: [
            {
                path: '/pageThree',
                name: '页面三',
                component: PageThree
            },
            {
                path: '/pageFour',
                name: '页面四',
                component: PageFour
            }
        ]
    },
    {
        path: '/nav',
        name: '导航二',
        component: Index,
        children: [
            {
                path: '/pageThree',
                name: '页面三',
                component: PageThree
            },
            {
                path: '/pageFour',
                name: '页面四',
                component: PageFour
            }
        ]
    },
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BABEL_ENV,
    routes
})

export default router
