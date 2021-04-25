package org.example.homeworks.homework03;

public class DecimalNumberIntoHexAndBack {
    public static void main(String[] args) {
        decimalToHex(555);
        hexToDecimal("22B");
    }

    public static void decimalToHex(int decimal) {
        char hexadecimal[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        int tmp;
        String result = "";

        while (decimal > 0) {
            tmp = decimal % 16;
            result = hexadecimal[tmp] + result;
            decimal = decimal / 16;
        }
        System.out.println(result);
    }

    public static void hexToDecimal(String hex) {
        String chars = "0123456789ABCDEF";

        int result = 0;

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int number = chars.indexOf(ch);
            result = 16 * result + number;
        }

        System.out.println(result);
    }
}
