import {createRouter, createWebHistory} from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginView from '../views/LoginView.vue'
import JoinView from '../views/JoinView.vue'
import NoticeView from '../views/NoticeView.vue'
import NoticeDetailView from '../views/NoticeDetailView.vue'

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/',
            name: 'home',
            component: HomeView
        },
        {
            path: '/login',
            name: 'login',
            component: LoginView
        },
        {
            path: '/join',
            name: 'join',
            component: JoinView
        },
        {
            path: '/notice',
            name: 'notice',
            component: NoticeView
        },
        {
            path: '/notice/:id',
            name: 'noticeDetail',
            component: NoticeDetailView
        }
    ]
})

export default router
