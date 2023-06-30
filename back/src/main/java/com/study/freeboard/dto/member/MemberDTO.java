package com.study.freeboard.dto.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public abstract class MemberDTO {

    @Getter
    @Setter
    public static class MemberJoinDTO {

        private Long id;
        private String userId;
        private String name;
        private String password;
        private String encryptedPassword;
    }

    @Getter
    @Setter
    @ToString
    public static class MemberLoginDTO {
        private String userId;
        private String password;
        private String encryptedPassword;
    }

}
