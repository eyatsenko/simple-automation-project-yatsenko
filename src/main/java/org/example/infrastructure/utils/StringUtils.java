package org.example.infrastructure.utils;

import java.util.Random;

public class StringUtils {

    public enum Mode {
        ALPHA,
        NUMERIC,
        ALPHANUMERIC,
        HEX
    }

    public static String randomString(Mode mode, int length) {

        String randomString = "";
        String alphabet = "";

        switch (mode) {
            case ALPHA:
                alphabet = "abcdefghijklmnopqrstuwxyz";
                break;
            case NUMERIC:
                alphabet = "01234567879";
                break;
            case ALPHANUMERIC:
                alphabet = "abcdefghijklmnopqrstuwxyz01234567879";
                break;
            case HEX:
                alphabet = "0123456789ABCDEF";
        }

        for (int i = 0; i < length; i++) {
            int randomIndex = new Random().nextInt(alphabet.length());
            randomString += alphabet.toCharArray()[randomIndex];
        }

        return randomString;
    }
}
