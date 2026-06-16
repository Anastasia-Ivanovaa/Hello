package Lesson2;

import java.util.Scanner;

public class PositiveNumber {
    // Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    // Добавить проверку, что введенное пользователем число корректно (>= 1).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");

        int enteredNumber = scanner.nextInt();

        long sum = 0; //на случай, если будет введено более 100 000

        for (int i = 0; i <= enteredNumber; i++) {
            sum += i;

        }
        System.out.println("The sum of all numbers is: " + sum);
        scanner.close();
    }
}
