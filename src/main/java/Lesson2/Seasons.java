package Lesson2;

import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {
        //Задача 1. Написать программу для вывода названия поры года по номеру месяца.  При решении используйте оператор switch-case//

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month (1-12): ");

        int number = scanner.nextInt();

        switch (number) {
            case 1, 2, 12:
                System.out.println("It's winter!");
                break;
            case 3, 4, 5:
                System.out.println("It's spring!");
                break;
            case 6, 7, 8:
                System.out.println("It's summer!");
                break;
            case 9, 10, 11:
                System.out.println("It's winter!");
                break;
            default:
                System.out.println("Enter a real month!");
                break;
        }
        scanner.close();
    }
}
