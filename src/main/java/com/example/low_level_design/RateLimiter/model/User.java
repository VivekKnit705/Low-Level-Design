package com.example.low_level_design.RateLimiter.model;


public class User {
    private int userId;
    private UserType userType;
    private String name;

    public User(int userId, UserType userType, String name) {
        this.userId = userId;
        this.userType = userType;
        this.name = name;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
