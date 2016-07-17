package com.ivankoi.wbitdd.fractions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ivank on 7/17/2016.
 */
public class FractionsTest {

    @Test
    public void testOnePlusOne() {
        assertEquals(2, Fractions.add(1, 1));
    }

    @Test
    public void testOnePlusOneHalf() {
        assertEquals(new Fraction(3, 2), Fractions.add(new Fraction(1), new Fraction(3, 2)));
    }
}
