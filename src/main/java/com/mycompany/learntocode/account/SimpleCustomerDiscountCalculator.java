package com.mycompany.learntocode.account;

import com.mycompany.learntocode.Constants;

public class SimpleCustomerDiscountCalculator implements IAccountDiscountCalculator {
    public double applyDiscount(double price) {
        return price - (Constants.DISCOUNT_FOR_SIMPLE_CUSTOMERS * price);
    }
}