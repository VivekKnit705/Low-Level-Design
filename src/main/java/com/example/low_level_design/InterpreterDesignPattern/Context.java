package com.example.low_level_design.InterpreterDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String, Integer> contextMap;

    public Context(){
        contextMap=new HashMap<>();
    }

    public void put(String strVal, int val){
        contextMap.put(strVal, val);
    }

    public int getValue(String key){
        return contextMap.get(key);
    }
}
