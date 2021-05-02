package org.example.homeworks.homework05;

/*
2. Count letters
Count the single character frequencies (do not use Collections)
*/

public class CountLetters {
    public static void main(String[] args) {
        String string = "London Is The Capital Of Great Britain";

        int[] frequencies = new int[128];

        for (char ch : string.toCharArray()) {
            frequencies[ch]++;
        }

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] != 0) {
                System.out.println("Char: " + (char) i + ", Count: " + frequencies[i]);
            }
        }
    }
}
