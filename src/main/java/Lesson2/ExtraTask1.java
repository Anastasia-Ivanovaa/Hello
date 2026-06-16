package Lesson2;

import java.util.Scanner;

public class ExtraTask1 {
    // Преобразовать задачу 2 таким образом, чтобы число запрашивалось у пользователя постоянно,
    // пока он не введет какое-нибудь число 2 раза подряд. Если это случилось, программа прекращает выполнение

    public static void main(String[] args) {
        // Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
        // Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2')


        int previousNumber = 0;

        while (true) {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number == previousNumber) {
                System.out.println("Это число было введено в прошлый раз");
                break;
            } else {
                if (number % 2 == 0) {
                    System.out.println("Это четное число");
                } else {
                    System.out.println("Это нечетное число");
                }
                previousNumber = number;
            }
        }
    }
}
