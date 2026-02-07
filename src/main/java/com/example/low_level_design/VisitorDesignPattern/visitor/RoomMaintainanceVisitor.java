package com.example.low_level_design.VisitorDesignPattern.visitor;

import com.example.low_level_design.VisitorDesignPattern.element.DeluxRoom;
import com.example.low_level_design.VisitorDesignPattern.element.DoubleRoom;
import com.example.low_level_design.VisitorDesignPattern.element.SingleRoom;

public class RoomMaintainanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Signle Room Cleaning");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double Room Cleaning");
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("Delux Room Cleaning");
    }
}
