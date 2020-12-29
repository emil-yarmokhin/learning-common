package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;

/*4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек
самое большое расстояние. Указание. Координаты точек занести в массив.*/
public class DUMTask4 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(18) + 2;//минимум 2
        int[][] a = new int[n][2];
        fillArrayA(a);
        points(a, findMaxDistance(a));
    }

    public static void fillArrayA(int[][] a) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = r.nextInt(5);
            }
        }
    }

    public static double findMaxDistance(int[][] a) {
        double maxDistance = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int s = 1; s < a.length - i; s++) {
                double diff = getDistance(a, i, a[i + s]);
                if (diff > maxDistance) {
                    maxDistance = diff;
                }
            }
        }
        return maxDistance;
    }

    private static double getDistance(int[][] a, int i, int[] ints) {
        int a1 = a[i][0];
        int a3 = ints[0];
        int a2 = a[i][1];
        int a4 = ints[1];
        return sqrt(pow(abs(a3 - a1), 2) + pow(abs(a4 - a2), 2));
    }

    public static void points(int[][] a, double maxDistance) {
        System.out.println("Координаты точек на плоскости:\n" + Arrays.deepToString(a));
        System.out.println("Самое большое расстояние (" + maxDistance + ") между точками:");
        for (int i = 0; i < a.length - 1; i++) {
            for (int s = 1; s < a.length - i; s++) {
                double diff = getDistance(a, i, a[i + s]);
                if (diff == maxDistance) {
                    System.out.println("[" + a[i][0] + ", " + a[i][1] + "] и [" + a[i + s][0] + ", " + a[i + s][1] + "]");
                }
            }
        }
    }
}