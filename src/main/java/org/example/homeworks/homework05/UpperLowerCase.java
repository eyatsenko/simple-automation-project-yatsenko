package org.example.homeworks.homework05;

/*
1. Upper/Lower case change
Change given text into all upper case, lower case, change the first letter of each word (in the
sentence) to upper and the rest to lower, etc.
*/

import java.util.Locale;

public class UpperLowerCase {
    public static void main(String[] args) {
        String word = "Test";
        String sentence = "London is the capital of Great Britain";

        String wordUpper = word.toUpperCase();
        String wordLower = word.toLowerCase();

        String[] words = sentence.split(" ", 999);

        StringBuilder sentenceFirstUp = new StringBuilder();

        for (String w : words) {
            sentenceFirstUp.append(w.substring(0, 1).toUpperCase() + w.substring(1));
            sentenceFirstUp.append(" ");
        }

        String result = sentenceFirstUp.toString().trim();

        System.out.println(wordUpper);
        System.out.println(wordLower);
        System.out.println(result);
    }
}
