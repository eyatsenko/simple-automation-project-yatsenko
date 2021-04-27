package org.example.homeworks.homework02;

public class FindX {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double x;

        if (a != 0 && b != 0) {
            x = (-b) / a;
            System.out.println(x);
        } else if (a == 0 && b != 0) {
            System.out.println("Division by zero!");
        } else if (a != 0 && b == 0) {
            x = 0;
            System.out.println(x);
        } else if (a == 0 && b == 0) {
            System.out.println("Division by zero!");
        }
    }
}
