package Lesson2;

public class SpecificNumberConsequence {

    // Необходимо, чтоб программа выводила на экран вот такую последовательность:
    // 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    // В решении используйте цикл while.

    public static void main(String[] args) {

        int i = 1;
        while (i <= 14) {
            System.out.println(7 * i);
            i++;
        }
    }
}
