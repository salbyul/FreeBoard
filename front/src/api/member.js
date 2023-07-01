import {http} from "./http";

export const joinMember = (member) => {
    return http.post("/members", member);
}

export const validateDuplicateUserId = (userId) => {
    return http.get("/members/user-id", {params: {userId}});
}

export const loginMember = (member) => {
    return http.post("/members/login", member);
}