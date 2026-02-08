package com.example.low_level_design.TemplateMethodDesignPattern;

public class PayToFriend extends PaymentFlow{
    @Override
    void validateRequest() {
        System.out.println("Pay to Friend Validate Request");
    }

    @Override
    void debitMoney() {
        System.out.println("Pay to Friend Debit Money");
    }

    @Override
    void calculateCharge() {
        System.out.println("Pay to Friend Calculate Charge");
    }

    @Override
    void creditMoney() {
        System.out.println("Pay to Friend  Credit Money");
    }
}
