package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

public class AOATask2 {
    //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    public static void main(String[] args) {
        Random r = new Random();
        int n = 5;
        int[][] matrix = new int[n][n];
        int count = 0;

        System.out.println("Вывод квадратной матрицы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nВыведены элементы, стоящие в матрице по диагонали:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j) && (i != (n - 1) / 2)) {
                    System.out.print(matrix[i][j] + " ");
                } else if (j == n - 1 - count) {
                    System.out.print(matrix[i][j] + " ");
                    count++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
