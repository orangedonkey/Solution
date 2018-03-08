package com.mycompany.learntocode.discounts;

public interface ILoyaltyDiscountCalculator {
    double applyDiscount(double price, int timeOfHavingAccountInYears);
}
