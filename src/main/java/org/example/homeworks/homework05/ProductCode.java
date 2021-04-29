package org.example.homeworks.homework05;

/*
6. Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.
*/

import java.util.Locale;
import java.util.Random;

public class ProductCode {
    public static void main(String[] args) {

        System.out.println(makeProductCode());
    }

    public static String makeProductCode() {

        String productCode = "";
        String alphabet = "";
        String numbers = "123456789";
        alphabet = "abcdefghijklmnopqrstuwxyz";

        String alphabetUpper = alphabet.toUpperCase();

        int countOfNumbers = 0;

        for (int i = 0; i < 8; i++) {
            int randomIndexAlphaOuter = new Random().nextInt(alphabet.length());

            while (countOfNumbers < 6){
                int randomIndexNumbers = new Random().nextInt(numbers.length());
                int randomIndexAlphaInner = new Random().nextInt(alphabet.length());
                productCode += alphabetUpper.toCharArray()[randomIndexAlphaInner];
                productCode += numbers.toCharArray()[randomIndexNumbers];
                countOfNumbers++;
            }
            productCode += alphabetUpper.toCharArray()[randomIndexAlphaOuter];
        }

        char a = productCode.charAt(1);
        char b = productCode.charAt(3);
        String ab = a + String.valueOf(b);
        int abi = Integer.parseInt(ab);

        char c = productCode.charAt(5);
        char d = productCode.charAt(7);
        String cd = c + String.valueOf(d);
        int cdi = Integer.parseInt(cd);

        char e = productCode.charAt(9);
        char f = productCode.charAt(11);
        String ef = e + String.valueOf(f);
        int efi = Integer.parseInt(ef);

        int result = abi * cdi * efi;

        return productCode + " " + result;

    }
}
