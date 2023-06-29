package com.study.freeboard.dto.member;

import lombok.Getter;
import lombok.ToString;

public abstract class MemberDTO {

    @Getter
    @ToString
    public static class MemberJoinDTO {

        private Long id;
        private String userId;
        private String name;
        private String password;
    }
}
