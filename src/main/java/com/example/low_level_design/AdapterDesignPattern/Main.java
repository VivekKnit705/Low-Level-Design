package com.example.low_level_design.AdapterDesignPattern;

import com.example.low_level_design.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import com.example.low_level_design.AdapterDesignPattern.Adapter.WeightMachineAdapterImp;
import com.example.low_level_design.AdapterDesignPattern.adaptee.BabyWeightingMachine;

public class Main {
    public static void main(String[] args){
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImp(new BabyWeightingMachine());
        System.out.println("Weight In KGs is: "+ weightMachineAdapter.calculateWeightInKG());
    }
}
