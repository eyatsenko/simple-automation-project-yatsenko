package org.example.lectures.lecture03;

public class ExchangeApp {
    public static void main(String[] args) {
        double sumInUAH = 100;
        System.out.println("USD: " + (sumInUAH / 28.05));
        System.out.println("GBP: " + (sumInUAH / 38.55));
        System.out.println("EUR: " + (sumInUAH / 33.55));
        System.out.println("RUB: " + (sumInUAH / 0.37));

    }
}
