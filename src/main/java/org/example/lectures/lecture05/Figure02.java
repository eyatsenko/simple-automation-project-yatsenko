package org.example.lectures.lecture05;

public class Figure02 {
    public static void main(String[] args) {
        String string = "#" + " ";
        for (int i = 8; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
