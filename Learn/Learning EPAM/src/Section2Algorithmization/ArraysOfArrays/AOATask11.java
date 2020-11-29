package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

/*11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
в которых число 5 встречается три и более раз.*/
public class AOATask11 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        Random r = new Random();
        int[][] matrix = new int[n1][n2];

        System.out.println("Исходная матрица неотрицательных чисел:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(16);
                System.out.format("%02d ", matrix[i][j]);
            }
            System.out.println();
        }

        int globalCount = 0;
        System.out.println("\nНомера строк, в которых число 5 встречается 3 и более раз:");
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            int row = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
                if (count >= 3) {
                    row = i;
                }
            }
            if ((count >= 3) && (count <= 4)) {
                System.out.println(row + " (" + count + " разa)");
                globalCount++;
            } else if ((count >= 5) && (count <= n2)) {
                System.out.println(row + " (" + count + " раз)");
                globalCount++;
            }
        }

        if (globalCount == 0) {
            System.out.println("Таких нет.");
        }

    }
}