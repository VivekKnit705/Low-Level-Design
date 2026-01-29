package com.example.low_level_design.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args){
        VehicalFactory vehicalFactory=new VehicalFactory();
        Vehicle bike=vehicalFactory.getVehical("BIKE");
        Vehicle car=vehicalFactory.getVehical("CAR");
        Vehicle truck=vehicalFactory.getVehical("TRUCK");

        System.out.println("Bike Milage:"+bike.getMilage()+" Bike Fuel Capacity: "+bike.getFuelCapacity());
        System.out.println("Car Milage:"+car.getMilage()+" Car Fuel Capacity: "+car.getFuelCapacity());
        System.out.println("Truck Milage:"+truck.getMilage()+" Truck Fuel Capacity: "+truck.getFuelCapacity());

    }
}
