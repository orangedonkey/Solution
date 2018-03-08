package com.mycompany.learntocode.account;

public class NotRegisteredDiscountCalculator implements IAccountDiscountCalculator {
    public double applyDiscount(double price) {
        return price;
    }
}