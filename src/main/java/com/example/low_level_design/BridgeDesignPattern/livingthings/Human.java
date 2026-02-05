package com.example.low_level_design.BridgeDesignPattern.livingthings;

import com.example.low_level_design.BridgeDesignPattern.breath.BreathImplementor;

public class Human extends LivingThings{
    public Human(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathingProcess() {
        breathImplementor.breath();
    }
}
