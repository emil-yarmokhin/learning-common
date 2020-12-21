package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Integer.MIN_VALUE;

/*5. Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).*/
public class DUMTask5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(8) + 2];//минимальное кол-во элементов в массиве - 2
        fillArray(array);
        System.out.print("Число, меньше максимального элемента массива, но больше всех други элементов: ");
        System.out.println(findingPenultimate(array, MIN_VALUE));
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
    }

    public static int findingPenultimate(int[] array, int max) {
        int penult = max;
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        return extractingPenult(array, max, penult);
    }

    private static int extractingPenult(int[] array, int max, int penult) {
        for (int value : array) {
            if (value > penult && value < max) {
                penult = value;
            }
        }
        return penult;
    }
}