package com.study.freeboard.response.error;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorResponse {

    private final LocalDateTime timestamp;
    private final Error error;

    /**
     * Member ErrorResponse를 생성한다.
     *
     * @param timestamp timestamp
     * @param errorCode errorCode
     * @return ErrorResponse
     */
    public static ErrorResponse generateMemberResponse(LocalDateTime timestamp, ErrorCode errorCode) {
        return new ErrorResponse(timestamp, new MemberError(errorCode));
    }

    /**
     * 정의되지 않은 ErrorResponse를 생성한다.
     *
     * @return ErrorResponse
     */
    public static ErrorResponse generateResponse() {
        return new ErrorResponse(LocalDateTime.now(), new GlobalError(ErrorCode.UNKNOWN_ERROR));
    }
}
