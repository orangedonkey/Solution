package com.mycompany.learntocode.account;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotRegisteredDiscountCalculatorTest {
    private static final double ARBITRARY_DOUBLE = 12.2;
    private NotRegisteredDiscountCalculator cut;

    @Before
    public void before() {
        cut = new NotRegisteredDiscountCalculator();
    }

    @After
    public void after() {
        cut = null;
    }

    @Test
    public void thatNoDiscountIsApplied() {
        double actual = cut.applyDiscount(ARBITRARY_DOUBLE);
        double expected = ARBITRARY_DOUBLE;

        Assert.assertEquals(expected, actual, 0);
    }
}
