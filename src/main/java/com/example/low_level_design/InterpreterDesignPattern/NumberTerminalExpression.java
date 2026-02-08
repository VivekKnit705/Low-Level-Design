package com.example.low_level_design.InterpreterDesignPattern;

public class NumberTerminalExpression implements AbstractInterpreter{

    String stringVal;

    public NumberTerminalExpression(String stringVal){
        this.stringVal=stringVal;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this.stringVal);
    }
}
