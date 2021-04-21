package org.example.homeworks.homework03;

/*
Write a program which calculates the sum of two columns.
Print table with results if columns have the same size.
| row_1 | row_2 | sum |
|  2 | 5    | 7 |
If columns are not of the same size, print which column has bigger size
*/

public class SumOfColumns {
    public static void main(String[] args) {
        int[] column1 = {1, 4, 5, 6, 7, 4, 9, 3, 6};
        int[] column2 = {6, 2, 7, 8, 3, 1, 3, 3, 6};

        if (column1.length == column2.length) {
            for (int i = 0; i < column1.length; i++) {
                int first = column1[i];
                int second = column2[i];
                int sum = first + second;
                System.out.println("| " + first + " | " + second + " | " + sum + " |");
            }
        } else if (column1.length > column2.length) {
            System.out.println("Column 1 has bigger size!");
        } else {
            System.out.println("Column 2 has bigger size!");
        }
    }
}
