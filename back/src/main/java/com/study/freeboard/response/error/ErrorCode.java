package com.study.freeboard.response.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    //    Member
    MEMBER_USER_ID_LENGTH("111", "아이디의 길이가 적절하지 않습니다."),
    MEMBER_USER_ID_PATTERN("112", "아이디의 패턴이 적절하지 않습니다."),
    MEMBER_USER_ID_DUPLICATED("119", "아이디가 중복됩니다."),
    MEMBER_PASSWORD_LENGTH("121", "비밀번호의 길이가 적절하지 않습니다."),
    MEMBER_PASSWORD_SAME_USER_ID("128", "비밀번호와 아이디가 같을 수 없습니다."),
    MEMBER_PASSWORD_PATTERN("122", "비밀번호의 패턴이 적절하지 않습니다."),
    MEMBER_NAME_LENGTH("131", "이름의 길이가 적절하지 않습니다.");

    private final String code;
    private final String message;
}
