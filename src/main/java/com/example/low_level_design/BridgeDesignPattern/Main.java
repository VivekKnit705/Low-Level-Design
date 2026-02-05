package com.example.low_level_design.BridgeDesignPattern;

import com.example.low_level_design.BridgeDesignPattern.breath.Leaves;
import com.example.low_level_design.BridgeDesignPattern.breath.Mouth;
import com.example.low_level_design.BridgeDesignPattern.livingthings.Dog;
import com.example.low_level_design.BridgeDesignPattern.livingthings.LivingThings;
import com.example.low_level_design.BridgeDesignPattern.livingthings.Tree;

public class Main {
    public static void main(String[] args){

        LivingThings dog=new Dog(new Mouth());
        dog.breathingProcess();

        LivingThings tree=new Tree(new Leaves());
        tree.breathingProcess();
    }
}
