package Lesson2;

import java.util.Scanner;

public class Bank {
    //За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    //Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
    // А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
    // Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your sum: ");
        float sum = scanner.nextFloat();
        float newSum = sum;

        System.out.println("Enter the month quantity: ");
        int monthQty = scanner.nextInt();

        float bankPercentage = 0.07f;

        float allPercentage = 0;

        for (int i = 1; i <= monthQty; i++) {
            float sumPerMonth = sum * bankPercentage;
            System.out.println("Сумма, которая добавляется к изначальной в " + i + " месяц: " + sumPerMonth);
            allPercentage += sumPerMonth;


        }
        System.out.println("Сумма по процентам: " + allPercentage);
        float endSum = allPercentage + sum;
        System.out.println("Итоговая сумма за " + monthQty + " месяцев: " + endSum);

        System.out.println("Иначе по снежному кому");

        for (int i = 1; i <= monthQty; i++) {
            float sumPerMonth = newSum * bankPercentage;
            newSum = newSum + sumPerMonth;
            System.out.println("Сумма за месяц на счету включая проценты за месяц " + i + " " + newSum);
        }

    }
}
