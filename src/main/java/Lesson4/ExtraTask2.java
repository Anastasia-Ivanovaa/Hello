package Lesson4;

import java.util.Random;

public class ExtraTask2 {
    // Создайте двумерный массив целых чисел.
    // Выведите на консоль сумму всех элементов массива.

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

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("The sum of all array elements: " + sum);

    }
}
