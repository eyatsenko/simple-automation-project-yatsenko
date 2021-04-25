package org.example.homeworks.homework03;

import java.util.Random;

public class SortFromMinToMax {
    public static void main(String[] args) {
        int [] array = new int[10];

        for (int j = 0; j < array.length; j++) {
            array[j] = new Random().nextInt(10);
            System.out.print(array[j] + " ");
        }

        for (int i = 0; i < array.length; i++) {

            int min = array[i];
            int min_i = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }

        System.out.println();

        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }
}
