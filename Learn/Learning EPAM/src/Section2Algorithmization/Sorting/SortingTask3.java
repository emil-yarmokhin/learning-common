package Section2Algorithmization.Sorting;

import java.util.Arrays;
import static Section2Algorithmization.Sorting.SortingTask2.swap;
//3. Реализуйте сортировку обменами (пузырьком)
public class SortingTask3 {
    public static void main(String[] args) {
        int[] array = {8, 5, 32, 12, 63, 74, 21, 88, 10, 2};

        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(array) + "\n");
        System.out.println("Выводятся шаги сортировки, в которых в хвост выводятся наибольшие элементы из оставшихся:");
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    isSorted = false;
                    swap(array, i, i - 1);
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("\nМассив, отсортированный обменом:");
        System.out.println(Arrays.toString(array));

    }
}