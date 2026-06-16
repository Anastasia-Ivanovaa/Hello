package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMaxInArray {
    //  Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
    //  Для генерации случайного числа используйте метод Math.random().
    //  Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");

        if (scanner.hasNext()) {
            int arrayLength = scanner.nextInt();

            int[] array = new int[arrayLength];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) ((Math.random() * 100) / 10);
            }
            System.out.println(Arrays.toString(array));

            int min = array[0];
            int max = array[0];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }
            double average = (double) sum / array.length;
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + average);


        } else {
            System.out.println("It's not a number!");
        }
        scanner.close();
    }
}
