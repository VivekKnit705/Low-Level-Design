package com.example.low_level_design.MementoDesignPattern;

public class ConfigurationMementoOriginator {
    private int height;
    private int width;

    public ConfigurationMementoOriginator(int height, int width){
        this.height=height;
        this.width=width;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height, this.width);
    }

    public void reverseMemento(ConfigurationMemento configurationMemento){
        this.height=configurationMemento.height;
        this.width=configurationMemento.width;
    }
}
