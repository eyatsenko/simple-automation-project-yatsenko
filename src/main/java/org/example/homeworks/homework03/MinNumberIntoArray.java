package org.example.homeworks.homework03;

import java.util.Random;

public class MinNumberIntoArray {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }

        System.out.print("Array is: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
        System.out.println("Minimum is: " + findMin(array));
    }

    public static int findMin(int[] array) {
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
        return array[0];
    }
}

