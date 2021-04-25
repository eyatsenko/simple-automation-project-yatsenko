package org.example.homeworks.homework04.conversions.numeric;

public class HexToDec {
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
