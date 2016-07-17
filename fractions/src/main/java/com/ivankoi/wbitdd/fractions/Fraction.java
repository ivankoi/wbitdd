package com.ivankoi.wbitdd.fractions;

/**
 * Fraction class
 *
 * Created by ivan on 7/17/2016.
 */
class Fraction {

    final int numerator;
    final int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
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
