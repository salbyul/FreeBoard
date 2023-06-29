package com.study.freeboard.service.member;

import com.study.freeboard.exception.member.MemberException;
import com.study.freeboard.repository.member.MemberRepository;
import com.study.freeboard.response.error.ErrorCode;
import com.study.freeboard.validator.MemberValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.study.freeboard.dto.member.MemberDTO.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final MemberValidator memberValidator;

    /**
     * 회원가입 메소드
     * 유효성 검사 진행 후 DB에 저장한다.
     *
     * @param memberJoinDTO 저장할 데이터가 담긴 객체
     * @return 생성된 기본키
     */
    @Override
    public Long joinMember(MemberJoinDTO memberJoinDTO) {
        memberValidator.validateForJoin(memberJoinDTO);
        memberRepository.save(memberJoinDTO);
        return memberJoinDTO.getId();
    }

    /**
     * userId 필드의 중복 검사를 진행한다.
     *
     * @param userId userId
     */
    @Override
    public void validateDuplicateUserId(String userId) {
        Integer duplicatedCounts = memberRepository.countByUserId(userId);
        if (duplicatedCounts != 0) {
            throw new MemberException(ErrorCode.MEMBER_USER_ID_DUPLICATED);
        }
    }
}
