package com.example.low_level_design.AdapterDesignPattern.Adapter;

import com.example.low_level_design.AdapterDesignPattern.adaptee.WeightingMachine;

public class WeightMachineAdapterImp implements  WeightMachineAdapter{

    WeightingMachine weightingMachine;

    public WeightMachineAdapterImp(WeightingMachine weightingMachine){
        this.weightingMachine=weightingMachine;
    }

    @Override
    public double calculateWeightInKG() {
        double weightInPound=weightingMachine.getWeightInPound();
        System.out.println("Weight In Pound: "+weightInPound);
        return weightInPound*25;
    }
}
