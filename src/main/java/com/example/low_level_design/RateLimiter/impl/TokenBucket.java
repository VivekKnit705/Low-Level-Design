package com.example.low_level_design.RateLimiter.impl;

import com.example.low_level_design.RateLimiter.model.RateLimiterConfig;
import com.example.low_level_design.RateLimiter.model.User;

import java.util.HashMap;
import java.util.Map;

public class TokenBucket extends RateLimiter {

    Map<String, Integer> tokens=new HashMap<>();
    Map<String, Integer> lastRefillTime=new HashMap<>();

    public TokenBucket(RateLimiterConfig rateLimiterConfig) {
        super(rateLimiterConfig);
    }

    @Override
    public boolean allowRequest(User user) {
        return false;
    }
}
