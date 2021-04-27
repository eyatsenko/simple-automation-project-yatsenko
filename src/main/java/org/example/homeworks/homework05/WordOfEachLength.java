package org.example.homeworks.homework05;

/*
Count words of each length

Count the number of words of each length in some text. (do not use Collections)
*/

public class WordOfEachLength {
    public static void main(String[] args) {
        String text = "London Is Is London The Capital Of The Great Britain";

        String[] words = text.split(" ", 9999);
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[uniqueWords.length];

        for (int m = 1; m < words.length; m++) {
            if (words[m - 1].equals(words[m])) {
                continue;
            } else if (words[m - 1].equals(null) || words[m - 1].equals(null)){
                continue;
            }
            else {
                uniqueWords[m - 1] = words[m - 1];
            }
        }


        for (int i = 0; i < words.length; i++) {

            //uniqueWords[i] = words[i];

            counts[i] = 0;

            for (int k = i; k < words.length; k++) {
                if (words[i].length() == words[k].length()) {
                    counts[i]++;
                }
            }
        }


        for (int j = 0; j < uniqueWords.length; j++) {
            System.out.println(uniqueWords[j] + " " + counts[j]);
        }
    }
}
