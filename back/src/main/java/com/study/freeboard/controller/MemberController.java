package com.study.freeboard.controller;

import com.study.freeboard.service.JwtTokenService;
import com.study.freeboard.response.APIResponse;
import com.study.freeboard.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

import static com.study.freeboard.dto.member.MemberDTO.*;
import static com.study.freeboard.response.APIResponse.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;
    private final JwtTokenService jwtTokenService;

    /**
     * 회원가입 메소드
     *
     * @param memberJoinDTO 회원가입할 데이터가 담긴 객체
     * @return response
     * @throws NoSuchAlgorithmException 알고리즘을 사용할 수 없을 시 발생
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public APIResponse join(@RequestBody MemberJoinDTO memberJoinDTO) throws NoSuchAlgorithmException {
        log.info("JOIN: [{}]", memberJoinDTO);
        Long id = memberService.joinMember(memberJoinDTO);
        return generateResponse()
                .addData("memberId", id);
    }

    /**
     * 중복확인 메소드
     *
     * @param userId 중복확인할 userId
     * @return response
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user_id")
    public APIResponse validateDuplicatedUserId(String userId) {
        memberService.validateDuplicateUserId(userId);
        return generateResponse();
    }

    /**
     * 로그인 메소드
     *
     * @param memberLoginDTO 로그인할 데이터가 담긴 객체
     * @return JwtToken
     */
    @PostMapping("/login")
    public APIResponse login(@RequestBody MemberLoginDTO memberLoginDTO) throws NoSuchAlgorithmException {
        memberService.loginMember(memberLoginDTO);
        return generateResponse()
                .addData("token", jwtTokenService.generateToken(memberLoginDTO.getUserId()));
    }
}
