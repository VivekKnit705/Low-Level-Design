package com.example.low_level_design.RateLimiter.service;

import com.example.low_level_design.RateLimiter.impl.RateLimiter;
import com.example.low_level_design.RateLimiter.model.User;


public class RateLimiterService {

    public boolean allowedRequest(User user){
        RateLimiterFactory rateLimiterFactory= new RateLimiterFactory();
        RateLimiter rateLimiter= rateLimiterFactory.getRateLimiter(user.getUserType());
        return rateLimiter.allowRequest(user);
    }
}
