package com.example.low_level_design.VisitorDesignPattern;

import com.example.low_level_design.VisitorDesignPattern.element.DeluxRoom;
import com.example.low_level_design.VisitorDesignPattern.element.DoubleRoom;
import com.example.low_level_design.VisitorDesignPattern.element.RoomElement;
import com.example.low_level_design.VisitorDesignPattern.element.SingleRoom;
import com.example.low_level_design.VisitorDesignPattern.visitor.RoomMaintainanceVisitor;
import com.example.low_level_design.VisitorDesignPattern.visitor.RoomPricingVisitor;
import com.example.low_level_design.VisitorDesignPattern.visitor.RoomVisitor;

public class Main {

    public static void main(String[] args){
        RoomElement singleRoom=new SingleRoom();
        RoomElement doubleRoom=new DoubleRoom();
        RoomElement deluxRoom=new DeluxRoom();

        RoomVisitor priceVisitor=new RoomPricingVisitor();
        singleRoom.accept(priceVisitor);
        System.out.println(((SingleRoom)singleRoom).price);

        doubleRoom.accept(priceVisitor);
        System.out.println(((DoubleRoom)doubleRoom).price);


        RoomVisitor maintance=new RoomMaintainanceVisitor();
        deluxRoom.accept(maintance);

        doubleRoom.accept(maintance);
    }
}
