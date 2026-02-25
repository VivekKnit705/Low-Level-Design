package com.example.low_level_design.RateLimiter;

import com.example.low_level_design.RateLimiter.model.User;
import com.example.low_level_design.RateLimiter.model.UserType;
import com.example.low_level_design.RateLimiter.service.RateLimiterService;


public class Main {
    public static void main(String[] args){

        RateLimiterService rateLimiterService=new RateLimiterService();

        User user1=new User(1, UserType.NORMAL_USER, "Normal User");
        User user2=new User(2, UserType.PREMIUM_USER, "Premium User");

        for(int i=0;i<15;i++){
            boolean isAllowed=rateLimiterService.allowedRequest(user1);

        }

        for(int i=0;i<115;i++){
            boolean isAllowed=rateLimiterService.allowedRequest(user2);
        }
    }
}
