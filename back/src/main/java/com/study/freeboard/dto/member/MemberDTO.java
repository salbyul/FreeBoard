package com.study.freeboard.dto.member;

import lombok.Getter;
import lombok.Setter;

public abstract class MemberDTO {

    @Getter
    @Setter
    public static class MemberJoinDTO {

        private Long memberId;
        private String userId;
        private String name;
        private String password;
        private String encryptedPassword;
    }

    @Getter
    @Setter
    public static class MemberLoginDTO {
        private String userId;
        private String password;
        private String encryptedPassword;
    }

}
