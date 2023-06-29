package com.study.freeboard.service.member;

import static com.study.freeboard.dto.member.MemberDTO.*;

public interface MemberService {

    /**
     * 회원가입 메소드
     *
     * @param memberJoinDTO 회원가입될 데이터가 담긴 객체
     * @return 기본키
     */
    Long joinMember(MemberJoinDTO memberJoinDTO);

    /**
     * userId 필드의 중복검사를 한다.
     *
     * @param userId userId
     */
    void validateDuplicateUserId(String userId);
}
