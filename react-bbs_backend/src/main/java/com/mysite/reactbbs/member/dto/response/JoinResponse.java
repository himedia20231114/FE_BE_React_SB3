package com.mysite.reactbbs.member.dto.response;

public class JoinResponse {

    private String id;

    public JoinResponse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
