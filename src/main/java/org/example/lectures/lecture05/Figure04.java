package org.example.lectures.lecture05;

public class Figure04 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j >= i) {
                    System.out.print("# ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
