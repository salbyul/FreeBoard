package com.study.freeboard.controller;

import com.study.freeboard.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.study.freeboard.dto.member.MemberDTO.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

//    TODO: Response 만들어야 함

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public String join(@RequestBody MemberJoinDTO memberJoinDTO) {
        log.info("JOIN: [{}]", memberJoinDTO);
        memberService.joinMember(memberJoinDTO);
        return "OK";
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/user_id")
    public String validateDuplicatedUserId(String userId) {
        memberService.validateDuplicateUserId(userId);
        return "OK";
    }
}
