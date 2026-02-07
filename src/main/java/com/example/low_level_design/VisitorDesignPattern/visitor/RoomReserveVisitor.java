package com.example.low_level_design.VisitorDesignPattern.visitor;

import com.example.low_level_design.VisitorDesignPattern.element.DeluxRoom;
import com.example.low_level_design.VisitorDesignPattern.element.DoubleRoom;
import com.example.low_level_design.VisitorDesignPattern.element.SingleRoom;

public class RoomReserveVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single Room Reserve");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Single Room Reserve");
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("Single Room Reserve");
    }
}
