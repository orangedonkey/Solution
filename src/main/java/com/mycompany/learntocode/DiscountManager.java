package com.mycompany.learntocode;

import com.mycompany.learntocode.discounts.ILoyaltyDiscountCalculator;
import com.mycompany.learntocode.factory.IAccountDiscountCalculatorFactory;

public class DiscountManager {
    private final IAccountDiscountCalculatorFactory _factory;
    private final ILoyaltyDiscountCalculator _loyaltyDiscountCalculator;

    public DiscountManager(IAccountDiscountCalculatorFactory factory, ILoyaltyDiscountCalculator loyaltyDiscountCalculator) {
        _factory = factory;
        _loyaltyDiscountCalculator = loyaltyDiscountCalculator;
    }

    public double applyDiscount(double price, AccountStatus accountStatus, int timeOfHavingAccountInYears) {
        double priceAfterDiscount = 0;
        priceAfterDiscount = _factory.GetAccountDiscountCalculator(accountStatus).applyDiscount(price);
        priceAfterDiscount = _loyaltyDiscountCalculator.applyDiscount(priceAfterDiscount, timeOfHavingAccountInYears);
        return priceAfterDiscount;
    }
}