package com.study.freeboard.domain;

import java.time.LocalDateTime;

// Table: free_board_comment
public class FreeBoardComment {


    //    Column: free_board_comment
    private Long id;

    //    Column: content
    private String content;

    //    Column: generation_timestamp
    private LocalDateTime generationTimestamp;

    //    Column: modification_timestamp
    private LocalDateTime modificationTimestamp;

    //    Column: member_id
    private Long memberId;
}
