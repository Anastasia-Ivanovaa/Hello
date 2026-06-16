package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumberFromArray {
    // Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    // Пусть число задается с консоли (класс Scanner).
    // Если такого числа нет - выведите сообщения об этом.
    // В результате должен быть новый массив без указанного числа.

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 5, 6, 8, 9, 10, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to delete: ");

        boolean hasNumber = false;

        if (scanner.hasNext()) {
            int number = scanner.nextInt();
            int counter = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    hasNumber = true;
                    counter += 1;
                }
            }

            int[] newArray = new int[array.length - counter];

            int j = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != number) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(newArray));

            if (hasNumber == false) {
                System.out.println("There is no such number in array!!");
            }

        } else {
            System.out.println("It's not a number!!");
        }
        scanner.close();
    }
}
