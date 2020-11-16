package Section2Algorithmization.OdArrays;

import java.util.Arrays;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class OdArraysTask4 {
    public static void main(String[] args) {
        int[] array = {2, 28, 54, 21, 75, 13, 71, 41, 7, 52};
        int min = 0;
        int max = 0;
        int buf;

        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
            if (array[max] < array[i]) {
                max = i;
            }
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(array));
        System.out.println("Минимальное значение массива: " + array[min] + ", индекс - " + min + ".");
        System.out.println("Максимальное значение массива: " + array[max] + ", индекс - " + max + ".");
        buf = array[min];
        array[min] = array[max];
        array[max] = buf;
        System.out.println("Конечный массив:\n" + Arrays.toString(array));
    }
}