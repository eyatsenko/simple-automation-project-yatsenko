package org.example.homeworks.homework05;

/*
Given a word, print a square made from letter rotations of the word as in:
help
elph
lphe
phel
*/

public class SquareWordPatterns {
    public static void main(String[] args) {

        // Вводим строку
        String text = "SquareWord";

        // Получаем массив chars из строки
        char[] chars = text.toCharArray();

        // Выводим строку без перестановок
        System.out.print(text);

        // Смещаем символы в строке на одну позицию и выводим на экран результат
        for (int j = 0; j < chars.length - 1; j++) {
            for (int i = 1; i < chars.length; i++) {
                char tmp = chars[i - 1];
                chars[i - 1] = chars[i];
                chars[i] = tmp;
            }
            System.out.println();
            for (char ch : chars) {
                System.out.print(ch);
            }
        }
    }
}
