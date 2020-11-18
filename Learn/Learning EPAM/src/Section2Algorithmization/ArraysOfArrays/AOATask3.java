package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class AOATask3 {
    public static void main(String[] args) {
        Random r = new Random();
        int nW = 5;
        int nH = 7;
        int k = 3;
        int p = 2;
        int[][] matrix = new int[nW][nH];

        System.out.println("Изначальный массив:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nВыведены на печать строка k: " + k + " и столбец p: " + p + ".");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == k) || (j == p)) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}