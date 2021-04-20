package org.example.homeworks.homework03;

import static java.lang.Math.*;

/*
Write a program which prints a table of all results for sin(x), where x equals every 10 degrees from 0 to 360
*/

public class SinX {
    public static void main(String[] args) {
        for (int x = 0; x <= 360; x += 10) {
            double result = sin(x);
            System.out.printf("Sin of " + x + " is " +  "%g\n", result);
        }
    }
}
