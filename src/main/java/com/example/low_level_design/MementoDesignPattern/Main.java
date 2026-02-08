package com.example.low_level_design.MementoDesignPattern;

public class Main {
    public static void main(String[] args){

        // careTaker
        ConfigutationCaretaker caretaker=new ConfigutationCaretaker();

        // Originator
        ConfigurationMementoOriginator originator=new ConfigurationMementoOriginator(5, 10);

        // add
        ConfigurationMemento memento=originator.createMemento();
        caretaker.addMomento(memento);

        originator.setHeight(7);

        // add
        memento=originator.createMemento();
        caretaker.addMomento(memento);

        // add
        originator.setHeight(9);
        originator.setWidth(15);
        memento=originator.createMemento();
        caretaker.addMomento(memento);

        // add
        originator.setWidth(20);
        memento=originator.createMemento();
        caretaker.addMomento(memento);

        // undo
        memento=caretaker.UNDO();
        originator.reverseMemento(memento);

        System.out.println("Height: "+originator.getHeight()+" Width: "+ originator.getWidth());

        memento=caretaker.UNDO();
        originator.reverseMemento(memento);

        System.out.println("Height: "+originator.getHeight()+" Width: "+ originator.getWidth());

        memento=caretaker.UNDO();
        originator.reverseMemento(memento);

        System.out.println("Height: "+originator.getHeight()+" Width: "+ originator.getWidth());





    }
}
