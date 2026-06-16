package Lesson1;

import java.util.Scanner;

public class NewProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        scanner.close();

    }
}
