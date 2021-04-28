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

        for (int i = 0; i < 14; i++) {
            int randomIndexAlpha = new Random().nextInt(alphabet.length());
            int randomIndexNumbers = new Random().nextInt(numbers.length());
            productCode += alphabetUpper.toCharArray()[randomIndexAlpha];
            while (countOfNumbers < 6){
                productCode += numbers.toCharArray()[randomIndexNumbers];
                countOfNumbers++;
            }

        }

        return productCode;
    }
}
