package com.study.freeboard.domain;

import java.time.LocalDateTime;

// Table: inquiry_board
public class InquiryBoard {

    //    Column: inquiry_board_id
    private Long inquiryBoardId;

    //    Column: title
    private String title;

    //    Column: content
    private String content;

    //    Column: password
    private String password;

    //    Column: views
    private Integer views;

    //    Column: generation_timestamp
    private LocalDateTime generationTimestamp;

    //    Column: modification_timestamp
    private LocalDateTime modificationTimestamp;

    //    Column: member_id
    private Long memberId;
}
