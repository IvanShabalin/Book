package com.company;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int _numerator, int _denominator) {
        numerator = _numerator;

        if (_denominator == 0) {
            throw new RuntimeException("denominator == 0");
        }
        denominator = _denominator;
    }

    public void setNumerator(int _numerator) {
        numerator = _numerator;
    }

    public void setDenominator(int _denominator) {
        denominator = _denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void init(int _numerator, int _denominator) {
        numerator = _numerator;

        if (_denominator == 0) {
            _denominator = 1;
        }
        denominator = _denominator;
    }

    public void print() {
        System.out.println("numerator = " + numerator);
        System.out.println("denominator = " + denominator);
    }
}
