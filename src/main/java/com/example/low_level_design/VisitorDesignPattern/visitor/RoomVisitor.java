package com.example.low_level_design.VisitorDesignPattern.visitor;

import com.example.low_level_design.VisitorDesignPattern.element.DeluxRoom;
import com.example.low_level_design.VisitorDesignPattern.element.DoubleRoom;
import com.example.low_level_design.VisitorDesignPattern.element.RoomElement;
import com.example.low_level_design.VisitorDesignPattern.element.SingleRoom;

public interface RoomVisitor {

    public void visit(SingleRoom singleRoom);
    public void visit(DoubleRoom doubleRoom);
    public void visit(DeluxRoom deluxRoom);
}
