package com.ivankoi.wbitdd.fractions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for {@link Fractions}
 *
 * Created by ivank on 7/17/2016.
 */
public class FractionsTest {

    @Test
    public void testOnePlusOne() {
        assertEquals(new Fraction(2), Fractions.add(new Fraction(1), new Fraction(1)));
    }

    @Test
    public void testOnePlusOneHalf() {
        assertEquals(new Fraction(3, 2), Fractions.add(new Fraction(1), new Fraction(1, 2)));
    }
}
