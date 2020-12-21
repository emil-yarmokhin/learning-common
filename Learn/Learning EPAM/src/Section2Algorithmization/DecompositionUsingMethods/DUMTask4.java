package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;
import java.util.Random;

/*4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек
самое большое расстояние. Указание. Координаты точек занести в массив.
ЗАДАЧА НЕ РЕШЕНА. Я СМОГ НАЙТИ ДВЕ КРАЙНИЕ ТОЧКИ НЕ НА КООРДИНАТАХ, А ЛИШЬ НОМИНАЛЬНЫЕ. КАК НИ ПЫТАЛСЯ*/
public class DUMTask4 {
    public static void main(String[] args) {
        Random r = new Random();
        int sq = r.nextInt(5) + 2;/*сторона условной квадратной области, расположенной на плоскости, в пределах
        которой заданы своими координатами sq точек*/
        int n = r.nextInt(sq * sq - 1) + 2;//кол-во точек на плоскости - минимум 2
        int[][] array = new int[sq][sq];

        special(r, sq, n, array);

        int countA = 0;
        int countB = 0;
        int[][] array2 = new int[n][2];
        option2(array, countA, countB, array2);

        int[][] array3 = new int[2][2];
        array3[0][0] = array2[0][0];
        array3[0][1] = array2[0][1];
        array3[1][0] = array2[array2.length - 1][0];
        array3[1][1] = array2[array2.length - 1][1];
        System.out.println("\nКоординаты двух точек на плоскости, между которыми самое большое расстояние: ");
        System.out.println(Arrays.deepToString(array3));
    }

    private static void option2(int[][] array, int countA, int countB, int[][] array2) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    array2[countA][countB] = i;
                    array2[countA][countB + 1] = j;
                    countA++;
                    countB = 0;
                }
            }
        }
        System.out.println("\nКоординаты всех точек, расположенных на плоскости:");
        System.out.println(Arrays.deepToString(array2));
    }

    private static void special(Random r, int sq, int n, int[][] array) {
        int count = 0;
        System.out.println("Длина стороны плоскости равна " + sq + ", кол-во точек на ней: " + n + ".");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count = getCount(r, sq, n, array, count);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int getCount(Random r, int sq, int n, int[][] array, int count) {
        while (count < n) {
            int a = r.nextInt(sq);
            int b = r.nextInt(sq);
            if (array[a][b] != 1) {
                array[a][b] = 1;
                count++;
            }
        }
        return count;
    }
}