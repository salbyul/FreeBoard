import axios from "axios";

const createInstance = (baseURL, options) => {
    return axios.create(Object.assign({baseURL: baseURL}, options));
}

export const http = createInstance("http://localhost:8080/api");

http.interceptors.response.use(
    (response) => {
        return response.data
    },
    (error) => {
        return Promise.reject(error);
    }
)