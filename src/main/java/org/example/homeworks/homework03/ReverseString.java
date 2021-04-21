package org.example.homeworks.homework03;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(revert("TesT"));
    }

    public static String revert (String string) {
        String revertedString = "";
        char[] stringInChars = new char[string.length()];

        for (int i = 0; i < stringInChars.length; i++) {
            stringInChars[i] = string.charAt(i);
        }

        char[] stringInCharsReverted = new char[stringInChars.length];

        int k = 0;

        for (int j = stringInChars.length - 1; j >= 0; j--) {
            stringInCharsReverted[k] = stringInChars[j];
            k++;
        }

        for (int m = 0; m < stringInCharsReverted.length; m++) {
            revertedString += stringInCharsReverted[m];
        }
        return revertedString;
    }
}
