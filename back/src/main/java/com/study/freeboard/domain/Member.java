package com.study.freeboard.domain;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
// Table: member
public class Member {

    //    Column: member_id
    private Long memberId;

    //    Column: user_id
    private String userId;

    //    Column: password
    private String password;

    //    Column: name
    private String name;

    //    Column: generation_timestamp
    private LocalDateTime generationTimestamp;

    //    Column: modification_timestamp
    private LocalDateTime modificationTimestamp;
}
