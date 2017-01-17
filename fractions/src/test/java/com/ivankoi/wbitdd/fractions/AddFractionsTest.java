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
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(new Fraction(3), new Fraction(0).plus(new Fraction(3)));
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(new Fraction(7), new Fraction(4).plus(new Fraction(3)));
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    public void nonTrivialButCommon() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(1, 5).plus(new Fraction(2, 5)));
    }
}
