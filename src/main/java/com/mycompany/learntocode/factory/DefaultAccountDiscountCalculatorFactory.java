package com.mycompany.learntocode.factory;


import com.mycompany.learntocode.AccountStatus;
import com.mycompany.learntocode.account.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DefaultAccountDiscountCalculatorFactory implements IAccountDiscountCalculatorFactory {
    public IAccountDiscountCalculator GetAccountDiscountCalculator(AccountStatus accountStatus) {
        IAccountDiscountCalculator calculator;
        switch (accountStatus) {
            case NotRegistered:
                calculator = new NotRegisteredDiscountCalculator();
                break;
            case SimpleCustomer:
                calculator = new SimpleCustomerDiscountCalculator();
                break;
            case ValuableCustomer:
                calculator = new ValuableCustomerDiscountCalculator();
                break;
            case MostValuableCustomer:
                calculator = new MostValuableCustomerDiscountCalculator();
                break;
            default:
                throw new NotImplementedException();
        }

        return calculator;
    }
}