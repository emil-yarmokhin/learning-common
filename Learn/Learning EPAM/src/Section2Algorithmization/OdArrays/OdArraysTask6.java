package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
// простыми числами. Пришлось потрудиться, но решение достойное внимания.
public class OdArraysTask6 {
    public static void main(String[] args) {
        Random r = new Random();
        double cou = 0;
        int n = 10;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (r.nextDouble());
            int k = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    k++;
            }
            if ((k < 2) && (i >= 2)) {
                cou += array[i];
                System.out.print(i + " ");
            }
            System.out.print("\n" + Arrays.toString(array) + " ");
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + cou);//
    }
}