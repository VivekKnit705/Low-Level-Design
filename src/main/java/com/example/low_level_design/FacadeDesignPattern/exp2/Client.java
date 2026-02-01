package com.example.low_level_design.FacadeDesignPattern.exp2;

public class Client {
    public static void main(String[] args){
        OrderFacade orderFacade=new OrderFacade();
        orderFacade.createOrder();
    }
}
