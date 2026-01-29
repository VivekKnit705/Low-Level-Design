package com.example.low_level_design.NullObjectDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class VehicalFactory {
    Map<String , Vehicle> vehical;

    public VehicalFactory(){
        vehical=new HashMap<>();
        vehical.put("CAR", new Car());
        vehical.put("BIKE", new Bike());
    }

    public Vehicle getVehical(String obj){
        return vehical.getOrDefault(obj, new NullObject());
    }
}
