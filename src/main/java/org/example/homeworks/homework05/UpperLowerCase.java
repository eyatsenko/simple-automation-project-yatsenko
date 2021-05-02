package org.example.homeworks.homework05;

/*
1. Upper/Lower case change
Change given text into all upper case, lower case, change the first letter of each word (in the
sentence) to upper and the rest to lower, etc.
*/

public class UpperLowerCase {
    public static void main(String[] args) {
        String sentence = "London is the capital of Great Britain";

        String sentenceUpper = sentence.toUpperCase();
        String sentenceLower = sentence.toLowerCase();

        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        StringBuilder sentenceFirstUp = new StringBuilder();

        for (String w : words) {
            sentenceFirstUp.append(w.substring(0, 1).toUpperCase() + w.substring(1));
            sentenceFirstUp.append(" ");
        }

        String result = sentenceFirstUp.toString().trim();

        System.out.println(sentenceUpper);
        System.out.println(sentenceLower);
        System.out.println(result);
    }
}