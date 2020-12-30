package Section2Algorithmization.Sorting;

import java.util.Arrays;

//5. Реализуйте сортировку Шелла.
public class SortingTask5 {
    public static void main(String[] args) {
        int[] array = {8, 5, 32, 12, 63, 74, 21, 88, 10, 2};
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(array) + "\n");
        sort(array);
    }

    public static void sort(int[] array) {/*метод разбивает массив на несколько частей (данный - */
        int d = 1;
        while (d * 3 < array.length)
            d *= 3 + 1;
        while (d >= 1) {
            dSort(array, d);
            d /= 3;
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    private static void dSort(int[] array, int d) {
        for (int i = d; i < array.length; i++) {
            for (int j = i; j >= d; j = j - d) {
                if (array[j] < array[j - d]) {
                    int temp = array[j];
                    array[j] = array[j - d];
                    array[j - d] = temp;
                } else {
                    break;
                }
            }
        }
    }
}