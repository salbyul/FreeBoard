package com.study.freeboard.controller.member;

import com.study.freeboard.exception.member.MemberException;
import com.study.freeboard.response.error.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class MemberControllerAdvice {

    /**
     * Member와 관련된 모든 예외를 처리한다.
     *
     * @param e MemberException
     * @return ErrorResponse
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MemberException.class)
    public ErrorResponse handleMemberException(MemberException e) {
        log.error("ERROR: [{}]", e.getErrorCode().getMessage());
        return ErrorResponse.generateMemberResponse(e.getTimestamp(), e.getErrorCode());
    }

    /**
     * 정의되지 않은 예외를 처리한다.
     *
     * @param e Exception
     * @return ErrorResponse
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(RuntimeException.class)
    public ErrorResponse handleUnknownException(Exception e) {
        e.printStackTrace();
        return ErrorResponse.generateResponse();
    }
}
