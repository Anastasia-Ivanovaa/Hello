package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class AverageForTwoArrays {
    // Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
    // Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение
    // оказалось больше (либо сообщите, что их средние арифметические равны).

    public static void main(String[] args) {
        Random random = new Random();

        int arrayLength = 5;
        int[] arrayOne = new int[arrayLength];
        int[] arrayTwo = new int[arrayLength];

        double sumOne = 0;
        double sumTwo = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(1, 100);
            sumOne += arrayOne[i];
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("The average of the first array: " + sumOne / arrayLength);

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = random.nextInt(1, 100);
            sumTwo += arrayTwo[i];
        }
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println("The average of the second array: " + sumTwo / arrayLength);

        if (sumOne > sumTwo) {
            System.out.println("The average of the FIRST array is greater.");
        } else if (sumOne < sumTwo){
            System.out.println("The average of the SECOND array is greater.");
        } else {
            System.out.println("The average of both arrays is equal");
        }
    }
}
