package com.example.StrawberryYogurtSmoothie.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private String profile_imageLink;
    private String email;
    private String password;

    // 참여 또는 팔로하고 있는 아티스트
    private List<Long> involvedArtistCommunity = new ArrayList<>();
    private Map<Long, String> artistCommunityAndNickname = new HashMap<>();

    // 유저 관리용 아이디
    private long user_id;

    // 유저 위치
    private String timeRegion;

    // 가입일
    private Date initiationDate;
}
