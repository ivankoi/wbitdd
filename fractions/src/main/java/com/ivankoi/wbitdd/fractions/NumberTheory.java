package com.ivankoi.wbitdd.fractions;

import static java.lang.Math.abs;

/**
 * Created by ivank on 1/17/2017.
 */
public class NumberTheory {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return abs(a);
    }
}
