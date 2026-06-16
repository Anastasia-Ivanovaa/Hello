package Lesson2;

import java.util.Scanner;

//Задача 3. Для введенного числа t (температура на улице) вывести
// Если t>–5, то вывести «Тепло».
// Если –5>= t > –20, то вывести «Нормально».
// Если –20>= t, то вывести «Холодно».

public class Temperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature: ");

        int temperature = scanner.nextInt();

        if (temperature > -5) {
            System.out.println("Warm");
        }
        if (-5 >= temperature && temperature > -20) {
            System.out.println("Normal");
        }
        if (-20 >= temperature) {
            System.out.println("Cold");
        }


        if (temperature > 30) {
            System.out.println("На улице очень жарко");
        } else if (temperature > 0) {
            System.out.println("На улице тепло");
        } else {
            System.out.println("На улице холодно");
        }
        scanner.close();
    }
}
