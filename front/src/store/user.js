// TODO: 사용하는 것이 맞나
export const user = {
    state: () => ({
        userName: '',
    }),
    mutations: {
        setUserName(state, value) {
            state.userName = value;
        },
    },
}