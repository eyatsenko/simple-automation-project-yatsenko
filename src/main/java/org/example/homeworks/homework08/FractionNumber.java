package org.example.homeworks.homework08;

/*
Добавить equals hashCode в класс FractionNumber
 */

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
