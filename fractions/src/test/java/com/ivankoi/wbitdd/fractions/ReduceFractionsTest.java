package com.ivankoi.wbitdd.fractions;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ivank on 1/17/2017.
 */
public class ReduceFractionsTest {
    @Test
    public void alreadyInLowestTerms() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    public void reduceToNotWholeNumbers() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }
}
