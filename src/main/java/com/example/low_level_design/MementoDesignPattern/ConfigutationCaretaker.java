package com.example.low_level_design.MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigutationCaretaker {
    List<ConfigurationMemento> state;

    public ConfigutationCaretaker(){
        state=new ArrayList<>();
    }

    public void addMomento(ConfigurationMemento memento){
        state.add(memento);
    }


    public ConfigurationMemento UNDO(){
        int size=state.size();
        if(size>0){
            ConfigurationMemento lst=state.remove(size-1);
            return lst;
        }
        return null;
    }
}
