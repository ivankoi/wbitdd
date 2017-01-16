package com.ivankoi.wbitdd.fractions;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Test class for {@link Fraction}
 *
 * Created by ivank on 7/17/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum  = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        Fraction sum  = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        Fraction sum  = new Fraction(0).plus(new Fraction(3));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        Fraction sum  = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());
    }
}
