package com.study.freeboard.exception.member;

import com.study.freeboard.response.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class MemberException extends RuntimeException {

    private final LocalDateTime timestamp = LocalDateTime.now();
    private final ErrorCode errorCode;
}
