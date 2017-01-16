package com.ivankoi.wbitdd.fractions;

public class Fraction {
    private final int integerValue;
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue, denominator);
    }

    public int intValue() {
        return integerValue;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
