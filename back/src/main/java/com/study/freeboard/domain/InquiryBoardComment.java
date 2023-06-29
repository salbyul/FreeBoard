package com.study.freeboard.domain;

import java.time.LocalDateTime;

// Table: inquiry_board_comment
public class InquiryBoardComment {

    //    Column: inquiry_board_comment_id
    private Long id;

    //    Column: content
    private String content;

    //    Column: generation_timestamp
    private LocalDateTime generationTimestamp;

    //    Column: modification_timestamp
    private LocalDateTime modificationTimestamp;

    //    Column: supervisor_id
    private Long supervisorId;
}
