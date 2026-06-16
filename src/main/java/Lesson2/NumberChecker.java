package Lesson2;

import java.util.Scanner;

public class NumberChecker {

    // Задача 2. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
    // Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2')

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("It's even number!");
        } else {
            System.out.println("It's odd number!");
        }
        scanner.close();
    }
}
