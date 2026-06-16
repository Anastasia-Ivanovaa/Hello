package Lesson2;

public class Fibonachi {
    public static void main(String[] args) {
        // Выведите на экран первые 11 членов последовательности Фибоначчи.
        // П-ть фибоначчи - последовательность, начинающаяся с двух единиц,
        // где каждый последующий член равен сумме двух предыдущих (1, 1, 2, 3, 5, 8 ... ).
        // Используйте любой понравившийся цикл

        int a = 0;
        int b = 1;
        System.out.print(b + " ");

        for (int i = 0; i <= 11; i++) {
            int f = a + b;
            a = b;
            b = f;
            System.out.print(f + " ");
        }
    }
}

