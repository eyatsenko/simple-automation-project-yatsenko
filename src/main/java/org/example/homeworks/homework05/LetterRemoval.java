package org.example.homeworks.homework05;

/*
5. Letter removal
Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the
phrase.
*/

public class LetterRemoval {
    public static void main(String[] args) {
        removeLetterInThePhrase("London is a capital of Great Britain", "o");
    }

    public static void removeLetterInThePhrase (String phrase, String letter) {

        if (phrase.contains(letter) && letter != null && !letter.equals("")){
            while (phrase.contains(letter)) {
                phrase = phrase.replace(letter, "");
            }
        }
        System.out.println(phrase);
    }
}
