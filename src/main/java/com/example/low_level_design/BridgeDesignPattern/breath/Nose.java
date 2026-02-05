package com.example.low_level_design.BridgeDesignPattern.breath;

public class Nose extends BreathImplementor{
    @Override
    public void breath() {
        System.out.println("Breath through Nose");
    }
}
