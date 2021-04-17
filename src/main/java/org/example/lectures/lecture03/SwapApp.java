package org.example.lectures.lecture03;

public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        // with add var
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("____________");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // without add var
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("____________");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
