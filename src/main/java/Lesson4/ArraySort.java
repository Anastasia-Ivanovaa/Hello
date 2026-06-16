package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySort {
    // Создать двумерный массив  m*n, где m,n вводятся с клавиатуры, оба >= 3.
    // Заполнить случайными числами, отсортировать каждую строку отдельно по возрастанию с применением Arrays.sort()

    public static void main(String[] args) {
        int[][] array;
        int column;
        int line;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the column quantity: ");
            if (!scanner.hasNextInt()) {
                System.out.println("It's not a number!!");
                return;
            } else {
                column = scanner.nextInt();

                System.out.println("Enter the line quantity: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("It's not a number!!");
                    return;
                }
                line = scanner.nextInt();
            }

            if (column < 3) {
                System.out.println("Column should be more or equal 3");
                System.out.println("Try again");
            }
            if (line < 3) {
                System.out.println("Line should be more or equal 3");
                System.out.println("Try again");
            }

            array = new int[column][line];
        } while (column < 3 || line < 3);

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 100);
            }
        }

        System.out.println("Array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
                Arrays.sort(array[i]);
        }

        System.out.println("Array after sorting: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
