package com.example.terellbrown.checkyoself.API;

/**
 * Created by fnord on 6/25/16.
 */
public class Auth {
    private String accessToken;
    private String tokenType;
    private int expiresAt;
    private int expiresIn;

    public Auth(String accessToken, String tokenType, int expiresAt, int expiresIn){
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresAt = expiresAt;
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public int getExpiresAt() {
        return expiresAt;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

}
