package com.study.freeboard.response.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    UNKNOWN_ERROR("999", "정의되지 않은 에러입니다."),

    //    Token
    TOKEN_NULL("000", "토큰이 null값 입니다."),
    TOKEN_EXPIRED("001", "토큰이 만료되었습니다."),
    TOKEN_MALFORMED("002", "올바르지 않은 형태입니다."),
    TOKEN_SIGNATURE("003", "올바르지 않은 서명입니다."),

    //    Member
    MEMBER_USER_ID_NULL("110", "아이디가 null값 입니다."),
    MEMBER_USER_ID_LENGTH("111", "아이디의 길이가 적절하지 않습니다."),
    MEMBER_USER_ID_PATTERN("112", "아이디의 패턴이 적절하지 않습니다."),
    MEMBER_USER_ID_DUPLICATED("119", "아이디가 중복됩니다."),

    MEMBER_PASSWORD_NULL("120", "비밀번호가 null값 입니다."),
    MEMBER_PASSWORD_LENGTH("121", "비밀번호의 길이가 적절하지 않습니다."),
    MEMBER_PASSWORD_SAME_USER_ID("128", "비밀번호와 아이디가 같을 수 없습니다."),
    MEMBER_PASSWORD_PATTERN("122", "비밀번호의 패턴이 적절하지 않습니다."),

    MEMBER_NAME_NULL("130", "이름이 null값 입니다."),
    MEMBER_NAME_LENGTH("131", "이름의 길이가 적절하지 않습니다."),

    MEMBER_LOGIN("100", "아이디나 비밀번호가 올바르지 않습니다.");

    private final String code;
    private final String message;
}
