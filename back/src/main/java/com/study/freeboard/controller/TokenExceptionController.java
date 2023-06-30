package com.study.freeboard.controller;

import com.study.freeboard.response.error.ErrorCode;
import com.study.freeboard.response.error.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import static com.study.freeboard.response.error.ErrorResponse.*;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@Slf4j
@RestController
@RequestMapping("/api/errors/token")
public class TokenExceptionController {

    /**
     * 만료된 토큰 핸들링 메소드
     *
     * @return ErrorResponse
     */
    @GetMapping("/expiration")
    public ErrorResponse handlingExpiredToken() {
        return generateMemberResponse(LocalDateTime.now(), ErrorCode.TOKEN_EXPIRED);
    }

    /**
     * 올바르지 않은 형태의 토큰 핸들링 메소드
     *
     * @return ErrorResponse
     */
    @GetMapping("/malformed")
    public ErrorResponse handlingMalformedToken() {
        return generateMemberResponse(LocalDateTime.now(), ErrorCode.TOKEN_MALFORMED);
    }

    /**
     * 올바르지 않은 서명의 토큰 핸들링 메소드
     *
     * @return ErrorResponse
     */
    @GetMapping("/signature")
    public ErrorResponse handlingInvalidSignature() {
        return generateMemberResponse(LocalDateTime.now(), ErrorCode.TOKEN_SIGNATURE);
    }

    /**
     * 토큰이 없을 경우 핸들링 메소드
     *
     * @return ErrorResponse
     */
    @GetMapping("/null")
    public ErrorResponse handlingNullToken() {
        return generateMemberResponse(LocalDateTime.now(), ErrorCode.TOKEN_NULL);
    }

    /**
     * 정의되지 않은 에러 핸들링 메소드
     *
     * @return ErrorResponse
     */
    @GetMapping("/unknown")
    public ErrorResponse handlingUnknownError() {
        return generateMemberResponse(LocalDateTime.now(), ErrorCode.UNKNOWN_ERROR);
    }
}
