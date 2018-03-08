package com.mycompany.learntocode.account;

import com.mycompany.learntocode.Constants;

public class ValuableCustomerDiscountCalculator implements IAccountDiscountCalculator {
    public double applyDiscount(double price) {
        return price - (Constants.DISCOUNT_FOR_VALUABLE_CUSTOMERS * price);
    }
}