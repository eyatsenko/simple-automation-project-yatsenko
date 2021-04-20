package org.example.homeworks.homework2;

import static java.lang.Math.*;

/*
Написать программу, которая бы решала квадратное уравнение вида a x2+b x+c = 0
Переменный a, b, c можно задать вручную. Программа должна учитывать варианты:
1) когда a=0
2) когда дискриминант < 0 - решений нет
3) когда дискриминант = 0 - тогда х1 == х2
4) когда дискриминант > 0 - тогда в уравнении два корня

*/

public class QuadraticEquation {
    public static void main(String[] args) {

        double a = 0;
        double b = -7;
        double c = -14;

        double D = sqrt(pow(b,2) - 4 * a * c);

        double x1 = 0;
        double x2 = 0;

        if (a == 0) {
            System.out.println("Переменная \"a\" не может быть равна нулю!");
        } else if (D == 0) {
            x1 = (-b)/(2 * a);
            x2 = x1;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D > 0) {
            x1 = ((-b) + D)/(2 * a);
            x2 = ((-b) - D)/(2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Решений нет.");
        }
    }
}
