package com.example.low_level_design.VisitorDesignPattern.visitor;

import com.example.low_level_design.VisitorDesignPattern.element.DeluxRoom;
import com.example.low_level_design.VisitorDesignPattern.element.DoubleRoom;
import com.example.low_level_design.VisitorDesignPattern.element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.price=100;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.price=200;
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        deluxRoom.price=500;
    }
}
