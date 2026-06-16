package Lesson4;

public class Chessboard {

    // Создать программу для раскраски шахматной доски с помощью цикла.Создать двумерный массив char'ов 8х8.
    // С помощью циклов задать элементам массива значения B(Black) или W(White). Результат работы программы:
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W


    public static void main(String[] args) {
        int arrayLength = 8;
        char[][] array = new char[arrayLength][arrayLength];

        char black = 'B';
        char white = 'W';

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = white;
                } else {
                    array[i][j] = black;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
