package com.example.low_level_design.BridgeDesignPattern.livingthings;

import com.example.low_level_design.BridgeDesignPattern.breath.BreathImplementor;

public class Dog extends LivingThings{

    public Dog(BreathImplementor breathImplementor){
        super(breathImplementor);
    }

    @Override
    public void breathingProcess() {
        breathImplementor.breath();
    }
}
