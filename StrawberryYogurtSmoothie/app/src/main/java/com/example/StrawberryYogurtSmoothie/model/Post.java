package com.example.StrawberryYogurtSmoothie.model;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Post {
    // 업로드 한 사람
    private long uploader_id;

    // 게시물 사진 링크
    private boolean isMediaExist = false;
    private String post_imageLink;
    // 게시물 글
    private String post_text;

    // 댓글 집합
    // <댓글 인덱스, Comment 객체>
    private final Map<Long, Comment> comments = new HashMap<>();

    // 지역
    private String timeRegion;
    private Date lastChangedDate;


}
