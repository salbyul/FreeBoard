import {createStore} from "vuex";
import {user} from './user'

export default createStore({
    modules: {
        user: Object.assign({namespaced: true}, user),
    }
});