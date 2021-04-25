package org.example.homeworks.homework04.conversions.numeric;

public class BinToDec {
    public static void binaryToDecimal(int binary) {
        int decimal = 0;
        int p = 0;
        while (binary > 0) {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, p);
            binary = binary / 10;
            p++;
        }
        System.out.println(decimal);
    }
}
