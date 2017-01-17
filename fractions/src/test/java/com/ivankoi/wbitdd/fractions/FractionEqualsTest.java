package com.ivankoi.wbitdd.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ivank on 1/17/2017.
 */
public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }
}
