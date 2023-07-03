import './index.css'

import {createApp} from 'vue'
import App from './App.vue'
import router from './router'
import VueCookies from 'vue-cookies'
import index from './store/index';

const app = createApp(App)

app.use(router)
    .use(VueCookies)
    .use(index)

app.mount('#app')