package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;
/*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., так,
что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.*/

//КОММЕНТАРИЙ К ВЫПОЛНЕННОМУ ЗАДАНИЮ. РАНДОМНЫМ ПОРЯДКОМ СОЗДАЁТСЯ МАГИЧЕСКИЙ КВАДРАТ НЕЧЁТНОГО ПОРЯДКА (ДО 11).
//ДЛЯ УБЕДИТЕЛЬНОСТИ МОЖНО ПОМЕНЯТЬ ЗНАЧЕНИЕ start.
public class AOATask16 {
    public static void main(String[] args) {
        Random random = new Random();
        int start = 3; //с какого числа начинается отсчёт
        int n = random.nextInt(11) + 1; // рандомом задаём квадрат до 11 порядка
        if (n % 2 == 0) {//(с нечётным значением), т. к. метод составления магического квадрата чётного порядка иной
            n += 1;
        }
        int[][] matrix = new int[n][n];
        int next = start; //счётчик
        int i = 0;
        int j = (n / 2); //в 14 и 15 строке задаём стартовую точку отсчёта в матрице
        matrix[i][j] = start;
        next++;
        while (next <= n * n - 1 + start) {
            if (i - 1 >= 0 && j + 1 <= n - 1 && matrix[i - 1][j + 1] == 0) {
                i = i - 1;
                j = j + 1;
            } else if (i - 1 >= 0 && j + 1 <= n - 1 && matrix[i - 1][j + 1] != 0) {
                i = i + 1;
            } else if (i == 0 && j == n - 1) {
                i = i + 1;
            } else if (i == 0) {
                i = n - 1;
                j = j + 1;
            } else {
                i = i - 1;
                j = 0;
            }
            matrix[i][j] = next;
            next++;
        }

        System.out.println("Ниже представлен магический квадрат. Сумма каждого его столбца и строки равна:");
        for (int[] ints : matrix) {
            int count2 = 0;
            for (int anInt : ints) {
                count2 += anInt;
                if (anInt >= 100) {
                    System.out.format("%03d ", anInt);
                } else {
                    System.out.format("%02d  ", anInt);
                }
            }
            System.out.println("== " + count2);
        }

        for (int b = 0; b < n; b++) {// этот блок отвечает за вывод операторов == под каждым из столбцов
            System.out.print("==  ");
        }
        System.out.println();

        for (int s1 = 0; s1 < matrix.length; s1++) {//в этом блоке считаем значения столбцов и красиво выводим
            int count = 0;
            for (int s2 = 0; s2 < matrix[s1].length; s2++) {
                count += matrix[s2][s1];
            }
            if (count < 100) {
                System.out.print(count + "  ");
            } else {
                System.out.print(count + " ");
            }
        }

        System.out.println("\n");//этот блок программы считает значения диагоналей
        int dial1 = 0;
        int dial2 = 0;
        for (int dr = 0; dr < n; dr++) {
            for (int dc = 0; dc < n; dc++) {
                if (dr == dc) {
                    dial1 += matrix[dr][dc];
                } else if (dc == n - 1 - dr) {
                    dial2 += matrix[dr][dc];
                } if (matrix[dr][dc] == matrix[n / 2][n / 2]) {//отдельно считаем matrix[2][2]
                    dial2 += matrix[dr][dc];
                }
            }
        }
        System.out.println("Сумма элементов диагонали с верхнего левого угла в нижний правый: " + dial1 + ".");
        System.out.println("Сумма элементов диагонали с верхнего правого угла в нижний левый: " + dial2 + ".");

    }
}