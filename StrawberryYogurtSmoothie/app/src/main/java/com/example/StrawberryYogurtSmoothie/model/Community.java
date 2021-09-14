package com.example.StrawberryYogurtSmoothie.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Community {
    private long artist_id;
    private List<Long> subscribersId = new ArrayList<>();

    // 가입자 수
    // get 할 때 subscribersId.size() 해서 리턴

    // 게시물
    private Map<Long, Post> communityPosts = new HashMap<>();




}
