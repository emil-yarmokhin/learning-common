package Section2Algorithmization.ArraysOfArrays;
import java.util.Random;

/*12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
Т.к. задание сформулировано неточно, будем считать, что нам нужно отсортировать по возрастанию и убыванию каждую
строку матрицы.
Получился рабочий код, но он мне совершенно не нравится, потому что:
1. Он получился громоздким, с кучей функций и пересчитываний. Или это норм?
2. Чтобы выводились последние значения строк (n2 - 1), только ради них мне пришлось создать третью и пятую пары циклов
в 46-47 и 69-70 стр. Иначе никак.
3. Я пробовал со статическими методами. С одномерными массивами вроде получалось. Но с матрицами нет.
 */
public class AOATask12 {
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

        System.out.println("\nМатрица, с отсортированными строками по возрастанию значений элементов:");
        boolean isSorted = false;//воспользовался твоим предложением
        int buf;
        while(!isSorted) {
            isSorted = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        isSorted = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
                }
            }
        }

        for (int[] ints : matrix) {//эта пара циклов только для того, чтобы отсортированный цикл выводился целиком
            for (int anInt : ints) {
                System.out.format("%02d ", anInt);
            }
            System.out.println();
        }

        System.out.println("\nМатрица, с отсортированными строками по убыванию значений элементов:");
        boolean isSortedMinus = false;
        while(!isSortedMinus) {
            isSortedMinus = true;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        isSortedMinus = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
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