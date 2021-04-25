package org.example.lectures.lecture05;

public class Figure01 {
    public static void main(String[] args) {
        String string = "#" + " ";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
