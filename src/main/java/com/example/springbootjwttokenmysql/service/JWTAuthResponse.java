package com.example.springbootjwttokenmysql.service;

public class JWTAuthResponse {
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
