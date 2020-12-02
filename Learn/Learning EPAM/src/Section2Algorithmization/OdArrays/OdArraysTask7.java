package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util.Random;
//7. Даны действительные числа а1 ,а2 ,..., аn. Найти максимальное сумму двух соседних чисел в массиве
public class OdArraysTask7 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 20;
        int[] array = new int[n];
        int[] array2 = new int[n-1];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (r.nextInt(20));
            if (i >= 1) {
                array2[i - 1] = array[i] + array[i - 1];
            }
        }
        for (int value : array2) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(array));
        System.out.print("Максимальная сумма двух соседних чисел в массиве array равна " + max + ".");
    }
}