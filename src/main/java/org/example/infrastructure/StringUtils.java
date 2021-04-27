package org.example.infrastructure;

import java.util.Random;

public class StringUtils {

    public static String randomString(String mode, int length) {

        String randomString = "";

        String alphabet = "";

        switch (mode) {
            case "ALPHA":
                alphabet = "abcdefghijklmnopqrstuwxyz";
                break;
            case "NUMERIC":
                alphabet = "01234567879";
                break;
            case "ALPHANUMERIC":
                alphabet = "abcdefghijklmnopqrstuwxyz01234567879";
                break;
        }

        for (int i = 0; i < length; i++) {
            int randomIndex = new Random().nextInt(alphabet.length());
            randomString += alphabet.toCharArray()[randomIndex];
        }

        return randomString;
    }
}
