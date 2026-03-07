package com.example.low_level_design.RateLimiter.service;

import com.example.low_level_design.RateLimiter.impl.RateLimiter;
import com.example.low_level_design.RateLimiter.impl.SlidingWindowLog;
import com.example.low_level_design.RateLimiter.impl.TokenBucket;
import com.example.low_level_design.RateLimiter.model.RateLimiterConfig;
import com.example.low_level_design.RateLimiter.model.UserType;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterFactory {

    Map<String, RateLimiter> userTypeToRateLimiter;

    public RateLimiterFactory(){
        userTypeToRateLimiter= new HashMap<>();
        userTypeToRateLimiter.put(UserType.NORMAL_USER.name(), new TokenBucket(new RateLimiterConfig(10, 60)));
        userTypeToRateLimiter.put(UserType.PREMIUM_USER.name(), new SlidingWindowLog(new RateLimiterConfig(100, 60)));
    }

    public RateLimiter getRateLimiter(UserType userType){
        return userTypeToRateLimiter.get(userType.name());
    }
}
