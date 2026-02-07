package com.example.low_level_design.VisitorDesignPattern.element;

import com.example.low_level_design.VisitorDesignPattern.visitor.RoomVisitor;

public interface RoomElement {

    public void accept(RoomVisitor visitor);

}
