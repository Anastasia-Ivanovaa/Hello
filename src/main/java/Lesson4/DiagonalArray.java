package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class DiagonalArray {
    //  Создайте двумерный массив размера n*n, n вводится с консоли от 2 до 6.
    //  После чего заполняется случайными элементами от -100 до 100.
    //  Выведите на консоль сумму элементов диагоналей массива.


    public static void main(String[] args) {
        int[][] array;
        int arrayLength;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        if (!scanner.hasNext()) {
            System.out.println("It's not a number!!");
        }

        arrayLength = scanner.nextInt();
        array = new int[arrayLength][arrayLength];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-101, 101);
            }
        }

        System.out.println("The array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    diagonal1 += array[i][j];
                }
                if ((i + j) == arrayLength - 1) {
                    diagonal2 += array[i][j];
                }
            }
        }

        System.out.println("The sum of 1st diagonal is " + diagonal1);
        System.out.println("The sum of 2nd diagonal is " + diagonal2);
        scanner.close();
    }
}
