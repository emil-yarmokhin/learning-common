package Section2Algorithmization.Sorting;

import java.util.Arrays;
//2. Реализуйте сортировку выбором (когда сканируется весь массив, и в начало (или конец, по выбору пользователя) отправ-
//ляется наибольший (наименьший) элемент.
public class SortingTask2 {
    static void swap(int[] array, int el1, int el2) {
        int tmp = array[el1];
        array[el1] = array[el2];
        array[el2] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {8, 5, 32, 12, 63, 74, 21, 88, 10, 2};
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.print("Пошаговая демонстрация сортировки выбором:\n");//выводятся только шаги с изменениями
        for (int l = 0; l < array.length; l++) {
            int minIndex = l;
            for (int i = l; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            System.out.println(Arrays.toString(array));
            swap(array, l, minIndex);/*не могу понять, почему не работает без написания array,
            ведь меняются местами только переменные в нём*/
        }
        System.out.println("\nМассив, отсортированный выбором:");
        System.out.println(Arrays.toString(array));

    }
}
