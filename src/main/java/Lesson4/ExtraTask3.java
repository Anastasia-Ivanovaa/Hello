package Lesson4;

import java.util.Random;

public class ExtraTask3 {
    // Создайте двумерный массив целых чисел.
    // Отсортируйте элементы в строках двумерного массива по убыванию с помощью пузырька/шейкерной сортировки.

    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 100);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length - 1 - j; k++) {
                    if (array[j][k] < array[j][k + 1]) {
                        int temp = array[j][k];
                        array[j][k] = array[j][k + 1];
                        array[j][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Array after sorting every line");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
