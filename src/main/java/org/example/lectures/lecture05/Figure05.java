package org.example.lectures.lecture05;

public class Figure05 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j >= 9 - i) {
                    System.out.print("# ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
