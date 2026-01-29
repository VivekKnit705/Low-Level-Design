package com.example.low_level_design.NullObjectDesignPattern;

public class Bike extends Vehicle{

    @Override
    int getMilage() {
        return 50;
    }

    @Override
    int getFuelCapacity() {
        return 12;
    }
}
