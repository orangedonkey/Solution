package com.mycompany.learntocode.discounts;

import com.mycompany.learntocode.Constants;

public class DefaultLoyaltyDiscountCalculator implements ILoyaltyDiscountCalculator {
    public double applyDiscount(double price, int timeOfHavingAccountInYears) {
        double discountForLoyaltyInPercentage = (timeOfHavingAccountInYears > Constants.MAXIMUM_DISCOUNT_FOR_LOYALTY)
                ? (double) Constants.MAXIMUM_DISCOUNT_FOR_LOYALTY / 100
                : (double) timeOfHavingAccountInYears / 100;
        return price - (discountForLoyaltyInPercentage * price);
    }
}