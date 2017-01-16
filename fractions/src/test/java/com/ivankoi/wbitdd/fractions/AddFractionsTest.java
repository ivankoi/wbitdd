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
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(3, new Fraction(0).plus(new Fraction(3)).intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
    }
}
