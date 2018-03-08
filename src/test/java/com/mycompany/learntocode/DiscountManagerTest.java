package com.mycompany.learntocode;

import com.mycompany.learntocode.account.IAccountDiscountCalculator;
import com.mycompany.learntocode.discounts.ILoyaltyDiscountCalculator;
import com.mycompany.learntocode.factory.IAccountDiscountCalculatorFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscountManagerTest {

    private DiscountManager cut;
    private IAccountDiscountCalculatorFactory accountDiscountCalculatorFactory;
    private ILoyaltyDiscountCalculator loyaltyDiscountCalculator;
    private IAccountDiscountCalculator accountDiscountCalculator;

    @Before
    public void setUp() {
        accountDiscountCalculatorFactory = mock(IAccountDiscountCalculatorFactory.class);
        loyaltyDiscountCalculator = mock(ILoyaltyDiscountCalculator.class);
        accountDiscountCalculator = mock(IAccountDiscountCalculator.class);

        cut = new DiscountManager(accountDiscountCalculatorFactory, loyaltyDiscountCalculator);
    }

    @After
    public void tearDown() {
        accountDiscountCalculatorFactory = null;
        loyaltyDiscountCalculator = null;
        accountDiscountCalculator = null;

        cut = null;
    }

    @Test
    public void canApplyDiscount() {
        when(accountDiscountCalculatorFactory.GetAccountDiscountCalculator(any(AccountStatus.class)))
                .thenReturn(accountDiscountCalculator);

        when(accountDiscountCalculator.applyDiscount(anyDouble())).thenReturn(100.0);

        when(loyaltyDiscountCalculator.applyDiscount(anyDouble(), anyInt())).thenReturn(80.0);

        assertEquals(80.0, cut.applyDiscount(200.0, AccountStatus.MostValuableCustomer, 10), 0);
    }
}