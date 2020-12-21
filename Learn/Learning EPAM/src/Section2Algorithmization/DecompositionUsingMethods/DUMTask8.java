package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Random;

/*8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].*/
public class DUMTask8 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n];
        allParts(arr);
        System.out.println();
        System.out.println(sumCount(arr, 1, 2, 3));
        System.out.println(sumCount(arr, 3, 4, 5));
        System.out.println(sumCount(arr, 4, 5, 6));
    }

    private static int sumCount(int[] arr, int a, int b, int c) {
        return arr[a] + arr[b] + arr[c];
    }

    private static void allParts(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
    }
}