package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class OddArray {
    // Создайте массив и заполните массив. Выведите массив на экран в строку.
    // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }
        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i]=0;
            }
        }
        System.out.println("Changed array: " + Arrays.toString(array));
    }
}
