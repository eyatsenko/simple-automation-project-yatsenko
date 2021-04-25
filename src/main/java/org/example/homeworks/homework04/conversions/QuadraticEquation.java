package org.example.homeworks.homework04.conversions;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        calculate(0, -7.0, -14.0);
    }

    public static void calculate(double a, double b, double c) {
        double D = sqrt(pow(b, 2) - 4 * a * c);

        double x1 = 0;
        double x2 = 0;

        if (a == 0) {
            System.out.println("Переменная \"a\" не может быть равна нулю!");
        } else if (D == 0) {
            x1 = (-b) / (2 * a);
            x2 = x1;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D > 0) {
            x1 = ((-b) + D) / (2 * a);
            x2 = ((-b) - D) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Решений нет.");
        }
    }
}
