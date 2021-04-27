package org.example.homeworks.homework02;

import static java.lang.Math.*;

public class Magnitude {
    public static void main(String[] args) {
        int x = -58;
        int y = -34;

        if (abs(x) > abs(y)) {
            System.out.println("Число " + x + " имеет большую величину");
        } else {
            System.out.println("Число " + y + " имеет большую величину");
        }
    }
}
