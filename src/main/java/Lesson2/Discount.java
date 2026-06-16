package Lesson2;

import java.util.Scanner;

public class Discount {
    //Вы пишете логику для интернет-магазина. У вас есть переменная int bill = 12000; и int discount = 0;
    //Правила такие:
    //Если покупка > 10 000, скидка 20%.
    //Если покупка > 5 000, скидка 10%.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sum bill: ");

        int bill = scanner.nextInt();

        if (bill > 10000) {
            System.out.println("Your discount 20%");
        } else if (bill > 5000) {
            System.out.println("Your discount 10%");
        } else {
            System.out.println("No discount :(");
        }
        scanner.close();
    }
}
