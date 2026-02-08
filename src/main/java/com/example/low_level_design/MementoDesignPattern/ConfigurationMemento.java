package com.example.low_level_design.MementoDesignPattern;

public class ConfigurationMemento {
    int height;
    int width;

    public ConfigurationMemento(int height, int width){
        this.height=height;
        this.width=width;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}
