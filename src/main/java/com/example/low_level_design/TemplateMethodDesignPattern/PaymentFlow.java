package com.example.low_level_design.TemplateMethodDesignPattern;

public abstract class PaymentFlow {

    abstract void validateRequest();
    abstract void debitMoney();
    abstract void calculateCharge();
    abstract void creditMoney();

    public final void sendMoney(){
        // step 1
        validateRequest();

        // step 2
        debitMoney();

        // step 3
        calculateCharge();

        // step 4
        creditMoney();
    }
}
