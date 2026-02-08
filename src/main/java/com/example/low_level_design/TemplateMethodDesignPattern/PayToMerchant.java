package com.example.low_level_design.TemplateMethodDesignPattern;

public class PayToMerchant extends PaymentFlow {
    @Override
    void validateRequest() {
        System.out.println("Pay to Merchant Validate Request");
    }

    @Override
    void debitMoney() {
        System.out.println("Pay to Merchant Debit Money");
    }

    @Override
    void calculateCharge() {
        System.out.println("Pay to Merchant Calculate Charge");
    }

    @Override
    void creditMoney() {
        System.out.println("Pay to Merchant  Credit Money");
    }
}
