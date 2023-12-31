package com.study.freeboard.domain;

import java.time.LocalDateTime;

// Table: supervisor
public class Supervisor {

    //    Column: supervisor_id
    private Long supervisorId;

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
