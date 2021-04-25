package org.example.homeworks.homework04.conversions.numeric;

public class DecToBin {
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
}
