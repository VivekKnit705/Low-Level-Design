package com.example.low_level_design.NullObjectDesignPattern;

public class NullObject extends Vehicle{
    @Override
    int getMillage() {
        return 0;
    }

    @Override
    int getFuelCapacity() {
        return 0;
    }
}
