package com.example.low_level_design.BridgeDesignPattern.livingthings;

import com.example.low_level_design.BridgeDesignPattern.breath.BreathImplementor;

public abstract class LivingThings {
    BreathImplementor breathImplementor;

    public LivingThings(BreathImplementor breathImplementor){
        this.breathImplementor=breathImplementor;
    }

    public abstract void breathingProcess();
}
