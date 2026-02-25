package com.example.low_level_design.RateLimiter.model;

public class RateLimiterConfig {
    int numberOfRequests;
    int refillTime;

    public RateLimiterConfig(int numberOfRequests, int refillTime) {
        this.numberOfRequests = numberOfRequests;
        this.refillTime = refillTime;
    }
}
