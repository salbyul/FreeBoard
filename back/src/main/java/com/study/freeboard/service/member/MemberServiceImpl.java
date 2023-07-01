package com.study.freeboard.service.member;

import com.study.freeboard.domain.Member;
import com.study.freeboard.encryptor.Encryptor;
import com.study.freeboard.exception.member.MemberException;
import com.study.freeboard.repository.member.MemberRepository;
import com.study.freeboard.response.error.ErrorCode;
import com.study.freeboard.validator.MemberValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

import static com.study.freeboard.dto.member.MemberDTO.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final MemberValidator memberValidator;
    private final Encryptor encryptor;

    /**
     * 회원가입 메소드
     * 유효성검사 후 저장된다.
     *
     * @param memberJoinDTO 회원가입할 데이터가 담긴 객체
     * @return 생성된 기본키
     * @throws NoSuchAlgorithmException 알고리즘을 사용할 수 없을 시 발생
     */
    @Override
    public Long joinMember(MemberJoinDTO memberJoinDTO) throws NoSuchAlgorithmException {
        memberValidator.validateForJoin(memberJoinDTO);

        String encryptedPassword = encryptor.encrypt(memberJoinDTO.getPassword());
        memberJoinDTO.setEncryptedPassword(encryptedPassword);

        validateDuplicateUserId(memberJoinDTO.getUserId());
        memberRepository.save(memberJoinDTO);
        return memberJoinDTO.getMemberId();
    }

    /**
     * userId 필드의 중복 검사를 진행한다.
     *
     * @param userId userId
     */
    @Override
    public void validateDuplicateUserId(String userId) {
        if (userId == null) {
            throw new MemberException(ErrorCode.MEMBER_USER_ID_NULL);
        }
        Integer duplicatedCounts = memberRepository.countByUserId(userId);
        if (duplicatedCounts != 0) {
            throw new MemberException(ErrorCode.MEMBER_USER_ID_DUPLICATED);
        }
    }

    /**
     * memberLoginDTO에 담긴 userId와 password를 이용해 DB에서 레코드를 찾아 기본키를 반환한다.
     * 레코드를 찾을 수 없을 경우 MemberException 발생
     *
     * @param memberLoginDTO 로그인 시 사용되는 객체
     * @return 기본키
     * @throws NoSuchAlgorithmException 알고리즘을 사용할 수 없을 시 발생
     */
    @Override
    public Long loginMember(MemberLoginDTO memberLoginDTO) throws NoSuchAlgorithmException {
        String encryptedPassword = encryptor.encrypt(memberLoginDTO.getPassword());
        memberLoginDTO.setEncryptedPassword(encryptedPassword);
        Member foundMember = memberRepository.findByUserIdAndPassword(memberLoginDTO);
        if (foundMember == null) {
            throw new MemberException(ErrorCode.MEMBER_LOGIN);
        }
        return foundMember.getMemberId();
    }
}
