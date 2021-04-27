package org.example.homeworks.homework05;

/*
3. Count the words in some text
*/

public class WordsInSomeText {

    public static void main(String[] args) {
        String text = "London Is The Capital Of Great Britain";

        String[] words = text.split(" ", 9999);

        int count = words.length;

        System.out.println(count);

    }
}