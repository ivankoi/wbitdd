package com.ivankoi.wbitdd.fractions;

/**
 * Utility class for fractions arithmetic
 *
 * Created by ivank on 7/17/2016.
 */
class Fractions {

    static Fraction add(Fraction op1, Fraction op2) {
        int resultNumerator = op1.numerator * op2.denominator + op2.numerator * op1.denominator;
        int resultDenominator = op1.denominator * op2.denominator;

        return new Fraction(resultNumerator, resultDenominator);
    }

}
