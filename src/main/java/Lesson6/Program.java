package Lesson6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreditCard[] cards = new CreditCard[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите данные карты №" + i + ": номер карты и сумму зачисления");
            cards[i] = new CreditCard(scanner.next(), scanner.nextDouble());

        }

        for (int i = 0; i < cards.length; i++) {
            cards[i].cardInfo();
            System.out.print("");
        }
    }
}
