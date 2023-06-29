package com.study.freeboard.domain;

import java.time.LocalDateTime;

// Table: notice
public class Notice {

    //    Column: notice_id
    private Long id;

    //    Column: category
    private String category;

    //    Column: title
    private String title;

    //    Column: content
    private String content;

    //    Column: views
    private Integer views;

    //    Column: is_notification
    private Boolean isNotification;

    //    Column: generation_timestamp
    private LocalDateTime generationTimestamp;

    //    Column: modification_timestamp
    private LocalDateTime modificationTimestamp;

    //    Column: supervisor_id
    private Long supervisorId;
}
