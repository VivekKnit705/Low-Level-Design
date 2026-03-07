package com.example.low_level_design.NullObjectDesignPattern;

public class Car extends Vehicle{
    @Override
    int getMillage() {
        return 12;
    }

    @Override
    int getFuelCapacity() {
        return 45;
    }
}
