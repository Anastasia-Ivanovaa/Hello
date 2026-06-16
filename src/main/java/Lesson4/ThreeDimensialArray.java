package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class ThreeDimensialArray {
    // Создать трехмерный массив из целых чисел, заполнить случайными числами от -100 до 100.
    // С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
    // Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли.

    public static void main(String[] args) {
        int[][][] array = new int[5][5][5];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(-101, 101);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Enter a number to increase the arrays: ");

        int number;

        if (!scanner.hasNext()) {
            System.out.println("It's not a number");
            return;
        }

        number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        scanner.close();
    }
}
