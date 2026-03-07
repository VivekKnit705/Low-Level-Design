package com.example.low_level_design.NullObjectDesignPattern;

public class Bike extends Vehicle{

    @Override
    int getMillage() {
        return 50;
    }

    @Override
    int getFuelCapacity() {
        return 12;
    }
}
