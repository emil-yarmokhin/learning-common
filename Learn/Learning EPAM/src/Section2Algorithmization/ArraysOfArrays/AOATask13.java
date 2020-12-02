package Section2Algorithmization.ArraysOfArrays;
import java.util.Random;

/*13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
По аналогии с предыдущим заданием, будем сортировать каждый столбец массива (по возрастанию и убыванию).
Код честно скопипищен с предыдущего задания, поскольку условие практически идентичное. Изменения:
            1. Строки 34-35 и 57-58. Т.к. я сравниваю теперь элементы столбца, а не строки, то чтобы не выходить за пределы
            массива, я ставлю ограничение в цикле, проходящему по столбцу
            2. Соответственно изменены в условии if matrix[i][j + 1] на matrix[i + 1][j]
 */


public class AOATask13 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;
        Random r = new Random();
        int[][] matrix = new int[n1][n2];

        System.out.println("Исходная неотсортированная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(100);
                System.out.format("%02d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nМатрица, с отсортированными столбцами по возрастанию значений элементов:");
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        isSorted = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = buf;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.format("%02d ", anInt);
            }
            System.out.println();
        }

        System.out.println("\nМатрица, с отсортированными столбцами по убыванию значений элементов:");
        boolean isSortedMinus = false;
        while(!isSortedMinus) {
            isSortedMinus = true;
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        isSortedMinus = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = buf;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.format("%02d ", anInt);
            }
            System.out.println();
        }
    }
}