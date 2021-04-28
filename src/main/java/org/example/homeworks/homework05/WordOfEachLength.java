package org.example.homeworks.homework05;

/*
Count words of each length

Count the number of words of each length in some text. (do not use Collections)
*/

import java.util.Arrays;

public class WordOfEachLength {
    public static void main(String[] args) {
        String text = "London Is Is London The Capital Of The Great Britain";

        String[] words = text.split(" ", 9999);

        int[] lengths = new int[words.length];
        int[] counts = new int[words.length];

        for (int i = 0; i < lengths.length; i ++) {
            if (!Arrays.asList(lengths).contains(words[i].length())) {
                lengths[i] = words[i].length();
            } else {
                lengths[i] += lengths[i];
            }
        }

        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Lenghts:");


        for (int length : lengths) {
            System.out.println(length);
        }

        for (String word : words) {
            if (!Arrays.asList(counts).contains(word.length())) {
                counts[word.length()] = 1;
            } else {
                counts[word.length()] += 1;
            }
        }

        System.out.println("Length " + " How often a word of this length occurs");

        for (int j = 0; j < counts.length; j ++) {
            System.out.println(lengths[j] + " " + counts[j]);
        }
    }
}
