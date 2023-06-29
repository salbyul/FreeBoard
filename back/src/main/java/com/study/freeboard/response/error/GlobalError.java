package com.study.freeboard.response.error;

import lombok.Getter;

@Getter
public class GlobalError implements Error{

    private final String code;
    private final String message;

    public GlobalError(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
