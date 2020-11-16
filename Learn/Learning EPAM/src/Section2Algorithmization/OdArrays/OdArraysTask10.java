package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util.Random;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями).
public class OdArraysTask10 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 20;
        int[] array = new int[n];
        int nCount2 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(20);
        }
        System.out.println("Изначалный массив:\n" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Из массива выброшен каждый второй элемент:\n" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if ((i + nCount2) <= (array.length - 1)) {
                array[i] = array[i + nCount2];
                nCount2++;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Сжатие массива, освободившиеся элементы заменены нулями:\n" + Arrays.toString(array));
    }
}