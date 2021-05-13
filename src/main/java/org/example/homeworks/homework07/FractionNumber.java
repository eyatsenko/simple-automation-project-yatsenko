package org.example.homeworks.homework07;

/*
Write class to represent FractionNumbers
This class should contain two fields.
This class should contain methods to perform basic math operations: plus, minus, multiply, divide
This class should contain toString method
 */

public class FractionNumber {
    private int numerator;
    private int denominator;

    public FractionNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public FractionNumber plus(FractionNumber number) {
        int commonDenominator;
        int num;
        int denom;

        if (this.getDenominator() == number.getDenominator()) {
            commonDenominator = this.getDenominator();
            num = this.getNumerator() + number.getNumerator();
            denom = commonDenominator;
        } else {
            commonDenominator = this.getDenominator() * number.getDenominator();
            num = this.getNumerator() * number.getDenominator()
                    + number.getNumerator() * this.getDenominator();
            denom = commonDenominator;
        }

        return new FractionNumber(num, denom);
    }

    public FractionNumber minus(FractionNumber number) {
        int num;
        int denom;
        int commonDenominator;

        if (this.getDenominator() == number.getDenominator()) {
            commonDenominator = this.getDenominator();
            num = this.getNumerator() - number.getNumerator();
            denom = commonDenominator;
        } else {
            commonDenominator = this.getDenominator() * number.getDenominator();
            num = this.getNumerator() * number.getDenominator()
                    - number.getNumerator() * this.getDenominator();
            denom = commonDenominator;
        }

        return new FractionNumber(num, denom);
    }

    public FractionNumber multiply(FractionNumber number) {
        int num = this.getNumerator() * number.getNumerator();
        int denom = this.getDenominator() * number.getDenominator();

        while (num % 2 == 0 && denom % 2 == 0)
            if (num % 2 == 0 && denom % 2 == 0) {
                num /= 2;
                denom /= 2;
            }

        return new FractionNumber(num, denom);
    }

    public FractionNumber divide(FractionNumber number) {
        int num = this.getNumerator() * number.getDenominator();
        int denom = this.getDenominator() * number.getNumerator();

        return new FractionNumber(num, denom);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
