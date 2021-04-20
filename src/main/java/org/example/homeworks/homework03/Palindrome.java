package org.example.homeworks.homework03;

/*
Write a program which checks if "string" (use array of chars) is a palindrome
*/

public class Palindrome {
    static boolean result = true;
    public static void main(String[] args) {

        System.out.println(isPalindrome("ANNA"));
    }

    public static boolean isPalindrome(String string) {
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

        for (int n = 0; n < stringInChars.length; n++) {
            char ch1 = stringInChars[n];
            char ch2 = stringInCharsReverted[n];
            if (ch1 != ch2) {
                result = false;
            }
            n ++;
        }
        return result;
    }
}
