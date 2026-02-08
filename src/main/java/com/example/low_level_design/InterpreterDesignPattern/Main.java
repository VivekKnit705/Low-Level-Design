package com.example.low_level_design.InterpreterDesignPattern;

public class Main {
    public static void main(String[] args){

        Context context=new Context();
        context.put("a", 2);
        context.put("b", 3);
        context.put("c", 4);
        context.put("d", 5);
        context.put("e", 6);

        AbstractInterpreter interpreter1=new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
        System.out.println(interpreter1.interpret(context));


        MultiplyNonTerminalExpression multiply1=new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"));
        MultiplyNonTerminalExpression multiply2=new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("e"));

        AbstractInterpreter interpreter2=new MultiplyNonTerminalExpression(multiply1, multiply2);
        System.out.println(interpreter2.interpret(context));

        AbstractInterpreter interpreter3=new SumNonTerminalExpression(multiply1, multiply2);
        System.out.println(interpreter3.interpret(context));
    }
}
