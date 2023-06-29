package com.study.freeboard.repository.member;

import static com.study.freeboard.dto.member.MemberDTO.*;

public interface MemberRepository {

    /**
     * 회원가입 메소드
     *
     * @param memberJoinDTO 회원가입시 입력한 데이터가 있는 객체
     */
    void save(MemberJoinDTO memberJoinDTO);

    /**
     * userId와 같은 user_id를 갖고 있는 레코드의 수를 반환한다.
     *
     * @param userId userId
     * @return 레코드 수
     */
    Integer countByUserId(String userId);
}
