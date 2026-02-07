package com.example.low_level_design.VisitorDesignPattern.element;

import com.example.low_level_design.VisitorDesignPattern.visitor.RoomVisitor;

public class DeluxRoom implements RoomElement{
    public int price;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
