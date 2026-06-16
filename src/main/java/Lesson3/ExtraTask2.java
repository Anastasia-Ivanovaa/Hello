package Lesson3;

import java.util.Arrays;

public class ExtraTask2 {
    // Создайте массив строк.
    // Заполните его произвольными именами людей.
    // Отсортируйте массив.
    // Результат выведите на консоль

    public static void main(String[] args) {
        String[] names = new String[]{"Sam", "Rob", "Ann", "John"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
