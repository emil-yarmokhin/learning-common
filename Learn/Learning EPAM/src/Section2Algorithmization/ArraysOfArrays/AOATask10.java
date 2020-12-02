package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

//10. Найти положительные элементы главной диагонали квадратной матрицы.
public class AOATask10 {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        System.out.println("Исходная матрица (с положительными и отрицательными числами):");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(100) - 50;
                if (matrix[i][j] >= 0) {
                    System.out.format(" %02d ", matrix[i][j]);
                } else {
                    System.out.format("%03d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("\nНайдены положительные элементы главной диагонали матрицы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((matrix[i][j] >= 0) && (i == j)) {
                    System.out.format(" %02d ", matrix[i][j]);
                } else if ((matrix[i][j] < 0) && (i == j)) {
                    System.out.print(" -- ");
                } else {
                    System.out.print(" •• ");
                }
            }
            System.out.println();
        }
    }
}