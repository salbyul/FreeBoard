import {createRouter, createWebHistory} from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginView from '../views/LoginView.vue'
import JoinView from '../views/JoinView.vue'
import NoticeView from '../views/notice/NoticeView.vue'
import NoticeDetailView from '../views/notice/NoticeDetailView.vue'
import FreeBoardView from '../views/free/FreeBoardView.vue'
import FreeBoardDetailView from '../views/free/FreeBoardDetailView.vue'
import FreeBoardCreateView from '../views/free/FreeBoardCreateView.vue'
import GalleryView from '../views/gallery/GalleyView.vue'
import GalleryDetailView from '../views/gallery/GalleyDetailView.vue'
import GalleryCreateView from '../views/gallery/GalleryCreateView.vue'
import InquiryView from '../views/inquiry/InquiryView.vue'
import InquiryDetailView from '../views/inquiry/InquiryDetailView.vue'
import InquiryCreateView from '../views/inquiry/InquiryCreateView.vue'

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
        },
        {
            path: '/free',
            name: 'free',
            component: FreeBoardView
        },
        {
            path: '/free/:id',
            name: 'freeDetail',
            component: FreeBoardDetailView
        },
        {
            path: '/free/create',
            name: 'freeCreate',
            component: FreeBoardCreateView
        },
        {
            path: '/gallery',
            name: 'gallery',
            component: GalleryView
        },
        {
            path: '/gallery/:id',
            name: 'galleryDetail',
            component: GalleryDetailView
        },
        {
            path: '/gallery/create',
            name: 'galleryCreate',
            component: GalleryCreateView
        },
        {
            path: '/inquiry',
            name: 'inquiry',
            component: InquiryView
        },
        {
            path: '/inquiry/:id',
            name: 'inquiryDetail',
            component: InquiryDetailView
        },
        {
            path: '/inquiry/create',
            name: 'inquiryCreate',
            component: InquiryCreateView
        }
    ]
})

export default router
