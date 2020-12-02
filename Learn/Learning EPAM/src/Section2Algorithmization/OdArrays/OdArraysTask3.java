package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util.Random;

//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class OdArraysTask3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int otr = 0;
        int zer = 0;
        int pol = 0;
        int n = 50;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(200) - 50;
            if (array[i] < 0) {
                otr++;
            } else if (array[i] == 0) {
                zer++;
            } else {
                pol++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Отрицацельных элементов в массиве: " + otr + ".");
        System.out.println("Нулевых элементов в массиве: " + zer + ".");
        System.out.println("Положительных элементов в массиве: " + pol + ".");
    }
}