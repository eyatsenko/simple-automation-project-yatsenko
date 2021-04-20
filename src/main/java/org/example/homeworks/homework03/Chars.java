package org.example.homeworks.homework03;

/*
Write a program which prints all chars for range of ints 50...177
*/

public class Chars {
    public static void main(String[] args) {
        for (int i = 50; i <= 177 ; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
