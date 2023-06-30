package com.study.freeboard.validator;

import com.study.freeboard.exception.member.MemberException;

import static com.study.freeboard.dto.member.MemberDTO.*;
import static com.study.freeboard.response.error.ErrorCode.*;

public class MemberValidator {

    /**
     * 회원가입 시 사용될 유효성 검사 메소드
     *
     * @param memberJoinDTO 유효성 검사 대상 객체
     */
    public void validateForJoin(MemberJoinDTO memberJoinDTO) {
        validateUserId(memberJoinDTO.getUserId());
        validatePassword(memberJoinDTO.getUserId(), memberJoinDTO.getPassword());
        validateName(memberJoinDTO.getName());
    }

    /**
     * userId 필드 유효성 검사 메소드
     * 4자 이상, 12자 미만
     * 영문, 숫자가 포함되고 "-", "_"를 제외한 특수문자를 금지한다.
     *
     * @param userId userId
     */
    private void validateUserId(String userId) {
        if (userId == null) {
            throw new MemberException(MEMBER_USER_ID_NULL);
        }
        if (userId.length() < 4 || userId.length() > 11) {
            throw new MemberException(MEMBER_USER_ID_LENGTH);
        }
        validateUserIdPattern(userId);
    }

    /**
     * userId 필드의 패턴과 관련된 유효성 검사를 한다.
     * 영문, 숫자가 포함되고 "-", "_"를 제외한 특수문자를 금지한다.
     *
     * @param userId userId
     */
    private void validateUserIdPattern(String userId) {
        boolean containAlphabetic = false;
        boolean containNumber = false;
        for (char c : userId.toCharArray()) {
            if (Character.isDigit(c)) {
                containNumber = true;
                continue;
            }
            if (Character.isAlphabetic(c)) {
                containAlphabetic = true;
                continue;
            }
            if (c == '-' || c == '_') {
                continue;
            }
            throw new MemberException(MEMBER_USER_ID_PATTERN);
        }
        if (!containNumber || !containAlphabetic) {
            throw new MemberException(MEMBER_USER_ID_PATTERN);
        }
    }

    /**
     * password 필드 유효성 검사 메소드
     * 4자 이상, 12자 미만
     * 아이디와 동일한 비밀번호 사용 불가
     * 3번 이상 연속된 문자 사용 불가
     *
     * @param userId   userId
     * @param password password
     */
    private void validatePassword(String userId, String password) {
        if (password == null) {
            throw new MemberException(MEMBER_PASSWORD_NULL);
        }
        if (password.length() < 4 || password.length() > 11) {
            throw new MemberException(MEMBER_PASSWORD_LENGTH);
        }
        if (password.equals(userId)) {
            throw new MemberException(MEMBER_PASSWORD_SAME_USER_ID);
        }
        validatePasswordPattern(password);
    }

    /**
     * password 필드의 패턴과 관련된 유효성 검사 메소드
     * 3번 이상 연속된 문자 사용 불가
     *
     * @param password password
     */
    private void validatePasswordPattern(String password) {
        char[] chars = password.toCharArray();
        int count = 1;
        char preChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == preChar) {
                count++;
            } else {
                count = 1;
                preChar = chars[i];
            }
            if (count == 3) {
                throw new MemberException(MEMBER_PASSWORD_PATTERN);
            }
        }
    }

    /**
     * name 필드 유효성 검사 메소드
     * 2자 이상, 5자 미만
     *
     * @param name name
     */
    private void validateName(String name) {
        if (name == null) {
            throw new MemberException(MEMBER_NAME_NULL);
        }
        if (name.length() < 2 || name.length() > 4) {
            throw new MemberException(MEMBER_NAME_LENGTH);
        }
    }
}
