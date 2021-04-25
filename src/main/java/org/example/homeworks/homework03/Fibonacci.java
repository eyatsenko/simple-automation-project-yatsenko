package org.example.homeworks.homework03;

/*
Write a program which will print all Fibonacci numbers till specified number
*/

public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;
        int firstInt;
        int secondInt;

        if (number == 0) {
            System.out.print(number);
        } else if (number == 1) {
            firstInt = 0;
            secondInt = 1;
            System.out.print(firstInt + " " + secondInt + " ");
        } else {
            firstInt = 1;
            secondInt = 1;
            int nextInt;

            System.out.print(0 + " " + firstInt + " " + secondInt + " ");

            for (int i = 3; i <= number; i++) {
                nextInt = firstInt + secondInt;
                System.out.print(nextInt + " ");
                firstInt = secondInt;
                secondInt = nextInt;
            }
        }
    }
}
