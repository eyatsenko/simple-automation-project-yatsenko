package org.example.homeworks.homework05;

/*
Count words of each length
Count the number of words of each length in some text. (do not use Collections)
*/

import java.util.Arrays;
import java.util.Collections;

public class CountWords {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis imperdiet turpis in magna vehicula tincidunt. Cras aliquet lacinia nibh. Donec vitae felis nisi.";

        // разделяем текст на слова, исключая знаки пунктуации
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // создаём массив длин, предполагая, что максимальная длина слова = 100
        int[] lengths = new int[100];

        // создаём массив в котором хранится количество повторений слова каждой длины, предполагая, что повторений будет не больше 100
        int[] counts = new int[100];

        // цикл в котором проходимся по элементам массива длин,
        // если длина отсутствует в массиве - добавляем её, если она уже есть, увеличиваем эту длину на 1
        for (int i = 0; i < words.length; i++) {
            if (!Arrays.asList(lengths).contains(words[i].length())) {
                lengths[words[i].length()] = words[i].length();
            }
        }

        // заполняем массив counts
        for (String word : words) {
            if (word.length() == lengths[word.length()]) {
                counts[word.length()] += 1;
            }
        }

        // выводим на экран длины и частоты
        System.out.println("Length " + " Frequency");
        int [] lengthsCopy = Arrays.copyOf(lengths, lengths.length);
        int max = findMax(lengthsCopy);

        for (int j = 1; j <= max; j++) {
            if (lengths[j] == 0) {
                continue;
            }
            System.out.println(lengths[j] + "       " + counts[j]);
        }
    }

    public static int findMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int max_i = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
        return array[0];
    }
}
