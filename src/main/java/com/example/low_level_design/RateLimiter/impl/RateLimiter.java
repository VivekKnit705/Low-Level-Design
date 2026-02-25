package com.example.low_level_design.RateLimiter.impl;

import com.example.low_level_design.RateLimiter.model.RateLimiterConfig;
import com.example.low_level_design.RateLimiter.model.User;

public abstract class RateLimiter {

    public RateLimiterConfig rateLimiterConfig;

    public RateLimiter(RateLimiterConfig rateLimiterConfig){
        this.rateLimiterConfig=rateLimiterConfig;
    }

     public abstract boolean allowRequest(User user);
}
