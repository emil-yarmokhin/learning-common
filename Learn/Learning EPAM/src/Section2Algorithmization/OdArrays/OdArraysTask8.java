package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util. Random;

//8. Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность, выбросив из исходной те
// члены, которые равны min(а1 ,а2 ,..., аn).
public class OdArraysTask8 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 15;
        int min = 0;
        int nCount = 0;//счётчик минимальных элементов min в массиве
        int nCount2 = 0;//счётчик для смещения минимальных элементов в конец массива
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(5);
            if (i == 0) {
                min = array[i];
            }
            if (array[i] < min) {
                min = array[i];
                nCount = 1;
            } else if (array[i] == min) {
                nCount += 1;
            }
        }
        int [] arrayFinal = new int [n - nCount];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != min) && (i < n - nCount2)) {
                arrayFinal[i + nCount2] = array[i];
            } else {
                nCount2--;
            }
        }
        System.out.print("Минимальный элемент в массиве: " + min + ", ");
        System.out.println("количество: " + nCount + ".");
        System.out.println("Изначальный массив:\n" + Arrays.toString(array));
        System.out.println("Новый массив без минимальных элементов: \n" + Arrays.toString(arrayFinal));

    }
}