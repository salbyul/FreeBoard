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
     * Member Error Response를 생성한다.
     *
     * @param timestamp timestamp
     * @param errorCode errorCode
     * @return ErrorResponse
     */
    public static ErrorResponse generateMemberResponse(LocalDateTime timestamp, ErrorCode errorCode) {
        return new ErrorResponse(timestamp, new MemberError(errorCode));
    }
}
