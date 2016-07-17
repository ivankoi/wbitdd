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
                new Object[] {new Fraction(-7, 15),     new Fraction(-2, 3),    new Fraction(1, 5)},
                new Object[] {new Fraction(1),          new Fraction(1, 4),     new Fraction(3, 4)},
        };
    }

    @Test
    @Parameters
    public void testZeroResult(Fraction result, Fraction op1, Fraction op2) {
        assertEquals(result, Fractions.add(op1, op2));
    }

    public Object parametersForTestZeroResult () {
        return new Object[]{
                new Object[]{new Fraction(0), new Fraction(-1, 4), new Fraction(1, 4)},
                new Object[]{new Fraction(0), new Fraction(-1), new Fraction(1)}
        };
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        assertEquals(new Fraction(1,0), Fractions.add(new Fraction(1, 1), new Fraction(1, 1)));
    }

}
