package com.ivankoi.wbitdd.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ivank on 1/17/2017.
 */
public class GravestCommonDivisorTest {
    @Test
    public void oneAndOne() throws Exception {
        assertEquals(1, gcd(1, 1));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
             int t = b;
             b = a % t;
             a = t;
        }
        return a;
    }
}
