package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

/*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц
равно номеру столбца.*/
public class AOATask14 {
    public static void main(String[] args) {
        Random r = new Random();
        int m = r.nextInt(9) + 1;
        int n = r.nextInt(m + 1) + 1;
        int[][] matrix = new int[m][n];
        System.out.println("Число строк в массиве: " + m + ", число столбцов: " + n + ".");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}