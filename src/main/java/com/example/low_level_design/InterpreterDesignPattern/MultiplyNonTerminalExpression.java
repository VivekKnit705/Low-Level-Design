package com.example.low_level_design.InterpreterDesignPattern;

public class MultiplyNonTerminalExpression implements AbstractInterpreter{

    AbstractInterpreter leftExp;
    AbstractInterpreter rightExp;

    public MultiplyNonTerminalExpression(AbstractInterpreter leftExp, AbstractInterpreter rightExp){
        this.leftExp=leftExp;
        this.rightExp=rightExp;
    }

    @Override
    public int interpret(Context context) {
        return leftExp.interpret(context) * rightExp.interpret(context);
    }
}
