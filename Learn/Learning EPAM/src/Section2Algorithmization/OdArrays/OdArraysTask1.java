package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util.Random;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class OdArraysTask1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int k = 4;
        int sum = 0;
        int n = 12;
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Сумма элементов массива a, кратных k (" + k + ") равна " + sum + ".");
    }
}