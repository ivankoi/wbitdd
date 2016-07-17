package com.ivankoi.wbitdd.fractions;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Fraction class
 *
 * Created by ivan on 7/17/2016.
 */
class Fraction {

    final int numerator;
    final int denominator;

    Fraction(int numerator, int denominator) {

        if (denominator == 0) {
            throw new ArithmeticException("Denominator must not be 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction simplify() {
        int numerator = this.numerator;
        int denominator = this.denominator;

        for (int i = 2; i < max(abs(numerator), abs(denominator)); i++) {
            while (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }

        return new Fraction(numerator, denominator);
    }

    Fraction(int numerator) {
        this(numerator, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction)) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;

    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
