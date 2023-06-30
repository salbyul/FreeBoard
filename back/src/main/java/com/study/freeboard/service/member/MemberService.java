package com.study.freeboard.service.member;

import java.security.NoSuchAlgorithmException;

import static com.study.freeboard.dto.member.MemberDTO.*;

public interface MemberService {

    /**
     * 회원가입 메소드
     *
     * @param memberJoinDTO 회원가입할 데이터가 담긴 객체
     * @return 생성된 기본키
     * @throws NoSuchAlgorithmException 알고리즘을 사용할 수 없을 시 발생
     */
    Long joinMember(MemberJoinDTO memberJoinDTO) throws NoSuchAlgorithmException;

    /**
     * userId 필드의 중복검사를 한다.
     *
     * @param userId userId
     */
    void validateDuplicateUserId(String userId);

    /**
     * 로그인 메소드
     * MemberLoginDTO의 userId와 password가 올바른지 확인한다.
     *
     * @param memberLoginDTO 로그인 시 사용되는 객체
     * @throws NoSuchAlgorithmException 알고리즘을 사용할 수 없을 시 발생
     */
    void loginMember(MemberLoginDTO memberLoginDTO) throws NoSuchAlgorithmException;
}
