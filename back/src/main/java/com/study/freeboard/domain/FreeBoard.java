package com.study.freeboard.domain;

import java.time.LocalDateTime;

// Table: free_board
public class FreeBoard {


    //    Column: free_board_id
    private Long freeBoardId;

    //    Column: category
    private String category;

    //    Column: title
    private String title;

    //    Column: content
    private String content;

    //    Column: views
    private Integer views;

    //    Column: generation_timestamp
    private LocalDateTime generationTimestamp;

    //    Column: modification_timestamp
    private LocalDateTime modificationTimestamp;

    //    Column: member_id
    private Long memberId;
}
