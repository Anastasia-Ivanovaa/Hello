package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CheckNumberInArray {
    // Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
    // Пусть число для поиска задается с консоли (класс Scanner).

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }

        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100:");

        boolean hasNumber = false;

        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число!!");
            return;
        }
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Введенное число есть в данном массиве.");
                hasNumber = true;
            }
        }

        if (hasNumber == false) {
            System.out.println("Такого числа в массиве нет!");
        }
        scanner.close();
    }
}
