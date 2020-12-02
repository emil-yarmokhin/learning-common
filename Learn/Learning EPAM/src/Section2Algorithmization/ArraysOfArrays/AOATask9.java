package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.
public class AOATask9 {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        int[][] matrix = new int[n][n];
        int[] array = new int[n];

        System.out.println("Исходная матрица неотрицательных чисел:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(100);
                System.out.format("%02d  ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Сумма элементов каждого из столбцов:");
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                count += matrix[j][i];
            }
            array[i] = count;
            System.out.print(count + " ");
        }

        int maxNum = 0;
        int maxColumn = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                maxColumn = i;
            }
        }
        System.out.println("\nСтолбец " + maxColumn + " содержит максимальную сумму (" + maxNum + ").");
    }
}