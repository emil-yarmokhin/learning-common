package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class AOATask15 {
    public static void main(String[] args) {
        Random r = new Random();
        int n1 = 5;
        int n2 = 10;
        int[][] array = new int[n1][n2];

        System.out.println("Исходная неотсортированная матрица:");
        int max = 0;
        int row = 0;
        int clmn = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(100);
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    clmn = j;
                }
                System.out.format("%02d ", array[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nМаксимальный элемент всей матрицы array: " + max + " (" + row + " строка, " + clmn + " столбец).");
        System.out.println(" Все нечётные элементы массива заменены на него:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if (array[i][j] % 2 == 1) {
                   array[i][j] = max;
               }
                System.out.format("%02d ", array[i][j]);
            }
            System.out.println();
        }
    }
}