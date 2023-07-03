import axios from "axios";

const createInstance = (baseURL, options) => {
    return axios.create(Object.assign({baseURL: baseURL}, options));
}

export const http = createInstance("http://localhost:8080/api");

/**
 * 토큰이 있으면 헤더에 토큰을 추가한다.
 */
http.interceptors.request.use(
    (config) => {
        const token = getCookie('token');
        if (token !== null && token !== '') {
            config.headers = {'authorization': 'Bearer ' + token};
        }
        return config;
    },
    (error) => {
        return Promise.reject(error);
    }
)

http.interceptors.response.use(
    (response) => {
        return response.data
    },
    (error) => {
        return Promise.reject(error);
    }
)

/**
 * 쿠키에서 key의 value 값을 뽑아내는 메소드
 * @param name 쿠키의 key
 * @returns {string} value
 */
const getCookie = (name) => {
    const cookie = document.cookie;
    let number = cookie.indexOf(name + '=');
    let end = cookie.indexOf(';');
    return end === -1 ? cookie.substring(number + name.length + 1) : cookie.substring(number + name.length + 1, end);
}