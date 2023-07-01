package com.study.freeboard.repository.member;

import com.study.freeboard.domain.Member;

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

    /**
     * userId와 password가 일치하는 레코드를 반환한다.
     *
     * @param memberLoginDTO userId와 password가 담긴 객체
     * @return member
     */
    Member findByUserIdAndPassword(MemberLoginDTO memberLoginDTO);

    /**
     * userId를 이용해 찾은 레코드의 기본키를 반환한다.
     *
     * @param userId userId
     * @return 기본키
     */
    Long findMemberIdByUserId(String userId);
}
