package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExtraTask1 {
    // Создайте массив из n случайных целых чисел и выведите его на экран.
    // Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
    // Если n не удовлетворяет условию - выведите сообщение об этом.
    // Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    // Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");

        boolean isCorrect = false;

        while (isCorrect == false) {
            if (!scanner.hasNext()) {
                System.out.println("It's not a number!");
                return;
            }

            int arrayLength = scanner.nextInt();
            {
                if (arrayLength > 5 && arrayLength <= 10) {
                    int[] array = new int[arrayLength];
                    isCorrect = true;

                    for (int i = 0; i < arrayLength; i++) {
                        array[i] = random.nextInt(0, 100);
                    }
                    System.out.println(Arrays.toString(array));

                    int counter = 0;

                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            counter++;
                        }
                    }

                    int[] arrayOnlyEven = new int[counter];
                    int j = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            arrayOnlyEven[j] = array[i];
                            j++;
                        }
                    }
                    System.out.println("NEW ARRAY: " + Arrays.toString(arrayOnlyEven));
                } else {
                    System.out.println("The number is incorrect!!");
                    System.out.println("Enter a number again: ");
                }
            }
        }
        scanner.close();
    }
}
