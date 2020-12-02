package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

public class AOATask2 {
    //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    public static void main(String[] args) {
        Random r = new Random();
        int n = 5;
        int[][] matrix = new int[n][n];

        System.out.println("Вывод квадратной матрицы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10);
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\nВыведены элементы, стоящие в матрице по диагонали:");
        for (int dr = 0; dr < matrix.length; dr++) {
            for (int dc = 0; dc < matrix[dr].length; dc++) {
                if ((dr == dc) || (dc == n - 1 - dr)) {
                    System.out.print(matrix[dr][dc] + "  ");
                } else {
                    System.out.print("•  ");
                }
            }
            System.out.println();
        }
    }
}