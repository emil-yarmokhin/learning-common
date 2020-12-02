package Section2Algorithmization.ArraysOfArrays;

import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

/*7. Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I^2 - J^2)/N)
и подсчитать количество положительных элементов в ней.*/
public class AOATask7 {
    public static void main(String[] args) {
        Random random = new Random();
        double n = random.nextInt(15) + 1;
        double[][] a = new double[(int) n][(int) n];

        System.out.println("Квадратная матрица порядка N по правилу: A[I,J] = sin((I^2 - J^2)/N):");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = sin((pow(i, 2) - pow(j, 2)) / n);
                if (a[i][j] >= 0) {
                    count++;
                    System.out.format(" %f ", a[i][j]);
                } else {
                    System.out.format("%f ", a[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("\nКоличество положительных элементов в матрице: " + count + ".");
    }
}