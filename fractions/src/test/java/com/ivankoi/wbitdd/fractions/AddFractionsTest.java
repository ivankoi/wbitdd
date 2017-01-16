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
}
