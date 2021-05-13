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

    public FractionNumber() {

    }

    public FractionNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public FractionNumber plus(FractionNumber number) {
        FractionNumber result = new FractionNumber();

        int commonDenominator;

        if (this.getDenominator() == number.getDenominator()) {
            commonDenominator = this.getDenominator();
            result.setNumerator(this.getNumerator() + number.getNumerator());
            result.setDenominator(commonDenominator);
        } else {
            commonDenominator = this.getDenominator() * number.getDenominator();
            result.setNumerator(this.getNumerator() * number.getDenominator()
                    + number.getNumerator() * this.getDenominator());
            result.setDenominator(commonDenominator);
        }

        return result;
    }

    public FractionNumber minus(FractionNumber number) {
        FractionNumber result = new FractionNumber();

        int commonDenominator;

        if (this.getDenominator() == number.getDenominator()) {
            commonDenominator = this.getDenominator();
            result.setNumerator(this.getNumerator() - number.getNumerator());
            result.setDenominator(commonDenominator);
        } else {
            commonDenominator = this.getDenominator() * number.getDenominator();
            result.setNumerator(this.getNumerator() * number.getDenominator()
                    - number.getNumerator() * this.getDenominator());
            result.setDenominator(commonDenominator);
        }

        return result;
    }

    public FractionNumber multiply(FractionNumber number) {
        FractionNumber result = new FractionNumber();

        result.setNumerator(this.getNumerator() * number.getNumerator());
        result.setDenominator(this.getDenominator() * number.getDenominator());

        while (result.getNumerator() % 2 == 0 && result.getDenominator() % 2 == 0)
            if (result.getNumerator() % 2 == 0 && result.getDenominator() % 2 == 0) {
                result.setNumerator(result.getNumerator() / 2);
                result.setDenominator(result.getDenominator() / 2);
            }

        return result;
    }

    public FractionNumber divide(FractionNumber number) {
        FractionNumber result = new FractionNumber();

        result.setNumerator(this.getNumerator() * number.getDenominator());
        result.setDenominator(this.getDenominator() * number.getNumerator());

        return result;
    }

    @Override
    public String toString() {
        return "FractionNumber: " +
                "numerator = " + numerator +
                ", denominator = " + denominator
                ;
    }
}
