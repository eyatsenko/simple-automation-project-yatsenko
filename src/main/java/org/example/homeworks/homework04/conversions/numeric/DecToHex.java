package org.example.homeworks.homework04.conversions.numeric;

public class DecToHex {
    public static void decimalToHex(int decimal) {
        char[] hexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        int tmp;
        String result = "";

        while (decimal > 0) {
            tmp = decimal % 16;
            result = hexadecimal[tmp] + result;
            decimal = decimal / 16;
        }
        System.out.println(result);
    }
}
