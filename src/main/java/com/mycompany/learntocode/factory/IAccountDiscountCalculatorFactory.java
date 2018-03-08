package com.mycompany.learntocode.factory;

import com.mycompany.learntocode.AccountStatus;
import com.mycompany.learntocode.account.IAccountDiscountCalculator;

public interface IAccountDiscountCalculatorFactory {
    IAccountDiscountCalculator GetAccountDiscountCalculator(AccountStatus accountStatus);
}
 