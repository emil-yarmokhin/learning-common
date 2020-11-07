package Section2Algorithmization.OdArrays;

import java.util.Arrays;

/*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчи­тать количество замен. */
public class OdArraysTask2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 48, 5, 6, 7, 8, 9, 10, 11, 12};
        int z = 7;
        int akk = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                akk++;
                }
            }
        System.out.print(Arrays.toString(array));
        System.out.println("\nКоличество замен: " + akk + ".");
    }
}
