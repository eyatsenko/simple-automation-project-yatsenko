package org.example.homeworks.homework03;

public class DecimalToBinaryAndBack {
    public static void main(String[] args) {
        decimalToBinary(6);
        binaryToDecimal(110);
    }

    public static void decimalToBinary(int decimal) {
        if (decimal == 0) {
            int result = 0;
            System.out.println(result);
        } else {
            int[] binaries = new int[100];
            int i = 0;

            while (decimal > 0) {
                binaries[i++] = decimal % 2;
                decimal = decimal / 2;
            }

            for (int j = i - 1; j >= 0; j--) {
                int result = binaries[j];
                System.out.print(result);
            }
            System.out.println();
        }
    }

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
