package com.ivankoi.wbitdd.fractions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

/**
 * Test class for {@link Fractions}
 *
 * Created by ivank on 7/17/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class FractionsTest {

    @Test
    @Parameters
    public void testAddFractions(Fraction result, Fraction op1, Fraction op2) {
        assertEquals(result, Fractions.add(op1, op2));
    }

    public Object parametersForTestAddFractions() {
        return new Object[] {
                new Object[] {new Fraction(2),          new Fraction(1),        new Fraction(1)},
                new Object[] {new Fraction(104, 35),    new Fraction(12, 5),    new Fraction(4, 7)},
                new Object[] {new Fraction(3, 2),       new Fraction(1),        new Fraction(1, 2)},
        };
    }

}
