package com.example.low_level_design.RateLimiter.impl;

import com.example.low_level_design.RateLimiter.model.RateLimiterConfig;
import com.example.low_level_design.RateLimiter.model.User;

public class LeakyBucket extends RateLimiter {

    public LeakyBucket(RateLimiterConfig rateLimiterConfig) {
        super(rateLimiterConfig);
    }

    @Override
    public boolean allowRequest(User user) {
        return false;
    }
}
