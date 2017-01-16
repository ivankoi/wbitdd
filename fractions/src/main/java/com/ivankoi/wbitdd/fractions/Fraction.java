package com.ivankoi.wbitdd.fractions;

/**
 * Created by ivank on 1/16/2017.
 */
public class Fraction {
    private final int intValue;

    public Fraction(int intValue) {
        this.intValue = intValue;
    }

    public Fraction plus(Fraction fraction) {
        return this;
    }

    public int intValue() {
        return intValue;
    }
}
