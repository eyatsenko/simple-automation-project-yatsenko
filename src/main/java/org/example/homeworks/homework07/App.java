package org.example.homeworks.homework07;

public class App {
    public static void main(String[] args) {
        FractionNumber number1 = new FractionNumber(5, 6);
        FractionNumber number2 = new FractionNumber(4, 7);
        FractionNumber number3 = number1.multiply(number2);
        FractionNumber number4 = number1.divide(number2);
        FractionNumber number5 = number1.plus(number2);
        FractionNumber number6 = number1.minus(number2);

        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
    }
}
